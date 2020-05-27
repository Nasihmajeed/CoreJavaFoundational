
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Bear extends Animal
{
	public Bear()
	{
		setName(getName() + "BEAR") ;
		setHealth(250) ;
		setStrength(200) ;
		setLuckFactor(GameHelper.generateRandomNumber(3)) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Omnivorus()) ;
		setIsAlive(true) ;
	}
}