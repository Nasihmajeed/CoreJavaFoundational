package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivorus;
public class Deer extends Animal implements Herbivorus
{
	/*public boolean isAlive(boolean isTrue)
	{
		if(isTrue)
		{
			meet();
		}
		return isTrue;
	}*/
	public int hStrength()
	{
		int herbivorusStrength = 10;
		return herbivorusStrength;
	}
	int deerHungerLevel = 8;
	public String meet()
	{
		String behaviour = "Herbivorus";
		return behaviour;
	}
}