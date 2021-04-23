package com.lxisoft.jungle;
import java.util.*;
public class Animal
{
	
	
	int energyLevel=3;
		int distance=20;
		int luckFactor;
		 Random rand = new Random();
	
		public	int getEnergyLevel()
			{
	
	
				return energyLevel;
			}
	
	public int getDistance()
		{
			
			return distance;
			
		}
		
		public int getLuckFactor()
		{
			luckFactor = rand.nextInt(2);
			return luckFactor;
		}
}