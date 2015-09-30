package com.mod_rpg.Gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import com.mod_rpg.Entity.ExtendedPlayerMana;


@SideOnly(Side.CLIENT)
public class GuiManaBar extends Gui
{
	private Minecraft mc;
	
	static final ResourceLocation texturepath = new ResourceLocation("mod_rpg", "textures/gui/mana_bar.png");

	public GuiManaBar(Minecraft mc) {
		super();
		this.mc = mc;
	}
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL)
	public void onRenderExperienceBar(RenderGameOverlayEvent.Post e) {
		if (e.type != ElementType.EXPERIENCE) {
			return;
		}

		ExtendedPlayerMana props = ExtendedPlayerMana.get(this.mc.thePlayer);
		if (props == null || props.getMaxMana() == 0) {
			return;
		}

		int xPos = 150;
		int yPos = 190;
		this.mc.getTextureManager().bindTexture(texturepath);

		// Add this block of code before you draw the section of your texture containing transparency
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(false);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		// Here we draw the background bar which contains a transparent section; note the new size
		drawTexturedModalRect(xPos, yPos, 0, 0, 56, 9);
		// You can keep drawing without changing anything
		int manabarwidth = (int)(((float) props.getCurrentMana() / props.getMaxMana()) * 49);
		drawTexturedModalRect(xPos + 3, yPos + 3, 0, 9, manabarwidth, 3);
		String s = "Mana " + props.getCurrentMana() + "/" + props.getMaxMana();
		yPos += 10;
		this.mc.fontRendererObj.drawString(s, xPos + 1, yPos, 0);
		this.mc.fontRendererObj.drawString(s, xPos - 1, yPos, 0);
		this.mc.fontRendererObj.drawString(s, xPos, yPos + 1, 0);
		this.mc.fontRendererObj.drawString(s, xPos, yPos - 1, 0);
		this.mc.fontRendererObj.drawString(s, xPos, yPos, 8453920);

		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthMask(true);
	}
/*
Alright, try it out. There should be a horizontal mana bar in the upper-left corner of 
your screen. Now use our ItemUseMana once or twice. Notice the mana bar doesn't update.

What's going on?

Well, currently only the server knows how much mana the player has. We never told the client
that the player even has mana, let alone how much! For many purposes, this is fine. However,
since a Gui is only rendered client side, this is a case where we will need to use packets
to synchronize the server/client.

Please take a few minutes to read up on Packet Handling, as I'm not going to cover it in
much detail here:
1.6.4: http://www.minecraftforge.net/wiki/Tutorials/Packet_Handling
1.7.2: SimpleNetworkWrapper is broken, use PacketPipeline
1.7.10: SNW works now, see here: http://www.minecraftforum.net/forums/mapping-and-modding/mapping-and-modding-tutorials/2137055

Ok, moving on.
Make a packet handler class like in the above tutorial:

STOP!!! The packet code below is for 1.6.4 - if you are coding for 1.7.2 or above, please see the actual demo of this tutorial for a current network implementation. You can find it here: https://github.com/coolAlias/Tutorial-Demo/tree/master/src/main/java/tutorial/network
*/}
