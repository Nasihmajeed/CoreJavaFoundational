package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Forest;
public class Rabbit extends Animal
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
}