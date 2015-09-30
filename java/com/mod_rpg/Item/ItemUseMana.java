package com.mod_rpg.Item;

import java.lang.annotation.ElementType;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.Entity.ExtendedPlayerMana;
import com.mod_rpg.Event.ModEventHandler;



public class ItemUseMana extends Item
{
	public ItemUseMana(String string) {
		this.setMaxStackSize(1);
		this.setUnlocalizedName(string);
		//this.setCreativeTab(Main.TabsMagic);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    	{
		if (!world.isRemote)
		{
			ExtendedPlayerMana props = ExtendedPlayerMana.get(player);
			
			if (props.consumeMana(15))
			{
				System.out.println("[MANA ITEM] Player had enough mana. Do something awesome!");
			}
			else
			{
				System.out.println("[MANA ITEM] Player ran out of mana. Sad face.");
				props.replenishMana();
			}
		}
		
        return itemstack;
    }

@EventHandler
public void load(FMLInitializationEvent event)
{
	MinecraftForge.EVENT_BUS.register(new ModEventHandler());
}
}