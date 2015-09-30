package com.mod_rpg.Recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.mod_rpg.CoreMod.ModItems;

public class RecipesFood {
	public static void addRecipesFood()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.bottle_cacao, 6),
			     "CCC",
			     " B ",
			     " A ",
			     'A', Items.glass_bottle ,'B',Items.milk_bucket, 'C', new ItemStack(Items.dye, 3, 3)
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.arriere_beef, 1),
			     "VVC",
			     'V', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ),'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', Items.beef
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.avant_beef, 1),
				"CVV",
				'V', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ),'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', Items.beef
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.rib_beef, 6),
				"VV",
				" V",
				'V', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ),'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', Items.beef
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.rib_pig, 6),
				"VV",
				" V",
				'V', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.pig_corp
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.leg_pig, 4),
				"HV",
				'H', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.pig_corp
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.roast_pig, 6),
				"HV",
				"H ",
				'H', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.pig_corp
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.rib_pig, 2),
				"HVC",
				"H ",
				'H', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.pig_corp,'C', new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE)
				);
		
		/*GameRegistry.addRecipe(new ItemStack(ModItems.leg_sheep, 4),
				"HVH",
				"H ",
				'H', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.pig_corp
				);*/
		
		GameRegistry.addRecipe(new ItemStack(ModItems.roast_beef),
				"CV",
				 'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.leg_beef
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.ham),
				"CV",
				 'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.leg_pig
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.knuckle_pig),
				"CV",
				 'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.ham
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.roast_beef),
				"CVC",
				 'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.avant_beef
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.knuckle_beef),
				"CV",
				 'C',new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.ham
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.ham_salt),
				"SVS",
				"SSS",
				 'S',ModItems.salt, 'V', ModItems.ham
				);
		/*GameRegistry.addRecipe(new ItemStack(ModItems.ham_sheep_salt),
				"SVS",
				"SSS",
				 'S',ModItems.salt, 'V', ModItems.ham_sheep
				);
		GameRegistry.addRecipe(new ItemStack(ModItems.leg_sheep, 4),
			     "VVC",
			     'V', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ),'B',ModItems.knife_butcher, 'V', ModItems.sheep_corp
			     );
		
		GameRegistry.addRecipe(new ItemStack(ModItems.rib_sheep, 6),
				"HV",
				'H', new ItemStack(ModItems.axe_butcher,1,OreDictionary.WILDCARD_VALUE ), 'V', ModItems.sheep_corp
				);*/
		
		GameRegistry.addSmelting(ModItems.rib_beef, new ItemStack(ModItems.rib_beef_cooked), 0.0F);
		GameRegistry.addSmelting(ModItems.rib_pig, new ItemStack(ModItems.rib_pig_cooked), 0.0F);
		GameRegistry.addSmelting(ModItems.knuckle_beef, new ItemStack(ModItems.knuckle_beef_cooked), 0.0F);
		GameRegistry.addSmelting(ModItems.roast_beef, new ItemStack(ModItems.roast_beef_cooked), 0.0F);
		GameRegistry.addSmelting(ModItems.ham, new ItemStack(ModItems.ham_cooked), 0.0F);
		GameRegistry.addSmelting(ModItems.roast_pig, new ItemStack(ModItems.roast_pig_cooked), 0.0F);
		GameRegistry.addSmelting(ModItems.knuckle_pig, new ItemStack(ModItems.knuckle_pig_cooked), 0.0F);
		
		/*GameRegistry.addRecipe(new ItemStack(ModItems.bucket_wood),
				"V V",
				"SVS",
				 'S',ModItems.chain_mail, 'V', Blocks.planks
				);*/
		
		GameRegistry.addRecipe(new ItemStack(ModItems.bucket_hydromel),
				"OHO",
				"FFF",
				"PSP",
				 'S',ModItems.bucket_wood, 'O', ModItems.orge,'F',Items.potionitem, 'H', ModItems.fairholly,'P', Items.sugar
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.bucket_beer),
				"OOO",
				"FFF",
				"PSP",
				 'S',ModItems.bucket_wood, 'O', ModItems.orge,'F',Items.potionitem,'P', Items.sugar
				);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.bucket_rhum),
				"CCC",
				"FFF",
				"PSP",
				 'S',ModItems.bucket_wood,'F',Items.potionitem,'P', Items.sugar,'C',Items.reeds
				);
		
		/*GameRegistry.addRecipe(new ItemStack(ModItems.bucket_vine),
				"RRR",
				"FFF",
				"PSP",
				 'S',ModItems.bucket_wood, 'O', ModItems.orge,'F',Items.potionitem,'P', Items.sugar,'R',ModItems.raisin
				);*/
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.floor, 2), new Object[]
			     {
			Items.wheat,ModItems.pilon
			     });
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.floor, 2), new Object[]
			     {
			ModItems.orge,ModItems.pilon
			     });
	}

}
