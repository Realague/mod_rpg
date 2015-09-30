package com.mod_rpg.World;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.mod_rpg.CoreMod.ModBlocks;


public class WorldGenerationCustom implements IWorldGenerator{
	private WorldGenerator gen_copper_ore;
	private WorldGenerator gen_tin_ore;
	private WorldGenerator gen_mithril_ore;
	private WorldGenerator gen_adamantine_ore;


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.getDimensionId()) {
	    case 0: //Overworld
	    	 this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	 this.runGenerator(this.gen_tin_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	 this.runGenerator(this.gen_mithril_ore, world, random, chunkX, chunkZ, 10, 0, 28);
	    	 this.runGenerator(this.gen_adamantine_ore, world, random, chunkX, chunkZ, 10, 0, 28);
	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}
	   public WorldGenerationCustom()
	   {
		   this.gen_copper_ore = new WorldGenMinable(ModBlocks.copper_ore.getDefaultState(), 12);
		   this.gen_tin_ore = new WorldGenMinable(ModBlocks.tin_ore.getDefaultState(), 12);
		   this.gen_mithril_ore = new WorldGenMinable(ModBlocks.mithril_ore.getDefaultState(), 7);
		   this.gen_adamantine_ore = new WorldGenMinable(ModBlocks.adamantine_ore.getDefaultState(), 7);
	   }



	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
	
	

}
