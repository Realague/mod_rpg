package com.mod_rpg.Block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.ModBlocks;
import com.mod_rpg.CoreMod.ModItems;

public class BlockOreCustom extends Block{
	private static final String __OBFID = "CL_00000282";

    public BlockOreCustom(String name, int level)
    {
        super(Material.rock);
        this.setHarvestLevel("pickaxe", level);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName(name);
        this.setHardness(10F);
        this.setResistance(20F);
    }
    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int j = 0;
            
            if (this == ModBlocks.copper_ore)
                j = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            else if (this == ModBlocks.mithril_ore)
                j = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            else if (this == ModBlocks.adamantine_ore)
                j = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            else if (this == ModBlocks.tin_ore)
                j = MathHelper.getRandomIntegerInRange(rand, 2, 5);

            return j;
        }
        return 0;
    }

    @Override
    public ArrayList getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
        ArrayList drops = new ArrayList();

        drops.add(new ItemStack(ModItems.rock));
        
        if (this == ModBlocks.mithril_ore)
            drops.add(new ItemStack(ModItems.mithril_nugget, RANDOM.nextInt(2)+ 3));
        else if (this == ModBlocks.adamantine_ore)
            drops.add(new ItemStack(ModItems.adamantine_nugget, RANDOM.nextInt(2)+ 3));
        else if (this == ModBlocks.copper_ore)
            drops.add(new ItemStack(ModItems.copper_nugget, RANDOM.nextInt(2)+ 3));
        else if (this == ModBlocks.tin_ore)
            drops.add(new ItemStack(ModItems.tin_nugget, RANDOM.nextInt(2)+ 3));
        return drops;
    }
}
