package com.mod_rpg.Proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.CoreMod.ModBlocks;
import com.mod_rpg.CoreMod.ModItems;
import com.mod_rpg.CoreMod.ModTileEntities;
import com.mod_rpg.Entity.ExtendedPlayerMana;
import com.mod_rpg.Gui.GuiBag;
import com.mod_rpg.inventory.ContainerBag;
import com.mod_rpg.inventory.ContainerCustomPlayer;
import com.mod_rpg.inventory.InventoryBag;


public class CommonProxy implements IGuiHandler
{
	public void preInit(FMLPreInitializationEvent e) {
		ModTileEntities.init();
		ModBlocks.createBlocksFood();
		ModBlocks.createBlocks();
		ModItems.createItemsFood();
		ModItems.createItems();
		
	}
	public int addArmor(String string) {
		return 0;
	}

	/**
	 * Returns a side-appropriate EntityPlayer for use during message handling
	 */
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		Main.logger.info("Retrieving player from CommonProxy for message on side " + ctx.side);
		return ctx.getServerHandler().playerEntity;
	}

	/**
	 * Returns the current thread based on side during message handling,
	 * used for ensuring that the message is being handled by the main thread
	 */
	public IThreadListener getThreadFromContext(MessageContext ctx) {
		return ctx.getServerHandler().playerEntity.getServerForPlayer();
	}

	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
		if (guiId == Main.GUI_CUSTOM_INV)  {
			return new ContainerCustomPlayer(player, player.inventory, ExtendedPlayerMana.get(player).inventory);
		} else if (guiId == Main.GUI_ITEM_INV)  {
			return new ContainerBag(player, player.inventory, new InventoryBag(player.getHeldItem()));
		} else {
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
		/*if (guiId == Main.GUI_CUSTOM_INV) {
			return new GuiCustomPlayerInventory(player, player.inventory, ExtendedPlayerMana.get(player).inventory);} */
		 if (guiId == Main.GUI_ITEM_INV)  {
			return new GuiBag(player, player.inventory, new InventoryBag(player.getHeldItem()));
		} else {
			return null;
		}
	}
	public void init(FMLInitializationEvent e) {
		//MinecraftForge.ORE_GEN_BUS(new ModEventHandler());
		   
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
	public void registerRenderers() {}


	}



