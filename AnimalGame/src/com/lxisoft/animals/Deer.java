package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivorus;
public class Deer extends Animal implements Herbivorus
{
	int deerStrength = 10,deerHungerLevel = 8;
	public String meet()
	{
		String behaviour = "Herbivorus";
		return behaviour;
	}
}