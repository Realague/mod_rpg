package com.mod_rpg.Item;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.mod_rpg.CoreMod.ModItems;

public enum CustomToolMaterial
{
    WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    EMERALD(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22),
    BRONZE(2, 500, 7.0F, 5.0F, 15),
    MITHRIL(3, 1000, 7.0F, 1.5F, 19);
    /** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
    private final int harvestLevel;
    /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
    private final int maxUses;
    /** The strength of this tool material against blocks which it is effective against. */
    private final float efficiencyOnProperMaterial;
    /** Damage versus entities. */
    private final float damageVsEntity;
    /** Defines the natural enchantability factor of the material. */
    private final int enchantability;

    private static final String __OBFID = "CL_00000042";

    //Added by forge for custom Tool materials.
    @Deprecated public Item customCraftingMaterial = null; // Remote in 1.8.1
    private ItemStack repairMaterial = null;

    private CustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float damageVsEntity, int enchantability)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiencyOnProperMaterial = efficiency;
        this.damageVsEntity = damageVsEntity;
        this.enchantability = enchantability;
    }

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int getMaxUses()
    {
        return this.maxUses;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    /**
     * Returns the damage against a given entity.
     */
    public float getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    /**
     * Return the natural enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Deprecated // Use getRepairItemStack below
    public Item getRepairItem()
    {
        switch (this)
        {
            case WOOD:    return Item.getItemFromBlock(Blocks.planks);
            case STONE:   return Item.getItemFromBlock(Blocks.cobblestone);
            case GOLD:    return Items.gold_ingot;
            case IRON:    return Items.iron_ingot;
            case EMERALD: return Items.diamond;
            case BRONZE: return ModItems.mithril_ingot;
            case MITHRIL: return ModItems.mithril_ingot;
            default:      return customCraftingMaterial;
        }
    }

    public CustomToolMaterial setRepairItem(ItemStack stack)
    {
        if (this.repairMaterial != null || customCraftingMaterial != null) throw new RuntimeException("Can not change already set repair material");
        if (this == WOOD || this == STONE || this == GOLD || this == IRON || this == EMERALD || this == MITHRIL || this == BRONZE) throw new RuntimeException("Can not change vanilla tool repair materials");
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