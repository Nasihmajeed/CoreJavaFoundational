package com.lxisoft.animalgame;
public class Rabbit extends Animal implements Herbivores
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
	

}