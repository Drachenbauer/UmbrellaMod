package drachenbauer32.umbrellamod.util;

import drachenbauer32.umbrellamod.Umbrella;
import drachenbauer32.umbrellamod.init.UmbrellaItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.RegistryObject;

public class UmbrellaItemGroup extends ItemGroup
{
    public UmbrellaItemGroup()
    {
        super("umbrellas");
    }
    
    @Override
    public ItemStack createIcon()
    {
        Item icon = Items.ELYTRA;
        for (RegistryObject<Item> umbrella : UmbrellaItems.UMBRELLAS)
        {
            if (umbrella.getId().getPath().startsWith("yellow"))
            {
                icon = umbrella.get();
                break;
            }
        }
        return new ItemStack(icon);
        
        //return new ItemStack(UmbrellaItems.YELLOW_UMBRELLA.get());
    }
    
    @Override
    public void fill(NonNullList<ItemStack> itemStacks)
    {
        super.fill(itemStacks);
        itemStacks.sort(Umbrella.itemSorter);
    }
}
