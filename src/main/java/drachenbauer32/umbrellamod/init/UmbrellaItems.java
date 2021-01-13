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
                           new Item.Properties().defaultMaxDamage(0).
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
