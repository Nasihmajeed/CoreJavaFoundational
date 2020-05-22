
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Bear extends Animal
{
	public Bear()
	{
		setName("Bear") ;
		setHealth(250) ;
		setEnergy(100) ;
		setStrength(200) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Omnivorus()) ;
		setIsAlive(true) ;
	}
}