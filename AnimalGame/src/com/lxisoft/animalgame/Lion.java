package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Lion extends Animal
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
}