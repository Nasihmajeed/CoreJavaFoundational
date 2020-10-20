package com.lxisoft.Animals;
import com.lxisoft.Game.*;
public class Rabbit extends Animal implements Herbivorus,Weak
{
	public void details()
	{
		System.out.println("Name-Rabbit");
		this.eat();
	}
	public void eat()
	{
		System.out.println(" "+"Rabbit amd koala are Herbivore and eats grass.");
		System.out.println("--------------------------------------------------");
	}
}
