package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public abstract class Animal
{
	String name;
	int strength;
	boolean isDead;
	
	public abstract void eat();
	public abstract void run();
	public abstract void animalsRoam();

	public Animal fight(Animal enemy)
	{		
		
		System.out.println("Animal fight in the forest");
		return enemy;
	}

}

