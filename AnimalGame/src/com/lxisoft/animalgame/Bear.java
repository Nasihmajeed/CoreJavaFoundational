package com.lxisoft.animalgame;
public class Bear extends Animal
{
	

	public void details()
	{
		animalName="bear";
		strength=3;
		System.out.println(" Animal--"+animalName);
		System.out.println(" strength--"+strength);
	}

	public void eat()
	{
		System.out.println("bear eat honey");
	}
	public void run()
	{
		System.out.println("bear runs slow");
	}
}
