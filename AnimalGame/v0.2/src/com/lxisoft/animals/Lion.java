
package com.lxisoft.animals ;    

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Lion extends Animal
{
	public Lion()
	{
		setName(getName() + "LION") ;
		setHealth(250) ;
	
		setStrength(250) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Carnivorus()) ;
		setIsAlive(true) ;
	}
}