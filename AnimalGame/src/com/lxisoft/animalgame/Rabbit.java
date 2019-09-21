package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Rabbit extends Animal implements Herbivores
{
	public void run()
	{
		System.out.println("\n rabbit run slowly");
	}
	public void eat()
	{
		System.out.println("\n rabbit eat carrot");
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
	public Animal escape(Animal animal)
	{
		if(this.luck>animal.luck)
		{
			return this;
		}
		else
		{
			return animal;
		}
	}
}