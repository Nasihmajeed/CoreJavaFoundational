
package com.lxisoft.animals ;  

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Zebra extends Animal
{
	public Zebra()
	{
		setName("Zebra") ;
		setHealth(150) ;
		setEnergy(100) ;
		setStrength(40) ;
		setAnimalBehaviour(new PassivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}