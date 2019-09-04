package com.lxisoft.animalgame;
public class Cheetah extends Animal
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
		System.out.println("Cheetah eats");
	}
	public void run()
	{
		System.out.println("Cheetah runs");
	}


}