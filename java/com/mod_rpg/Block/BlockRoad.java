package com.mod_rpg.Block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockRoad extends SimpleBlock{

	public BlockRoad(Material materialIn, String name) {
		super(materialIn, name);
	}

	 public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity)
	    
	    {
	    
	    
	    if(entity instanceof EntityPlayer){
	    EntityPlayer player = (EntityPlayer)entity;
	    player.setAIMoveSpeed(player.getAIMoveSpeed()*2);
player.motionX *=5D;
player.motionY *=5D;
    }
}
}
