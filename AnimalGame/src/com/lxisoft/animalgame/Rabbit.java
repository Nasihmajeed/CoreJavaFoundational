package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Rabbit extends Animal
{
	public Rabbit(String animalName,String aggressive,int strength)
	{
		this.animalName=animalName;
		this.aggressive=aggressive;
		this.strength=strength;
	}
	public void eat()
	{
		System.out.println("\n");
		System.out.println("rabbit eat carrot");
	}
	public void run()
	{
		System.out.println("rabbit run slowly");
	}
}