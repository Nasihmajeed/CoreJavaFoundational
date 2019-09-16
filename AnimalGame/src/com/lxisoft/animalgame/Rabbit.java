package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivore;
public class Rabbit extends Animal implements Herbivore
{
	// public Animal fight(Animal animal)
	// {   
	// 	if(this.strength>animal.strength)
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
  		System.out.println("Rabbit run very slow");
  	}

  	public void eat()
  	{
  		System.out.println("Rabbit eat grass\n");
  	}
	
}