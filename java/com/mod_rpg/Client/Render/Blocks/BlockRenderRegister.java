package com.mod_rpg.Client.Render.Blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.CoreMod.ModBlocks;

public final class BlockRenderRegister {

	public static void registerBlockRenderer() {
		reg(ModBlocks.crops_salad);
		reg(ModBlocks.crops_malt);
		reg(ModBlocks.crops_tomato);
		reg(ModBlocks.crops_cabbages);
		reg(ModBlocks.adamantine_ore);
		//reg(ModBlocks.apple_green_sapling);
		//reg(ModBlocks.apple_sapling);
		reg(ModBlocks.barrel_beer);
		reg(ModBlocks.barrel_hydromel);
		reg(ModBlocks.barrel_rhum);
		reg(ModBlocks.barrel_vine);
		reg(ModBlocks.crops_fairholly);
		reg(ModBlocks.bush_blueberry);
		reg(ModBlocks.bush_blueberry_simple);
		reg(ModBlocks.bush_raspberry);
		reg(ModBlocks.bush_raspberry_simple);
		reg(ModBlocks.bush_strawberry);
		reg(ModBlocks.bush_strawberry_simple);
		reg(ModBlocks.crops_orge);
		reg(ModBlocks.copper_ore);
		//reg(ModBlocks.poire_sapling);
		reg(ModBlocks.tin_ore);
		reg(ModBlocks.mithril_ore);
		reg(ModBlocks.roof_oak);
		/*reg(ModBlocks.roof, 0, "block_roof_oak");
		reg(ModBlocks.roof, 1, "block_roof_hay");*/
		}

	public static String modid = Main.MODID;
	public static void reg(Block block, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
