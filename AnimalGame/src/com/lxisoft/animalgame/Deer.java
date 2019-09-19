package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Deer extends Animal implements Herbivorous
{
	public Animal fight(Animal animal)
	{
		if(this.strength>animal.strength)
		{
			return this;
		}
		else
		{
			return animal;
		}
	
	}
	public void eat()
	{
		System.out.println("Deer eat grass");
	}
	public Animal escape(Animal animal)
    {
    	if(animal.strength>=2)
    	{
     		return animal;    
  		}
  		else
  		{
  			return this;
  		}
	}
	
}
