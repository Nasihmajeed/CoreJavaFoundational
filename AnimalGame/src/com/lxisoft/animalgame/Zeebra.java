package com.lxisoft.animalgame;
public class Zeebra extends Animal
{
	
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
		System.out.println("Zeebra eats");
	}
	public void run()
	{
		System.out.println("Zeebra runs");
	}
	public void fight (Animal name)
	{
	}

}