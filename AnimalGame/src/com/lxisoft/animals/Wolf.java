
package com.lxisoft.animals ;   

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Wolf extends Animal 
{
	public Wolf()
	{
		setName(getName() + "WOLF") ;
		setHealth(110) ;
		setLuckFactor(GameHelper.generateRandomNumber(6)) ;
		setStrength(120) ;
		setAnimalBehaviour(new PassivePredator()) ;
		setEatBehaviour(new Carnivorus()) ;
		setIsAlive(true) ;
	}
}