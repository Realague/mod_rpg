package com.mod_rpg.Item;

import java.util.Map;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Maps;
import com.mod_rpg.CoreMod.ModItems;
import com.mod_rpg.Entity.ExtendedPlayerThirst;

public class ItemBeerChope extends ItemDrink{
	 private Map effectCache = Maps.newHashMap();
	public ItemBeerChope(String name, int heal) {
	super (name, heal);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(1);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn, ExtendedPlayerThirst thirst)
    {
		thirst.setCurrentThirst(thirst.getCurrentThirst() + heal);
        if (!playerIn.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }
        if (!playerIn.capabilities.isCreativeMode)
        {
            if (stack.stackSize <= 0)
            {
                return new ItemStack(ModItems.empty_chope);
            }

            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.empty_chope));
        }

        return stack;
    }
	public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
	

}
