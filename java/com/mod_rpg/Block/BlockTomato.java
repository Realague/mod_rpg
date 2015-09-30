package com.mod_rpg.Block;

import net.minecraft.item.Item;

import com.mod_rpg.CoreMod.ModItems;

public class BlockTomato extends CropsBlock{
	public BlockTomato(String name) {
		super(name);
	}

	@Override
	   protected Item getSeed()
	    {
	        return ModItems.seeds_tomato;
	    }
	   
	   @Override
	    protected Item getCrop()
	    {
	        return ModItems.tomato;
	    }
}
