package com.mod_rpg.Item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.mod_rpg.Entity.ExtendedPlayerThirst;

public class ItemDrink extends SimpleItem{
	int heal;
	   /** Number of ticks to run while 'EnumAction'ing until result. */
    int itemUseDuration;
    /** If this field is true, the food can be consumed even if the player don't need to eat. */
    private boolean alwaysDrinkable;
    /** represents the potion effect that will occurr upon eating this food. Set by setPotionEffect */
    private int potionId;
    /** set by setPotionEffect */
    private int potionDuration;
    /** set by setPotionEffect */
    private int potionAmplifier;
    /** probably of the set potion effect occurring */
    private float potionEffectProbability;
    
	public ItemDrink(String name, int amount) {
		super(name);
		this.heal = amount;

	}
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn,ExtendedPlayerThirst thirst)
    {
		thirst.setCurrentThirst(thirst.getCurrentThirst() + heal);
        --stack.stackSize;
        this.onDrink(stack, worldIn, playerIn);
        return stack;
    }

    protected void onDrink(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && this.potionId > 0 && worldIn.rand.nextFloat() < this.potionEffectProbability)
        {
            player.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (playerIn.canEat(this.alwaysDrinkable))
        {
            playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        }

        return itemStackIn;
    }



    /**
     * sets a potion effect on the item. Args: int potionId, int duration (will be multiplied by 20), int amplifier,
     * float probability of effect happening
     */
    public ItemDrink setPotionEffect(int id, int duration, int amplifier, float probability)
    {
        this.potionId = id;
        this.potionDuration = duration;
        this.potionAmplifier = amplifier;
        this.potionEffectProbability = probability;
        return this;
    }

    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ItemDrink setAlwaysEdible()
    {
        this.alwaysDrinkable = true;
        return this;
    }
}
