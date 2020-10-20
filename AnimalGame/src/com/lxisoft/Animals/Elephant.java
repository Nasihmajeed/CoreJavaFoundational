package com.lxisoft.Animals;
import com.lxisoft.Game.*;
public class Elephant extends Animal implements Herbivorus
{
	public void details()
	{
		System.out.println("Name-Elephant");
		this.eat();
	}
	public void eat()
	{
		System.out.println(" "+"Elephants are Herbivore and eats grass.");
		System.out.println("-------------------------------------");
	}
}
