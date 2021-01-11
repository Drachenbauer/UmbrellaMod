package drachenbauer32.umbrellamod.util;

import drachenbauer32.umbrellamod.init.UmbrellaItems;
import drachenbauer32.umbrellamod.items.UmbrellaItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.UseAction;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class UmbrellaEventHandler
{
    @SubscribeEvent
    public void onLoad(FMLClientSetupEvent event)
    {
        ModelLoader.addSpecialModel(new ModelResourceLocation(UmbrellaItems.BLACK_UMBRELLA.get().getRegistryName() + "_3d", "3d"));
        ModelLoader.addSpecialModel(new ModelResourceLocation(UmbrellaItems.BLACK_UMBRELLA.get().getRegistryName() + "_gui", "gui"));
    }
    
    @SubscribeEvent
    public static void noFallDamage(LivingFallEvent event)
    {
        LivingEntity player = event.getEntityLiving();
        
        if (player instanceof PlayerEntity)
        {
            if (player.getHeldItem(Hand.MAIN_HAND).getItem() instanceof UmbrellaItem ||
                player.getHeldItem(Hand.OFF_HAND).getItem() instanceof UmbrellaItem)
            {
                event.setCanceled(true);
            }
            else
            {
                event.setCanceled(false);
            }
        }
        else
        {
            event.setCanceled(false);
        }
    }
    
    @SubscribeEvent
    public static void slowFall(PlayerTickEvent event)
    {
        PlayerEntity player = event.player;
        
        if (player.getHeldItem(Hand.MAIN_HAND).getItem() instanceof UmbrellaItem ||
            player.getHeldItem(Hand.OFF_HAND).getItem() instanceof UmbrellaItem)
        {
            Vec3d vec3d = player.getMotion();
            
            if (!player.onGround && vec3d.y < 0.0D)
            {
                player.setMotion(vec3d.mul(1.0D, 0.6D, 1.0D));
            }
        }
    }
    
    /** 
     ** I found this event in the ArtifactsMod by ochotonida
     ** it activates an arm uo pose for holding the umbrella
     **/
    @SubscribeEvent
    public static void armUpPose(final RenderLivingEvent.Pre<?, BipedModel<?>> event)
    {
        final LivingEntity entity = event.getEntity();
        
        if (!entity.isHandActive() || entity.getActiveItemStack().isEmpty() ||
             entity.getActiveItemStack().getItem().getUseAction(entity.getActiveItemStack()) != UseAction.BLOCK)
        {
            final boolean isHoldingOffHand = entity.getHeldItemOffhand().getItem() instanceof UmbrellaItem;
            final boolean isHoldingMainHand = entity.getHeldItemMainhand().getItem() instanceof UmbrellaItem;
            
            if ((isHoldingMainHand && Minecraft.getInstance().gameSettings.mainHand == HandSide.RIGHT) || 
                (isHoldingOffHand && Minecraft.getInstance().gameSettings.mainHand == HandSide.LEFT))
            {
                ((BipedModel<?>)event.getRenderer().getEntityModel()).rightArmPose = BipedModel.ArmPose.THROW_SPEAR;
            }
            else 
            {
                if ((isHoldingMainHand && Minecraft.getInstance().gameSettings.mainHand == HandSide.LEFT) ||
                    (isHoldingOffHand && Minecraft.getInstance().gameSettings.mainHand == HandSide.RIGHT))
                {
                    ((BipedModel<?>)event.getRenderer().getEntityModel()).leftArmPose = BipedModel.ArmPose.THROW_SPEAR;
                }
            }
        }
    }
    
    @SubscribeEvent
    public void onModelBake(ModelRegistryEvent event)
    { 
        ModelLoaderRegistry.registerLoader(new ResourceLocation(Reference.MOD_ID,"separate_perspective"), UmbrellaSeparateModels.Loader.INSTANCE);
    }
}
