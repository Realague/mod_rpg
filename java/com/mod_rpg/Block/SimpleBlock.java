package com.mod_rpg.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpleBlock extends Block{

	public SimpleBlock(Material materialIn, String name) {
		super(materialIn);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabBlock);

	}

	

	}


