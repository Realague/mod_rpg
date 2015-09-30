package com.mod_rpg.Block;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.ModBlocks;
import com.mod_rpg.CoreMod.ModItems;

public class BlockGrape extends CropsBlock{

	public BlockGrape(String name) {
		super(name);
	}
	protected void makeGrapeSimple(World world, BlockPos pos)
    {
    	if (this==ModBlocks.crops_grape && ModBlocks.crops_grape.getBlockState().equals(7))
    	{
    		System.out.println("sa marche");
    		world.setBlockState(pos, ModBlocks.grape_simple.getDefaultState());
    	}
    }
	protected void makeGrape(World world, BlockPos pos)
    {
    	if (this==ModBlocks.grape_simple)
    	{
    		world.setBlockState(pos, ModBlocks.grapes.getDefaultState());
    	}
    }
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float
			hitX, float hitY, float hitZ)
			{
				if (this == ModBlocks.grapes) 
				{
					world.setBlockState(pos, ModBlocks.grape_simple.getDefaultState());
					dropBerry(world, pos);
				}
				return null == null;
			}
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player)
    {
    	if (this == ModBlocks.grapes)
    	{
    		spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(this), 1));
    		spawnAsEntity(world, pos, new ItemStack(ModItems.grape, 1 + RANDOM.nextInt(2)));
    	}
    }
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
    	super.updateTick(world, pos, state, rand);
    	int i = 1;

    	if (i < 20)
    	{
    		if (rand.nextInt((int)(5.0F) + 1) == 0)
    		{
    			if (this == ModBlocks.crops_grape)
    			{
    				makeGrapeSimple(world, pos);
    			}
    		}
    		if (rand.nextInt((int)(5.0F) + 1) == 0)
    		{
    			if (this == ModBlocks.grape_simple)
    			{
    				makeGrape(world, pos);
    			}
    		}
    	}
    }
	protected void dropBerry(World world, BlockPos pos)
    {
    	if (this == ModBlocks.grape_simple || this == ModBlocks.grapes)
    	{
    		spawnAsEntity(world, pos, new ItemStack(ModItems.grape, 1 + RANDOM.nextInt(2))); 
    	}
    }
	@Override
	   protected Item getSeed()
	    {
	        return ModItems.seeds_grape;
	    }
	   
	  /* @Override
	    protected Item getCrop()
	    {
	        return ModItems.grape;
	    }*/

}
