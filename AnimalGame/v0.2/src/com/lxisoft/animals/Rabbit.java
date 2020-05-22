
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Rabbit extends Animal
{
	public Rabbit()
	{
		setName("Rabbit") ;
		setHealth(30) ;
		setEnergy(120) ;
		setStrength(15) ;
		setAnimalBehaviour(new PassivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}