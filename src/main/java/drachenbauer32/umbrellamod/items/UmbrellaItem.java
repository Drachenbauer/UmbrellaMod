package drachenbauer32.umbrellamod.items;

import drachenbauer32.umbrellamod.init.UmbrellaItems;
import drachenbauer32.umbrellamod.util.UmbrellaColors;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class UmbrellaItem extends Item
{
    public final UmbrellaColors color;
    
    public UmbrellaItem(UmbrellaColors color, Properties properties)
    {
        super(properties);
        this.color=color;
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = new ItemStack(UmbrellaItems.UMBRELLAS.get(color).get());
        
        EquipmentSlotType hand = EquipmentSlotType.MAINHAND;
        
        if (playerIn.getHeldItemMainhand().getItem() == this)
        {
            playerIn.setItemStackToSlot(hand, itemstack.copy());
            
            return ActionResult.resultSuccess(itemstack);
        }
        else
        {
            if (playerIn.getHeldItemOffhand().getItem() == this)
            {
                hand = EquipmentSlotType.OFFHAND;
                playerIn.setItemStackToSlot(hand, itemstack.copy());
                
                return ActionResult.resultSuccess(itemstack);
            }
            else
            {
                return ActionResult.resultFail(itemstack);
            }
        }
    }
}
