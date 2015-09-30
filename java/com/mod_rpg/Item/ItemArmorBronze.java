package com.mod_rpg.Item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.CoreMod.ModItems;

public class ItemArmorBronze extends ItemArmor{

	public ItemArmorBronze(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(name);
	}
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if(repair.getItem() == ModItems.bronze_ingot)
		{
			return true;
		}
		return false;
	}
}
