package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Lion extends Animal implements Carnivorus
{
	public int carnivorusStrength = 50;
	/*public int cStrength(int strength)
	{
		
		return 	carnivorusStrength;
	}*/
	int lionHungerLevel = 25;
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}