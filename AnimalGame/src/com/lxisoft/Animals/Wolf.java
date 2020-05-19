package com.lxisoft.Animals ;

import com.lxisoft.Game.Animal ;
import com.lxisoft.Interfaces.* ;

public class Wolf extends Animal implements Predator
{
	public Wolf()
	{
		setAnimalName("Wolf") ;
		setAnimalStrength(150) ;
	}
}
