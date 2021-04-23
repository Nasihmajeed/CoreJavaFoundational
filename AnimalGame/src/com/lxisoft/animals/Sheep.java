package com.lxisoft.animals;
import  com.lxisoft.jungle.*;
import java.util.*;
public class Sheep extends Animal implements Herbivores  
{
int energyLevel=3;
	int stamina=6;
	int distance=5;
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