package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Bear extends Animal
{
	public Bear(String animalName,String aggressive,int strength)
	{
		this.animalName=animalName;
		this.aggressive=aggressive;
		this.strength=strength;
	}
	public void eat()
	{
		System.out.println("\n");
		System.out.println("bear eat honey");
	}
	public void run()
	{
		System.out.println("bear run slowly");
	}
}
