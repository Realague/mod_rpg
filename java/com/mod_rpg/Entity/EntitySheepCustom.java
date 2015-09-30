package com.mod_rpg.Entity;

import com.mod_rpg.CoreMod.ModItems;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntitySheepCustom extends EntitySheep{

	public EntitySheepCustom(World worldIn) {
		super(worldIn);
	}
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        if (!this.getSheared())
        {
            this.entityDropItem(new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, this.getFleeceColor().getMetadata()), 0.0F);
        }

        int j = 1;

        for (int k = 0; k < j; ++k)
        {
            //this.dropItem(ModItems.sheep_corp, 1);
        }
    }
}
