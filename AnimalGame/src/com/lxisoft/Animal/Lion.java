package com.lxisoft.Animal;
import com.lxisoft.Game.*;
public class Lion extends Animal implements Carnivorus
{
	public void eat(int energy)
	{
		this.animalEnergy=this.animalEnergy+(int)(energy*.15);
		if(this.animalEnergy>100)
			animalEnergy=100;
		System.out.println(this.getAnimalName()+"'s Energy raised to " + animalEnergy);
	}
	public void kill()
	{
		
	}

	public void fight()
	{
		animalEnergy=animalEnergy-(int)(animalEnergy*.2);
	}
}