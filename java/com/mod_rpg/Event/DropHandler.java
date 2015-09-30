package com.mod_rpg.Event;

import java.util.Random;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;





import com.mod_rpg.CoreMod.ModItems;

public class DropHandler
{
public static Random random;
public static int dropped;
public static int lrl;
@SubscribeEvent
public void onEntityDrop(LivingDropsEvent event)
{
random = new Random();
dropped = random.nextInt(2) + 1;
if(event.entityLiving instanceof EntityCow)
{
event.entityLiving.entityDropItem(new ItemStack(ModItems.cow_corp), dropped);
}
if(event.entityLiving.entityDropItem(new ItemStack(Items.beef), 1) != null)
{
		event.setCanceled(true);
}
/*if(event.entityLiving instanceof EntitySheep)
{
event.entityLiving.entityDropItem(new ItemStack(ModItems.sheep_corp), dropped);
}*/
if(event.entityLiving instanceof EntityPig)
{
event.entityLiving.entityDropItem(new ItemStack(ModItems.pig_corp), dropped);
}
}

}