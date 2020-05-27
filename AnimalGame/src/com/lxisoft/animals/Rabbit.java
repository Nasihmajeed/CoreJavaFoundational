
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Rabbit extends Animal
{
	public Rabbit()
	{
		setName(getName() + "RABBIT") ;
		setHealth(30) ;
		setLuckFactor(GameHelper.generateRandomNumber(10)) ;
		setStrength(15) ;
		setAnimalBehaviour(new PassivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}