package com.mod_rpg.CoreMod;

import java.io.File;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.logging.log4j.Logger;

import com.mod_rpg.CreativeTabsMod.TabsMagic;
import com.mod_rpg.Entity.EntityCowCustom;
import com.mod_rpg.Entity.EntityPigCustom;
import com.mod_rpg.Entity.EntitySheepCustom;
import com.mod_rpg.Entity.EntityThrowingRock;
import com.mod_rpg.Event.DropHandler;
import com.mod_rpg.Event.LivingEventHandler;
import com.mod_rpg.Event.ModEventHandler;
import com.mod_rpg.Gui.GuiManaBar;
import com.mod_rpg.Gui.GuiThirstBar;
import com.mod_rpg.Gui.ModGuiHandler;
import com.mod_rpg.Network.PacketDispatcher;
import com.mod_rpg.Proxy.CommonProxy;
import com.mod_rpg.Recipes.Recipes;
import com.mod_rpg.Recipes.RecipesArmor;
import com.mod_rpg.Recipes.RecipesCraft;
import com.mod_rpg.Recipes.RecipesFood;
import com.mod_rpg.Recipes.RecipesSmelting;
import com.mod_rpg.World.WorldGenerationCustom;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {
	private static int modGuiIndex = 100;

	/** Custom GUI indices: */
	public static final int
	GUI_CUSTOM_INV = modGuiIndex++,
	GUI_ITEM_INV = modGuiIndex++;

	/** This is the starting index for all of our mod's item IDs */
	private static int modEntityIndex = 0;


	@Instance
	public static Main instance = new Main();
	    public static final String MODID = "mod_rpg";
	    public static final String VERSION = "0.0.1";
	    public static final String MODNAME = "mod_rpg";

	    public static Logger logger;
	    @SidedProxy(clientSide="com.mod_rpg.Proxy.ClientProxy", serverSide="com.mod_rpg.Proxy.ServerProxy")
	    public static CommonProxy proxy;


	    @EventHandler
	    public void preInit(FMLPreInitializationEvent e) {
			proxy.preInit(e);
			
			logger = e.getModLog();
			logger.info("Beginning pre-initialization");
			Configuration config = new Configuration(new File(e.getModConfigurationDirectory().getAbsolutePath() + "/Tutorial.cfg"));
			config.load();
			config.save();

			// Initialize and register all blocks, items, and entities
			EntityRegistry.registerModEntity(EntityThrowingRock.class, "rock", ++modEntityIndex, this, 64, 10, true);
			EntityRegistry.registerModEntity(EntityCowCustom.class, "cow", 3, this, 64, 10, true);
			EntityRegistry.registerModEntity(EntityPigCustom.class, "pig", 4, this, 64, 10, true);
			EntityRegistry.registerModEntity(EntitySheepCustom.class, "sheep", 5, this, 64, 10, true);
			
			EntityRegistry.removeSpawn(EntityCow.class,EnumCreatureType.CREATURE ,new BiomeGenBase[]{
					BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.extremeHills,BiomeGenBase.taiga,BiomeGenBase.forest,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.jungle,BiomeGenBase.jungleEdge,BiomeGenBase.jungleHills,BiomeGenBase.plains,
					BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.taigaHills,BiomeGenBase.taiga.taigaHills,BiomeGenBase.savanna.taigaHills,BiomeGenBase.savannaPlateau,BiomeGenBase.forestHills
				});
				
				EntityRegistry.removeSpawn(EntityPig.class,EnumCreatureType.CREATURE ,new BiomeGenBase[]{
					BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.extremeHills,BiomeGenBase.taiga,BiomeGenBase.forest,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.jungle,BiomeGenBase.jungleEdge,BiomeGenBase.jungleHills,BiomeGenBase.plains,
					BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.taigaHills,BiomeGenBase.taiga.taigaHills,BiomeGenBase.savanna.taigaHills,BiomeGenBase.savannaPlateau,BiomeGenBase.forestHills
				});
				EntityRegistry.removeSpawn(EntitySheep.class,EnumCreatureType.CREATURE ,new BiomeGenBase[]{
					BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.extremeHills,BiomeGenBase.taiga,BiomeGenBase.forest,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.jungle,BiomeGenBase.jungleEdge,BiomeGenBase.jungleHills,BiomeGenBase.plains,
					BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.taigaHills,BiomeGenBase.taiga.taigaHills,BiomeGenBase.savanna.taigaHills,BiomeGenBase.savannaPlateau,BiomeGenBase.forestHills
				});
			EntityRegistry.addSpawn(EntityPigCustom.class, 10, 3, 5,EnumCreatureType.CREATURE,new BiomeGenBase[]{
				BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.extremeHills,BiomeGenBase.taiga,BiomeGenBase.forest,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.jungle,BiomeGenBase.jungleEdge,BiomeGenBase.jungleHills,BiomeGenBase.plains,
				BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.taigaHills,BiomeGenBase.taiga.taigaHills,BiomeGenBase.savanna.taigaHills,BiomeGenBase.savannaPlateau
			});
			EntityRegistry.addSpawn(EntityCowCustom.class, 10, 3, 5,EnumCreatureType.CREATURE,new BiomeGenBase[]{
				BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.extremeHills,BiomeGenBase.taiga,BiomeGenBase.forest,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.jungle,BiomeGenBase.jungleEdge,BiomeGenBase.jungleHills,BiomeGenBase.plains,
				BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.taigaHills,BiomeGenBase.taiga.taigaHills,BiomeGenBase.savanna.taigaHills,BiomeGenBase.savannaPlateau
			});
			EntityRegistry.addSpawn(EntitySheepCustom.class, 10, 3, 5,EnumCreatureType.CREATURE,new BiomeGenBase[]{
				BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,BiomeGenBase.extremeHills,BiomeGenBase.taiga,BiomeGenBase.forest,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.jungle,BiomeGenBase.jungleEdge,BiomeGenBase.jungleHills,BiomeGenBase.plains,
				BiomeGenBase.megaTaiga,BiomeGenBase.megaTaigaHills,BiomeGenBase.taigaHills,BiomeGenBase.taiga.taigaHills,BiomeGenBase.savanna.taigaHills,BiomeGenBase.savannaPlateau
			});
			//EntityRegistry.

			// Remember to register your packets! This applies whether or not you used a
			// custom class or direct implementation of SimpleNetworkWrapper
			PacketDispatcher.registerPackets();
			
		}
	    public static CreativeTabs TabsCraft = new TabsMagic("TabsCraft");
		@EventHandler
		public void init(FMLInitializationEvent e) {
			proxy.init(e);

			MinecraftForge.EVENT_BUS.register(new LivingEventHandler());
		  	MinecraftForge.EVENT_BUS.register(new DropHandler());
		  	
	    	MinecraftForge.EVENT_BUS.register(new ModEventHandler());
	    	
	    	GameRegistry.registerWorldGenerator(new WorldGenerationCustom(), 0);
	    	
			
			
			

		}
		@SideOnly(Side.CLIENT)
		@EventHandler
		public void postInit(FMLPostInitializationEvent e) {
			proxy.postInit(e);
			NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new ModGuiHandler());
			NetworkRegistry.INSTANCE.registerGuiHandler(this, proxy);
			MinecraftForge.EVENT_BUS.register(new GuiManaBar(Minecraft.getMinecraft()));
			MinecraftForge.EVENT_BUS.register(new GuiThirstBar(Minecraft.getMinecraft()));
			//removeRecipe(new ItemStack(Items.book));
			removeRecipe(new ItemStack(Items.bread));
			removeRecipe(new ItemStack(Items.cake));
			removeRecipe(new ItemStack(Items.book));
			removeRecipe(new ItemStack(Items.pumpkin_pie));
			//faire pour les craft avec le boi/pierre
			removeRecipe (new ItemStack(Blocks.planks));
			removeRecipe (new ItemStack(Blocks.planks,5, 5));
			removeRecipe (new ItemStack(Blocks.planks,4, 4));
			removeRecipe (new ItemStack(Blocks.planks,3, 3));
			removeRecipe (new ItemStack(Blocks.planks,2, 2));
			removeRecipe (new ItemStack(Blocks.planks,1,1));
			removeRecipe(new ItemStack(Items.wooden_sword));
			removeRecipe(new ItemStack(Items.iron_sword));
			removeRecipe(new ItemStack(Items.diamond_sword));
			removeRecipe(new ItemStack(Items.stone_sword));
			removeRecipe(new ItemStack(Items.golden_sword));

			removeRecipe(new ItemStack(Items.wooden_hoe));
			removeRecipe(new ItemStack(Items.iron_hoe));
			removeRecipe(new ItemStack(Items.diamond_hoe));
			removeRecipe(new ItemStack(Items.stone_hoe));
			removeRecipe(new ItemStack(Items.golden_hoe));

			removeRecipe(new ItemStack(Items.wooden_shovel));
			removeRecipe(new ItemStack(Items.iron_shovel));
			removeRecipe(new ItemStack(Items.diamond_shovel));
			removeRecipe(new ItemStack(Items.stone_shovel));
			removeRecipe(new ItemStack(Items.golden_shovel));

			removeRecipe(new ItemStack(Items.wooden_axe));
			removeRecipe(new ItemStack(Items.iron_axe));
			removeRecipe(new ItemStack(Items.diamond_axe));
			removeRecipe(new ItemStack(Items.stone_axe));
			removeRecipe(new ItemStack(Items.golden_axe));

			removeRecipe(new ItemStack(Items.wooden_pickaxe));
			removeRecipe(new ItemStack(Items.iron_pickaxe));
			removeRecipe(new ItemStack(Items.diamond_pickaxe));
			removeRecipe(new ItemStack(Items.stone_pickaxe));
			removeRecipe(new ItemStack(Items.golden_pickaxe));
			
			Recipes.addRecipes();
			RecipesFood.addRecipesFood();	
			RecipesArmor.addRecipesArmor();
			RecipesSmelting.addRecipesSmelting();
			RecipesCraft.addRecipes();
		}
	    	
		public static void removeRecipe(ItemStack stack)
		{
			List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
			for(int i = 0; i < recipeList.size(); i++)
			{
				ItemStack output = recipeList.get(i).getRecipeOutput();
				if(output != null && stack.getItem() == output.getItem() && stack.getItemDamage() == output.getItemDamage())
				{
					recipeList.remove(i);
				}
	 }
		}
}


