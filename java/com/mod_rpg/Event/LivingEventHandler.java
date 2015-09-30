package com.mod_rpg.Event;



import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.mod_rpg.CoreMod.ModItems;
import com.mod_rpg.Entity.ExtendedPlayerThirst;

public class LivingEventHandler {
	
	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent event)
	{
		ItemStack boots = event.entityLiving.getEquipmentInSlot(1);
		ItemStack leggings = event.entityLiving.getEquipmentInSlot(2);
		ItemStack chestPlate = event.entityLiving.getEquipmentInSlot(3);
		ItemStack helmet = event.entityLiving.getEquipmentInSlot(4);

		if(boots != null && boots.getItem() == ModItems.mithril_boots && leggings != null && leggings.getItem() == ModItems.mithril_leggins && chestPlate != null && chestPlate.getItem() == 
				ModItems.mithril_chestplate && helmet != null && helmet.getItem() == ModItems.mithril_helmet)
		{
			
		}
	}
/*	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
	/*if (event.entity instanceof EntityPlayer && ExtendedPlayerThirst.get((EntityPlayer) event.entity) == null)

//		ExtendedPlayerThirst.register((EntityPlayer) event.entity);

	if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedPlayerThirst.EXT_PROP_NAME2) == null)
		event.entity.registerExtendedProperties(ExtendedPlayerThirst.EXT_PROP_NAME2, new ExtendedPlayerThirst((EntityPlayer) event.entity));
}*/
	@SubscribeEvent
	public void onLivingFall(LivingFallEvent event)
	{

	}
}
