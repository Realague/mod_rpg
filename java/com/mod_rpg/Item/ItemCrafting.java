package com.mod_rpg.Item;

import java.util.Set;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCrafting extends Item{

    private float damageVsEntity;
    protected com.mod_rpg.Item.CraftingMaterial CraftingMaterial;
protected ItemCrafting(float attackDamage, com.mod_rpg.Item.CraftingMaterial material)
{
    this.CraftingMaterial = material;
    this.maxStackSize = 1;
    this.setMaxDamage(material.getMaxDamage());
    this.damageVsEntity = attackDamage + material.getDamageVsEntity();
    this.setCreativeTab(CreativeTabs.tabTools);
}


/**
 * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
 * the damage on the stack.
 *  
 * @param target The Entity being hit
 * @param attacker the attacking entity
 */
public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
{
    stack.damageItem(2, attacker);
    return true;
}


/**
 * Returns True is the item is renderer in full 3D when hold.
 */
@SideOnly(Side.CLIENT)
public boolean isFull3D()
{
    return true;
}

public CraftingMaterial getCraftingMaterial()
{
    return this.CraftingMaterial;
}


public String getCraftingMaterialName()
{
    return this.CraftingMaterial.toString();
}

public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
{
    ItemStack mat = this.CraftingMaterial.getRepairItemStack();
    if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
    return super.getIsRepairable(toRepair, repair);
}
}



