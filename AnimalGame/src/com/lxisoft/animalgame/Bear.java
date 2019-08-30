package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Bear extends Animal
{
	public void fight()
	{
		System.out.println("\n");
		System.out.println("animal: "+animalName);
		System.out.println("aggressive: "+aggressive);
		System.out.println("power: "+strength);
	}
	public void eat()
	{
		System.out.println("bear eat honey");
	}
	public void run()
	{
		System.out.println("bear run slowly");
	}
}
