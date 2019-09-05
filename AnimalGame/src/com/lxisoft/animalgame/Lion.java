package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Forest;
public class Lion extends Animal
{	
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