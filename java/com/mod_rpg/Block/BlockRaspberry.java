package com.mod_rpg.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.ModBlocks;
import com.mod_rpg.CoreMod.ModItems;

public class BlockRaspberry extends BlockBush{

		public BlockRaspberry(String name) 
		{
			super(Material.plants);
			this.setStepSound(soundTypeGrass); 
			this.setTickRandomly(true); 
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			this.setUnlocalizedName(name);
		}
		
		public boolean canPlaceBlockAt(World world, BlockPos pos)
		{
			return super.canPlaceBlockAt(world, pos) && world.getBlockState(pos.down()).getBlock().canSustainPlant(world,
			pos.down(), net.minecraft.util.EnumFacing.UP, this);
		}

		protected boolean canPlaceBlockOn(Block ground)
		{
			return ground == Blocks.grass || ground == Blocks.dirt || ground == Blocks.farmland;
		}
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float
				hitX, float hitY, float hitZ)
				{
					if (this == ModBlocks.bush_raspberry) 
					{
						world.setBlockState(pos, ModBlocks.bush_raspberry_simple.getDefaultState());
						dropBerry(world, pos);
					}
					return null == null;
				}


	    protected void dropBerry(World world, BlockPos pos)
	    {
	    	if (this == ModBlocks.bush_raspberry_simple || this == ModBlocks.bush_raspberry)
	    	{
	    		spawnAsEntity(world, pos, new ItemStack(ModItems.raspberry, 1 + RANDOM.nextInt(2))); 
	    	}
	    }
	    protected void makeBerry(World world, BlockPos pos)
	    {
	    	if (this == ModBlocks.bush_raspberry_simple)
	    	{
	    		world.setBlockState(pos, ModBlocks.bush_raspberry.getDefaultState());
	    	}
	    }
	    public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player)
	    {
	    	if (this == ModBlocks.bush_raspberry)
	    	{
	    		spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(this), 1));
	    		spawnAsEntity(world, pos, new ItemStack(ModItems.raspberry, 1 + RANDOM.nextInt(2)));
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
	    			if (this == ModBlocks.bush_raspberry_simple)
	    			{
	    				makeBerry(world, pos);
	    			}
	    		}
	    	}
	    }
	}

