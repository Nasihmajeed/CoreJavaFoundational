package com.lxisoft.animals;
import  com.lxisoft.jungle.*;
import java.util.*;

public class Deer  extends Animal implements Herbivores 
{
	int energyLevel=5;
	int stamina=6;
		int distance=3;
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