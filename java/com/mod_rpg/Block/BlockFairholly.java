package com.mod_rpg.Block;

import com.mod_rpg.CoreMod.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockFairholly extends CropsBlock{
	
public BlockFairholly(String name) {
		super(name);
	}

protected Item getSeed()
    {
        return ModItems.seeds_fairholly;
    }

    protected Item getCrop()
    {
        return ModItems.fairholly;
    }
    
}
