package com.mod_rpg.Item;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import com.google.common.collect.Sets;
import com.mod_rpg.CoreMod.ModBlocks;

public class ItemSpadeCustom extends ItemToolCustom{
	private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.clay, Blocks.dirt, Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer, Blocks.soul_sand, ModBlocks.salt_block});
    private static final String __OBFID = "CL_00000063";

    public ItemSpadeCustom(CustomToolMaterial material, String name, int manche)
	{
		super(1.0F, material, EFFECTIVE_ON, manche);
	setUnlocalizedName(name);

	}
    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.snow_layer ? true : blockIn == Blocks.snow;
    }
}
