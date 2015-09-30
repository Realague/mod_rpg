package com.mod_rpg.Block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.ModItems;



public class BlockSalt extends SimpleBlock{

	public BlockSalt(String name, Material material) {
		super(material, name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabFood);
	}
    public Item getItem(World worldIn, BlockPos pos)
    {
        return ModItems.salt;
    }
    public int quantityDropped(Random random)
    {
        return 3;
    }
}
