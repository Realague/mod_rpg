package com.mod_rpg.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mod_rpg.Entity.ExtendedPlayerThirst;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class ItemBottleVine extends ItemDrink{

	 private Map effectCache = Maps.newHashMap();
		public ItemBottleVine(String name, int heal) {
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
	                return new ItemStack(Items.glass_bottle);
	            }

	            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
	        }

	        return stack;
	    }
		public EnumAction getItemUseAction(ItemStack stack)
	    {
	        return EnumAction.DRINK;
	    }
}
