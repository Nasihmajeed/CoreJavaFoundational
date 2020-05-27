
package com.lxisoft.forest ;

import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.* ;
import com.lxisoft.ui_elements.* ;

public abstract class Animal
{

	private String name=GameHelper.getRandomAnimalName() ;
	private int health,strength,energy=100,luckFactor ;  
	private AnimalBehaviour animalBehaviour ;
	private EatBehaviour eatBehaviour ;
	private boolean isAlive ;
	public Location animalLocation = new Location() ;

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

	public int getLuckFactor()
	{
		return luckFactor ;
	}
	public void setLuckFactor(int lF)
	{
		luckFactor = lF ;
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

	public void setLocation(int r,int c)
	{
		animalLocation.setLocationRow(r) ;
		animalLocation.setLocationColoumn(c) ;
	}

	public void fightAnimal(Animal opponent)
	{
		
			if(energy<30)
			{
				GameHelper.reduceAnimalEnergy(opponent,15) ;
				GameHelper.reduceAnimalEnergy(this,20) ;
				System.out.print("\n\n\t\t*** " + name + " IS EXHAUSTED. IT BACKS OFF FROM THE FIGHT. ***") ;
				return ;
			}	
			if(opponent.getLuckFactor()>5 && GameHelper.giveLuck())
			{
				GameHelper.reduceAnimalEnergy(opponent,15) ;
				GameHelper.reduceAnimalEnergy(this,5) ;
				System.out.print("\n\t\t*** " + opponent.getName() + " WAS VERY LUCKY. IT CUNNINGLY ESCAPES FROM THE FIGHT. ***") ;
				return ;
			}

			DisplayElements.displayFightMessage(this,opponent) ;
			animalBehaviour.fight(this,opponent) ;
				
	}
}