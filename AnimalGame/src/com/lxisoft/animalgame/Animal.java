package com.lxisoft.animalgame;


import com.lxisoft.animalgame.*;

public abstract class Animal
{
	int strength;
	String name;
	boolean isDead;
	Hunger hungerlevel;
	int luckFactor;
	int range,sight; 
	int[] newLocation=new int[2];


	public void printDetails()
	{
		System.out.print(name+" "+strength+ " range= "+ range+"  location: "+newLocation[0]+" "+newLocation[1]);
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