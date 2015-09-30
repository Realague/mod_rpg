package com.mod_rpg.Event;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.mod_rpg.CoreMod.ModItems;
import com.mod_rpg.Entity.ExtendedPlayerMana;
import com.mod_rpg.Entity.ExtendedPlayerThirst;




public class ModEventHandler {

	//PlayerDestroyItemEvent	Déclenché lorsqu'un item est sur le point d'être détruit par le joueur (ex:outils)
	@SubscribeEvent
	public void onHarvestDropsEvent(BlockEvent.HarvestDropsEvent event)
	{
		Random rand = new Random();
		if (event.state.getBlock() == Blocks.cobblestone) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			}
		if (event.state.getBlock() == Blocks.stone) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			}
		if (event.state.getBlock() == Blocks.gold_ore) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			event.drops.add(new ItemStack(ModItems.gold_nugget_custom, rand.nextInt(2)+ 3));
			}
		if (event.state.getBlock() == Blocks.iron_ore) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			event.drops.add(new ItemStack(ModItems.iron_nugget, rand.nextInt(2)+ 3));
			}
		if (event.state.getBlock() == Blocks.diamond_ore) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			event.drops.add(new ItemStack(Items.diamond));
			}
		if (event.state.getBlock() == Blocks.emerald_ore) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			event.drops.add(new ItemStack(Items.emerald));
			}
		if (event.state.getBlock() == Blocks.lapis_ore) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			event.drops.add(new ItemStack(Items.dye, rand.nextInt(2)+ 3,4));
			}
		if (event.state.getBlock() == Blocks.coal_ore) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			event.drops.add(new ItemStack(Items.coal));
			}
		if (event.state.getBlock() == Blocks.redstone_ore) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItems.rock));
			event.drops.add(new ItemStack(Items.redstone, rand.nextInt(2)+ 3));
			}
	}
	
	/*@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent drop)
	{
		if(drop.equals(Items.beef))
		{
			drop.setCanceled(true);
		}
	}*/
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event) {

		if (event.entity instanceof EntityPlayer && ExtendedPlayerMana.get((EntityPlayer) event.entity) == null)
		

			ExtendedPlayerMana.register((EntityPlayer) event.entity);
	    
	}

	@SubscribeEvent
	public void onLivingFallEvent(LivingFallEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			ExtendedPlayerMana props = ExtendedPlayerMana.get((EntityPlayer) event.entity);
			if (event.distance > 3.0F && props.getCurrentMana() > 0)
			{
				System.out.println("[EVENT] Fall distance: " + event.distance);
				System.out.println("[EVENT] Current mana: " + props.getCurrentMana());

				//reduceby to change if u want to change the amount of mana consume
				float reduceby = props.getCurrentMana() < (event.distance - 3.0F) ? props.getCurrentMana() : (event.distance - 3.0F);
				event.distance -= reduceby;
				
				props.consumeMana((int) reduceby*2);
				
				System.out.println("[EVENT] Adjusted fall distance: " + event.distance);
			}
}
		}
	
 
	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;
			ExtendedPlayerMana.get(player).onUpdate();
			if (player.isPlayerFullyAsleep()) {
				player.addChatMessage(new ChatComponentText("After a full night's rest, you feel refreshed!"));
				ExtendedPlayerMana.get(player).replenishMana();
			}
		}
	}
				}