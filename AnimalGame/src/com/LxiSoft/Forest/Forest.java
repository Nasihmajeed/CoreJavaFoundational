package com.LxiSoft.Forest;
import com.LxiSoft.Animal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Forest
{
	ArrayList<Animal> animal=new ArrayList<Animal>();

	public void gameStart()
	{
		Scanner s=new Scanner(System.in);
		String y;
		System.out.println("\t \t_________________________________");
		System.out.println("\t \t___________Animal Game___________");
		System.out.println("\t \t_________________________________");
		System.out.println("\nPress Y to start the game");
		y=s.nextLine();
		if(y.equals("y"))
		{
			System.out.println("\t\t ANIMAL GAME ");
			System.out.println("\t --------------------------------------");
			this.animalList();
			
		}
		else
			{
				
				System.out.println(" You are exited. Thank You..!");}
	
	}

	public void animalList()
	{
		animal.add(new Tiger());
		animal.add(new Deer());
		animal.get(0).setName("tiger");
		animal.get(1).setName("Deer");
		System.out.println(animal);
	}
	public void selectAnimals()
	{
		
	}
}