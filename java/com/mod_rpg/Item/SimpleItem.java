package com.mod_rpg.Item;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.Main;

public class SimpleItem extends Item{

	public SimpleItem(String name)
	{
	setUnlocalizedName(name);
	this.setCreativeTab(Main.TabsCraft);	
	}
}
