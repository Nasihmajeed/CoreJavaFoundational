package com.lxisoft.Animals;
import com.lxisoft.Game.*;
public class Bear extends Animal implements Carnivorus
{
	public void details()
	{
		System.out.println("Name-Bear");
		this.eat();
	}
	public void eat()
	{
		System.out.println(" "+"Bear is carnivore and eats flesh.");
		System.out.println("-------------------------------------");
	}
}
