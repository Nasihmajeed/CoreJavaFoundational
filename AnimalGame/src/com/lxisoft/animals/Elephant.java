
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Elephant extends Animal
{
	public Elephant()
	{
		setName(getName() + "ELEPHANT") ;
		setHealth(350) ;
		setLuckFactor(GameHelper.generateRandomNumber(5)) ;
		setStrength(320) ;
		setAnimalBehaviour(new AggressivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}