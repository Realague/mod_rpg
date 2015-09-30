package com.mod_rpg.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.mod_rpg.Block.ModTileEntity;

public class ModGuiHandler implements IGuiHandler {

	public static final int MOD_TILE_ENTITY_GUI = 11;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == MOD_TILE_ENTITY_GUI)
			return new ContainerModTileEntity(player.inventory, (ModTileEntity) world.getTileEntity(new BlockPos(x, y, z)));

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == MOD_TILE_ENTITY_GUI)
			return new GuiModTileEntity(player.inventory, (ModTileEntity) world.getTileEntity(new BlockPos(x, y, z)));

		return null;
	}

}

