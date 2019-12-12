package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Lion extends Animal implements Carnivorus
{
	public int cStrength()
	{
		int carnivorusStrength = 50;
		return 	carnivorusStrength;
	}
	int lionHungerLevel = 25;
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}