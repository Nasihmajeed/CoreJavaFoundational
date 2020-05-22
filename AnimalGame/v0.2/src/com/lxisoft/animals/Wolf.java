
package com.lxisoft.animals ;   

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Wolf extends Animal 
{
	public Wolf()
	{
		setName("Wolf") ;
		setHealth(110) ;
		setEnergy(200) ;
		setStrength(120) ;
		setAnimalBehaviour(new PassivePredator()) ;
		setEatBehaviour(new Carnivorus()) ;
		setIsAlive(true) ;
	}
}