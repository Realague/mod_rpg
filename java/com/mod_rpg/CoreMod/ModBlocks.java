package com.mod_rpg.CoreMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mod_rpg.Block.BlockBarrelBeer;
import com.mod_rpg.Block.BlockBarrelHydromel;
import com.mod_rpg.Block.BlockBarrelRhum;
import com.mod_rpg.Block.BlockBarrelVine;
import com.mod_rpg.Block.BlockBlueberry;
import com.mod_rpg.Block.BlockCabbages;
import com.mod_rpg.Block.BlockFairholly;
import com.mod_rpg.Block.BlockGrape;
import com.mod_rpg.Block.BlockOreCustom;
import com.mod_rpg.Block.BlockOrge;
import com.mod_rpg.Block.BlockRaspberry;
import com.mod_rpg.Block.BlockRoof;
import com.mod_rpg.Block.BlockSalt;
import com.mod_rpg.Block.BlockStrawberry;
import com.mod_rpg.Block.BlockTestLeather;
import com.mod_rpg.Block.BlockTomato;
import com.mod_rpg.Block.ModBlockTileEntity;
import com.mod_rpg.Block.ModTileEntity;

public class ModBlocks {
	 public static Block barrel_beer, barrel_vine, barrel_rhum, barrel_hydromel, crops_orge,crops_grape, bush_blueberry_simple,bush_raspberry_simple,bush_strawberry_simple, bush_strawberry, bush_blueberry,bush_raspberry
	    ,crops_fairholly,salt_block, crops_tomato,crops_cabbages,grape_simple,grapes,crops_salad,crops_malt,
	    leaves_apple_simple,leaves_apple,leaves_apple_green_simple,leaves_apple_green,leaves_poire_simple,leaves_poire,poire_sapling,apple_sapling,apple_green_sapling;
	   
	public static Block copper_ore, tin_ore, mithril_ore, BlockRoad, modBlockTileEntity,
	adamantine_ore,Test;
	public static Block chair,throne,table,bench,Brasero,lantern,roof_oak;
	
	public static void createBlocks() {
		GameRegistry.registerBlock(roof_oak = new BlockRoof(Blocks.log.getDefaultState(),"roof_oak"), "roof_oak");
	
		
		GameRegistry.registerBlock(copper_ore = new BlockOreCustom("copper_ore", 1).setResistance(3.0F), "copper_ore");  	
    	GameRegistry.registerBlock(tin_ore = new BlockOreCustom("tin_ore", 1).setResistance(3.0F), "tin_ore");
    	GameRegistry.registerBlock(mithril_ore = new BlockOreCustom("mithril_ore",3).setResistance(10.0F), "mithril_ore");
    	GameRegistry.registerBlock(adamantine_ore = new BlockOreCustom("adamantine_ore",3), "adamantine_ore");
    	//GameRegistry.registerBlock(BlockRoad, "BlockRoad");
    	//BlockRoad = new com.mod_rpg.Block.BlockRoad(Material.rock, "BlockRoad").setResistance(10.0F);
	}
	public static void createBlocksFood() {
		//GameRegistry.registerBlock(leaves_poire_simple, "leaves_poire_simple");
    	//GameRegistry.registerBlock(leaves_poire, "leaves_poire");
    	//GameRegistry.registerBlock(leaves_apple_simple, "leaves_apple_simple");
    	//GameRegistry.registerBlock(leaves_apple, "leaves_apple");
    	//GameRegistry.registerBlock(leaves_apple_green_simple, "leaves_apple_green_simple");
    	//GameRegistry.registerBlock(leaves_apple_green, "leaves_apple_green");
    	//GameRegistry.registerBlock(poire_sapling, "poire_sapling");
    	//GameRegistry.registerBlock(apple_sapling, "apple_sapling");
    	//GameRegistry.registerBlock(apple_green_sapling, "apple_green_sapling");
    	
    	GameRegistry.registerBlock(salt_block = new BlockSalt("salt_block",Material.sand), "salt_block");
    	GameRegistry.registerBlock(bush_strawberry_simple = new BlockStrawberry("bush_strawberry_simple").setCreativeTab(CreativeTabs.tabFood), "bush_strawberry_simple");
    	GameRegistry.registerBlock(bush_strawberry = new BlockStrawberry("bush_strawberry"), "bush_strawberry");
    	GameRegistry.registerBlock(bush_blueberry_simple = new BlockBlueberry("bush_raspberry_simple").setCreativeTab(CreativeTabs.tabFood), "bush_blueberry_simple");
    	GameRegistry.registerBlock(bush_blueberry = new BlockBlueberry("bush_blueberry"), "bush_blueberry");
    	GameRegistry.registerBlock(bush_raspberry_simple = new BlockRaspberry("bush_raspberry_simple").setCreativeTab(CreativeTabs.tabFood), "bush_raspberry_simple");
    	GameRegistry.registerBlock(bush_raspberry = new BlockRaspberry("bush_raspberry"), "bush_raspberry");
    	
    	GameRegistry.registerBlock(barrel_beer = new BlockBarrelBeer(Material.wood, "barrel_beer").setHardness(2.0F), "barrel_beer");
    	GameRegistry.registerBlock(barrel_vine = new BlockBarrelVine(Material.wood, "barrel_vine").setHardness(2.0F), "barrel_vine");
    	GameRegistry.registerBlock(barrel_rhum = new BlockBarrelRhum(Material.wood, "barrel_rhum").setHardness(2.0F), "barrel_rhum");
    	GameRegistry.registerBlock(barrel_hydromel = new BlockBarrelHydromel(Material.wood, "barrel_hydromel").setHardness(2.0F), "barrel_hydromel");
    	//GameRegistry.registerBlock(Test = new BlockTestLeather(Material.wood,"Test").setHardness(2.0F), "Test");
    	GameRegistry.registerBlock(modBlockTileEntity = new ModBlockTileEntity("tile_entity").setCreativeTab(CreativeTabs.tabAllSearch), "tile_entity");
    	
    	GameRegistry.registerBlock(crops_salad = new BlockGrape("crops_salad"), "crops_salad");
    	GameRegistry.registerBlock(crops_malt = new BlockOrge("crops_malt"), "crops_malt");
    	GameRegistry.registerBlock(crops_grape = new BlockGrape("crops_grape"), "crops_grape");
    	GameRegistry.registerBlock(crops_orge = new BlockOrge("crops_orge"), "crops_orge");
    	GameRegistry.registerBlock(crops_fairholly = new BlockFairholly("crops_fairholly"), "crops_fairholly");
    	GameRegistry.registerBlock(crops_tomato = new BlockTomato("crops_tomato"), "crops_tomato");
    	GameRegistry.registerBlock(crops_cabbages = new BlockCabbages("crops_cabbages"), "crops_cabbages");
    	GameRegistry.registerBlock(grapes = new BlockGrape("grapes"), "grapes");
    	GameRegistry.registerBlock(grape_simple = new BlockGrape("grape_simple"), "grape_simple");
	}
}
