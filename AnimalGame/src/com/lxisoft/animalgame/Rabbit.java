package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Rabbit extends Animal implements Herbivorous
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
		System.out.println("Rabbit eat carrott");
	}
	
	public Animal escape(Animal animal)
    {
    	int luck;
    	luck=(int) (Math.random()*100);
    	if(luck>=50)
    	{
     		return this;    
  		}
  		else
  		{
  			return animal;
  		}
  	}
}