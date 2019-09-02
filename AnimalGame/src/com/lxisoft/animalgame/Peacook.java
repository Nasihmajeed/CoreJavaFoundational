package com.lxisoft.animalgame;
public class Peacook extends Animal
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
		System.out.println("Peacook eats");
	}
	public void run()
	{
		System.out.println("Peacook runs");
	}
	public void fight (Animal name)
	{
	}

}