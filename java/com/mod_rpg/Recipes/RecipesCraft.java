package com.mod_rpg.Recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.mod_rpg.CoreMod.ModItems;
import com.mod_rpg.Item.CustomToolMaterial;
import com.mod_rpg.Item.ItemPickaxeCustom;
import com.mod_rpg.Item.ItemSwordCustom;

public class RecipesCraft {

	public static void addRecipes()
	{
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hammer_burin), new Object[]
			     {
			      ModItems.burin,ModItems.hammer,
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks), new Object[]
			     {
			      Blocks.log, new ItemStack(ModItems.copper_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,1,1), new Object[]
			     {
			new ItemStack(Blocks.log,1,1), new ItemStack(ModItems.copper_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,1,2), new Object[]
			     {
			new ItemStack(Blocks.log,1,2), new ItemStack(ModItems.copper_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,1,3), new Object[]
			     {
			new ItemStack(Blocks.log,1,3), new ItemStack(ModItems.copper_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,1,4), new Object[]
			     {
			new ItemStack(Blocks.log,1,4), new ItemStack(ModItems.copper_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,1,5), new Object[]
			     {
			new ItemStack(Blocks.log,1,5), new ItemStack(ModItems.copper_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		//saw iron
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,0), new Object[]
			     {
			new ItemStack(Blocks.log,1,0), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,1), new Object[]
			     {
			new ItemStack(Blocks.log,1,1), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,2), new Object[]
			     {
			new ItemStack(Blocks.log,1,2), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,3), new Object[]
			     {
			new ItemStack(Blocks.log,1,3), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,4), new Object[]
			     {
			new ItemStack(Blocks.log,1,4), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,5), new Object[]
			     {
			new ItemStack(Blocks.log,1,5), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		//saw diamond
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,8,0), new Object[]
			     {
			new ItemStack(Blocks.log,1,0), new ItemStack(ModItems.diamond_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,8,1), new Object[]
			     {
			new ItemStack(Blocks.log,1,1), new ItemStack(ModItems.diamond_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,8,2), new Object[]
			     {
			new ItemStack(Blocks.log,1,2), new ItemStack(ModItems.diamond_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,8,3), new Object[]
			     {
			new ItemStack(Blocks.log,1,3), new ItemStack(ModItems.diamond_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,8,4), new Object[]
			     {
			new ItemStack(Blocks.log,1,4), new ItemStack(ModItems.diamond_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,8,5), new Object[]
			     {
			new ItemStack(Blocks.log,1,5), new ItemStack(ModItems.diamond_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		//saw iron
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,0), new Object[]
			     {
			new ItemStack(Blocks.log,1,0), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,1), new Object[]
			     {
			new ItemStack(Blocks.log,1,1), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,2), new Object[]
			     {
			new ItemStack(Blocks.log,1,2), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,3), new Object[]
			     {
			new ItemStack(Blocks.log,1,3), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,4), new Object[]
			     {
			new ItemStack(Blocks.log,1,4), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,6,5), new Object[]
			     {
			new ItemStack(Blocks.log,1,5), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		//saw iron
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,12,0), new Object[]
			     {
			new ItemStack(Blocks.log,1,0), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,12,1), new Object[]
			     {
			new ItemStack(Blocks.log,1,1), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,12,2), new Object[]
			     {
			new ItemStack(Blocks.log,1,2), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,12,3), new Object[]
			     {
			new ItemStack(Blocks.log,1,3), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,12,4), new Object[]
			     {
			new ItemStack(Blocks.log,1,4), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks,12,5), new Object[]
			     {
			new ItemStack(Blocks.log,1,5), new ItemStack(ModItems.iron_saw,1,OreDictionary.WILDCARD_VALUE ),
			     });
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_saw, 1),
			     " B ",
			     "B B",
			     "AAA",
			     'A', Items.iron_ingot , 'B' , Items.stick
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.diamond_saw, 1),
			     " B ",
			     "B B",
			     "AAA",
			     'A', Items.diamond , 'B' , Items.stick
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_saw, 1),
			     " B ",
			     "B B",
			     "AAA",
			     'A', Items.iron_ingot , 'B' , Items.stick
			     );
		
		//
		GameRegistry.addRecipe(new ItemStack(ModItems.head_axe_stone, 1),
			     "BBA",
			     "B  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.rock
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.head_axe_gold, 1),
			     "BBA",
			     "B  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.gold_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_axe_mithril, 1),
			   	 "BBA",
			     "B  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.mithril_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_axe_iron, 1),
				 "BBA",
			     "B  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_axe_diamond, 1),
				 "BBA",
			     "B  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_pickaxe_stone, 1),
				 "BBB",
			     "A  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.rock
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.head_pickaxe_gold, 1),
			     "BBA",
			     "B  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.gold_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_pickaxe_mithril, 1),
			     "BBB",
			     "A  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.mithril_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_pickaxe_iron, 1),
			     "BBB",
			     "A  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_pickaxe_diamond, 1),
			     "BBB",
			     "A  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_hoe_stone, 1),
				 "BBB",
			     "A  ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.rock
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.head_hoe_gold, 1),
				 "BB",
			     " A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.gold_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_hoe_mithril, 1),
				 "BB",
			     " A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.mithril_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_hoe_iron, 1),
			     "BB",
			     " A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_hoe_diamond, 1),
			     "BB",
			     " A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_shovel_stone, 1),
				 "B",
			     "A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.rock
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.head_shovel_gold, 1),
				 "B",
			     "A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.gold_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_shovel_mithril, 1),
				 "B",
			     "A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.mithril_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_shovel_iron, 1),
			     "B",
			     "A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.head_shovel_diamond, 1),
			     "B",
			     "A",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.blade_stone, 1),
			     "B  ",
			     "BB ",
			     "BBA",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.rock
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.blade_gold, 1),
				 "B  ",
			     "BB ",
			     "BBA",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.gold_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.blade_diamond, 1),
				 "B  ",
			     "BB ",
			     "BBA",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.blade_mithril, 1),
				 "B  ",
			     "BB ",
			     "BBA",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.mithril_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.blade_bronze, 1),
				 "B  ",
			     "BB ",
			     "BBA",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.bronze_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.blade_steel, 1),
				 "B  ",
			     "BB ",
			     "BBA",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.steel_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.blade_iron, 1),
				 "B  ",
			     "BB ",
			     "BBA",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.iron_ingot
			     );
		
		//manche
		GameRegistry.addRecipe(new ItemStack(ModItems.manche_iron, 1),
			     " B ",
			     " B ",
			     "AB",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manche_leather, 1),
			     "ABA",
			     "ABA",
			     "ABA",
			     'A', Items.leather, 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manche_mithril, 1),
			     " B ",
			     " B ",
			     "AB",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.mithril_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manche_steel, 1),
			     " B ",
			     " B ",
			     "AB",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.steel_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manche_stone, 1),
			     " B ",
			     " B ",
			     " B",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.rock
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.manche_wood, 1),
			     " B ",
			     " B ",
			     " B",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Blocks.planks
			     );
		//garde
		GameRegistry.addRecipe(new ItemStack(ModItems.garde_wood, 1),
			     "BBB",
			     " B ",
			     " B ",
			     'B' , Blocks.planks
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.garde_bronze, 1),
			     "BBB",
			     " B ",
			     "AB ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.bronze_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.garde_iron, 1),
			     "BBB",
			     " B ",
			     "AB ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.garde_leather, 1),
			     "BBB",
			     "ABA",
			     "ABA",
			     'A', Items.leather, 'B' , Items.iron_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.garde_mithril, 1),
			     "BBB",
			     " B ",
			     "AB ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.mithril_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.garde_obsidian, 1),
			     "BBB",
			     " B ",
			     "AB ",
			     'A', new ItemStack(ModItems.hammer,1,OreDictionary.WILDCARD_VALUE ), 'B' , ModItems.obsidian_ingot
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.garde_wood, 1),
			     "BBB",
			     " B ",
			     " B ",
			     'B' , Blocks.planks	     
			     );
		
		//tools
		//hoe
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_hoe_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_hoe_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_hoe_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_hoe_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_hoe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_hoe_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_hoe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_hoe_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_hoe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_hoe_iron    
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.wood_hoe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_hoe_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_hoe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_hoe_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_hoe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_hoe_gold    
			     );

		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_hoe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_hoe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_hoe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_hoe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_hoe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_hoe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_hoe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_hoe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_hoe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_hoe_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_hoe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_hoe_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_hoe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_hoe_mithril    
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_hoe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_hoe_mithril   
			     );
		//shovel
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_shovel_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_shovel_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_shovel_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_shovel_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_shovel_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_shovel_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_shovel_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_shovel_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_shovel_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_shovel_iron    
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.wood_shovel_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_shovel_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_shovel_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_shovel_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_shovel_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_shovel_gold    
			     );

		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_shovel_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_shovel_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_shovel_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_shovel_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_shovel_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_shovel_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_shovel_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_shovel_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_shovel_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_shovel_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_shovel_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_shovel_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_shovel_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_shovel_mithril    
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_shovel_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_shovel_mithril   
			     );
		//axe
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_axe_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_axe_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_axe_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_axe_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_axe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_axe_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_axe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_axe_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_axe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_axe_iron    
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.wood_axe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_axe_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_axe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_axe_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_axe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_axe_gold    
			     );

		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_axe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_axe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_axe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_axe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_axe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_axe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_axe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_axe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_axe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_axe_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_axe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_axe_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_axe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_axe_mithril    
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_axe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_axe_mithril   
			     );
		//pickaxe
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_pickaxe_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_pickaxe_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_pickaxe_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_pickaxe_stone     
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_pickaxe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_pickaxe_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_pickaxe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_pickaxe_iron    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_pickaxe_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_pickaxe_iron    
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.wood_pickaxe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_pickaxe_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_pickaxe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_pickaxe_gold    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_pickaxe_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_pickaxe_gold    
			     );

		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_pickaxe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_pickaxe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_pickaxe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_pickaxe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_pickaxe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_pickaxe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_pickaxe_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_pickaxe_diamond    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.wood_pickaxe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_wood, 'A', ModItems.head_pickaxe_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leather_pickaxe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_leather, 'A', ModItems.head_pickaxe_mithril    
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_pickaxe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_iron, 'A', ModItems.head_pickaxe_mithril    
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_pickaxe_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.manche_mithril, 'A', ModItems.head_pickaxe_mithril   
			     );
		//sword
		
		/*GameRegistry.addRecipe(new ItemStack(ModItems.wood_sword_stone, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_wood, 'A', ModItems.blade_stone
			     );*/

		GameRegistry.addRecipe(new ItemStack(ModItems.leather_sword_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_leather, 'A', ModItems.blade_iron
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_sword_iron, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_iron, 'A', ModItems.blade_iron
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.leather_sword_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_leather, 'A', ModItems.blade_gold
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_sword_gold, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_iron, 'A', ModItems.blade_gold
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.leather_sword_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_leather, 'A', ModItems.blade_diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_sword_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_iron, 'A', ModItems.blade_diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.bronze_sword_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_bronze, 'A', ModItems.blade_diamond
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_sword_diamond, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_mithril, 'A', ModItems.blade_diamond
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.leather_sword_bronze, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_leather, 'A', ModItems.blade_bronze
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_sword_bronze, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_iron, 'A', ModItems.blade_bronze
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.bronze_sword_bronze, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_bronze, 'A', ModItems.blade_bronze
			     );

		GameRegistry.addRecipe(new ItemStack(ModItems.leather_sword_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_leather, 'A', ModItems.blade_mithril
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_sword_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_iron, 'A', ModItems.blade_mithril
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.bronze_sword_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_bronze, 'A', ModItems.blade_mithril
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_sword_mithril, 1),
			     "A",
			     "B",
			     'B' , ModItems.garde_mithril, 'A', ModItems.blade_mithril
			     );

		//mold
	
		GameRegistry.addRecipe(new ItemStack(ModItems.clay_mold, 16),
			     "A A",
			     "AAA",
			     'A', Items.clay_ball 
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.rock_mold, 4),
			     "A A",
			     "AAA",
			     'A', ModItems.rock
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.tin_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.tin_nugget,'B' ,ModItems.clay_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.tin_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.tin_nugget,'B', ModItems.rock_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.adamantine_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.adamantine_nugget,'B' ,ModItems.clay_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.adamantine_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.adamantine_nugget,'B', ModItems.rock_mold
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.adamantine_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.adamantine_nugget,'B', ModItems.rock_mold
			     );
	}
}
