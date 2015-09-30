package com.mod_rpg.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSaw extends ItemCrafting{
	
	
	public ItemSaw(float attackDamage,com.mod_rpg.Item.CraftingMaterial material, String name) {
		super(attackDamage, material);
			this.setUnlocalizedName(name);
			this.canRepair = false;
			this.setCreativeTab(CreativeTabs.tabTools);
			}
	
	public ItemStack getContainerItem(ItemStack itemStack) {
		return new ItemStack(this, 1, itemStack.getItemDamage() + 1);
		}
	public boolean hasContainerItem(ItemStack stack) {
		return true;
		}
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
		return false;
		}

}
