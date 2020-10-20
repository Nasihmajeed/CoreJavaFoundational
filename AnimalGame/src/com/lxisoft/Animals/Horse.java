package com.lxisoft.Animals;
import com.lxisoft.Game.*;
public class Horse extends Animal implements Herbivorus
{
	public void details()
	{
	System.out.println("Name-Horse");
	}
		public void eat()
		{
		System.out.println(" "+"It is Herbivore and eats grass.");
		}
}
