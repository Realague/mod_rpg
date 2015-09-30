package com.mod_rpg.Item;

import java.awt.List;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.inventory.InventoryBag;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBag extends SimpleItem
{
	public ItemBag(String name) {
		super(name);
		setMaxDamage(0);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(name);
	}

	// Without this method, your inventory will NOT work!!!
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1; // return any value greater than zero
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			if (!player.isSneaking()) {
				player.openGui(Main.instance, Main.GUI_ITEM_INV, player.worldObj, 0, 0, 0);
			} else {
				new InventoryBag(player.getHeldItem()).setInventorySlotContents(0, new ItemStack(Items.diamond, 4));
			}
		}
		return stack;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.ITALIC + "A magic bag that holds many items");
	}
}
