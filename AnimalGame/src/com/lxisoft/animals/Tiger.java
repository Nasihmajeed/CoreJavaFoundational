package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Tiger extends Animal implements Carnivorus
{
	public int cStrength()
	{
		int carnivorusStrength = 40;
		return 	carnivorusStrength;
	}
	int tigerHungerLevel = 20;
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}