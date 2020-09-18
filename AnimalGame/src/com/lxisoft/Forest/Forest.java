package com.lxisoft.Forest;
import java.util.ArrayList;
import java.util.Scanner;
public class Forest
{
	ArrayList<Animal> animal = new ArrayList<Animal>();
	Scanner scanner = new Scanner(System.in);

	public void printName()
	{
		System.out.println("\n WELCOME TO ANIMAL GAME");

	}

	public void setName()
	{
		System.out.println("\nAnimals");
		animal.add(new Deer());
		animal.get(0).setName("Deer");
		animal.get(0).setStrength(40);
		animal.add(new Deer());
		animal.get(1).setName("Deer1");
		animal.get(1).setStrength(40);
		animal.add(new Elephant());
		animal.get(2).setName("Elephant");
		animal.get(2).setStrength(70);
		animal.add(new Elephant());
		animal.get(3).setName("Elephant1");
		animal.get(3).setStrength(70);
		animal.add(new Fox());
		animal.get(4).setName("Fox");
		animal.get(4).setStrength(50);
		animal.add(new Fox());
		animal.get(5).setName("Fox1");
		animal.get(5).setStrength(50);
		animal.add(new Lion());
		animal.get(6).setName("Lion");
		animal.get(6).setStrength(90);
        animal.add(new Lion());
		animal.get(7).setName("Lion1");
		animal.get(7).setStrength(90);
        animal.add(new Panther());
		animal.get(8).setName("Panther");
		animal.get(8).setStrength(80);
        animal.add(new Panther());
		animal.get(9).setName("Panther1");
		animal.get(9).setStrength(80);

		for(int i=0;i<animal.size();i++)
		{
			System.out.println(i+1+" "+animal.get(i).getName());
		}
	}

	public void setPage()
	{
		int c = 0;
		do
		{
		System.out.println("\nSelect your first animal");
		int a = scanner.nextInt();
		System.out.println("Select your second animal");
		int b = scanner.nextInt();
		if(a <= animal.size() && b <= animal.size())
		{
			System.out.println("Strongest animal:");
			if(animal.get(a-1).getStrength() > animal.get(b-1).getStrength())
			{
				System.out.println(animal.get(a-1).getName());
			}
			else
			{
				System.out.println(animal.get(b-1).getName());
			}
		}

		else
		{
			System.out.println("Please select valid choice");
		}

		System.out.println("Press 1 to Re-enter | press 0 to Continue: ");
		c = scanner.nextInt();
	    }
	    while(c == 1); 
	}

}
