package com.lxisoft.animalgame;
public class Deer extends Animal
{
	int strength;
	String name;
	public void printDetails()
	{
		name="deer";
		strength=50;
		System.out.println(name+strength);
	}
	public void printName()
	{
		System.out.println(name);
	}

	public void eat()
	{
		System.out.println("Deer eats");
	}
	public void run()
	{
		System.out.println("Deer runs");
	}
	public void fight (Animal name)
	{
}
}