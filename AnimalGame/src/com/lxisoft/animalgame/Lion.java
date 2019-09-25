package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Lion extends Animal implements Carnivorous
{
	public Animal fight(Animal animal)
	{
		if(this.strength>animal.strength)
		{
			return this;
		}
		else
		{
			return animal;
		}
	
	}
	public void roam()
	{
		System.out.println("Lions roam for prey");
	}
	
}
