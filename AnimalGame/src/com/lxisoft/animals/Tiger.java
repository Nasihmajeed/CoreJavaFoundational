
package com.lxisoft.animals ;    

import com.lxisoft.forest.Animal ; 
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Tiger extends Animal
{
	public Tiger()
	{
		setName(getName() + "TIGER") ;
		setHealth(180) ;
		setLuckFactor(GameHelper.generateRandomNumber(5)) ;
		setStrength(250) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Carnivorus()) ;
		setIsAlive(true) ;
	}
}