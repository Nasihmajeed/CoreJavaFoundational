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

		animal.add(new Elephant());
		animal.get(1).setName("Elephant");
		animal.get(1).setStrength(70);
		
		animal.add(new Fox());
		animal.get(2).setName("Fox");
		animal.get(2).setStrength(50);
		
		animal.add(new Lion());
		animal.get(3).setName("Lion");
		animal.get(3).setStrength(90);
        
        animal.add(new Panther());
		animal.get(4).setName("Panther");
		animal.get(4).setStrength(80);
        
		for(int i=0;i<animal.size();i++)
		{
			System.out.println(i+1+" "+animal.get(i).getName());
		}
	}

	public void setPage()
	{
		int i = 0,j;
		int z = 0;
		j = i+1;
		String y = null;
		int c = 0;
		do
		{
			for(i=0;i<animal.size();i++)
			{
				if(animal.get(i).getStrength() >= animal.get(j).getStrength())
				{
					z = animal.get(i).getStrength();
                    y = animal.get(i).getName();
                    System.out.println(z+" "+y);
				}				
		    }
		    System.out.println("\nWinner is: "+y);
		    System.out.println("\nPress 1 to Re-enter | press 0 to Continue: ");
		    c = scanner.nextInt();
	    }
	    while(c == 1); 
	}

}
