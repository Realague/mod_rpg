package com.mod_rpg.CoreMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mod_rpg.Item.CraftingMaterial;
import com.mod_rpg.Item.CustomToolMaterial;
import com.mod_rpg.Item.ItemArmorAdamantine;
import com.mod_rpg.Item.ItemArmorBronze;
import com.mod_rpg.Item.ItemArmorCloute;
import com.mod_rpg.Item.ItemArmorEbene;
import com.mod_rpg.Item.ItemArmorMithril;
import com.mod_rpg.Item.ItemArmorObsidian;
import com.mod_rpg.Item.ItemArmorSteel;
import com.mod_rpg.Item.ItemAxeCustom;
import com.mod_rpg.Item.ItemBag;
import com.mod_rpg.Item.ItemBeerChope;
import com.mod_rpg.Item.ItemBottleVine;
import com.mod_rpg.Item.ItemCraft;
import com.mod_rpg.Item.ItemFoodCustom;
import com.mod_rpg.Item.ItemHoeCustom;
import com.mod_rpg.Item.ItemPickaxeCustom;
import com.mod_rpg.Item.ItemReedCustom;
import com.mod_rpg.Item.ItemSaw;
import com.mod_rpg.Item.ItemSeedsCustom;
import com.mod_rpg.Item.ItemSpadeCustom;
import com.mod_rpg.Item.ItemSwordCustom;
import com.mod_rpg.Item.ItemThrowingRock;
import com.mod_rpg.Item.SimpleItem;



public class ModItems {
	
	  public static Item seeds_orge ,empty_chope, beer_chope, bucket_vine, bucket_hydromel, bucket_beer, bucket_rhum, orge, houx_blond, bottle_rhum, bottle_vine, bottle_milk, bottle_cacao, blueberry, raspberry,strawberry,pear,pomme,cabbages,tomato,grape,seeds_tomato,seeds_cabbages,seeds_grape,
	    fairholly,seeds_fairholly,back_pig,ham,rib_pig,roast_pig,avant_beef,arriere_beef,roast_beef,rib_beef,knuckle_beef
	    ,ham_cooked,leg_beef,knuckle_pig,knuckle_sheep,leg_pig,gigot_pig,/*carcasse_sheep,leg_sheep,gigot_sheep,/*ham_sheep,*/rib_pig_cooked,rib_beef_cooked,roast_beef_cooked,knuckle_pig_cooked,knuckle_beef_cooked,roast_pig_cooked
	    ,salt,ham_salt,apple_green,salad,seeds_salad,seeds_malt,malt,
	    dough_bread,dough_bread_cereal,dough_pie,dough_pie_blueberry,dough_cake,dough_cake_chocolate,
	    pig_corp,cow_corp,/*sheep_corp,*/hydromel_chop
	    ,item_barrel_beer,item_barrel_hydromel,item_barrel_rhum,item_barrel_vine,bucket_wood
	    ,floor,bread_cereal,pie_blueberry,cake_chocolate,liver;//,/*gigot_sheep_cooked,ham_sheep_cooked,ham_sheep_salt,rib_sheep,rib_sheep_cooked*/;
	  
	public static Item  copper_ingot, tin_ingot, chain_mail, axe_butcher,bronze_ingot, steel_ingot,mithril_ingot, bronze_helmet, bronze_chestplate, bronze_leggins, bronze_boots, mithril_helmet, mithril_chestplate, mithril_leggins, mithril_boots,donavis,steel_helmet, steel_chestplate, steel_leggins, steel_boots, ebene_helmet,ebene_chestplate,ebene_leggins, ebene_boots,
	obsidian_helmet, obsidian_chestplate, obsidian_leggins, obsidian_boots, obsidian_ore, obsidian_ingot, cloute_helmet, cloute_chestplate,cloute_leggins,cloute_boots, cloute,
	copper_helmet,copper_chestplate,copper_leggins,copper_boots,
	copper_saw, gold_saw,iron_saw,diamond_saw,
	rock, copper_nugget,iron_nugget,tin_nugget,mithril_nugget,gold_nugget_custom
	,clay_mold,rock_mold,tin_ingot_mold,mithril_ingot_mold,iron_ingot_mold,gold_ingot_mold,copper_ingot_mold,
	hammer,burin,hammer_burin,mithril_pickaxe_mithril,wood_shovel_stone,leather_shovel_stone,wood_shovel_iron,leather_shovel_iron,iron_shovel_iron,wood_shovel_gold,leather_shovel_gold,iron_shovel_gold
	,wood_shovel_diamond,leather_shovel_diamond,iron_shovel_diamond,mithril_shovel_diamond,wood_shovel_bronze,leather_shovel_bronze,iron_shovel_bronze,mithril_shovel_bronze,wood_shovel_mithril
	,leather_shovel_mithril,iron_shovel_mithril,mithril_shovel_mithril,
	diamond_brut,diamond_part,
	hoe_butcher,knife_butcher,
	adamantine_nugget,adamantine_ingot,adamantine_ingot_mold,adamantine_boots,adamantine_leggins,adamantine_chestplate,adamantine_helmet
	,pilon,healing_staff,poison_staff,leather_pickaxe_mithril,
	bag,leather_pickaxe_stone,leather_pickaxe_iron,iron_pickaxe_iron,leather_pickaxe_gold,iron_pickaxe_gold,leather_pickaxe_diamond,iron_pickaxe_diamond,mithril_pickaxe_diamond,leather_pickaxe_bronze,iron_pickaxe_bronze,wood_pickaxe_stone,wood_pickaxe_iron,wood_pickaxe_gold,wood_pickaxe_diamond,wood_pickaxe_bronze,wood_pickaxe_mithril;

	public static Item leather_hoe_stone,leather_hoe_iron,iron_hoe_iron,leather_hoe_gold,iron_hoe_gold,leather_hoe_diamond,iron_hoe_diamond,mithril_hoe_diamond,leather_hoe_bronze,iron_hoe_bronze,wood_hoe_stone,wood_hoe_iron,wood_hoe_gold,wood_hoe_diamond,wood_hoe_bronze,wood_hoe_mithril,
	leather_hoe_mithril,mithril_hoe_bronze,iron_hoe_mithril,mithril_hoe_mithril, garde_leather,garde_stone,garde_iron,garde_mithril,garde_obsidian,garde_bronze,
	blade_stone,blade_iron,blade_gold,blade_diamond,blade_bronze,blade_mithril,blade_steel,
	manche_wood,manche_stone,manche_iron,manche_mithril,manche_steel,manche_leather,
	head_pickaxe_stone,head_pickaxe_iron,head_pickaxe_mithril,head_pickaxe_gold,mithril_sword_mithril,
	head_hoe_stone,head_hoe_gold,head_hoe_mithril,head_hoe_iron,head_shovel_mithril,wood_sword_stone,garde_wood,bronze_sword_diamond,
	head_shovel_stone,head_shovel_gold,head_shovel_iron,leather_sword_stone,head_axe_stone,head_axe_gold,head_axe_iron,head_axe_mithril,head_axe_diamond,head_pickaxe_diamond,head_shovel_diamond,head_hoe_diamond,
	/*head_pickaxe_stone,head_pickaxe_iron,head_pickaxe_gold,head_pickaxe_mithril,*/mithril_axe_mithril,mithril_axe_diamond,
	plate_iron,plate_gold,plate_bronze,plate_mithril,plate_adamantine,plate_steel,plate_obsidian,plate_ebeneleather_pickaxe_mithril,mithril_pickaxe_bronze,iron_pickaxe_mithril,leather_sword_iron,iron_sword_iron,leather_sword_gold,iron_sword_gold,leather_sword_diamond,iron_sword_diamond,mithril_sword_diamond,leather_sword_bronze,iron_sword_bronze,
	leather_sword_mithril,bronze_sword_bronze,iron_sword_mithril,bronze_sword_mithril,leather_axe_stone,leather_axe_iron,iron_axe_iron,leather_axe_gold,iron_axe_gold,leather_axe_diamond,iron_axe_diamond,bronze_axe_diamond,leather_axe_bronze,iron_axe_bronze,wood_axe_stone,wood_axe_iron,wood_axe_gold,wood_axe_diamond,wood_axe_bronze,wood_axe_mithril,	leather_axe_mithril,bronze_axe_bronze,iron_axe_mithril,bronze_axe_mithril;
	public static void createItems() {

		ArmorMaterial BRONZE = EnumHelper.addArmorMaterial("BRONZE","mod_rpg:bronze", 17, new int[]{3, 5, 5, 3}, 13);
    	ArmorMaterial MITHRIL = EnumHelper.addArmorMaterial("MITHRIL","mod_rpg:mithril", 25, new int[]{5, 6, 5 ,5}, 17);
    	ArmorMaterial ADAMANTINE = EnumHelper.addArmorMaterial("ADAMANTINE","mod_rpg:adamantine", 25, new int[]{5, 6, 5 ,5}, 17);
    	ArmorMaterial STEEL = EnumHelper.addArmorMaterial("STEEL","mod_rpg:steel", 18, new int[]{3, 6, 5, 3}, 14);
    	ArmorMaterial OBSIDIAN = EnumHelper.addArmorMaterial("OBSIDIAN","mod_rpg:obsidian", 40, new int[]{6, 9, 8, 6}, 11);
    	ArmorMaterial EBENE = EnumHelper.addArmorMaterial("EBENE","mod_rpg:ebene", 25, new int[]{5, 8, 7, 5}, 25);
    	ArmorMaterial CLOUTE = EnumHelper.addArmorMaterial("CLOUTE","mod_rpg:cloute", 13, new int[]{3, 4, 4, 2}, 13);
    	/**/
    	GameRegistry.registerItem(mithril_sword_mithril = new ItemSwordCustom(CustomToolMaterial.MITHRIL,"mithril_sword_mithril", 600), "mithril_sword_mithril");
    	GameRegistry.registerItem(mithril_sword_diamond = new ItemSwordCustom(CustomToolMaterial.MITHRIL,"mithril_sword_diamond", 600), "mithril_sword_diamond");
    	
    	GameRegistry.registerItem(leather_hoe_stone = new ItemSpadeCustom(CustomToolMaterial.STONE,"leather_hoe_stone", 0), "leather_hoe_stone");
    	GameRegistry.registerItem(wood_hoe_stone = new ItemSpadeCustom(CustomToolMaterial.STONE,"wood_hoe_stone", -30), "wood_hoe_stone");
    	
    	GameRegistry.registerItem(leather_hoe_iron = new ItemSpadeCustom(CustomToolMaterial.IRON,"leather_hoe_iron", 0), "leather_hoe_iron");
    	GameRegistry.registerItem(wood_hoe_iron = new ItemSpadeCustom(CustomToolMaterial.IRON,"wood_hoe_iron",-30), "wood_hoe_iron");
    	GameRegistry.registerItem(iron_hoe_iron = new ItemSpadeCustom(CustomToolMaterial.IRON,"iron_hoe_iron",60), "iron_hoe_iron");
    	
    	GameRegistry.registerItem(wood_hoe_gold = new ItemSpadeCustom(CustomToolMaterial.GOLD,"wood_hoe_gold", -30), "wood_hoe_gold");
    	GameRegistry.registerItem(leather_hoe_gold = new ItemSpadeCustom(CustomToolMaterial.GOLD,"leather_hoe_gold", -30), "leather_hoe_gold");
    	GameRegistry.registerItem(iron_hoe_gold = new ItemSpadeCustom(CustomToolMaterial.GOLD,"iron_hoe_gold", 200), "iron_hoe_gold");
    	
    	GameRegistry.registerItem(wood_hoe_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"wood_hoe_diamond", -500), "wood_hoe_diamond");
    	GameRegistry.registerItem(leather_hoe_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"leather_hoe_diamond", -500), "leather_hoe_diamond");
    	GameRegistry.registerItem(iron_hoe_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"iron_hoe_diamond", 0), "iron_hoe_diamond");
    	GameRegistry.registerItem(mithril_hoe_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"mithril_hoe_diamond", 100), "mithril_hoe_diamond");
    	
    	GameRegistry.registerItem(wood_hoe_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"wood_hoe_bronze", -100), "wood_hoe_bronze");
    	GameRegistry.registerItem(leather_hoe_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"leather_hoe_bronze", -100), "leather_hoe_bronze");
    	GameRegistry.registerItem(iron_hoe_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"iron_hoe_bronze", 100), "iron_hoe_bronze");
    	GameRegistry.registerItem(mithril_hoe_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"mithril_hoe_bronze", 100), "mithril_hoe_bronze");
    	
    	GameRegistry.registerItem(wood_hoe_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"wood_hoe_mithril", -100), "wood_hoe_mithril");
    	GameRegistry.registerItem(leather_hoe_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"leather_hoe_mithril", -100), "leather_hoe_mithril");
    	GameRegistry.registerItem(iron_hoe_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"iron_hoe_mithril", 200), "iron_hoe_mithril");
    	GameRegistry.registerItem(mithril_hoe_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"mithril_hoe_mithril", 300), "mithril_hoe_mithril");
    	
    	GameRegistry.registerItem(chain_mail = new ItemCraft("chain_mail"), "chain_mail");
    	GameRegistry.registerItem(gold_nugget_custom = new ItemCraft("gold_nugget_custom"), "gold_nugget_custom");
    	GameRegistry.registerItem(iron_nugget = new ItemCraft("iron_nugget"), "iron_nugget");
    	
    	GameRegistry.registerItem(garde_bronze = new ItemCraft("garde_bronze"), "garde_bronze");
    	GameRegistry.registerItem(garde_leather = new ItemCraft("garde_leather"), "garde_leather");
    	GameRegistry.registerItem(garde_iron = new ItemCraft("garde_iron"), "garde_iron");  	
    	GameRegistry.registerItem(garde_mithril = new ItemCraft("garde_mithril"), "garde_mithril");
    	GameRegistry.registerItem(garde_obsidian = new ItemCraft("garde_obsidian"), "garde_obsidian");
    	
    	GameRegistry.registerItem(manche_steel = new ItemCraft("manche_steel"), "manche_steel");
    	GameRegistry.registerItem(manche_wood = new ItemCraft("manche_wood"), "manche_wood");
    	GameRegistry.registerItem(manche_leather = new ItemCraft("manche_leather"), "manche_leather");
    	GameRegistry.registerItem(manche_iron = new ItemCraft("manche_iron"), "manche_iron");  	
    	GameRegistry.registerItem(manche_mithril = new ItemCraft("manche_mithril"), "manche_mithril");
    	
    	GameRegistry.registerItem(blade_stone = new ItemCraft("blade_stone"), "blade_stone");
    	GameRegistry.registerItem(blade_gold = new ItemCraft("blade_gold"), "blade_gold");
    	GameRegistry.registerItem(blade_iron = new ItemCraft("blade_iron"), "blade_iron");
    	GameRegistry.registerItem(blade_steel = new ItemCraft("blade_steel"), "blade_steel");
    	GameRegistry.registerItem(blade_mithril = new ItemCraft("blade_mithril"), "blade_mithril");  	
    	GameRegistry.registerItem(blade_bronze = new ItemCraft("blade_bronze"), "blade_bronze");
    	GameRegistry.registerItem(blade_diamond = new ItemCraft("blade_diamond"), "blade_diamond");
    	
    	GameRegistry.registerItem(plate_iron = new ItemCraft("plate_iron"), "plate_iron");
    	GameRegistry.registerItem(plate_steel = new ItemCraft("plate_steel"), "plate_steel");
    	GameRegistry.registerItem(plate_mithril = new ItemCraft("plate_mithril"), "plate_mithril");
    	GameRegistry.registerItem(plate_bronze = new ItemCraft("plate_bronze"), "plate_bronze");
    	GameRegistry.registerItem(plate_obsidian = new ItemCraft("plate_obsidian"), "plate_obsidian");
    	GameRegistry.registerItem(plate_adamantine = new ItemCraft("plate_adamantine"), "plate_adamantine");
    	GameRegistry.registerItem(plate_gold = new ItemCraft("plate_gold"), "plate_gold");
    	
    	GameRegistry.registerItem(head_pickaxe_stone = new ItemCraft("head_pickaxe_stone"), "head_pickaxe_stone");
    	GameRegistry.registerItem(head_pickaxe_iron = new ItemCraft("head_pickaxe_iron"), "head_pickaxe_iron");
    	GameRegistry.registerItem(head_pickaxe_mithril = new ItemCraft("head_pickaxe_mithril"), "head_pickaxe_mithril");
    	GameRegistry.registerItem(head_pickaxe_gold = new ItemCraft("head_pickaxe_gold"), "head_pickaxe_gold");
    	GameRegistry.registerItem(head_pickaxe_diamond = new ItemCraft("head_pickaxe_diamond"), "head_pickaxe_diamond");
    	
    	GameRegistry.registerItem(head_hoe_stone = new ItemCraft("head_hoe_stone"), "head_hoe_stone");  	
    	GameRegistry.registerItem(head_hoe_gold = new ItemCraft("head_hoe_gold"), "head_hoe_gold");
    	GameRegistry.registerItem(head_hoe_mithril = new ItemCraft("head_hoe_mithril"), "head_hoe_mithril");
    	GameRegistry.registerItem(head_hoe_iron = new ItemCraft("head_hoe_iron"), "head_hoe_iron");
    	GameRegistry.registerItem(head_hoe_diamond = new ItemCraft("head_hoe_diamond"), "head_hoe_diamond");
    	
    	GameRegistry.registerItem(head_shovel_stone = new ItemCraft("head_shovel_stone"), "head_shovel_stone");  	
    	GameRegistry.registerItem(head_shovel_gold = new ItemCraft("head_shovel_gold"), "head_shovel_gold");
    	GameRegistry.registerItem(head_shovel_mithril = new ItemCraft("head_shovel_mithril"), "head_shovel_mithril");
    	GameRegistry.registerItem(head_shovel_iron = new ItemCraft("head_shovel_iron"), "head_shovel_iron");
    	GameRegistry.registerItem(head_shovel_diamond = new ItemCraft("head_shovel_diamond"), "head_shovel_diamond");
    	
    	GameRegistry.registerItem(head_axe_stone = new ItemCraft("head_axe_stone"), "head_axe_stone");  	
    	GameRegistry.registerItem(head_axe_gold = new ItemCraft("head_axe_gold"), "head_axe_gold");
    	GameRegistry.registerItem(head_axe_mithril = new ItemCraft("head_axe_mithril"), "head_axe_mithril");
    	GameRegistry.registerItem(head_axe_iron = new ItemCraft("head_axe_iron"), "head_axe_iron");
    	GameRegistry.registerItem(head_axe_diamond = new ItemCraft("head_axe_diamond"), "head_axe_diamond");
    	
		//GameRegistry.registerItem(healing_staff, "healing_staff");
    	GameRegistry.registerItem(bag = new ItemBag("bag"), "bag");
    	GameRegistry.registerItem(leg_beef = new ItemThrowingRock("leg_beef"), "leg_beef");
    	GameRegistry.registerItem(rock = new ItemThrowingRock("rock"), "rock");
    	GameRegistry.registerItem(iron_ingot_mold = new SimpleItem("iron_ingot_mold"), "iron_ingot_mold");
    	GameRegistry.registerItem(donavis = new SimpleItem("donavis"), "donavis");
    	GameRegistry.registerItem(pilon = new SimpleItem("pilon"), "pilon");
    	GameRegistry.registerItem(cloute = new SimpleItem("cloute"), "cloute");
    	GameRegistry.registerItem(axe_butcher = new ItemSaw(0,CraftingMaterial.IRON, "axe_butcher"), "axe_butcher");
    	GameRegistry.registerItem(knife_butcher = new ItemSaw(0,CraftingMaterial.IRON, "knife_butcher"), "knife_butcher");
    	GameRegistry.registerItem(tin_ingot = new SimpleItem("tin_ingot"), "tin_ingot");
    	GameRegistry.registerItem(copper_ingot = new SimpleItem("copper_ingot"), "copper_ingot");
    	GameRegistry.registerItem(copper_nugget = new SimpleItem("copper_nugget"), "copper_nugget");
    	GameRegistry.registerItem(bronze_ingot = new SimpleItem("bronze_ingot"), "bronze_ingot");
    	GameRegistry.registerItem(mithril_ingot = new SimpleItem("mithril_ingot"), "mithril_ingot");
    	GameRegistry.registerItem(steel_ingot = new SimpleItem("steel_ingot"), "steel_ingot");
    	GameRegistry.registerItem(obsidian_ingot = new SimpleItem("obsidian_ingot"), "obsidian_ingot");
    	GameRegistry.registerItem(obsidian_ore = new SimpleItem("obsidian_ore"), "obsidian_ore");
    	GameRegistry.registerItem(rock_mold = new SimpleItem("rock_mold"), "rock_mold");
    	GameRegistry.registerItem(clay_mold = new SimpleItem("clay_mold"), "clay_mold");
    	GameRegistry.registerItem(tin_nugget = new SimpleItem("tin_nugget"), "tin_nugget");
    	GameRegistry.registerItem(mithril_nugget = new SimpleItem("mithril_nugget"), "mithril_nugget");
    	GameRegistry.registerItem(tin_ingot_mold = new SimpleItem("tin_ingot_mold"), "tin_ingot_mold");
    	GameRegistry.registerItem(gold_ingot_mold = new SimpleItem("gold_ingot_mold"), "gold_ingot_mold");
    	GameRegistry.registerItem(mithril_ingot_mold = new SimpleItem("mithril_ingot_mold"), "mithril_ingot_mold");
    	GameRegistry.registerItem(copper_ingot_mold = new SimpleItem("copper_ingot_mold"), "copper_ingot_mold");
    	GameRegistry.registerItem(adamantine_ingot_mold = new SimpleItem("adamantine_ingot_mold"), "adamantine_ingot_mold");
    	GameRegistry.registerItem(hammer_burin = new ItemSaw(0, CraftingMaterial.STONE, "hammer_burin"), "hammer_burin");
    	GameRegistry.registerItem(burin = new SimpleItem("burin"), "burin");
    	GameRegistry.registerItem(hammer = new SimpleItem("hammer"), "hammer");

    	GameRegistry.registerItem(diamond_brut = new SimpleItem("diamond_brut"), "diamond_brut");
    	GameRegistry.registerItem(adamantine_nugget = new SimpleItem("adamantine_nugget"), "adamantine_nugget");
    	
    	GameRegistry.registerItem(adamantine_helmet = new ItemArmorAdamantine(ADAMANTINE,0, "adamantine_helmet"), "adamantine_helmet");
    	GameRegistry.registerItem(adamantine_chestplate = new ItemArmorAdamantine(ADAMANTINE,1, "adamantine_chestplate"), "adamantine_chestplate");
    	GameRegistry.registerItem(adamantine_leggins = new ItemArmorAdamantine(ADAMANTINE,2, "adamantine_leggins"), "adamantine_leggins");
    	GameRegistry.registerItem(adamantine_boots = new ItemArmorAdamantine(ADAMANTINE,3, "adamantine_boots"), "adamantine_boots");

    	GameRegistry.registerItem(cloute_helmet = new ItemArmorCloute(CLOUTE,0,"cloute_helmet"), "cloute_helmet");
    	GameRegistry.registerItem(cloute_chestplate = new ItemArmorCloute(CLOUTE,1,"cloute_chestplate"), "cloute_chestplate");
    	GameRegistry.registerItem(cloute_leggins = new ItemArmorCloute(CLOUTE,2,"cloute_leggins"), "cloute_leggins");
    	GameRegistry.registerItem(cloute_boots = new ItemArmorCloute(CLOUTE,3,"cloute_boots"), "cloute_boots");
    	
    	GameRegistry.registerItem(steel_helmet = new ItemArmorSteel(STEEL,0, "steel_helmet"), "steel_helmet");
    	GameRegistry.registerItem(steel_chestplate = new ItemArmorSteel(STEEL,1, "steel_chestplate"), "steel_chestplate");
    	GameRegistry.registerItem(steel_leggins = new ItemArmorSteel(STEEL,2, "steel_leggins"), "steel_leggins");
    	GameRegistry.registerItem(steel_boots = new ItemArmorSteel(STEEL,3, "steel_boots"), "steel_boots");
    	
    	GameRegistry.registerItem(mithril_helmet = new ItemArmorMithril(MITHRIL,0, "mithril_helmet"), "mithril_helmet");
    	GameRegistry.registerItem(mithril_chestplate = new ItemArmorMithril(MITHRIL,1, "mithril_chestplate"), "mithril_chestplate");
    	GameRegistry.registerItem(mithril_leggins = new ItemArmorMithril(MITHRIL,2, "mithril_leggins"), "mithril_leggins");
    	GameRegistry.registerItem(mithril_boots = new ItemArmorMithril(MITHRIL,3, "mithril_boots"), "mithril_boots");
    	
    	GameRegistry.registerItem(bronze_helmet = new ItemArmorBronze(BRONZE,0, "bronze_helmet"), "bronze_helmet");
    	GameRegistry.registerItem(bronze_chestplate = new ItemArmorBronze(BRONZE,1, "bronze_chestplate"), "bronze_chestplate");
    	GameRegistry.registerItem(bronze_leggins = new ItemArmorBronze(BRONZE,2, "bronze_leggins"), "bronze_leggins");
    	GameRegistry.registerItem(bronze_boots = new ItemArmorBronze(BRONZE,3, "bronze_boots"), "bronze_boots");
    	
    	GameRegistry.registerItem(obsidian_helmet = new ItemArmorObsidian(OBSIDIAN,0,"obsidian_helmet"), "obsidian_helmet");
    	GameRegistry.registerItem(obsidian_chestplate = new ItemArmorObsidian(OBSIDIAN,1,"obsidian_chestplate"), "obsidian_chestplate");
    	GameRegistry.registerItem(obsidian_leggins = new ItemArmorObsidian(OBSIDIAN,2,"obsidian_leggins"), "obsidian_leggins");
    	GameRegistry.registerItem(obsidian_boots = new ItemArmorObsidian(OBSIDIAN,3,"obsidian_boots"), "obsidian_boots");
    	
    	GameRegistry.registerItem(copper_saw = new ItemSaw(0,CraftingMaterial.COPPER, "copper_saw"), "copper_saw");
    	GameRegistry.registerItem(gold_saw = new ItemSaw(0,CraftingMaterial.GOLD, "gold_saw"), "gold_saw");
    	GameRegistry.registerItem(diamond_saw = new ItemSaw(0,CraftingMaterial.EMERALD, "diamond_saw"), "diamond_saw");
    	GameRegistry.registerItem(iron_saw = new ItemSaw(0,CraftingMaterial.IRON, "iron_saw"), "iron_saw");

    	
    	GameRegistry.registerItem(ebene_helmet = new ItemArmorEbene(EBENE,0,"ebene_helmet"), "ebene_helmet");
    	GameRegistry.registerItem(ebene_chestplate = new ItemArmorEbene(EBENE,1,"ebene_chestplate"), "ebene_chestplate");
    	GameRegistry.registerItem(ebene_leggins = new ItemArmorEbene(EBENE,2,"ebene_leggins"), "ebene_leggins");
    	GameRegistry.registerItem(ebene_boots = new ItemArmorEbene(EBENE,3,"ebene_boots"), "ebene_boots");
    	
    	
		GameRegistry.registerItem(wood_sword_stone = new ItemSwordCustom(CustomToolMaterial.STONE,"wood_sword_stone", -30), "wood_sword_stone");
    	
    	GameRegistry.registerItem(leather_sword_iron = new ItemSwordCustom(CustomToolMaterial.STONE,"leather_sword_iron", -30), "leather_sword_iron");
    	GameRegistry.registerItem(iron_sword_iron = new ItemSwordCustom(CustomToolMaterial.IRON,"iron_sword_iron", 200), "iron_sword_iron");
    	
    	GameRegistry.registerItem(leather_sword_gold = new ItemSwordCustom(CustomToolMaterial.IRON,"leather_sword_gold", -30), "leather_sword_gold");
    	GameRegistry.registerItem(iron_sword_gold = new ItemSwordCustom(CustomToolMaterial.IRON,"iron_sword_gold", 200), "iron_sword_gold");
    	
    	GameRegistry.registerItem(leather_sword_diamond = new ItemSwordCustom(CustomToolMaterial.EMERALD,"leather_sword_diamond", -500), "leather_sword_diamond");
    	GameRegistry.registerItem(iron_sword_diamond = new ItemSwordCustom(CustomToolMaterial.EMERALD,"iron_sword_diamond", 0), "iron_sword_diamond");
    	GameRegistry.registerItem(bronze_sword_diamond = new ItemSwordCustom(CustomToolMaterial.EMERALD,"bronze_sword_diamond", 100), "bronze_sword_diamond");
    	
    	GameRegistry.registerItem(leather_sword_bronze = new ItemSwordCustom(CustomToolMaterial.BRONZE,"leather_sword_bronze", -100), "leather_sword_bronze");
    	GameRegistry.registerItem(iron_sword_bronze = new ItemSwordCustom(CustomToolMaterial.BRONZE,"iron_sword_bronze", 100), "iron_sword_bronze");
    	GameRegistry.registerItem(bronze_sword_bronze = new ItemSwordCustom(CustomToolMaterial.BRONZE,"bronze_sword_bronze", 100), "bronze_sword_bronze");
    	
    	GameRegistry.registerItem(leather_sword_mithril = new ItemSwordCustom(CustomToolMaterial.MITHRIL,"leather_sword_mithril", -100), "leather_sword_mithril");
    	GameRegistry.registerItem(iron_sword_mithril = new ItemSwordCustom(CustomToolMaterial.MITHRIL,"iron_sword_mithril", 200), "iron_sword_mithril");
    	GameRegistry.registerItem(bronze_sword_mithril = new ItemSwordCustom(CustomToolMaterial.MITHRIL,"bronze_sword_mithril", 300), "bronze_sword_mithril");

    	GameRegistry.registerItem(wood_axe_stone = new ItemAxeCustom(CustomToolMaterial.STONE,"wood_axe_stone", -30), "wood_axe_stone");
    	GameRegistry.registerItem(leather_axe_stone = new ItemAxeCustom(CustomToolMaterial.STONE,"leather_axe_stone", 0), "leather_axe_stone");
    	
    	GameRegistry.registerItem(wood_axe_iron = new ItemAxeCustom(CustomToolMaterial.IRON,"wood_axe_iron", -60), "wood_axe_iron");
    	GameRegistry.registerItem(leather_axe_iron = new ItemAxeCustom(CustomToolMaterial.STONE,"leather_axe_iron", -30), "leather_axe_iron");
    	GameRegistry.registerItem(iron_axe_iron = new ItemAxeCustom(CustomToolMaterial.IRON,"iron_axe_iron", 200), "iron_axe_iron");
    	
    	GameRegistry.registerItem(wood_axe_gold = new ItemAxeCustom(CustomToolMaterial.GOLD,"wood_axe_gold", -30), "wood_axe_gold");
    	GameRegistry.registerItem(leather_axe_gold = new ItemAxeCustom(CustomToolMaterial.GOLD,"leather_axe_gold", -30), "leather_axe_gold");
    	GameRegistry.registerItem(iron_axe_gold = new ItemAxeCustom(CustomToolMaterial.GOLD,"iron_axe_gold", 200), "iron_axe_gold");
    	
    	GameRegistry.registerItem(wood_axe_diamond = new ItemAxeCustom(CustomToolMaterial.EMERALD,"wood_axe_diamond", -500), "wood_axe_diamond");
    	GameRegistry.registerItem(leather_axe_diamond = new ItemAxeCustom(CustomToolMaterial.EMERALD,"leather_axe_diamond", -500), "leather_axe_diamond");
    	GameRegistry.registerItem(iron_axe_diamond = new ItemAxeCustom(CustomToolMaterial.EMERALD,"iron_axe_diamond", 0), "iron_axe_diamond");
    	GameRegistry.registerItem(mithril_axe_diamond = new ItemAxeCustom(CustomToolMaterial.EMERALD,"mithril_axe_diamond", 100), "mithril_axe_diamond");
    	
    	GameRegistry.registerItem(wood_axe_bronze = new ItemAxeCustom(CustomToolMaterial.BRONZE,"wood_axe_bronze", -100), "wood_axe_bronze");
    	GameRegistry.registerItem(leather_axe_bronze = new ItemAxeCustom(CustomToolMaterial.BRONZE,"leather_axe_bronze", -100), "leather_axe_bronze");
    	GameRegistry.registerItem(iron_axe_bronze = new ItemAxeCustom(CustomToolMaterial.BRONZE,"iron_axe_bronze", 100), "iron_axe_bronze");
    	GameRegistry.registerItem(bronze_axe_bronze = new ItemAxeCustom(CustomToolMaterial.BRONZE,"bronze_axe_bronze", 100), "bronze_axe_bronze");
    	
    	GameRegistry.registerItem(wood_axe_mithril = new ItemAxeCustom(CustomToolMaterial.MITHRIL,"wood_axe_mithril", -100), "wood_axe_mithril");
    	GameRegistry.registerItem(leather_axe_mithril = new ItemAxeCustom(CustomToolMaterial.MITHRIL,"leather_axe_mithril", -100), "leather_axe_mithril");
    	GameRegistry.registerItem(iron_axe_mithril = new ItemAxeCustom(CustomToolMaterial.MITHRIL,"iron_axe_mithril", 200), "iron_axe_mithril");
    	GameRegistry.registerItem(mithril_axe_mithril = new ItemAxeCustom(CustomToolMaterial.MITHRIL,"mithril_axe_mithril", 300), "mithril_axe_mithril");

    	GameRegistry.registerItem(wood_pickaxe_stone = new ItemPickaxeCustom(CustomToolMaterial.STONE,"wood_pickaxe_stone", -30), "wood_pickaxe_stone");
    	GameRegistry.registerItem(leather_pickaxe_stone = new ItemPickaxeCustom(CustomToolMaterial.STONE,"leather_pickaxe_stone", 0), "leather_pickaxe_stone");
    	
    	GameRegistry.registerItem(wood_pickaxe_iron = new ItemPickaxeCustom(CustomToolMaterial.IRON,"wood_pickaxe_iron", -60), "wood_pickaxe_iron");
    	GameRegistry.registerItem(leather_pickaxe_iron = new ItemPickaxeCustom(CustomToolMaterial.STONE,"leather_pickaxe_iron", -30), "leather_pickaxe_iron");
    	GameRegistry.registerItem(iron_pickaxe_iron = new ItemPickaxeCustom(CustomToolMaterial.IRON,"iron_pickaxe_iron", 200), "iron_pickaxe_iron");
    	
    	GameRegistry.registerItem(wood_pickaxe_gold = new ItemPickaxeCustom(CustomToolMaterial.GOLD,"wood_pickaxe_gold", -30), "wood_pickaxe_gold");
    	GameRegistry.registerItem(leather_pickaxe_gold = new ItemPickaxeCustom(CustomToolMaterial.GOLD,"leather_pickaxe_gold", -30), "leather_pickaxe_gold");
    	GameRegistry.registerItem(iron_pickaxe_gold = new ItemPickaxeCustom(CustomToolMaterial.GOLD,"iron_pickaxe_gold", 200), "iron_pickaxe_gold");
    	
    	GameRegistry.registerItem(wood_pickaxe_diamond = new ItemPickaxeCustom(CustomToolMaterial.EMERALD,"wood_pickaxe_diamond", -500), "wood_pickaxe_diamond");
    	GameRegistry.registerItem(leather_pickaxe_diamond = new ItemPickaxeCustom(CustomToolMaterial.EMERALD,"leather_pickaxe_diamond", -500), "leather_pickaxe_diamond");
    	GameRegistry.registerItem(iron_pickaxe_diamond = new ItemPickaxeCustom(CustomToolMaterial.EMERALD,"iron_pickaxe_diamond", 0), "iron_pickaxe_diamond");
    	GameRegistry.registerItem(mithril_pickaxe_diamond = new ItemPickaxeCustom(CustomToolMaterial.EMERALD,"mithril_pickaxe_diamond", 100), "mithril_pickaxe_diamond");
    	
    	GameRegistry.registerItem(wood_pickaxe_bronze = new ItemPickaxeCustom(CustomToolMaterial.BRONZE,"wood_pickaxe_bronze", -100), "wood_pickaxe_bronze");
    	GameRegistry.registerItem(leather_pickaxe_bronze = new ItemPickaxeCustom(CustomToolMaterial.BRONZE,"leather_pickaxe_bronze", -100), "leather_pickaxe_bronze");
    	GameRegistry.registerItem(iron_pickaxe_bronze = new ItemPickaxeCustom(CustomToolMaterial.BRONZE,"iron_pickaxe_bronze", 100), "iron_pickaxe_bronze");
    	GameRegistry.registerItem(mithril_pickaxe_bronze = new ItemPickaxeCustom(CustomToolMaterial.BRONZE,"mithril_pickaxe_bronze", 100), "mithril_pickaxe_bronze");
    	
    	GameRegistry.registerItem(wood_pickaxe_mithril = new ItemPickaxeCustom(CustomToolMaterial.MITHRIL,"wood_pickaxe_mithril", -100), "wood_pickaxe_mithril");

		GameRegistry.registerItem(leather_pickaxe_mithril = new ItemPickaxeCustom(CustomToolMaterial.MITHRIL,"leather_pickaxe_mithril", -100), "leather_pickaxe_mithril");
    	GameRegistry.registerItem(iron_pickaxe_mithril = new ItemPickaxeCustom(CustomToolMaterial.MITHRIL,"iron_pickaxe_mithril", 200), "iron_pickaxe_mithril");
		GameRegistry.registerItem(mithril_pickaxe_mithril = new ItemPickaxeCustom(CustomToolMaterial.MITHRIL,"mithril_pickaxe_mithril", 300), "mithril_pickaxe_mithril");
		
    	GameRegistry.registerItem(wood_shovel_stone = new ItemSpadeCustom(CustomToolMaterial.STONE,"wood_shovel_stone", -30), "wood_shovel_stone");
    	GameRegistry.registerItem(leather_shovel_stone = new ItemSpadeCustom(CustomToolMaterial.STONE,"leather_shovel_stone", 0), "leather_shovel_stone");
    	
    	GameRegistry.registerItem(wood_shovel_iron = new ItemSpadeCustom(CustomToolMaterial.IRON,"wood_shovel_iron", -60), "wood_shovel_iron");
    	GameRegistry.registerItem(leather_shovel_iron = new ItemSpadeCustom(CustomToolMaterial.STONE,"leather_shovel_iron", -30), "leather_shovel_iron");
    	GameRegistry.registerItem(iron_shovel_iron = new ItemSpadeCustom(CustomToolMaterial.IRON,"iron_shovel_iron", 200), "iron_shovel_iron");
    	
    	GameRegistry.registerItem(wood_shovel_gold = new ItemSpadeCustom(CustomToolMaterial.GOLD,"wood_shovel_gold", -30), "wood_shovel_gold");
    	GameRegistry.registerItem(leather_shovel_gold = new ItemSpadeCustom(CustomToolMaterial.GOLD,"leather_shovel_gold", -30), "leather_shovel_gold");
    	GameRegistry.registerItem(iron_shovel_gold = new ItemSpadeCustom(CustomToolMaterial.GOLD,"iron_shovel_gold", 200), "iron_shovel_gold");
    	
    	GameRegistry.registerItem(wood_shovel_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"wood_shovel_diamond", -500), "wood_shovel_diamond");
    	GameRegistry.registerItem(leather_shovel_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"leather_shovel_diamond", -500), "leather_shovel_diamond");
    	GameRegistry.registerItem(iron_shovel_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"iron_shovel_diamond", 0), "iron_shovel_diamond");
    	GameRegistry.registerItem(mithril_shovel_diamond = new ItemSpadeCustom(CustomToolMaterial.EMERALD,"mithril_shovel_diamond", 100), "mithril_shovel_diamond");
    	
    	GameRegistry.registerItem(wood_shovel_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"wood_shovel_bronze", -100), "wood_shovel_bronze");
    	GameRegistry.registerItem(leather_shovel_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"leather_shovel_bronze", -100), "leather_shovel_bronze");
    	GameRegistry.registerItem(iron_shovel_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"iron_shovel_bronze", 100), "iron_shovel_bronze");
    	GameRegistry.registerItem(mithril_shovel_bronze = new ItemSpadeCustom(CustomToolMaterial.BRONZE,"mithril_shovel_bronze", 100), "mithril_shovel_bronze");
    	
    	GameRegistry.registerItem(wood_shovel_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"wood_shovel_mithril", -100), "wood_shovel_mithril");
    	GameRegistry.registerItem(leather_shovel_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"leather_shovel_mithril", -100), "leather_shovel_mithril");
    	GameRegistry.registerItem(iron_shovel_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"iron_shovel_mithril", 200), "iron_shovel_mithril");
    	GameRegistry.registerItem(mithril_shovel_mithril = new ItemSpadeCustom(CustomToolMaterial.MITHRIL,"mithril_shovel_mithril", 300), "mithril_shovel_mithril");


	}
	
	public static void createItemsFood() {

		GameRegistry.registerItem(liver = new SimpleItem("liver"), "liver");
		GameRegistry.registerItem(bucket_wood = new SimpleItem("bucket_wood"), "bucket_wood");
		GameRegistry.registerItem(leg_pig = new SimpleItem("leg_pig"), "leg_pig");
    	GameRegistry.registerItem(floor = new SimpleItem("foor"), "floor");
    	GameRegistry.registerItem(pig_corp = new SimpleItem("pig_corp"), "pig_corp");
    	GameRegistry.registerItem(cow_corp = new SimpleItem("cow_corp"), "cow_corp");
    	//GameRegistry.registerItem(sheep_corp = new SimpleItem("sheep_corp"), "sheep_corp");
    	
    	GameRegistry.registerItem(item_barrel_beer = new ItemReedCustom(ModBlocks.barrel_beer, "item_barrel_beer"), "item_barrel_beer");
    	GameRegistry.registerItem(item_barrel_hydromel = new ItemReedCustom(ModBlocks.barrel_hydromel, "item_barrel_hydromel"), "item_barrel_hydromel");
    	GameRegistry.registerItem(item_barrel_vine = new ItemReedCustom(ModBlocks.barrel_vine, "item_barrel_vine"), "item_barrel_vine");
    	GameRegistry.registerItem(item_barrel_rhum = new ItemReedCustom(ModBlocks.barrel_rhum, "item_barrel_rhum"), "item_barrel_rhum");
    	
    	GameRegistry.registerItem(dough_bread = new SimpleItem("dough_bread"), "dough_bread");
    	GameRegistry.registerItem(dough_bread_cereal = new SimpleItem("dough_bread_cereal"), "dough_bread_cereal");
    	GameRegistry.registerItem(dough_pie = new SimpleItem("dough_pie"), "dough_pie");
    	GameRegistry.registerItem(dough_pie_blueberry = new SimpleItem("dough_pie_blueberry"), "dough_pie_blueberry");
    	GameRegistry.registerItem(dough_cake = new SimpleItem("foor"), "dough_cake");
    	GameRegistry.registerItem(dough_cake_chocolate = new SimpleItem("dough_cake_chocolate"), "dough_cake_chocolate");
    	GameRegistry.registerItem(hydromel_chop = new ItemBeerChope("hydromel_chop",4), "hydromel_chop");
    	GameRegistry.registerItem(apple_green = new ItemFoodCustom(2 , 0.1F, false, "apple_green",-2), "apple_green");
    	GameRegistry.registerItem(pear = new ItemFoodCustom(2 , 0.1F, false, "pear", 0), "pear");

    	GameRegistry.registerItem(ham_cooked = new ItemFoodCustom(5 , 0.2F, true, "ham_cooked", 0), "ham_cooked");
    	/*GameRegistry.registerItem(ham_sheep_cooked = new ItemFoodCustom(5 , 0.2F, true, "ham_sheep_cooked", 0), "ham_sheep_cooked");
    	GameRegistry.registerItem(ham_sheep_salt = new ItemFoodCustom(5 , 0.2F, true, "ham_sheep_salt", 3), "ham_sheep_salt");*/
    	GameRegistry.registerItem(rib_pig_cooked = new ItemFoodCustom(3 , 0.4F, true, "rib_pig_cooked", 0), "rib_pig_cooked");
    	GameRegistry.registerItem(roast_pig_cooked = new ItemFoodCustom(9 , 0.5F, true, "roast_pig_cooked", 0), "roast_pig_cooked");
    	GameRegistry.registerItem(roast_beef_cooked = new ItemFoodCustom(11 , 0.2F, true, "roast_beef_cooked", 0), "roast_beef_cooked");
    	GameRegistry.registerItem(rib_beef_cooked = new ItemFoodCustom(3 , 0.4F, true, "rib_beef_cooked", 0), "rib_beef_cooked");
    	//GameRegistry.registerItem(rib_sheep_cooked = new ItemFoodCustom(3 , 0.4F, true, "rib_sheep_cooked", 0), "rib_sheep_cooked");
    	GameRegistry.registerItem(knuckle_pig_cooked = new ItemFoodCustom(9 , 0.5F, true, "knuckle_pig_cooked",0), "knuckle_pig_cooked");
    	GameRegistry.registerItem(knuckle_beef_cooked = new ItemFoodCustom(8 , 0.3F, true, "knuckle_beef_cooked",0), "knuckle_beef_cooked");

    	GameRegistry.registerItem(avant_beef = new SimpleItem("avant_beef"), "avant_beef");
    	GameRegistry.registerItem(arriere_beef = new SimpleItem("arriere_beef"), "arriere_beef");
    	GameRegistry.registerItem(ham = new ItemFoodCustom(3 , 0.2F, true, "ham", 0).setPotionEffect(Potion.poison.id, 30, 0, 0.3F), "ham");
    	GameRegistry.registerItem(rib_pig = new ItemFoodCustom(3 , 0.2F, true, "rib_pig", 0).setPotionEffect(Potion.poison.id, 30, 0, 0.3F), "rib_pig");
    	//GameRegistry.registerItem(rib_sheep = new ItemFoodCustom(3 , 0.2F, true, "rib_sheep", 0).setPotionEffect(Potion.poison.id, 30, 0, 0.3F), "rib_sheep");
    	GameRegistry.registerItem(roast_pig = new ItemFoodCustom(3 , 0.3F, true, "roast_pig", 0).setPotionEffect(Potion.poison.id, 30, 0, 0.3F), "roast_pig");
    	GameRegistry.registerItem(ham_salt = new ItemFoodCustom(6, 0.3F,false, "ham_salt",2 ), "ham_salt");
    	GameRegistry.registerItem(roast_beef = new ItemFoodCustom(5 , 0.2F, true, "roast_beef",0), "roast_beef");
    	GameRegistry.registerItem(rib_beef = new ItemFoodCustom(3 , 0.2F, true, "rib_beef",0), "rib_beef");
    	GameRegistry.registerItem(knuckle_pig = new ItemFoodCustom(4 , 0.3F, true, "knuckle_pig",0).setPotionEffect(Potion.poison.id, 30, 0, 0.3F), "knuckle_pig");
    	GameRegistry.registerItem(knuckle_beef = new ItemFoodCustom(4 , 0.3F, true, "knuckle_beef",0), "knuckle_beef");
    	GameRegistry.registerItem(knuckle_sheep = new ItemFoodCustom(7 , 0.4F, true, "knuckle_sheep",0), "knuckle_sheep");
    	/*GameRegistry.registerItem(leg_sheep = new SimpleItem("leg_sheep"), "leg_sheep");
    	GameRegistry.registerItem(gigot_sheep = new ItemFoodCustom(4 , 0.4F, true, "gigot_sheep",0), "gigot_sheep");
    	GameRegistry.registerItem(ham_sheep = new ItemFoodCustom(3 , 0.2F, true, "ham_sheep",0), "ham_sheep");*/
    	
    	GameRegistry.registerItem(blueberry = new ItemFoodCustom(2 , 0.2F, false, "blueberry",2), "blueberry");
    	GameRegistry.registerItem(strawberry = new ItemFoodCustom(2 , 0.2F, false, "strawberry",2), "strawberry");
    	GameRegistry.registerItem(raspberry = new ItemFoodCustom(2 , 0.2F, false, "raspberry",2), "raspberry");
    	
    	GameRegistry.registerItem(salad = new ItemFoodCustom(3, 0.1F,false ,"salad",0), "salad");
    	GameRegistry.registerItem(grape = new SimpleItem("grape"), "grape");
    	GameRegistry.registerItem(malt = new SimpleItem("malt"), "malt");
    	GameRegistry.registerItem(fairholly = new SimpleItem("fairholly"), "fairholly");
    	GameRegistry.registerItem(tomato = new ItemFoodCustom(3, 0.1F,false ,"tomato",0), "tomato");
    	GameRegistry.registerItem(cabbages = new ItemFoodCustom(3, 0.1F,false ,"cabbages", 0), "cabbages");
    	GameRegistry.registerItem(orge = new SimpleItem("orge").setCreativeTab(CreativeTabs.tabFood), "orge");
    	
    	GameRegistry.registerItem(salt = new SimpleItem("salt"), "salt");
    	GameRegistry.registerItem(empty_chope = new SimpleItem("empty_chope"), "empty_chope");
    	GameRegistry.registerItem(beer_chope = new ItemBeerChope("beer_chope",6).setPotionEffect(Potion.confusion.id, 10, 0, 0.2F).setPotionEffect(Potion.moveSpeed.id, 30, 0, 0.5F), "beer_chope");
    	GameRegistry.registerItem(bucket_beer = new SimpleItem("bucket_beer").setCreativeTab(CreativeTabs.tabFood).setMaxStackSize(1), "bucket_beer");
    	GameRegistry.registerItem(bucket_hydromel = new SimpleItem("bucket_hydromel").setMaxStackSize(1), "bucket_hydromel");
    	GameRegistry.registerItem(bucket_vine = new SimpleItem("bucket_vine").setMaxStackSize(1), "bucket_vine");
    	GameRegistry.registerItem(bucket_rhum = new SimpleItem("bucket_rhum").setMaxStackSize(1), "bucket_rhum");
    	
    	GameRegistry.registerItem(bottle_rhum = new ItemBottleVine("bottle_rhum", 5), "bottle_rhum");
    	GameRegistry.registerItem(bottle_vine = new ItemBottleVine("bottle_vine",5), "bottle_vine");
    	GameRegistry.registerItem(bottle_cacao = new ItemBottleVine("bottle_cacao",3), "bottle_cacao");
    	GameRegistry.registerItem(bottle_milk = new ItemBottleVine("bottle_milk",4), "bottle_milk");
    	
    	GameRegistry.registerItem(seeds_salad = new ItemSeeds(ModBlocks.crops_salad, Blocks.farmland).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("seeds_salad"), "seeds_salad");
    	GameRegistry.registerItem(seeds_malt = new ItemSeeds(ModBlocks.crops_malt, Blocks.farmland).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("seeds_malt"), "seeds_malt");
    	GameRegistry.registerItem(seeds_grape = new ItemSeeds(ModBlocks.crops_grape, Blocks.farmland).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("seeds_grape"), "seeds_grape");
    	GameRegistry.registerItem(seeds_tomato = new ItemSeeds(ModBlocks.crops_tomato, Blocks.farmland).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("seeds_tomato"), "seeds_tomato");
    	GameRegistry.registerItem(seeds_cabbages = new ItemSeeds(ModBlocks.crops_cabbages, Blocks.farmland).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("seeds_cabbages"), "seeds_cabbages");
    	GameRegistry.registerItem(seeds_orge = new ItemSeeds(ModBlocks.crops_orge, Blocks.farmland).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("seeds_orge"), "seeds_orge");
    	GameRegistry.registerItem(seeds_fairholly = new ItemSeeds(ModBlocks.crops_fairholly, Blocks.farmland).setUnlocalizedName("seeds_fairholly"), "seeds_fairholly");
	}
}
