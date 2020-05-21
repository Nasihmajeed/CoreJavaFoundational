package com.lxisoft.Animals ;

import com.lxisoft.Game.Animal ;
import com.lxisoft.Interfaces.* ;

public class Tiger extends Animal implements Predator
{
	public Tiger()
	{
		setAnimalName("Tiger") ;
		setAnimalStrength(180) ;
	}
}
