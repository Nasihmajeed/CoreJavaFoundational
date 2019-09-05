package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Rabbit extends Animal
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

	public void run()
  	{
  		System.out.println("Rabbit run very slow");
  	}

  	public void eat()
  	{
  		System.out.println("Rabbit eat grass\n");
  	}
	
}