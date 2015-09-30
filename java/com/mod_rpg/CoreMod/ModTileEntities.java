package com.mod_rpg.CoreMod;

import com.mod_rpg.Block.ModTileEntity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModTileEntities {

	public static void init() {
		GameRegistry.registerTileEntity(ModTileEntity.class, "tutorial_tile_entity");
	}

}

