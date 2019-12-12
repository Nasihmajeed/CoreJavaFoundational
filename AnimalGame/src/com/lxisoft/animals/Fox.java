package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Fox extends Animal implements Carnivorus
{
	boolean isTrue;
	public int strength()
	{
		int carnivorusStrength = 15;
		return 	carnivorusStrength;
	}
	
	int foxHungerLevel = 10;
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}