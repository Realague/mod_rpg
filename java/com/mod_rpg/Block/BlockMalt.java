package com.mod_rpg.Block;

import net.minecraft.item.Item;

import com.mod_rpg.CoreMod.ModItems;

public class BlockMalt extends CropsBlock{

	public BlockMalt(String name) {
		super(name);
	}
	@Override
	   protected Item getSeed()
	    {
	        return ModItems.seeds_malt;
	    }
	   
	   @Override
	    protected Item getCrop()
	    {
	        return ModItems.malt;
	    }

}
