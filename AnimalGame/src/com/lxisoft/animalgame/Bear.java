package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Bear extends Animal
{
	public void animalDetails()
	{
		animalName="ballu bear";
		aggressive="high";
		System.out.println("animal: "+animalName);
		System.out.println("aggressive: "+aggressive);
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
