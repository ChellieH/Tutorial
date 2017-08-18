package com.auroralily.tutorial.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.auroralily.tutorial.Reference;
import com.auroralily.tutorial.items.ItemObsidianIngot;

public class ModItems 
{
	public static Item obsidian_ingot;
	
	public static void init()
	{
		obsidian_ingot = new ItemObsidianIngot();
	}
	
	public static void register()
	{
		ForgeRegistries.ITEMS.register(obsidian_ingot);
	}
	
	public static void registerRenders()
	{
		registerRender(obsidian_ingot);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}	
}
