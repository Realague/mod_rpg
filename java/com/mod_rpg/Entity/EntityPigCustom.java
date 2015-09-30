package com.mod_rpg.Entity;

import com.mod_rpg.CoreMod.ModItems;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityPigCustom extends EntityPig{

	public EntityPigCustom(World worldIn) {
		super(worldIn);

	}
	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = 1;

        for (int k = 0; k < j; ++k)
        {
            this.dropItem(ModItems.pig_corp, 1);
            this.dropItem(ModItems.liver, 1);
        }

        if (this.getSaddled())
        {
            this.dropItem(Items.saddle, 1);
        }
    }
}
