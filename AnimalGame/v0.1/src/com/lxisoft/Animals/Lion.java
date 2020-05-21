package com.lxisoft.Animals ;

import com.lxisoft.Game.Animal ;
import com.lxisoft.Interfaces.* ;

public class Lion extends Animal implements Predator
{
	public Lion()
	{
		setAnimalName("Lion") ;
		setAnimalStrength(200) ;
	}
}
