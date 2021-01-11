package drachenbauer32.umbrellamod.util;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoaderRegistry;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class UmbrellaEventHandlerModBus
{
    @SubscribeEvent
    public void onModelBake(ModelRegistryEvent event)
    { 
        ModelLoaderRegistry.registerLoader(new ResourceLocation(Reference.MOD_ID,"separate_perspective"), UmbrellaSeparateModels.Loader.INSTANCE);
    }
}
