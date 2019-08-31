package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Tiger extends Animal
{
	public Tiger(String animalName,String aggressive,int strength)
	{
		this.animalName=animalName;
		this.aggressive=aggressive;
		this.strength=strength;
	}
	public void eat()
	{
		System.out.println("\n");
		System.out.println("tiger eat rabbit");
	}
	public void run()
	{
		System.out.println("tiger run fastly");
	}
}