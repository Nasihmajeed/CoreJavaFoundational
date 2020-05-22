
package com.lxisoft.animals ;    

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Lion extends Animal
{
	public Lion()
	{
		setName("Lion") ;
		setHealth(250) ;
		setEnergy(150) ;
		setStrength(250) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Carnivorus()) ;
		setIsAlive(true) ;
	}
}