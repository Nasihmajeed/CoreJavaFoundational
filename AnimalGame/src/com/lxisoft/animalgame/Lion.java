package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivore;
public class Lion extends Animal implements Carnivore
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
  		System.out.println("Lion run fast");
  	}

  	public void eat()
  	{
  		System.out.println("Lion eat meat\n");
  	}

    
}