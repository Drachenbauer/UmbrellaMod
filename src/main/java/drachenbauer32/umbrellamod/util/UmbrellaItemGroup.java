package drachenbauer32.umbrellamod.util;

import drachenbauer32.umbrellamod.Umbrella;
import drachenbauer32.umbrellamod.init.UmbrellaItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class UmbrellaItemGroup extends ItemGroup
{
    public UmbrellaItemGroup()
    {
        super("umbrellas");
    }
    
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(UmbrellaItems.UMBRELLAS.get(UmbrellaColors.YELLOW).get());
    }
    
    @Override
    public void fill(NonNullList<ItemStack> itemStacks)
    {
        super.fill(itemStacks);
        itemStacks.sort(Umbrella.itemSorter);
    }
}
