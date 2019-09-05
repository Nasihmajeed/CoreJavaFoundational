package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Deer extends Animal
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
  		System.out.println("Deer run fastly");
  	}

  	public void eat()
  	{
  		System.out.println("Deer eat leaves\n");
  	}
}