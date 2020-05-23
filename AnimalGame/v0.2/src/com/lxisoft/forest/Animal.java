
package com.lxisoft.forest ;

import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;
import com.lxisoft.ui_elements.* ;

public abstract class Animal
{

	private String name=GameHelper.getRandomAnimalName() ;
	private int health,strength,energy=100 ;  
	private AnimalBehaviour animalBehaviour ;
	private EatBehaviour eatBehaviour ;
	private boolean isAlive ;

	public String getName()
	{
		return name ;
	}
	public void setName(String n)
	{
		name = n ;
	}

	public int getHealth()
	{
		return health ;
	}
	public void setHealth(int h)
	{
		if(h<=0)
		{
			h = 0 ;
			setIsAlive(false) ;
		}		

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
		else if(e<0)
		{
			e = 0 ;
		}

		energy = e ;
	}

	public int getStrength()
	{
		return strength ;
	}
	public void setStrength(int s)
	{
		if(s<=0)
		{
			s = 0 ;
		}

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
		return eatBehaviour ;
	}
	public void setEatBehaviour(EatBehaviour eb)
	{
		eatBehaviour = eb ;
	}

	public boolean getIsAlive()
	{
		return isAlive ;
	}
	public void setIsAlive(boolean isAl)
	{
		isAlive = isAl ;
	}

	public void fightAnimal(Animal opponent)
	{
		DisplayElements.displayFightMessage(this,opponent) ;

			animalBehaviour.fight(this,opponent) ;
			if(energy<30)
			{
			System.out.print("\n\t\t\t THE ANIMALS ARE EXHAUSTED. THEY BACK OFF FROM THE FIGHT.") ;
			return ;
			}		
	}
}