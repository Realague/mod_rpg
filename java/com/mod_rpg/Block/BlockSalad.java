package com.mod_rpg.Block;

import net.minecraft.item.Item;

import com.mod_rpg.CoreMod.ModItems;

public class BlockSalad extends CropsBlock{
	public BlockSalad(String name) {
		super(name);
	}

	@Override
	   protected Item getSeed()
	    {
	        return ModItems.seeds_salad;
	    }
	   
	   @Override
	    protected Item getCrop()
	    {
	        return ModItems.salad;
	    }
}
