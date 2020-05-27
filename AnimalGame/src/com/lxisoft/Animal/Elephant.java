package com.lxisoft.animal;
import com.lxisoft.game.*;
public class Elephant extends Animal implements Herbivorus,StrongAnimal
{
	public void Beat()
	{
		
	}
	public void fight()
	{
		animalEnergy=animalEnergy-(int)(animalEnergy*.2);
	}
	
}