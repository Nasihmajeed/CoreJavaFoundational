package com.lxisoft.Animal;
import com.lxisoft.Game.*;
public class Tiger extends Animal implements Carnivorus
{
	public void eat(int energy)
	{
		this.animalEnergy=this.animalEnergy+(int)(energy*.15);
		if(this.animalEnergy>100)
			animalEnergy=100;
		else if(this.animalEnergy<0)
			animalEnergy=0;


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