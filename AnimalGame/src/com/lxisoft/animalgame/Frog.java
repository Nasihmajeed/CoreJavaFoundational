package com.lxisoft.animalgame;
public class Frog extends Animal
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
		System.out.println("Frog eats");
	}
	public void run()
	{
		System.out.println("Frog runs");
	}
	
}