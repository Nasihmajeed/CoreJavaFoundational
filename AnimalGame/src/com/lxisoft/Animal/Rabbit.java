package com.lxisoft.animal;
import com.lxisoft.game.*;
public class Rabbit extends Animal implements Herbivorus,WeakAnimal
{
	public void Beat()
	{
		
	}
	public void fight()
	{
		animalEnergy=animalEnergy-(int)(animalEnergy*.2);
	}
	
}