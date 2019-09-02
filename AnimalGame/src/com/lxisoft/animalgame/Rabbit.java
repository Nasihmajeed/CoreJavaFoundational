package com.lxisoft.animalgame;
public class Rabbit extends Animal
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
		System.out.println("rabit eats");
	}
	public void run()
	{
		System.out.println("rabbit runs");
	}

	public void fight (Animal name)
	{
	}

}