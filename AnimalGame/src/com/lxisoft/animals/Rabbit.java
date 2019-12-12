package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivorus;
public class Rabbit extends Animal implements Herbivorus
{
	boolean isTrue;
	public int strength()
	{
		int herbivorusStrength = 5;
		return herbivorusStrength;
	}
	int rabbitHungerLevel = 8;
	public String meet()
	{
		String behaviour = "Herbivorus";
		return behaviour;
	}
}