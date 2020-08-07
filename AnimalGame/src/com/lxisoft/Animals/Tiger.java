package com.lxisoft.AnimalGame;
public class Tiger extends Animal implements Carnivorous
{
	public void eat(int energy)
	{
		this.animalEnergy=this.animalEnergy+(int)(energy*.15);
		if(this.animalEnergy>100)
			animalEnergy=100;
		else if(this.animalEnergy<0)
			animalEnergy=0;

	}


	public void kill()
	{
		
	}

	public void fight()
	
	{
	
	}
}