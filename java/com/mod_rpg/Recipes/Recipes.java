package com.mod_rpg.Recipes;



import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.mod_rpg.CoreMod.ModItems;




public class Recipes {
	
	public static void addRecipes()
	{
		//crafting
		//craft add to the basic game
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone,1),
			     "AA",
			     "AA",
			     'A', ModItems.rock
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.burin,1),
			     "AAA",
			     " A ",
			     " A ",
			     'A', Blocks.cobblestone
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.hammer,1),
			     "AAA",
			     "AAA",
			     " B ",
			     'A', Blocks.cobblestone,'B',Items.stick
			     );
		/*GameRegistry.addRecipe(new ItemStack(ModItems.chain_mail, 16),
			     " A ",
			     "A A",
			     " A ",
			     'A', ModItems.chain_mail
			     );*/
		/**/
		
		
		//alliage
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bronze_ingot), new Object[]
			     {
			      ModItems.copper_ingot, ModItems.tin_ingot ,ModItems.tin_ingot ,ModItems.tin_ingot
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidian_ore), new Object[]
			     {
			      Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian
			     });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cloute), new Object[]
			     {
			      Items.iron_ingot, Items.leather, Items.leather
			     });
			
		//armor
		
		
		

		//tool
		/*GameRegistry.addRecipe(new ItemStack(ModItems.copper_pickaxe, 1),
			     "AAA",
			     " B ",
			     " B ",
			     'A', ModItems.copper_ingot , 'B' , Items.stick
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_axe, 1),
			     "AA ",
			     "AB ",
			     " B ",
			     'A', ModItems.copper_ingot , 'B' , Items.stick
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_hoe, 1),
			     "AA ",
			     " B ",
			     " B ",
			     'A', ModItems.copper_ingot , 'B' , Items.stick
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_shovel, 1),
			     "A",
			     "B",
			     "B",
			     'A', ModItems.copper_ingot , 'B' , Items.stick
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_saw, 1),
			     " B ",
			     "B B",
			     "AAA",
			     'A', ModItems.copper_ingot , 'B' , Items.stick
			     );*/
		
		
		//mold
		
		/*GameRegistry.addRecipe(new ItemStack(ModItems.iron_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.iron_nugget,'B', ModItems.rock_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.iron_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.iron_nugget,'B',ModItems.clay_mold
			     );*/
		/*GameRegistry.addRecipe(new ItemStack(ModItems.gold_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.gold_nugget_custom, 'B' ,ModItems.clay_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.gold_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.gold_nugget_custom, 'B' ,ModItems.rock_mold
			     );*/
		/*GameRegistry.addRecipe(new ItemStack(ModItems.mithril_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.mithril_nugget, 'B' ,ModItems.rock_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.mithril_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.mithril_nugget, 'B' ,ModItems.clay_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_ingot_mold,1),
			     "AAA",
			     " B ",
			     'A', ModItems.copper_nugget, 'B' ,ModItems.clay_mold
			     );
		GameRegistry.addRecipe(new ItemStack(ModItems.copper_ingot_mold),
			     "AAA",
			     " B ",
			     'A', ModItems.copper_nugget, 'B' ,ModItems.rock_mold
			     );*/
		
			
		
		
		
	}
}
