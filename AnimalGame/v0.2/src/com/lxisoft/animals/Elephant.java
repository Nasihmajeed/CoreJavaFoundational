
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Elephant extends Animal
{
	public Elephant()
	{
		setName("Elephant") ;
		setHealth(500) ;
		setEnergy(200) ;
		setStrength(450) ;
		setAnimalBehaviour(new AggressivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}