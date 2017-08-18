package com.auroralily.tutorial.proxy;

import com.auroralily.tutorial.init.ModItems;

public class ClientProxy implements CommonProxy 
{
	@Override
	public void init() 
	{
		ModItems.registerRenders();
	}
}
