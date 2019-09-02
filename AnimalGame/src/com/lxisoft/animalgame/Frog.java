package com.lxisoft.animalgame;
public class Frog extends Animal
{
	int strength;
	String name;
	public void printDetails()
	{
		System.out.println(name+" "+strength);
	}
	public void printName()
	{
		System.out.println(name);
	}

	public void eat()
	{
		System.out.println("Frog eats");
	}
	public void run()
	{
		System.out.println("Frog runs");
	}
	public void fight (Animal name)
	{
	}
}