package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivore;
public class Rabbit extends Animal implements Herbivore
{
	public void run()
  	{
  		System.out.println("Rabbit run very slow");
  	}

  	public void eat()
  	{
  		System.out.println("Rabbit eat grass\n");
  	}


	public Animal escape(Animal animal)
    {
    	int x=(int)(Math.random()*10);
    	if(animal.strength>=4)
    	{
     		return animal;    
  		}
  		else
  		{
  			return this;
  		}
	}

}