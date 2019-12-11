package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivorus;
public class Rabbit extends Animal implements Herbivorus
{
	int rabbitStrength = 5,rabbitHungerLevel = 8;
	public String meet()
	{
		String behaviour = "Herbivorus";
		return behaviour;
	}
}