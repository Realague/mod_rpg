package com.mod_rpg.Item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.CoreMod.ModItems;


public class ItemArmorObsidian extends ItemArmor{

	public ItemArmorObsidian(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(name);
	}
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if(repair.getItem() == ModItems.obsidian_ingot)
		{
			return true;
		}
		return false;
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.obsidian_helmet
    	        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.obsidian_chestplate
    	        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.obsidian_leggins
    	        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.obsidian_boots) {
			player.addPotionEffect(new PotionEffect(Potion.weakness.id, 20, 0));
	    	player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 0));
	    	player.addPotionEffect(new PotionEffect(Potion.poison.id, 20, 0));
    	}
		/*player.addPotionEffect(new PotionEffect(Potion.weakness.id, 20, 0));
    	player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 0));
    	player.addPotionEffect(new PotionEffect(Potion.poison.id, 20, 0));
    	if(this.armorType == 0 && this.armorType == 1 && this.armorType == 2 && this.armorType == 3)
		{
    		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 1));
		}*/
    }
}
