package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Forest;
public class Tiger extends Animal
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