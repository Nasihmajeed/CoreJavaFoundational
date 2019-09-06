package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Forest;
public class Lion extends Animal
{	
	public void run()
	{
		System.out.println("\n lion run fast");
	}
	public void eat()
	{
		System.out.println("\n lion eat flush");
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