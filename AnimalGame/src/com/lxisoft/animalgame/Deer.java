package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivore;
public class Deer extends Animal implements Herbivore
{	
	// public Animal fight(Animal animal)
	// {
 //  		if(this.strength>animal.strength)
	// 	{
	// 		return this;					
	// 	}
	// 	else
 //    	{  
 //    		return animal;
 //    	}
	// }

	public void run()
  	{
  		System.out.println("Deer run fastly");
  	}

  	public void eat()
  	{
  		System.out.println("Deer eat leaves\n");
  	}
}