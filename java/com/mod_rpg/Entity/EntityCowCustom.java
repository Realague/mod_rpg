package com.mod_rpg.Entity;

import com.mod_rpg.CoreMod.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityCowCustom extends EntityCow{

	public EntityCowCustom(World worldIn) {
		super(worldIn);
	}

    @Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = 1;
        int k;

        for (k = 0; k < j; ++k)
        {
        	this.dropItem(ModItems.cow_corp, 1);
            
        }
    }

}
