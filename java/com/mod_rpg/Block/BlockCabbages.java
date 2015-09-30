package com.mod_rpg.Block;

import net.minecraft.item.Item;

import com.mod_rpg.CoreMod.ModItems;

public class BlockCabbages extends CropsBlock{
	
	public BlockCabbages(String name) {
		super(name);

	}

	@Override
	   protected Item getSeed()
	    {
	        return ModItems.seeds_cabbages;
	    }
	   
	   @Override
	    protected Item getCrop()
	    {
	        return ModItems.cabbages;
	    }
}
