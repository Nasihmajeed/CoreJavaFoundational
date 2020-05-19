package com.lxisoft.Animals ;

import com.lxisoft.Game.Animal ;
import com.lxisoft.Interfaces.* ;

public class Rabbit extends Animal implements Prey
{
	public Rabbit()
	{
		setAnimalName("Rabbit") ;
		setAnimalStrength(40) ;
	}
}
