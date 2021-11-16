package com.yeetmanlord.somanyenchants.core.util;

import com.yeetmanlord.somanyenchants.Main;

public class MathUtils {

	public static float roundNearestPlace(float value, int place)
	{
		if(place > 0)
		{
			float newValue = value;
			int divisor = 10 ^ place;
			
			newValue = Math.round(newValue/divisor);
			newValue *= divisor;
			
			return newValue;
		}
		else if(place < 0)
		{
			float newValue = value;
			int multiplier = 10 ^ -place;
			
			newValue = Math.round(newValue * multiplier);
			newValue /= multiplier;
			
			return newValue;
		} else return Math.round(value);
	}
	
	public static double roundNearestPlace(double value, int place)
	{
		if(place > 0)
		{
			double newValue = value;
			int divisor = 10 ^ place;
			
			newValue = Math.round(newValue/divisor);
			newValue *= divisor;
			
			return newValue;
		}
		else if(place < 0)
		{
			double newValue = value;
			Main.LOGGER.info("value  " + newValue);
			int multiplier = 10 ^ -place - 1;
			
			newValue = Math.round(newValue * multiplier);
			newValue /= multiplier;
			
			Main.LOGGER.info("5 " + newValue);
			
			return newValue;
		} else return Math.round(value);
	}

}
