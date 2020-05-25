
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Elephant extends Animal
{
	public Elephant()
	{
		setName(getName() + "ELEPHANT") ;
		setHealth(400) ;
		
		setStrength(350) ;
		setAnimalBehaviour(new AggressivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}