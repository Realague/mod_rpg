package com.mod_rpg.CreativeTabsMod;

import com.mod_rpg.CoreMod.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabsMagic extends CreativeTabs
{




public TabsMagic(String label) 
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
