package drachenbauer32.umbrellamod;

import java.util.Comparator;
import drachenbauer32.umbrellamod.init.UmbrellaItems;
import drachenbauer32.umbrellamod.items.UmbrellaItem;
import drachenbauer32.umbrellamod.util.UmbrellaItemGroup;
import drachenbauer32.umbrellamod.util.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class Umbrella
{   
    public static final ItemGroup UMBRELLAS = new UmbrellaItemGroup();
    
    public static Comparator<ItemStack> itemSorter;
    
    public Umbrella() 
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        
        UmbrellaItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        itemSorter = Comparator.comparing(stack -> ((UmbrellaItem) stack.getItem()).color);
    }
    
    private void clientRegistries(final FMLClientSetupEvent event)
    {
        
    }
}
