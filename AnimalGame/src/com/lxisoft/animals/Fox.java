package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Fox extends Animal implements Carnivorus
{
	int foxStrength = 15,foxHungerLevel = 10;
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}