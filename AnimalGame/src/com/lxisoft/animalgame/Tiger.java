package com.lxisoft.animalgame;
public class Tiger extends Animal
{
	

	public void details()
	{
		animalName="tiger";
		strength=5;
		System.out.println(" Animal--"+animalName);
		System.out.println(" strength--"+strength);
	}

	public void eat()
	{
		System.out.println("bear eat flesh");
	}
	public void run()
	{
		System.out.println("bear runs very fast");
	}
}