package com.lxisoft.animalgame;


import com.lxisoft.animalgame.Tiger;

public abstract class Animal
{
	int strength;
	String name;
	boolean isDead;
	int locationX,locationY;
	int range,sight; 
	int[] newLocation;


	public void printDetails()
	{
		System.out.print(name+" "+strength+ " range= "+ range+" default location: "+locationX+" "+locationY);
	}
	public void printName()
	{
		System.out.println(name);
	}

	


	public void eat()
	{
		System.out.println("animal eat");

	}
	public void run()
	{
		System.out.println("animal runs");
	}
	
} 