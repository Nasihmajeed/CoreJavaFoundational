package com.lxisoft.Animals;
import com.lxisoft.Game.*;
public class Tiger extends Animal implements Carnivorus
{
	public void details()
	{
		System.out.println("Name-Tiger");
		this.eat();
	}
	public void eat()
	{
		System.out.println(" "+"Tiger and cheetah are carnivore and eats flesh.");
	}
}
