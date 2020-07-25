package com.LxiSoft.Forest;
import com.LxiSoft.Animal.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Forest
{
	ArrayList<Animal> animal=new ArrayList<Animal>();

	public void gameStart()
	{
		Scanner s=new Scanner(System.in);
		String y;
		System.out.println("\t \t_________________________________");
		System.out.println("\n\t \t-----------Animal Game-----------");
		System.out.println("\t \t_________________________________");
		System.out.println("\nPress y to start the game");
		y=s.nextLine();
		if(y.equals("y"))
		{
			System.out.println("\t --------------------------------------");
			System.out.println("\t\t \t ANIMAL GAME ");
			System.out.println("\t --------------------------------------");
			this.animalList();
			this.printRandom();
		}
		else
			{
				
				System.out.println(" You are exited. Thank You..!");}
	
	}

	public void animalList()
	{
		animal.add(new Tiger());
		animal.add(new Deer());
		animal.add(new Elephant());
		animal.add(new Bears());
		animal.add(new Lion());
		animal.get(0).setName("tiger");
		animal.get(1).setName("Deer");
		animal.get(2).setName("Elephant");
		animal.get(3).setName("Bear");
		animal.get(4).setName("Lion");

		System.out.println("\t Animals in the forest are ");
     	for (int i=0; i<animal.size(); i++)
     	{	
     		System.out.println("\n   "+(i+1)+"   "+animal.get(i).getName());
     	}
     
	}
	public void printRandom()
	{		Random random = new Random();

			System.out.println("\t \n Random Animals in the game  ");
			int r=random.nextInt(5);
	for (int i=r; i<animal.size(); i++)
     	{	
     		System.out.println( animal.get(i).getName());
     	}
	}
}
