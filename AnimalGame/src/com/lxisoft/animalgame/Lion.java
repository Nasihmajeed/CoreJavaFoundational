package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Lion extends Animal
{	
	public void animalDetails()
	{
		animalName="mad lion";
		aggressive="very high";
		System.out.println("animal: "+animalName);
		System.out.println("aggressive: "+aggressive);
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