package com.auroralily.tutorial;

public class Reference 
{
	
	public static final String MOD_ID = "altm";
	public static final String NAME = "Tutorial Mod";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.12]";
	
	public static final String CLIENT_PROXY_CLASS = "com.auroralily.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.auroralily.tutorial.proxy.ServerProxy";
	
	public static enum TutorialItems
	{
		OBSIDIAN_INGOT("obsidian_ingot", "ItemObsidianIngot");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
	
}
