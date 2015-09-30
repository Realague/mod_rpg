package com.mod_rpg.Block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.Gui.ModGuiHandler;

public class ModBlockTileEntity extends BlockContainer {

	public ModBlockTileEntity(String unlocalizedName) {
		super(Material.iron);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
	}
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (stack.hasDisplayName()) {
			((ModTileEntity) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new ModTileEntity();
	}
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		ModTileEntity te = (ModTileEntity) world.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(world, pos, te);
		super.breakBlock(world, pos, blockstate);
	}

	@Override
	public int getRenderType() {
		return 3;
	}
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
	    if (!world.isRemote) {
	        player.openGui(Main.instance, ModGuiHandler.MOD_TILE_ENTITY_GUI, world, pos.getX(), pos.getY(), pos.getZ());
	    }
	    return true;
	}
}

