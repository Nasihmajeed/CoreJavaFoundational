package com.lxisoft.Forest;
import java.util.ArrayList;
import java.util.Scanner;
public class Forest
{
	ArrayList<Animal> animal = new ArrayList<Animal>();

	public void printName()
	{
		System.out.println("\n WELCOME TO ANIMAL GAME");

	}

	public void setName()
	{
		System.out.println("\nAnimals");
		animal.add(new Animal());
		animal.get(0).setName("Deer");
		animal.add(new Animal());
		animal.get(1).setName("Elephant");
		animal.add(new Animal());
		animal.get(2).setName("Fox");
		animal.add(new Animal());
		animal.get(3).setName("Lion");
		animal.add(new Animal());
		animal.get(4).setName("Panther");
		animal.add(new Animal());
		animal.get(5).setName("Deer1");
		animal.add(new Animal());
		animal.get(6).setName("Elephant1");
        animal.add(new Animal());
		animal.get(7).setName("Fox1");
        animal.add(new Animal());
		animal.get(8).setName("Lion1");
        animal.add(new Animal());
		animal.get(9).setName("Panther1");

		for(int i=0;i<animal.size();i++)
		{
			System.out.println(i+1+" "+animal.get(i).getName());
		}
	}
}
