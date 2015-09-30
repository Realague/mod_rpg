package com.mod_rpg.Client.Render.Items;

import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.CoreMod.ModBlocks;
import com.mod_rpg.CoreMod.ModItems;
import com.mod_rpg.CoreMod.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;


public final class ItemRenderRegister {

	public static String modid = Main.MODID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerItemRenderer() {
		reg(ModItems.salad);
		reg(ModItems.seeds_salad);
		reg(ModItems.malt);
		reg(ModItems.seeds_malt);
		reg(ModItems.grape);
		reg(ModItems.seeds_grape);
		reg(ModItems.cabbages);
		reg(ModItems.tomato);
		reg(ModItems.seeds_cabbages);
		reg(ModItems.seeds_tomato);
		reg(ModItems.bag);
		reg(ModItems.ham);
    	reg(ModItems.seeds_orge);
        reg(ModItems.empty_chope);
        reg(ModItems.beer_chope);
        reg(ModItems.bucket_vine);
        reg(ModItems.bucket_hydromel);
        reg(ModItems.bucket_beer);
        reg(ModItems.bucket_rhum);
        reg(ModItems.orge);
        reg(ModItems.fairholly);
        reg(ModItems.bottle_rhum);
        reg(ModItems.bottle_vine);
        reg(ModItems.bottle_milk);
        reg(ModItems.bottle_cacao);
        reg(ModItems.blueberry);
        reg(ModItems.raspberry);
        reg(ModItems.strawberry);
        reg(ModItems.pear);
        reg(ModItems.seeds_fairholly);
        reg(ModItems.ham );
        reg(ModItems.rib_pig );
        reg(ModItems.roast_pig );
        reg(ModItems.avant_beef );
        reg(ModItems.arriere_beef );
        reg(ModItems.roast_beef );
        reg(ModItems.rib_beef );
        reg(ModItems.knuckle_beef );
        reg(ModItems.ham_cooked );
        reg(ModItems.leg_beef );
        reg(ModItems.knuckle_pig );
        reg(ModItems.knuckle_sheep );
        reg(ModItems.leg_pig );
        /*reg(ModItems.leg_sheep);
        reg(ModItems.gigot_sheep);
        reg(ModItems.ham_sheep );
        reg(ModItems.ham_sheep_cooked);
        reg(ModItems.ham_sheep_salt);*/
        reg(ModItems.rib_pig_cooked );
        reg(ModItems.rib_beef_cooked );
        reg(ModItems.roast_beef_cooked );       
        reg(ModItems.knuckle_pig_cooked );
        reg(ModItems.knuckle_beef_cooked);
        reg(ModItems.roast_pig_cooked);
        reg(ModItems.salt);
        reg(ModItems.ham_salt);
        reg(ModItems.apple_green);
        reg(ModItems.dough_bread);
        reg(ModItems.dough_bread_cereal);
        reg(ModItems.dough_pie);
        reg(ModItems.dough_pie_blueberry);
        reg(ModItems.dough_cake);
        reg(ModItems.dough_cake_chocolate);
        reg(ModItems.pig_corp);
        reg(ModItems.cow_corp);
        //reg(ModItems.sheep_corp);
        reg(ModItems.tin_ingot);
        reg(ModItems.bronze_helmet);        
        reg(ModItems.bronze_chestplate);
        reg(ModItems.bronze_leggins);
        reg(ModItems.bronze_boots);
        
        reg(ModItems.mithril_helmet);  
        reg(ModItems.mithril_chestplate);
        reg(ModItems.mithril_leggins);
        reg(ModItems.mithril_boots);
        
        reg(ModItems.steel_helmet);
        reg(ModItems.steel_chestplate);
        reg(ModItems.steel_leggins);
        reg(ModItems.steel_boots);

        reg(ModItems.obsidian_helmet);
        reg(ModItems.obsidian_chestplate);
        reg(ModItems.obsidian_leggins);
        reg(ModItems.obsidian_boots);
        
        reg(ModItems.ebene_helmet);
        reg(ModItems.ebene_chestplate);
        reg(ModItems.ebene_leggins);
        reg(ModItems.ebene_boots);
        
        reg(ModItems.cloute_helmet);
        reg(ModItems.cloute_chestplate);
        reg(ModItems.cloute_leggins);
        reg(ModItems.cloute_boots);
        
        reg(ModItems.adamantine_helmet);
        reg(ModItems.adamantine_chestplate);
        reg(ModItems.adamantine_leggins);
        reg(ModItems.adamantine_boots);
        
        reg(ModItems.donavis);
        reg(ModItems.chain_mail);
        reg(ModItems.copper_ingot);
        reg(ModItems.tin_ingot);
        reg(ModItems.bronze_ingot);
        reg(ModItems.steel_ingot);
        reg(ModItems.mithril_ingot);
        
        reg(ModItems.hammer);
        reg(ModItems.burin);
        reg(ModItems.hammer_burin);
        
        reg(ModItems.axe_butcher);
        reg(ModItems.knife_butcher);
        
        reg(ModItems.copper_saw);
        reg(ModItems.diamond_saw);
        reg(ModItems.gold_saw);
        reg(ModItems.iron_saw);
        
        reg(ModItems.clay_mold);
        reg(ModItems.rock_mold);
        
        reg(ModItems.gold_ingot_mold);
        reg(ModItems.iron_ingot_mold);
        reg(ModItems.copper_ingot_mold);
        reg(ModItems.mithril_ingot_mold);
        reg(ModItems.tin_ingot_mold);
        reg(ModItems.mithril_nugget);
        reg(ModItems.tin_nugget);
        reg(ModItems.copper_nugget);
        reg(ModItems.adamantine_nugget);
        reg(ModItems.adamantine_ingot_mold);
        
        reg(ModItems.gold_ingot_mold);
        reg(ModItems.iron_ingot_mold);
        reg(ModItems.copper_ingot_mold);
        reg(ModItems.mithril_ingot_mold);
        reg(ModItems.tin_ingot_mold);
        reg(ModItems.mithril_nugget);
        reg(ModItems.tin_nugget);
        reg(ModItems.copper_nugget);
        reg(ModItems.adamantine_nugget);
        reg(ModItems.adamantine_ingot_mold);
        reg(ModItems.gold_ingot_mold);
        reg(ModItems.iron_ingot_mold);
        reg(ModItems.copper_ingot_mold);
        reg(ModItems.mithril_ingot_mold);
        reg(ModItems.tin_ingot_mold);
        reg(ModItems.mithril_nugget);
        reg(ModItems.tin_nugget);
        reg(ModItems.copper_nugget);
        reg(ModItems.adamantine_nugget);
        reg(ModItems.adamantine_ingot_mold);
        reg(ModItems.gold_ingot_mold);
        reg(ModItems.iron_ingot_mold);
        reg(ModItems.copper_ingot_mold);
        reg(ModItems.mithril_ingot_mold);
        reg(ModItems.tin_ingot_mold);
        reg(ModItems.mithril_nugget);
        reg(ModItems.tin_nugget);
        reg(ModItems.copper_nugget);
        reg(ModItems.adamantine_nugget);
        reg(ModItems.adamantine_ingot_mold);
        reg(ModItems.gold_ingot_mold);
        reg(ModItems.iron_ingot_mold);
        reg(ModItems.copper_ingot_mold);
        reg(ModItems.mithril_ingot_mold);
        reg(ModItems.tin_ingot_mold);
        reg(ModItems.mithril_nugget);
        reg(ModItems.tin_nugget);
        reg(ModItems.copper_nugget);
        reg(ModItems.adamantine_nugget);
        reg(ModItems.adamantine_ingot_mold);
        
        reg(ModItems.leather_hoe_stone);
        //reg(ModItems.leather_hoe_iron);
        reg(ModItems.iron_hoe_iron);
        reg(ModItems.leather_hoe_gold);
        reg(ModItems.iron_hoe_gold);
        reg(ModItems.leather_hoe_diamond);
        reg(ModItems.iron_hoe_diamond);
        reg(ModItems.mithril_hoe_diamond);
        reg(ModItems.leather_hoe_bronze);
        reg(ModItems.iron_hoe_bronze);
        reg(ModItems.wood_hoe_stone);
        reg(ModItems.wood_hoe_iron);
        reg(ModItems.wood_hoe_gold);
        reg(ModItems.wood_hoe_diamond);
        reg(ModItems.wood_hoe_bronze);
        reg(ModItems.wood_hoe_mithril);
        reg(ModItems.leather_hoe_mithril);
        reg(ModItems.mithril_hoe_bronze);
        reg(ModItems.iron_hoe_mithril);
        reg(ModItems.mithril_hoe_mithril);
        
        reg(ModItems.leather_axe_stone);
        reg(ModItems.leather_axe_iron);
        reg(ModItems.iron_axe_iron);
        reg(ModItems.leather_axe_gold);
        reg(ModItems.iron_axe_gold);
        reg(ModItems.leather_axe_diamond);
        reg(ModItems.iron_axe_diamond);
        //reg(ModItems.bronze_axe_diamond);
        reg(ModItems.leather_axe_bronze);
        reg(ModItems.iron_axe_bronze);
        reg(ModItems.wood_axe_stone);
        reg(ModItems.wood_axe_iron);
        reg(ModItems.wood_axe_gold);
        reg(ModItems.wood_axe_diamond);
        reg(ModItems.wood_axe_bronze);
        reg(ModItems.wood_axe_mithril);
        reg(ModItems.leather_axe_mithril);
        reg(ModItems.bronze_axe_bronze);
        reg(ModItems.iron_axe_mithril);
        //reg(ModItems.bronze_axe_mithril);
        
        reg(ModItems.leather_pickaxe_stone);
        reg(ModItems.leather_pickaxe_iron);
        reg(ModItems.iron_pickaxe_iron);
        reg(ModItems.leather_pickaxe_gold);
        reg(ModItems.iron_pickaxe_gold);
        reg(ModItems.leather_pickaxe_diamond);
        reg(ModItems.iron_pickaxe_diamond);
        reg(ModItems.mithril_pickaxe_diamond);
        reg(ModItems.leather_pickaxe_bronze);
        reg(ModItems.iron_pickaxe_bronze);
        reg(ModItems.wood_pickaxe_stone);
        reg(ModItems.wood_pickaxe_iron);
        reg(ModItems.wood_pickaxe_gold);
        reg(ModItems.wood_pickaxe_diamond);
        reg(ModItems.wood_pickaxe_bronze);
        reg(ModItems.wood_pickaxe_mithril);
        //reg(ModItems.leather_pickaxe_mithril);
        reg(ModItems.mithril_pickaxe_bronze);
        reg(ModItems.iron_pickaxe_mithril);
        reg(ModItems.mithril_pickaxe_mithril);
        
        reg(ModItems.leather_shovel_stone);
        reg(ModItems.leather_shovel_iron);
        reg(ModItems.iron_shovel_iron);
        reg(ModItems.leather_shovel_gold);
        reg(ModItems.iron_shovel_gold);
        reg(ModItems.leather_shovel_diamond);
        reg(ModItems.iron_shovel_diamond);
        reg(ModItems.mithril_shovel_diamond);
        reg(ModItems.leather_shovel_bronze);
        reg(ModItems.iron_shovel_bronze);
        reg(ModItems.wood_shovel_stone);
        reg(ModItems.wood_shovel_iron);
        reg(ModItems.wood_shovel_gold);
        reg(ModItems.wood_shovel_diamond);
        reg(ModItems.wood_shovel_bronze);
        reg(ModItems.wood_shovel_mithril);
        reg(ModItems.leather_shovel_mithril);
        reg(ModItems.mithril_shovel_bronze);
        reg(ModItems.iron_shovel_mithril);
        reg(ModItems.mithril_shovel_mithril);
        
        //reg(ModItems.leather_sword_stone);
        reg(ModItems.leather_sword_iron);
        reg(ModItems.iron_sword_iron);
        reg(ModItems.leather_sword_gold);
        reg(ModItems.iron_sword_gold);
        reg(ModItems.leather_sword_diamond);
        reg(ModItems.iron_sword_diamond);
        reg(ModItems.bronze_sword_diamond);
        reg(ModItems.leather_sword_bronze);
        reg(ModItems.iron_sword_bronze);
        reg(ModItems.wood_sword_stone);
        /*reg(ModItems.wood_sword_iron);
        reg(ModItems.wood_sword_gold);
        reg(ModItems.wood_sword_diamond);
        reg(ModItems.wood_sword_bronze);
        reg(ModItems.wood_sword_mithril);*/
        reg(ModItems.leather_sword_mithril);
        reg(ModItems.bronze_sword_bronze);
        reg(ModItems.iron_sword_mithril);
        reg(ModItems.bronze_sword_mithril);
        
        reg(ModItems.garde_leather);
        //reg(ModItems.garde_stone);
        reg(ModItems.garde_iron);
        reg(ModItems.garde_mithril);
        reg(ModItems.garde_obsidian);
        reg(ModItems.garde_bronze);
        
        reg(ModItems.blade_stone);
        reg(ModItems.blade_iron);
        reg(ModItems.blade_gold);
        reg(ModItems.blade_diamond);
        reg(ModItems.blade_bronze);
        reg(ModItems.blade_mithril);
        reg(ModItems.blade_steel);
        
        reg(ModItems.manche_wood);
        reg(ModItems.manche_iron);
        reg(ModItems.manche_mithril);
        reg(ModItems.manche_steel);
        reg(ModItems.manche_leather);
        
        reg(ModItems.head_pickaxe_stone);
        reg(ModItems.head_pickaxe_iron);
        reg(ModItems.head_pickaxe_mithril);
        reg(ModItems.head_pickaxe_gold);
        reg(ModItems.head_hoe_stone);
        reg(ModItems.head_hoe_gold);
        reg(ModItems.head_hoe_mithril);
        reg(ModItems.head_hoe_iron);
        reg(ModItems.head_shovel_stone);
        reg(ModItems.head_shovel_gold);
        reg(ModItems.head_shovel_iron);
        
        reg(ModItems.plate_iron);
        reg(ModItems.plate_gold);
        reg(ModItems.plate_bronze);
        reg(ModItems.plate_mithril);
        reg(ModItems.plate_adamantine);
        reg(ModItems.plate_steel);
        reg(ModItems.plate_obsidian);

	}

	
}
