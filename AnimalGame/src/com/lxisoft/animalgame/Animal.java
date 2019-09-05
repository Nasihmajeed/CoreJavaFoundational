package com.lxisoft.animalgame;

import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Rabbit;
public class Animal
{
	int strength;
	public String name;
	boolean isDead;
	public Animal fight(Animal animal)
	{
		Animal win;
		System.out.println(this.name +" fight with " +animal.name);
		if(this.strength>animal.strength)
		{
			win=this;
			animal.isDead=true;
			System.out.println(this.name + "  wins " + animal.name +"  died  \n");
		}
		else
		{
			win=animal;
			this.isDead=true;
			System.out.println(animal.name + "  wins " + this.name + "  died \n");
		}
		return win;

	}
	public void display()
	{
			
	}
	
		

}