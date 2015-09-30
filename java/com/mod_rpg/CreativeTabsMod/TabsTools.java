package com.mod_rpg.CreativeTabsMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.mod_rpg.CoreMod.ModItems;

public class TabsTools extends CreativeTabs
{

public TabsTools(String label) 
    {
		super(getNextID(), label);
	}


@Override
public ItemStack getIconItemStack()
{
return new ItemStack(ModItems.adamantine_boots);
}


@Override
public Item getTabIconItem() {
    return null;
}



}
