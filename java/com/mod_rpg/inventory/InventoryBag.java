package com.mod_rpg.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.mod_rpg.Item.ItemBag;

public class InventoryBag extends AbstractInventory
{
	private String name = "Bag of Holding";

	/** The key used to store and retrieve the inventory from NBT */
	private static final String SAVE_KEY = "ItemInventory";

	/** Defining your inventory size this way is handy */
	public static final int INV_SIZE = 10;

	/** Provides NBT Tag Compound to reference */
	private final ItemStack invStack;

	public InventoryBag(ItemStack stack) {
		inventory = new ItemStack[INV_SIZE];
		this.invStack = stack;
		if (!invStack.hasTagCompound()) {
			invStack.setTagCompound(new NBTTagCompound());
		}
		readFromNBT(invStack.getTagCompound());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean hasCustomName() {
		return name.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	/**
	 * For inventories stored in ItemStacks, it is critical to implement this method
	 * in order to write the inventory to the ItemStack's NBT whenever it changes.
	 */
	@Override
	public void markDirty() {
		for (int i = 0; i < getSizeInventory(); ++i) {
			if (getStackInSlot(i) != null && getStackInSlot(i).stackSize == 0)
				inventory[i] = null;
		}
		writeToNBT(invStack.getTagCompound());
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		// this will close the inventory if the player tries to move
		// the item that opened it, but you need to return this method
		// from the Container's canInteractWith method
		// an alternative would be to override the slotClick method and
		// prevent the current item slot from being clicked
		return player.getHeldItem() == invStack;
	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		return !(stack.getItem() instanceof ItemBag);
	}

	@Override
	protected String getNbtKey() {
		return SAVE_KEY;
	}
}