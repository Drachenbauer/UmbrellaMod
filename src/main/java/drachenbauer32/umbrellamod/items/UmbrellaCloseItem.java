package drachenbauer32.umbrellamod.items;

import com.google.common.collect.Multimap;

import drachenbauer32.umbrellamod.init.UmbrellaItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class UmbrellaCloseItem extends Item
{
    public String color;
    private final float attackDamage = 5f;
    private final float attackSpeed = 2.5f;
    
    public UmbrellaCloseItem(String color, Properties properties)
    {
        super(properties);
        this.color=color;
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
       ItemStack itemstack = new ItemStack(this);
        
        if (color == "black")
        {
            itemstack = new ItemStack(UmbrellaItems.BLACK_UMBRELLA.get());
        }
        else
        {
            if (color == "blue")
            {
                itemstack = new ItemStack(UmbrellaItems.BLUE_UMBRELLA.get());
            }
            else
            {
                if (color == "brown")
                {
                    itemstack = new ItemStack(UmbrellaItems.BROWN_UMBRELLA.get());
                }
                else
                {
                    if (color == "cyan")
                    {
                        itemstack = new ItemStack(UmbrellaItems.CYAN_UMBRELLA.get());
                    }
                    else
                    {
                        if (color == "gray")
                        {
                            itemstack = new ItemStack(UmbrellaItems.GRAY_UMBRELLA.get());
                        }
                        else
                        {
                            if (color == "green")
                            {
                                itemstack = new ItemStack(UmbrellaItems.GREEN_UMBRELLA.get());
                            }
                            else
                            {
                                if (color == "light_blue")
                                {
                                    itemstack = new ItemStack(UmbrellaItems.LIGHT_BLUE_UMBRELLA.get());
                                }
                                else
                                {
                                    if (color == "light_gray")
                                    {
                                        itemstack = new ItemStack(UmbrellaItems.LIGHT_GRAY_UMBRELLA.get());
                                    }
                                    else
                                    {
                                        if (color == "lime")
                                        {
                                            itemstack = new ItemStack(UmbrellaItems.LIME_UMBRELLA.get());
                                        }
                                        else
                                        {
                                            if (color == "magenta")
                                            {
                                                itemstack = new ItemStack(UmbrellaItems.MAGENTA_UMBRELLA.get());
                                            }
                                            else
                                            {
                                                if (color == "orange")
                                                {
                                                    itemstack = new ItemStack(UmbrellaItems.ORANGE_UMBRELLA.get());
                                                }
                                                else
                                                {
                                                    if (color == "pink")
                                                    {
                                                        itemstack = new ItemStack(UmbrellaItems.PINK_UMBRELLA.get());
                                                    }
                                                    else
                                                    {
                                                        if (color == "purple")
                                                        {
                                                            itemstack = new ItemStack(UmbrellaItems.PURPLE_UMBRELLA.get());
                                                        }
                                                        else
                                                        {
                                                            if (color == "red")
                                                            {
                                                                itemstack = new ItemStack(UmbrellaItems.RED_UMBRELLA.get());
                                                            }
                                                            else
                                                            {
                                                                if (color == "white")
                                                                {
                                                                    itemstack = new ItemStack(UmbrellaItems.WHITE_UMBRELLA.get());
                                                                }
                                                                else
                                                                {
                                                                    if (color == "yellow")
                                                                    {
                                                                        itemstack = new ItemStack(UmbrellaItems.YELLOW_UMBRELLA.get());
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
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
         multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
         multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)this.attackSpeed, AttributeModifier.Operation.ADDITION));
      }

      return multimap;
   }
}
