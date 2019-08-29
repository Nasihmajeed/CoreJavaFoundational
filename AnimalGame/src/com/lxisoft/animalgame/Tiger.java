package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Tiger extends Animal
{
	public void animalDetails()
	{
		animalName="sambu tiger";
		aggressive="highest";
		System.out.println("animal: "+animalName);
		System.out.println("aggressive: "+aggressive);
	}
	public void eat()
	{
		System.out.println("tiger eat rabbit");
	}
	public void run()
	{
		System.out.println("tiger run fastly");
	}
}