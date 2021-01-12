package drachenbauer32.umbrellamod.items;

import drachenbauer32.umbrellamod.init.UmbrellaItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

public class UmbrellaItem extends Item
{
    public String color;
    
    public UmbrellaItem(String color, Properties properties)
    {
        super(properties);
        this.color=color;
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = new ItemStack(this);
        
        /*if (color == "black")
        {
            itemstack = new ItemStack(UmbrellaItems.BLACK_UMBRELLA_CLOSE.get());
        }
        else
        {
            if (color == "blue")
            {
                itemstack = new ItemStack(UmbrellaItems.BLUE_UMBRELLA_CLOSE.get());
            }
            else
            {
                if (color == "brown")
                {
                    itemstack = new ItemStack(UmbrellaItems.BROWN_UMBRELLA_CLOSE.get());
                }
                else
                {
                    if (color == "cyan")
                    {
                        itemstack = new ItemStack(UmbrellaItems.CYAN_UMBRELLA_CLOSE.get());
                    }
                    else
                    {
                        if (color == "gray")
                        {
                            itemstack = new ItemStack(UmbrellaItems.GRAY_UMBRELLA_CLOSE.get());
                        }
                        else
                        {
                            if (color == "green")
                            {
                                itemstack = new ItemStack(UmbrellaItems.GREEN_UMBRELLA_CLOSE.get());
                            }
                            else
                            {
                                if (color == "light_blue")
                                {
                                    itemstack = new ItemStack(UmbrellaItems.LIGHT_BLUE_UMBRELLA_CLOSE.get());
                                }
                                else
                                {
                                    if (color == "light_gray")
                                    {
                                        itemstack = new ItemStack(UmbrellaItems.LIGHT_GRAY_UMBRELLA_CLOSE.get());
                                    }
                                    else
                                    {
                                        if (color == "lime")
                                        {
                                            itemstack = new ItemStack(UmbrellaItems.LIME_UMBRELLA_CLOSE.get());
                                        }
                                        else
                                        {
                                            if (color == "magenta")
                                            {
                                                itemstack = new ItemStack(UmbrellaItems.MAGENTA_UMBRELLA_CLOSE.get());
                                            }
                                            else
                                            {
                                                if (color == "orange")
                                                {
                                                    itemstack = new ItemStack(UmbrellaItems.ORANGE_UMBRELLA_CLOSE.get());
                                                }
                                                else
                                                {
                                                    if (color == "pink")
                                                    {
                                                        itemstack = new ItemStack(UmbrellaItems.PINK_UMBRELLA_CLOSE.get());
                                                    }
                                                    else
                                                    {
                                                        if (color == "purple")
                                                        {
                                                            itemstack = new ItemStack(UmbrellaItems.PURPLE_UMBRELLA_CLOSE.get());
                                                        }
                                                        else
                                                        {
                                                            if (color == "red")
                                                            {
                                                                itemstack = new ItemStack(UmbrellaItems.RED_UMBRELLA_CLOSE.get());
                                                            }
                                                            else
                                                            {
                                                                if (color == "white")
                                                                {
                                                                    itemstack = new ItemStack(UmbrellaItems.WHITE_UMBRELLA_CLOSE.get());
                                                                }
                                                                else
                                                                {
                                                                    if (color == "yellow")
                                                                    {
                                                                        itemstack = new ItemStack(UmbrellaItems.YELLOW_UMBRELLA_CLOSE.get());
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
        }*/
        
        for (RegistryObject<Item> umbrella : UmbrellaItems.UMBRELLAS)
        {
            if (umbrella.getId().getPath().startsWith(color))
            {
                itemstack = new ItemStack(umbrella.get());
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
}
