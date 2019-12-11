package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Tiger extends Animal implements Carnivorus
{
	int tigerStrength = 40,tigerHungerLevel = 20;
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}