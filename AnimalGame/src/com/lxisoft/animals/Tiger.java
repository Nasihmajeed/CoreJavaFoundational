package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Tiger extends Animal implements Carnivorus
{
	public int carnivorusStrength = 40;

	int tigerHungerLevel = 20;
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}