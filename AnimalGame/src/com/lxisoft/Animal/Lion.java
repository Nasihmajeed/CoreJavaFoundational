package com.lxisoft.Animal;
import com.lxisoft.Game.*;
public class Lion extends Animal implements Carnivorus,LionRoam,StrongAnimal
{
	public void eat(int energy)
	{
		this.animalEnergy=this.animalEnergy+(int)(energy*0.15);
		if(this.animalEnergy>100)
			animalEnergy=100;
		else if(this.animalEnergy<0)
			animalEnergy=0;

		
		System.out.print(this.getAnimalName()+"'s Energy raised to " + animalEnergy);
	}
	public void kill()
	{
		
	}

	public void fight()
	{
		animalEnergy=animalEnergy-(int)(animalEnergy*.2);
	}
}