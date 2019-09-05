package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Lion extends Animal
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