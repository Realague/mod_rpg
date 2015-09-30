package com.mod_rpg.Entity;

import com.mod_rpg.Network.client.SyncPlayerPropsMessage;
import com.mod_rpg.inventory.InventoryCustomPlayer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class ExtendedPlayerThirst implements IExtendedEntityProperties{

	public final static String EXT_PROP_NAME2 = "ExtendedPlayerThirst";
	public final InventoryCustomPlayer inventory = new InventoryCustomPlayer();
	
	private final EntityPlayer player;
	public static final int THIRST_WATCHER = 20;
	private int maxThirst, thirstLooseTimer;
	int drinktimer;
	
	public ExtendedPlayerThirst(EntityPlayer player) {
		this.player = player;
		this.maxThirst = 50;
		this.thirstLooseTimer = 0;
		this.player.getDataWatcher().addObject(THIRST_WATCHER, this.maxThirst);
	}
	/**
	 * Used to register these extended properties for the player during EntityConstructing event
	 */
	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(ExtendedPlayerThirst.EXT_PROP_NAME2, new ExtendedPlayerThirst(player));
	}

	/**
	 * Returns ExtendedPlayer properties for player
	 */
	public static final ExtendedPlayerThirst get(EntityPlayer player) {
		return (ExtendedPlayerThirst) player.getExtendedProperties(EXT_PROP_NAME2);
	}
	/**
	 * Copies additional player data from the given ExtendedPlayer instance
	 * Avoids NBT disk I/O overhead when cloning a player after respawn
	 */
	public void copy(ExtendedPlayerThirst props) {
		inventory.copy(props.inventory);
		player.getDataWatcher().updateObject(THIRST_WATCHER, props.getCurrentThirst());
		maxThirst = props.maxThirst;
		thirstLooseTimer = props.thirstLooseTimer;
	}

	@Override
	public final void saveNBTData(NBTTagCompound compound) {
		// We store all of our data nested in a single tag;
		// this way, we never have to worry about conflicting with other
		// mods that may also be writing to the player's tag compound
		NBTTagCompound properties = new NBTTagCompound();
		
		// Write everything to our new tag:
		inventory.writeToNBT(properties);
		properties.setInteger("CurrentThirst", player.getDataWatcher().getWatchableObjectInt(THIRST_WATCHER));
		properties.setInteger("MaxThirst", maxThirst);
		properties.setInteger("ThirstLooseTimer", thirstLooseTimer);
		
		// Finally, set the tag with our unique identifier:
		compound.setTag(EXT_PROP_NAME2, properties);
	}

	@Override
	public final void loadNBTData(NBTTagCompound compound) {
		// Pretty much the reverse of saveNBTData - get our
		// unique tag and then load everything from it:
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME2);
		inventory.readFromNBT(properties);
		player.getDataWatcher().updateObject(THIRST_WATCHER, properties.getInteger("CurrentThirst"));
		maxThirst = properties.getInteger("MaxThirst");
		thirstLooseTimer = properties.getInteger("ThirstLooseTimer");
	}

	/**
	 * Updates anything that needs to be updated each tick
	 * NOT called automatically, so you must call it yourself from LivingUpdateEvent or a TickHandler
	 */
	public void onUpdate(Entity player,LivingUpdateEvent tick) {
		++this.drinktimer;
		// only want to update the timer and Loose Thirst on the server:
		if (this.drinktimer >= 80)
        {
			LooseThirst(1);
            this.drinktimer = 0;
        }	
	}
	public void onThirstDeath(EntityLiving player){
		if (getCurrentThirst() <= 0)
		{
			player.setDead();
		}
	}
	private boolean updateThirstTimer() {
		if (thirstLooseTimer > 0) {
			--thirstLooseTimer;
		}
		if (thirstLooseTimer == 0) {
			thirstLooseTimer = getCurrentThirst() < getMaxThirst() ? 100 : 0;
			return true;
		}
		
		return false;
	}
	
	public final void LooseThirst(int amount) {
		setCurrentThirst(getCurrentThirst() - amount);
	}

	/**
	 * Returns true if the amount of Thirst was consumed or false
	 * if the player's current Thirst was insufficient
	 */
	public final boolean consumeThirst(int amount) {
		boolean sufficient = amount <= getCurrentThirst();
		setCurrentThirst(getCurrentThirst() - amount);
		return sufficient;
	}

	/**
	 * Simple method sets current Thirst to max Thirst
	 */
	public final void replenishThirst() {
		this.player.getDataWatcher().updateObject(THIRST_WATCHER, this.maxThirst);
	}

	/**
	 * Returns current Thirst amount
	 */
	public final int getCurrentThirst() {
		return player.getDataWatcher().getWatchableObjectInt(THIRST_WATCHER);
	}

	/**
	 * Sets current Thirst to amount or maxThirst, whichever is lesser
	 */
	public final void setCurrentThirst(int amount) {
		player.getDataWatcher().updateObject(THIRST_WATCHER, amount > 0 ? (amount < maxThirst ? amount : maxThirst) : 0);
	}

	/**
	 * Returns max Thirst amount
	 */
	public final int getMaxThirst() {
		return maxThirst;
	}

	/**
	 * Sets max Thirst to amount or 0 if amount is less than 0
	 */
	public final void setMaxThirst(int amount) {
		maxThirst = (amount > 0 ? amount : 0);
		// if your extended properties contains a lot of data, it would be better
		// to make an individual packet for maxThirst, rather than sending all of
		// the data each time max Thirst changes...
		
		//PacketDispatcher.sendTo(new SyncPlayerPropsMessage(player), (EntityPlayerMP) player);
	}

	@Override
	public void init(Entity entity, World world) {
		// TODO Auto-generated method stub
		
	}

}
