package com.lxisoft.animalgame;
public abstract class Animal
{
	public String animalName;
	public int strength;
	public boolean isDead=false;
	public abstract void run();
	public abstract void eat();

	public Animal fight(Animal animals)
	{
		System.out.println("\n fight details");
		return animals;
	}

}