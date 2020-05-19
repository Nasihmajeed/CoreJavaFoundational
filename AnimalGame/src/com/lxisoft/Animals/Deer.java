package com.lxisoft.Animals ;

import com.lxisoft.Game.Animal ;
import com.lxisoft.Interfaces.* ;

public class Deer extends Animal implements Prey
{
	public Deer()
	{
		setAnimalName("Deer") ;
		setAnimalStrength(100) ;
	}
}