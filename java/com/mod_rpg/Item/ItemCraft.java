package com.mod_rpg.Item;

import net.minecraft.item.Item;

import com.mod_rpg.CoreMod.Main;

public class ItemCraft extends Item{

	public ItemCraft(String name)
	{
	setUnlocalizedName(name);
	this.setCreativeTab(Main.TabsCraft);	
	}


}
