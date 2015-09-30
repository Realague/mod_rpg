package com.mod_rpg.Recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mod_rpg.CoreMod.ModItems;

public class RecipesSmelting {

	public static void addRecipesSmelting()
	{
		//smeltings
				GameRegistry.addSmelting(ModItems.copper_ingot_mold, new ItemStack(ModItems.copper_ingot, 1), 1.5F); 
				GameRegistry.addSmelting(ModItems.tin_ingot_mold, new ItemStack(ModItems.tin_ingot), 1F); 
				GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(ModItems.steel_ingot), 1F); 
				GameRegistry.addSmelting(ModItems.obsidian_ore, new ItemStack(ModItems.obsidian_ingot), 3F);
				GameRegistry.addSmelting(ModItems.mithril_ingot_mold, new ItemStack(ModItems.mithril_ingot), 2F);
				GameRegistry.addSmelting(ModItems.adamantine_ingot_mold, new ItemStack(ModItems.adamantine_ingot), 2F);
				GameRegistry.addSmelting(ModItems.iron_ingot_mold, new ItemStack(Items.iron_ingot), 1.5F);
				GameRegistry.addSmelting(ModItems.gold_ingot_mold, new ItemStack(Items.gold_ingot), 1.7F);
	}
}
