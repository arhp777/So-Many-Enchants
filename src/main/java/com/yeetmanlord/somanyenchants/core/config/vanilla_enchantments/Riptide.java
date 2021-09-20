package com.yeetmanlord.somanyenchants.core.config.vanilla_enchantments;

import com.yeetmanlord.somanyenchants.core.config.EnchantmentConfig;

import net.minecraftforge.common.ForgeConfigSpec.Builder;

public class Riptide extends EnchantmentConfig
{
	
	public Riptide(int absMax) {
		super(absMax);
		// TODO Auto-generated constructor stub
	}


	protected static String name = "Riptide";
	protected static int max = 5;
	
	
	public void init(Builder builder) 
	{
		builder.push(name);
		
		isEnabled = builder
				.comment(" Whether the mod changes this enchantment")
				.define("isEnabled", true);
		
		maxLevel = builder
				.comment(" The maximum enchantment level")
				.defineInRange("maxLevel", max, 1, 10);
		
		builder.pop();
	}
	
	

}