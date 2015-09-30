package com.mod_rpg.Item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemSeedsCustom extends ItemSeeds implements net.minecraftforge.common.IPlantable{
	
	public ItemSeedsCustom(Block crops, Block soil, String name) {
		super(crops, soil);
		this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMaterials);
		// TODO Auto-generated constructor stub
	}

}
