package com.lxisoft.animalgame;
public class Deer extends Hanimal
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
		System.out.println("Deer eats");
	}
	public void run()
	{
		System.out.println("Deer runs");
	}

}