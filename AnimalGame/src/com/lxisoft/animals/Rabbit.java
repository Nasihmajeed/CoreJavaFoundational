package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivorus;
public class Rabbit extends Animal implements Herbivorus
{
	public int herbivorusStrength = 10;
	/*public int hStrength(int strength)
	{
		
		return herbivorusStrength;
	}*/
	int rabbitHungerLevel = 8;
	public String meet()
	{
		String behaviour = "Herbivorus";
		return behaviour;
	}
}