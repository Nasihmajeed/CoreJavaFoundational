
package com.lxisoft.forest ;

import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

abstract class Animal
{

	private String name ;
	private int health,energy,strength ;
	private AnimalBehaviour animalBehaviour ;
	private EatBehaviour eatBehaviour ;

	public String getName()
	{
		return name ;
	}
	public setName(String n)
	{
		name = n ;
	}

	public int getHealth()
	{
		return health ;
	}
	public void setHealth(int h)
	{
		health = h ;
	}

	public int getEnergy()
	{
		return energy ;
	}
	public void setEnergy(int e)
	{

		if(e>100)
			{
				e = 100 ;
			}

		energy = e ;
	}

	public int getStrength()
	{
		return strength ;
	}
	public void setStrength(int s)
	{
		strength = s ;
	}

	public AnimalBehaviour getAnimalBehaviour()
	{
		return animalBehaviour ;
	}
	public void setAnimalBehaviour(AnimalBehaviour ab)
	{
		animalBehaviour = ab ;
	}

	public EatBehaviour getEatBehaviour()
	{
		return animalBehaviour ;
	}
	public void setEatBehaviour(EatBehaviour eb)
	{
		eatBehaviour = eb ;
	}
}