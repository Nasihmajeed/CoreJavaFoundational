package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Animal
{
	String name;
	int strength;
	
	public void eat()
	{
		System.out.println("animals eats grass and flesh");
	}
	public void run()
	{
		System.out.println("animals runs in the wild ");
	}

	public void animalsRoam()
	{
		System.out.println(" Animal roams in jungle");
		System.out.println("Animal has strength");
	}

	public Animal fight(Animal a)
	{		
		
		System.out.println("Animal fight in the forest");
		return a;
	}

}

