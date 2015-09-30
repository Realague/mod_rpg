package com.mod_rpg.Proxy;


import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.mod_rpg.Client.Render.Blocks.BlockRenderRegister;
import com.mod_rpg.Client.Render.Items.ItemRenderRegister;
import com.mod_rpg.CoreMod.Main;
import com.mod_rpg.CoreMod.ModItems;
import com.mod_rpg.Entity.EntityThrowingRock;
import com.mod_rpg.Gui.GuiManaBar;
import com.mod_rpg.Gui.GuiThirstBar;




public class ClientProxy extends CommonProxy
{
	

private final Minecraft mc = Minecraft.getMinecraft();

@Override
public void registerRenderers() {
	ItemModelMesher mesher = mc.getRenderItem().getItemModelMesher();

	RenderingRegistry.registerEntityRenderingHandler(EntityThrowingRock.class,
			new RenderSnowball(mc.getRenderManager(), ModItems.rock, mc.getRenderItem()));
	
	// can register other client-side only things here, too:

	// The RenderGameOverlayEvent is in the MinecraftForge package, so we will
	// register our mana bar overlay to that event bus:
	MinecraftForge.EVENT_BUS.register(new GuiThirstBar(mc));
	MinecraftForge.EVENT_BUS.register(new GuiManaBar(mc));

	// KeyInputEvent is in the FML package, meaning it's posted to the FML event bus
	// rather than the regular Forge event bus:
	//FMLCommonHandler.instance().bus().register(new KeyHandler(mc));
}


// Deprecated???
@Override
public int addArmor(String armor) {
	//return RenderingRegistry.addNewArmourRendererPrefix(armor);
	return 0;
}

@Override
public EntityPlayer getPlayerEntity(MessageContext ctx) {
	// Note that if you simply return 'Minecraft.getMinecraft().thePlayer',
	// your packets will not work as expected because you will be getting a
	// client player even when you are on the server!
	// Sounds absurd, but it's true.

	// Solution is to double-check side before returning the player:
	Main.logger.info("Retrieving player from ClientProxy for message on side " + ctx.side);
	return (ctx.side.isClient() ? mc.thePlayer : super.getPlayerEntity(ctx));
}

@Override
public IThreadListener getThreadFromContext(MessageContext ctx) {
	return (ctx.side.isClient() ? mc : super.getThreadFromContext(ctx));
}
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}



