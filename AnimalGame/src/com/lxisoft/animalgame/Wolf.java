package com.lxisoft.animalgame;
public class Wolf extends Canimal
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
		System.out.println("Wolf eats");
	}
	public void run()
	{
		System.out.println("Wolf  runs");
	}
	

}