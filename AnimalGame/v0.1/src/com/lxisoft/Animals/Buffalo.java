package com.lxisoft.Animals ;

import com.lxisoft.Game.Animal ;
import com.lxisoft.Interfaces.* ;

public class Buffalo extends Animal implements Prey
{
	public Buffalo()
	{
		setAnimalName("Buffalo") ;
		setAnimalStrength(140) ;
	}
}
