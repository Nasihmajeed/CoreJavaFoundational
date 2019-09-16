package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Tiger extends Animal implements Carnivores
{
	public void run()
	{
		System.out.println("\n tiger run fastly");
	}
	public void eat()
	{
		System.out.println("\n tiger eat meat");
	}
	public Animal fight(Animal animals)
	{
		if(this.strength>animals.strength)
		{
			return this;
		}
		else
		{
			return animals;
		}
	}
}