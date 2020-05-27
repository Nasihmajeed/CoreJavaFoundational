
package com.lxisoft.animals ;  

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Zebra extends Animal
{
	public Zebra()
	{
		setName(getName() + "ZEBRA") ;
		setHealth(150) ;
		setLuckFactor(GameHelper.generateRandomNumber(8)) ;
		setStrength(40) ;
		setAnimalBehaviour(new PassivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}