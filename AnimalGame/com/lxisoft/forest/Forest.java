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
		int ch;
		do
		{
			startGame();
			System.out.println("Do U Want To Paly Again?Press 1(Play Again) or 0(Quit Game)");
			ch = sc.nextInt();
		}while(ch == 1);	
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
		int noOfElephant = 3;
		int noOfTiger= 4;
		int noOfFox = 3;
		int noOfRabbit = 5;
		int noOfDeer = 1;
		//int totalAnimal = noOfLion+noOfElephant+noOfTiger+noOfFox+noOfRabbit+noOfDeer;
		lion();
		elephant();
		tiger();
		fox();
		rabbit();
		deer();
	}
		public void lion(int noOfLion)
		{
			for (int i=0;i<noOfLion;i++) 
			{
				animalList.add(new Lion());
				animalList.get(i).setAnimalName("Lion"+(i+1));
				animalList.get(i).setAnimalStrength(9);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void elephant(int noOfLion,int noOfElephant)
		{
			int l = noOfLion+noOfElephant;
			for (int i=noOfLion;i<l;i++) 
			{
				animalList.add(new Elephant());
				animalList.get(i).setAnimalName("Elephant"+(i+1));
				animalList.get(i).setAnimalStrength(10);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void tiger(int noOfLion,int noOfElephant,int noOfTiger)
		{
			int m = noOfLion+noOfElephant+noOfTiger;
			for (int i=l;i<m;i++) 
			{
				animalList.add(new Tiger());
				animalList.get(i).setAnimalName("Tiger"+(i+1));
				animalList.get(i).setAnimalStrength(8);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void fox(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox)
		{
			int n = noOfLion+noOfElephant+noOfTiger+noOfTiger;
			for (int i=m;i<n;i++) 
			{
				animalList.add(new Fox());
				animalList.get(i).setAnimalName("Fox"+(i+1));
				animalList.get(i).setAnimalStrength(6);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void rabbit(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox,int noOfRabbit)
		{
			int o = noOfLion+noOfElephant+noOfTiger+noOfTiger+noOfRabbit;
			for (int i=n;i<o;i++) 
			{
				animalList.add(new Rabbit());
				animalList.get(i).setAnimalName("Rabbit"+(i+1));
				animalList.get(i).setAnimalStrength(6);
				animalList.get(i).setIsAlive(true);				
			}
		}
		public void deer(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox,int noOfRabbit,int noOfDeer)
		{
			int p = noOfLion+noOfElephant+noOfTiger+noOfTiger+noOfRabbit+noOfDeer;
			for (int i=0;i<p;i++) 
			{
				animalList.add(new Deer());
				animalList.get(i).setAnimalName("Deer"+(i+1));
				animalList.get(i).setAnimalStrength(4);	
				animalList.get(i).setIsAlive(true);			
			}
		} 
}