package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Lion extends Animal
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
		System.out.println("Lion eat meat");
	}
	public void run()
	{
		System.out.println("Lion run fastly");
	}
}