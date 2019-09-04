package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Forest;
public class Bear extends Animal
{
	public Animal fight(Animal animals)
	{
		
		if(this.strength>animals.strength)
		{
			this.strength=(this.strength-1);
			animals.strength=(animals.strength-2);
			return this;
		}
		else
		{
			animals.strength=(animals.strength)-1;
			this.strength=(this.strength-2);
			return animals;
		}
	}

}
