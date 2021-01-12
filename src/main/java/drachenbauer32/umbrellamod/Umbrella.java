package drachenbauer32.umbrellamod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;

import drachenbauer32.umbrellamod.init.UmbrellaItems;
import drachenbauer32.umbrellamod.util.UmbrellaItemGroup;
import drachenbauer32.umbrellamod.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
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
        String[] colors = {"red",
                           "orange",
                           "yellow",
                           "lime",
                           "cyan",
                           "blue",
                           "purple",
                           "magenta",
                           "pink",
                           "light_blue",
                           "green",
                           "brown",
                           "black",
                           "gray",
                           "light_gray",
                           "white"};
        
        List<Item> items = new ArrayList<Item>();
        
        for (String color : colors)
        {
            for (RegistryObject<Item> umbrella : UmbrellaItems.UMBRELLAS)
            {
                if (umbrella.getId().getPath().startsWith(color))
                {
                    items.add(umbrella.get());
                }
            }
        }
        
        /*List<Item> items = Arrays.asList(UmbrellaItems.RED_UMBRELLA.get(),
                                         UmbrellaItems.ORANGE_UMBRELLA.get(),
                                         UmbrellaItems.YELLOW_UMBRELLA.get(),
                                         UmbrellaItems.LIME_UMBRELLA.get(),
                                         UmbrellaItems.CYAN_UMBRELLA.get(),
                                         UmbrellaItems.BLUE_UMBRELLA.get(),
                                         UmbrellaItems.PURPLE_UMBRELLA.get(),
                                         UmbrellaItems.MAGENTA_UMBRELLA.get(),
                                         UmbrellaItems.PINK_UMBRELLA.get(),
                                         UmbrellaItems.LIGHT_BLUE_UMBRELLA.get(),
                                         UmbrellaItems.GREEN_UMBRELLA.get(),
                                         UmbrellaItems.BROWN_UMBRELLA.get(),
                                         UmbrellaItems.BLACK_UMBRELLA.get(),
                                         UmbrellaItems.GRAY_UMBRELLA.get(),
                                         UmbrellaItems.LIGHT_GRAY_UMBRELLA.get(),
                                         UmbrellaItems.WHITE_UMBRELLA.get());*/
        
        itemSorter = Ordering.explicit(items).onResultOf(ItemStack::getItem);
    }
    
    private void clientRegistries(final FMLClientSetupEvent event)
    {
        
    }
}
