package drachenbauer32.umbrellamod.init;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import drachenbauer32.umbrellamod.Umbrella;
import drachenbauer32.umbrellamod.items.UmbrellaItem;
import drachenbauer32.umbrellamod.items.UmbrellaCloseItem;
import drachenbauer32.umbrellamod.util.Reference;
import drachenbauer32.umbrellamod.util.UmbrellaColors;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class UmbrellaItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    
    /*public static final RegistryObject<Item> BLACK_UMBRELLA = ITEMS.register("black_umbrella", () -> new UmbrellaItem("black",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BLUE_UMBRELLA = ITEMS.register("blue_umbrella", () -> new UmbrellaItem("blue",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BROWN_UMBRELLA = ITEMS.register("brown_umbrella", () -> new UmbrellaItem("brown",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> CYAN_UMBRELLA = ITEMS.register("cyan_umbrella", () -> new UmbrellaItem("cyan",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GRAY_UMBRELLA = ITEMS.register("gray_umbrella", () -> new UmbrellaItem("gray",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GREEN_UMBRELLA = ITEMS.register("green_umbrella", () -> new UmbrellaItem("green",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_BLUE_UMBRELLA = ITEMS.register("light_blue_umbrella", () -> new UmbrellaItem("light_blue",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_GRAY_UMBRELLA = ITEMS.register("light_gray_umbrella", () -> new UmbrellaItem("light_gray",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIME_UMBRELLA = ITEMS.register("lime_umbrella", () -> new UmbrellaItem("lime",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> MAGENTA_UMBRELLA = ITEMS.register("magenta_umbrella", () -> new UmbrellaItem("magenta",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> ORANGE_UMBRELLA = ITEMS.register("orange_umbrella", () -> new UmbrellaItem("orange",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PINK_UMBRELLA = ITEMS.register("pink_umbrella", () -> new UmbrellaItem("pink",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PURPLE_UMBRELLA = ITEMS.register("purple_umbrella", () -> new UmbrellaItem("purple",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> RED_UMBRELLA = ITEMS.register("red_umbrella", () -> new UmbrellaItem("red",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> WHITE_UMBRELLA = ITEMS.register("white_umbrella", () -> new UmbrellaItem("white",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> YELLOW_UMBRELLA = ITEMS.register("yellow_umbrella", () -> new UmbrellaItem("yellow",
                        new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    
    public static final RegistryObject<Item> BLACK_UMBRELLA_CLOSE = ITEMS.register("black_umbrella_close", () -> new UmbrellaCloseItem("black",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BLUE_UMBRELLA_CLOSE = ITEMS.register("blue_umbrella_close", () -> new UmbrellaCloseItem("blue",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> BROWN_UMBRELLA_CLOSE = ITEMS.register("brown_umbrella_close", () -> new UmbrellaCloseItem("brown",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> CYAN_UMBRELLA_CLOSE = ITEMS.register("cyan_umbrella_close", () -> new UmbrellaCloseItem("cyan",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GRAY_UMBRELLA_CLOSE = ITEMS.register("gray_umbrella_close", () -> new UmbrellaCloseItem("gray",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> GREEN_UMBRELLA_CLOSE = ITEMS.register("green_umbrella_close", () -> new UmbrellaCloseItem("green",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_BLUE_UMBRELLA_CLOSE = ITEMS.register("light_blue_umbrella_close", () -> new UmbrellaCloseItem("light_blue",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIGHT_GRAY_UMBRELLA_CLOSE = ITEMS.register("light_gray_umbrella_close", () -> new UmbrellaCloseItem("light_gray",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> LIME_UMBRELLA_CLOSE = ITEMS.register("lime_umbrella_close", () -> new UmbrellaCloseItem("lime",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> MAGENTA_UMBRELLA_CLOSE = ITEMS.register("magenta_umbrella_close", () -> new UmbrellaCloseItem("magenta",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> ORANGE_UMBRELLA_CLOSE = ITEMS.register("orange_umbrella_close", () -> new UmbrellaCloseItem("orange",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PINK_UMBRELLA_CLOSE = ITEMS.register("pink_umbrella_close", () -> new UmbrellaCloseItem("pink",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> PURPLE_UMBRELLA_CLOSE = ITEMS.register("purple_umbrella_close", () -> new UmbrellaCloseItem("purple",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> RED_UMBRELLA_CLOSE = ITEMS.register("red_umbrella_close", () -> new UmbrellaCloseItem("red",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> WHITE_UMBRELLA_CLOSE = ITEMS.register("white_umbrella_close", () -> new UmbrellaCloseItem("white",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<Item> YELLOW_UMBRELLA_CLOSE = ITEMS.register("yellow_umbrella_close", () -> new UmbrellaCloseItem("yellow",
                        new Item.Properties().defaultMaxDamage(0).maxStackSize(1).rarity(Rarity.COMMON).setNoRepair()));*/
    
    public static final Map<UmbrellaColors, RegistryObject<Item>> UMBRELLAS = Collections.synchronizedMap(new HashMap<UmbrellaColors, RegistryObject<Item>>());
    public static final Map<UmbrellaColors, RegistryObject<Item>> UMBRELLAS_CLOSE = Collections.synchronizedMap(new HashMap<UmbrellaColors, RegistryObject<Item>>());
    
    private static int i = 0;
    
    static
    {
        
        for(UmbrellaColors color : UmbrellaColors.values())
        {
            UMBRELLAS.put(color,ITEMS.register(color.GetName() + "_umbrella", () -> new UmbrellaItem(color,
                           new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).
                           maxStackSize(1).rarity(Rarity.COMMON).setNoRepair())));
            
            UMBRELLAS.put(color,ITEMS.register(color.GetName() + "_umbrella_close", () -> new UmbrellaCloseItem(color,
                           new Item.Properties().defaultMaxDamage(0).group(Umbrella.UMBRELLAS).
                           maxStackSize(1).rarity(Rarity.COMMON).setNoRepair())));
            
            if (i < UmbrellaColors.values().length - 1)
            {
                i++;
            }
            else
            {
                i = 0;
            }
        }
    }
}
