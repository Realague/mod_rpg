package com.mod_rpg.Item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemReed;

public class ItemReedCustom extends ItemReed{

	public ItemReedCustom(Block block, String name) {
		super(block);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
