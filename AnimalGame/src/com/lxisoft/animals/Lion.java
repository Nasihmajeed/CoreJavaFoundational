
package com.lxisoft.animals ;    

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Lion extends Animal
{
	public Lion()
	{
		setName(getName() + "LION") ;
		setHealth(250) ;
		setLuckFactor(GameHelper.generateRandomNumber(5)) ;
		setStrength(250) ;
		setAnimalBehaviour(new AggressivePredator()) ;
		setEatBehaviour(new Carnivorus()) ;
		setIsAlive(true) ;
	}
}