package com.mod_rpg.Item;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.mod_rpg.CoreMod.ModItems;


public enum CraftingMaterial
	{
		WOOD(60, 0F),
        STONE(120, 1.0F),
	    IRON(250, 2.0F),
	    EMERALD(1000, 5.0F),
	    GOLD(75, 2.0F),
	    COPPER(175, 2.0F);
	    /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
	    private final int maxDamage;
	    /** The strength of this tool material against blocks which it is effective against. */
	    private final float damageVsEntity;

	    private static final String __OBFID = "CL_00000042";

	    //Added by forge for custom Tool materials.
	    @Deprecated public Item customCraftingMaterial = null; // Remote in 1.8.1
	    private ItemStack repairMaterial = null;

	    private CraftingMaterial( int maxDamage, float damageVsEntity)
	    {
	        this.maxDamage = maxDamage;
	        this.damageVsEntity = damageVsEntity;
	    }

	    /**
	     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
	     */
	    public int getMaxDamage()
	    {
	        return this.maxDamage;
	    }


	    /**
	     * Returns the damage against a given entity.
	     */
	    public float getDamageVsEntity()
	    {
	        return this.damageVsEntity;
	    }

	    @Deprecated // Use getRepairItemStack below
	    public Item getRepairItem()
	    {
	        switch (this)
	        {
	        	case WOOD:	  return Item.getItemFromBlock(Blocks.planks);
	            case STONE:   return Item.getItemFromBlock(Blocks.cobblestone);
	            case GOLD:    return Items.gold_ingot;
	            case IRON:    return Items.iron_ingot;
	            case EMERALD: return Items.diamond;
	            case COPPER:  return ModItems.copper_ingot;
	            default:      return customCraftingMaterial;
	        }
	    }

	    public CraftingMaterial setRepairItem(ItemStack stack)
	    {
	        if (this.repairMaterial != null || customCraftingMaterial != null) throw new RuntimeException("Can not change already set repair material");
	        if (this == GOLD || this == IRON || this == EMERALD || this == COPPER) throw new RuntimeException("Can not change vanilla tool repair materials");
	        this.repairMaterial = stack;
	        this.customCraftingMaterial = stack.getItem();
	        return this;
	    }

	    public ItemStack getRepairItemStack()
	    {
	        if (repairMaterial != null) return repairMaterial;
	        Item ret = this.getRepairItem();
	        if (ret == null) return null;
	        repairMaterial = new ItemStack(ret, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
	        return repairMaterial;
	    }
}
