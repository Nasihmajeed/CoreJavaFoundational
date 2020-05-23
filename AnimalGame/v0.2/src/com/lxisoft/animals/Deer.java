
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Deer extends Animal
{
	public Deer()
	{
		setName(getName() + "DEER") ;
		setHealth(100) ;
		
		setStrength(80) ;
		setAnimalBehaviour(new PassivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}