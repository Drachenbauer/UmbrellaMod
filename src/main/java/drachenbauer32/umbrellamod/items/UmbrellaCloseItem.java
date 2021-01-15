package drachenbauer32.umbrellamod.items;

import drachenbauer32.umbrellamod.init.UmbrellaItems;
import drachenbauer32.umbrellamod.util.UmbrellaColors;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UmbrellaCloseItem extends SwordItem
{
    private final UmbrellaColors color;
    private static final IItemTier tier= ItemTier.WOOD;
    
    public UmbrellaCloseItem(UmbrellaColors color, Properties properties)
    {
        super(tier, 5, 2.5f, properties);
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
    
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
        return true;
    }
    
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
    {
        // TODO Auto-generated method stub
        return true;
    }
}
