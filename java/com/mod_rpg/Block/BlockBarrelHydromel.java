package com.mod_rpg.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.ModItems;


public class BlockBarrelHydromel extends Block{
public static final PropertyInteger LEVELS = PropertyInteger.create("levels", 0, 16);
	
	public BlockBarrelHydromel(Material materialIn, String name) {
		super(Material.wood);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setDefaultState(this.blockState.getBaseState().withProperty(LEVELS, Integer.valueOf(16)));
	}
	public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean isFullCube()
    {
        return false;
    }
    
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
	        if (worldIn.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            ItemStack itemstack = playerIn.inventory.getCurrentItem();

	            if (itemstack == null)
	            {
	                return true;
	            }
	            else
	            {
	                int i = ((Integer)state.getValue(LEVELS)).intValue();
	                Item item = itemstack.getItem();

	                if (item == ModItems.bucket_hydromel)
	                {
	                    if (i < 3)
	                    {
	                        if (!playerIn.capabilities.isCreativeMode)
	                        {
	                            playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, new ItemStack(ModItems.bucket_wood));
	                        }

	                        this.setWaterLevel(worldIn, pos, state, 16);
	                    }

	                    return true;
	                }
	                else
	                {
	                    ItemStack itemstack1;

	                    if (item == ModItems.empty_chope)
	                    {
	                        if (i > 0)
	                        {
	                            if (!playerIn.capabilities.isCreativeMode)
	                            {
	                                itemstack1 = new ItemStack(ModItems.hydromel_chop,1,0);

	                                if (!playerIn.inventory.addItemStackToInventory(itemstack1))
	                                {
	                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
	                                }
	                                else if (playerIn instanceof EntityPlayerMP)
	                                {
	                                    ((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
	                                }

	                                --itemstack.stackSize;

	                                if (itemstack.stackSize <= 0)
	                                {
	                                    playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, (ItemStack)null);
	                                }
	                            }

	                            this.setWaterLevel(worldIn, pos, state, i - 1);
	                        }

	                        return true;
	                    }
	                    
	                }
	            }
	        }
			return enableStats;
	    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(LEVELS, Integer.valueOf(meta));
    }
    public void setWaterLevel(World worldIn, BlockPos pos, IBlockState state, int level)
    {
        worldIn.setBlockState(pos, state.withProperty(LEVELS, Integer.valueOf(MathHelper.clamp_int(level, 0, 16))), 2);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(LEVELS)).intValue();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {LEVELS});
    }
}
