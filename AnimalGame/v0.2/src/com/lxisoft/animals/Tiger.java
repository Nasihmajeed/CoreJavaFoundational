
package com.lxisoft.animals ;    

import com.lxisoft.forest.Animal ; 
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;

public class Tiger extends Animal
{
	public Tiger()
	{
		setName("Tiger") ;
		setHealth(180) ;
		setEnergy(190) ;
		setStrength(250) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Carnivorus()) ;
		setIsAlive(true) ;
	}
}