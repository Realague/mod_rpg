package com.mod_rpg.Item;

import com.mod_rpg.Entity.ExtendedPlayerMana;
import com.mod_rpg.Entity.ExtendedPlayerThirst;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class ItemFoodCustom extends ItemFood{
int Thirstlose;
private PotionEffect[] effects;
	public ItemFoodCustom(int amount, float saturation, boolean isWolfFood, String name,int lose,PotionEffect... effects) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.Thirstlose = lose;
		this.effects = effects;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	        
	    for (int i = 0; i < effects.length; i ++) {
	        if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
	            player.addPotionEffect(new PotionEffect(this.effects[i]));
	    }
	}
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn,ExtendedPlayerThirst thirst)
    {
		thirst.setCurrentThirst(thirst.getCurrentThirst() - Thirstlose);
		ExtendedPlayerMana props = ExtendedPlayerMana.get(playerIn);
        --stack.stackSize;
        playerIn.getFoodStats().addStats(this, stack);
        worldIn.playSoundAtEntity(playerIn, "random.burp", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(stack, worldIn, playerIn);
        playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return stack;
    }
}
