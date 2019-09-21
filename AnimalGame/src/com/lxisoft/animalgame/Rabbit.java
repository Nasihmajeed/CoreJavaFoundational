package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
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
    	if(x>=4)
   		{
     	return this; 
     	}   
  		else
  		{
  			return animal;
  		}
	}

    public void graze()
    {

    }
}