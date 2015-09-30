package com.mod_rpg.Item;

import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.CoreMod.ModItems;

public class ItemArmorEbene extends ItemArmor{

	public ItemArmorEbene(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(name);
	}
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if(repair.getItem() == ModItems.obsidian_ingot)
		{
			return true;
		}
		if(repair.getItem() == Items.gold_ingot)
		{
			return true;
		}
		return false;
	}
}

