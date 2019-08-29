package com.lxisoft.animalgame;

public class Lion extends Animal
{
	

	public void details()
	{
		animalName="lion";
		strength=4;
		System.out.println(" Animal--"+animalName);
		System.out.println(" strength--"+strength);
	}

	public void eat()
	{
		System.out.println("bear eat flesh");
	}
	public void run()
	{
		System.out.println("bear runs fast");
	}
}