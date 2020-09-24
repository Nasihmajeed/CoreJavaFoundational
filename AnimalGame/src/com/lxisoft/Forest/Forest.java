package com.lxisoft.Forest;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Forest
{
	ArrayList<Animal> animal = new ArrayList<Animal>();
	Scanner scanner = new Scanner(System.in);
	Random r = new Random();
	int random1 = r.nextInt(5);
	int random2 = r.nextInt(5);

	public void printName()
	{
		
		System.out.println("\n WELCOME TO ANIMAL GAME");
		/*System.out.println("\n press 1 to Start GAME:");
		c = scanner.nextInt();
		if(c==1)
		{
			setPage();
		}
		else
		{
			System.out.println("Invalid choice");
		}*/
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
		int a=0,y=0,c;
		String z=null,b=null;
		System.out.println("\n press 1 to Start GAME:");
		c = scanner.nextInt();
		if(c==1)
		{	
        System.out.println("\nAnimal 1: "+animal.get(random1).getName()+" "+"Strength: "+animal.get(random1).getStrength());
        System.out.println("Animal 2: "+animal.get(random2).getName()+" "+"Strength: "+animal.get(random2).getStrength());
		if(animal.get(random1).getStrength() >= animal.get(random2).getStrength())
		{
			a = animal.get(random1).getStrength();
            b = animal.get(random1).getName();
            System.out.println("\nWinner:"+b);
	    }
	    else
	    {
		  	y = animal.get(random2).getStrength();
            z = animal.get(random2).getName();
            System.out.println("\nWinner:"+z);
	    }
	    System.out.println("\nGame Over");
        }
	    else
		{
			System.out.println("Invalid choice");
		}
		   
	}

}
