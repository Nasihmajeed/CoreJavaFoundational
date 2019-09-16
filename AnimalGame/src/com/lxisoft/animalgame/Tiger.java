package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivore;
public class Tiger extends Animal implements Carnivore
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
  		System.out.println("Tiger run very fast");
  	}

    public void eat()
  	{
  		System.out.println("Tiger eat meat\n");
  	}
}