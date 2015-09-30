package com.mod_rpg.Gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

import com.mod_rpg.Entity.ExtendedPlayerMana;
import com.mod_rpg.Entity.ExtendedPlayerThirst;

@SideOnly(Side.CLIENT)
public class GuiThirstBar extends Gui
{	
	private Minecraft mc;

static final ResourceLocation texturepaths = new ResourceLocation("mod_rpg", "textures/gui/thirst_bar.png");

public GuiThirstBar(Minecraft mc) {
	super();
	this.mc = mc;
}
@SideOnly(Side.CLIENT)
@SubscribeEvent(priority=EventPriority.NORMAL)
public void onRenderExperienceBar(RenderGameOverlayEvent.Post e) {
	if (e.type != ElementType.EXPERIENCE) {
		return;
	}

	ExtendedPlayerThirst props = ExtendedPlayerThirst.get(this.mc.thePlayer);
	if (props == null || props.getMaxThirst() == 0) {
		return;
	}

	int xPos = 100;
	int yPos = 100;
	this.mc.getTextureManager().bindTexture(texturepaths);

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
	int thirstbarwidth = (int)(((float) props.getCurrentThirst() / props.getMaxThirst()) * 49);
	drawTexturedModalRect(xPos + 3, yPos + 3, 0, 9, thirstbarwidth, 3);
	String s = "Thirst " + props.getCurrentThirst() + "/" + props.getMaxThirst();
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
}