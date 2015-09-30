package com.mod_rpg.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

import com.mod_rpg.CoreMod.ModItems;

public class BlockTestLeather extends BlockContainer implements ITileEntityProvider{

    protected BlockTestLeather(String unlocalizedName) {
        super(Material.iron);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(2.0f);
        this.setResistance(6.0f);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new ModTileEntity();
    }
    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }

    @Override
    public boolean onBlockEventReceived(World worldIn, BlockPos pos, IBlockState state, int eventID, int eventParam) {
        super.onBlockEventReceived(worldIn, pos, state, eventID, eventParam);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
    }
	
    

/*public static final PropertyInteger LEVELS10 = PropertyInteger.create("levels10", 0, 1);
	public BlockTestLeather(Material materialIn, String name) {
		super(Material.wood);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setDefaultState(this.blockState.getBaseState().withProperty(LEVELS10, Integer.valueOf(0)));
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
	            	int i = ((Integer)state.getValue(LEVELS10)).intValue();
	                Item item = itemstack.getItem();

	                if (item == Items.leather)
	                {
	                    if (i==0)
	                    {
	                        if (!playerIn.capabilities.isCreativeMode)
	                        {
	                            playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, null);
	                            
	                        }
	                        
	                        this.setWaterLevel(worldIn, pos, state, 1);
	                    }
	                     
	                    return true;
	                }
	                else
	                {
	                    ItemStack itemstack1;
	                    ItemStack itemstack2;
	                    if (item == ModItems.knife_butcher)
	                    {
	                        if (i == 1)
	                        {
	                            if (!playerIn.capabilities.isCreativeMode)
	                            {
	                            	itemstack1 = new ItemStack(ModItems.knife_butcher,1,OreDictionary.WILDCARD_VALUE + 1);
	                            		//itemstack1 = new ItemStack(item, ModItems.knife_butcher.getMaxItemUseDuration(new ItemStack(ModItems.knife_butcher)));
	                            	itemstack2 = new ItemStack(ModItems.adamantine_boots);
	                                
	                                if (!playerIn.inventory.addItemStackToInventory(itemstack1))
	                                {
	                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack1));
	                                }
	                                if (!playerIn.inventory.addItemStackToInventory(itemstack2))
	                                {
	                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.5D, (double)pos.getZ() + 0.5D, itemstack2));
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

	                            this.setWaterLevel(worldIn, pos, state, i - i);
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
   /* public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(LEVELS10, Integer.valueOf(meta));
    }
    public void setWaterLevel(World worldIn, BlockPos pos, IBlockState state, int level)
    {
        worldIn.setBlockState(pos, state.withProperty(LEVELS10, Integer.valueOf(MathHelper.clamp_int(level, 0, 1))), 2);
    }
    
    /**
     * Convert the BlockState into the correct metadata value
     */
  /*  public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(LEVELS10)).intValue();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {LEVELS10});
    }*/
}
