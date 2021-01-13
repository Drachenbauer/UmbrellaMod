package drachenbauer32.umbrellamod.items;

import com.google.common.collect.Multimap;

import drachenbauer32.umbrellamod.init.UmbrellaItems;
import drachenbauer32.umbrellamod.util.UmbrellaColors;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class UmbrellaCloseItem extends SwordItem
{
    public UmbrellaColors color;
    private static final int attackDamage = 5;
    private static final float attackSpeed = 2.5f;
    private static final IItemTier tier= ItemTier.WOOD;
    
    public UmbrellaCloseItem(UmbrellaColors color, Properties properties)
    {
        super(tier, attackDamage, attackSpeed, properties);
        this.color=color;
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = new ItemStack(UmbrellaItems.UMBRELLAS.get(color).get());
        
        EquipmentSlotType hand = EquipmentSlotType.MAINHAND;
        
        if (playerIn.getHeldItemMainhand().getItem() == this)
        {
            hand = EquipmentSlotType.MAINHAND;
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
    public Multimap<String, AttributeModifier> getAttributeModifiers( EquipmentSlotType equipmentSlot, ItemStack itemStack)
    {
      Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot, itemStack);
      if (equipmentSlot == EquipmentSlotType.MAINHAND) {
         multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)UmbrellaCloseItem.attackDamage, AttributeModifier.Operation.ADDITION));
         multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)UmbrellaCloseItem.attackSpeed, AttributeModifier.Operation.ADDITION));
      }

      return multimap;
   }
}
