package com.mod_rpg.Recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.mod_rpg.CoreMod.ModItems;

public class RecipesArmor {

	public static void addRecipesArmor()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.plate_steel, 2),
			     "AAB",
			     "AA ",
			     'A', ModItems.steel_ingot, 'B', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE )
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.plate_gold, 2),
			     "AAB",
			     "AA ",
			     'A', Items.gold_ingot, 'B', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE )
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.plate_mithril, 2),
			     "AAB",
			     "AA ",
			     'A', ModItems.mithril_ingot, 'B', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE )
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.plate_obsidian, 2),
			     "AAB",
			     "AA ",
			     'A', ModItems.obsidian_ingot, 'B', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE )
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.plate_iron, 2),
			     "AAB",
			     "AA ",
			     'A', Items.iron_ingot, 'B', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE )
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.plate_bronze, 2),
			     "AAB",
			     "AA ",
			     'A', ModItems.bronze_ingot, 'B', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE )
			     );
		
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet, 1),
			     "AAA",
			     "A A",
			     'A', ModItems.chain_mail
			     );
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate, 1),
			     "A A",
			     "AAA",
			     "AAA",
			     'A', ModItems.chain_mail
			     );
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings, 1),
			     "AAA",
			     "A A",
			     "A A",
			     'A', ModItems.chain_mail
			     );
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots, 1),
			     "A A",
			     "A A",
			     'A', ModItems.chain_mail
			     );
		
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1),
			     "A  ",
			     "ABA",
			     "AAA",
			     'A', ModItems.plate_iron , 'B' , Blocks.wool
			     );
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1),
			     "A  ",
			     "ABA",
			     "AAA",
			     'A', ModItems.plate_gold , 'B' , Blocks.wool
			     );
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1),
			     "A  ",
			     "ABA",
			     "AAA",
			     'A', Items.diamond , 'B' , Blocks.wool
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.bronze_helmet, 1),
			     "AAA",
			     "A A",
			     'A', ModItems.plate_bronze
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.bronze_chestplate, 1),
			     "A A",
			     "AAA",
			     "AAA",
			     'A', ModItems.plate_bronze
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.bronze_leggins, 1),
			     "AAA",
			     "A A",
			     "A A",
			     'A', ModItems.plate_bronze
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.bronze_boots, 1),
			     "A A",
			     "A A",
			     'A', ModItems.plate_bronze
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.cloute_helmet, 1),
			     "AAA",
			     "A A",
			     'A', ModItems.cloute
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.cloute_chestplate, 1),
			     "A A",
			     "AAA",
			     "AAA",
			     'A', ModItems.cloute
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.cloute_leggins, 1),
			     "AAA",
			     "A A",
			     "A A",
			     'A', ModItems.cloute
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.cloute_boots, 1),
			     "A A",
			     "A A",
			     'A', ModItems.cloute
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_helmet, 1),
			     "AAA",
			     "A A",
			     'A', ModItems.copper_ingot
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_chestplate, 1),
			     "A A",
			     "AAA",
			     "AAA",
			     'A', ModItems.copper_ingot
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_leggins, 1),
			     "AAA",
			     "A A",
			     "A A",
			     'A', ModItems.copper_ingot
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_boots, 1),
			     "A A",
			     "A A",
			     'A', ModItems.copper_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_helmet, 1),
			     "AAA",
			     "A A",
			     'A', ModItems.plate_mithril
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_chestplate, 1),
			     "A A",
			     "AAA",
			     "AAA",
			     'A', ModItems.plate_mithril
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_leggins, 1),
			     "AAA",
			     "A A",
			     "A A",
			     'A', ModItems.plate_mithril
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_boots, 1),
			     "A A",
			     "A A",
			     'A', ModItems.plate_mithril
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_helmet, 1),
			     "AAA",
			     "A A",
			     'A', ModItems.plate_obsidian
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_chestplate, 1),
			     "A A",
			     "AAA",
			     "AAA",
			     'A', ModItems.plate_obsidian
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_leggins, 1),
			     "AAA",
			     "A A",
			     "A A",
			     'A', ModItems.plate_obsidian
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_boots, 1),
			     "A A",
			     "A A",
			     'A', ModItems.plate_obsidian
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.steel_helmet, 1),
			     "AAA",
			     "A A",
			     'A', ModItems.plate_steel
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.steel_chestplate, 1),
			     "A A",
			     "AAA",
			     "AAA",
			     'A', ModItems.plate_steel
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.steel_leggins, 1),
			     "AAA",
			     "A A",
			     "A A",
			     'A', ModItems.plate_steel
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.steel_boots, 1),
			     "A A",
			     "A A",
			     'A', ModItems.plate_steel
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.ebene_helmet, 1),
			     "AAA",
			     "B B",
			     'A', ModItems.obsidian_ingot, 'B', ModItems.plate_gold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.ebene_chestplate, 1),
			     "A A",
			     "ABA",
			     "BAB",
			     'A', ModItems.obsidian_ingot, 'B', ModItems.plate_gold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.ebene_leggins, 1),
			     "AAA",
			     "B B",
			     "A A",
			     'A', ModItems.obsidian_ingot, 'B', ModItems.plate_gold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.ebene_boots, 1),
			     "B B",
			     "A A",
			     'A', ModItems.obsidian_ingot, 'B', ModItems.plate_gold
			     );
		
	}
}
