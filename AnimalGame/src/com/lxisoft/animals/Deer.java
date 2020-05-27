
package com.lxisoft.animals ;     

import com.lxisoft.forest.Animal ;
import com.lxisoft.behaviours.animalbehaviour.* ;
import com.lxisoft.behaviours.eatbehaviour.* ;
import com.lxisoft.game.GameHelper ;

public class Deer extends Animal
{
	public Deer()
	{
		setName(getName() + "DEER") ;
		setHealth(100) ;
		setLuckFactor(GameHelper.generateRandomNumber(9)) ;
		setStrength(80) ;
		setAnimalBehaviour(new PassivePrey()) ;
		setEatBehaviour(new Herbivorus()) ;
		setIsAlive(true) ;
	}
}