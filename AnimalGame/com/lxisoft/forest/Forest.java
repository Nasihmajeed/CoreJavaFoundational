package com.lxisoft.forest;
import com.lxisoft.game.*;
import java.io.*;
import com.lxisoft.forest.*;
import java.util.ArrayList;
import java.util.*;
public class Forest
{
	private String forestName = "Gir Forest";
	 
	static Scanner sc = new Scanner(System.in);
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	Game game;
	public void setForestName(String forestName)
	{
		this.forestName = forestName;
	}
	public String getforestName()
	{
		return forestName;
	}
	public void createForest()
	{
		game  =  new Game();
		System.out.println("***** WELCOME TO " + getforestName().toUpperCase()+" *****");
		System.out.println("-----------------------------------------");	
		createAnimal();
		startGame();
	}
	public void  startGame() 	
	{
		try
		{
			int choice;	
			System.out.println("\n\t1.Start\n\t2.Stop\n\tEnter Ur Choice::\t");
			choice = sc.nextInt();
			if (choice == 1) 
			{
				System.out.println("\t\tGAME STARTS");
				game.playGame(animalList); 			
			}
			else if (choice == 2) 
			{
					System.exit(0);	
			 }
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
	public  void createAnimal()
	{
		int noOfLion = 2;
		int noOfElephant = 2;
		int noOfTiger= 4;
		int noOfFox = 3;
		int noOfRabbit = 6;
		int noOfDeer = 5;
		lion(noOfLion);
		elephant(noOfLion,noOfElephant);
		tiger(noOfLion,noOfElephant,noOfTiger);
		fox(noOfLion,noOfElephant,noOfTiger,noOfFox);
		rabbit(noOfLion,noOfElephant,noOfTiger,noOfFox,noOfRabbit);
		deer(noOfLion,noOfElephant,noOfTiger,noOfFox,noOfRabbit,noOfDeer);
	}
		public void lion(int noOfLion)
		{
			for (int i=0;i<noOfLion;i++) 
			{
				animalList.add(new Lion());
				animalList.get(i).setAnimalName("Lion-->"+(i+1));
				animalList.get(i).setAnimalStrength(9);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void elephant(int noOfLion,int noOfElephant)
		{
			int j=0;
			int l = noOfLion+noOfElephant;
			for (int i=noOfLion;i<l;i++,j++) 
			{
				animalList.add(new Elephant());
				animalList.get(i).setAnimalName("Elephant-->"+(j+1));
				animalList.get(i).setAnimalStrength(10);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void tiger(int noOfLion,int noOfElephant,int noOfTiger)
		{
			int j=0;
			int l = noOfLion+noOfElephant;
			int m = noOfLion+noOfElephant+noOfTiger;
			for (int i=l;i<m;i++,j++) 
			{
				animalList.add(new Tiger());
				animalList.get(i).setAnimalName("Tiger-->"+(j+1));
				animalList.get(i).setAnimalStrength(8);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void fox(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox)
		{
			int j=0;
			int m = noOfLion+noOfElephant+noOfTiger;
			int n =noOfLion+noOfElephant+noOfTiger+noOfFox;
			for (int i=m;i<n;i++,j++) 
			{
				animalList.add(new Fox());
				animalList.get(i).setAnimalName("Fox-->"+(j+1));
				animalList.get(i).setAnimalStrength(6);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void rabbit(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox,int noOfRabbit)
		{
			int j=0;
			int n =noOfLion+noOfElephant+noOfTiger+noOfFox;
			int o = noOfLion+noOfElephant+noOfTiger+noOfFox+noOfRabbit;
			for (int i=n;i<o;i++,j++) 
			{
				animalList.add(new Rabbit());
				animalList.get(i).setAnimalName("Rabbit-->"+(j+1));
				animalList.get(i).setAnimalStrength(6);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void deer(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox,int noOfRabbit,int noOfDeer)
		{
			int j=0;
			int o = noOfLion+noOfElephant+noOfTiger+noOfFox+noOfRabbit;
			int p = noOfLion+noOfElephant+noOfTiger+noOfFox+noOfRabbit+noOfDeer;
			for (int i=o;i<p;i++,j++) 
			{
				animalList.add(new Deer());
				animalList.get(i).setAnimalName("Deer-->"+(j+1));
				animalList.get(i).setAnimalStrength(4);	
				animalList.get(i).setIsAlive(true);			
			}
		} 
}