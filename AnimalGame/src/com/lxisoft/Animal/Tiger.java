package com.lxisoft.Animal;
import com.lxisoft.Game.*;
public class Tiger extends Animal implements Carnivorus
{
	public void eat()
	{
		this.animalEnergy=this.animalEnergy+(int)(this.animalEnergy*.05);
	}
	public void kill()
	{
		
	}
	public void dead()
	{
		this.animalEnergy=0;
	}
	
}