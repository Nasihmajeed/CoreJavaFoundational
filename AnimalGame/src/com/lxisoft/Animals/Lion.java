package com.lxisoft.Animals;
import com.lxisoft.Game.*;
import java.util.ArrayList;
import java.util.List;
public class Lion extends Animal implements Carnivorus
{
	public void details()
	{
		System.out.println("Name-Lion");
		this.eat();
	}
	public void eat()
	{
		System.out.println(" "+"Lions are carnivore and eats flesh.");
		System.out.println("---------------------------------------");
	}
}
