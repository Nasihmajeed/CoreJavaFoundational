
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Bear extends Animal
{
	public Bear()
	{
		setName(getName() + "BEAR") ;
		setHealth(250) ;
		setStrength(200) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Omnivorus()) ;
		setIsAlive(true) ;
	}
}