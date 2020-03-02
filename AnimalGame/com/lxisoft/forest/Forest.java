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
		FileRepository repo = new FileRepository();
		repo.createFile();
		game  =  new Game();
		createAnimal();
		System.out.println("***** WELCOME TO " + getforestName().toUpperCase()+" *****");
		System.out.println("-----------------------------------------");	
		int ch;
		do
		{
			setAnimalProperties();
			startGame(repo);
			System.out.println("Do U Want To Continue Playing?\n1.Continue(Press 1)\n2.stop(Press 0)\n");
			ch = sc.nextInt();	
		}while(ch==1);	
	}
	
	public void  startGame(FileRepository repo) 	
	{
		int choice;	
		try
		{
			System.out.println("\n\t1.Start\n\t2.Stop\n\t3.WinnersList \n\t Enter Ur Choice::\t");
			choice = sc.nextInt();
			if (choice == 1) 
			{
				System.out.println("\t\tGAME STARTS");
				game.playGame(animalList,repo); 			
			}
			else if(choice == 2) 
			{
				System.exit(0);
			}
			else if(choice == 3) 
			{
				repo.readFromFile();		
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
	public  void setAnimalProperties()
	{
		int noOfLion = 2;
		int noOfElephant = 2;
		int noOfTiger= 4;
		int noOfFox = 3;
		int noOfRabbit = 6;
		int noOfDeer = 5;
		lionProperties(noOfLion);
		elephantProperties(noOfLion,noOfElephant);
		tigerProperties(noOfLion,noOfElephant,noOfTiger);
		foxProperties(noOfLion,noOfElephant,noOfTiger,noOfFox);
		rabbitProperties(noOfLion,noOfElephant,noOfTiger,noOfFox,noOfRabbit);
		deerProperties(noOfLion,noOfElephant,noOfTiger,noOfFox,noOfRabbit,noOfDeer);
	}
	public void lionProperties(int noOfLion)
	{
		for (int i=0;i<noOfLion;i++) 
		{
			animalList.get(i).setAnimalStrength(9);
			animalList.get(i).setIsAlive(true);				
		}
	}
	public void elephantProperties(int noOfLion,int noOfElephant)
	{
		int j=0;
		int l = noOfLion+noOfElephant;
		for (int i=noOfLion;i<l;i++,j++) 
		{
			animalList.get(i).setAnimalStrength(10);
			animalList.get(i).setIsAlive(true);				
		}
	}
	public void tigerProperties(int noOfLion,int noOfElephant,int noOfTiger)
	{
		int j=0;
		int l = noOfLion+noOfElephant;
		int m = noOfLion+noOfElephant+noOfTiger;
		for (int i=l;i<m;i++,j++) 
		{
			animalList.get(i).setAnimalStrength(8);
			animalList.get(i).setIsAlive(true);				
		}
	}
	public void foxProperties(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox)
	{
		int j=0;
		int m = noOfLion+noOfElephant+noOfTiger;
		int n =noOfLion+noOfElephant+noOfTiger+noOfFox;
		for (int i=m;i<n;i++,j++) 
		{
			animalList.get(i).setAnimalStrength(6);
			animalList.get(i).setIsAlive(true);				
		}
	}
	public void rabbitProperties(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox,int noOfRabbit)
	{
		int j=0;
		int n =noOfLion+noOfElephant+noOfTiger+noOfFox;
		int o = noOfLion+noOfElephant+noOfTiger+noOfFox+noOfRabbit;
		for (int i=n;i<o;i++,j++) 
		{
			animalList.get(i).setAnimalStrength(6);
			animalList.get(i).setIsAlive(true);				
		}
	}
	public void deerProperties(int noOfLion,int noOfElephant,int noOfTiger,int noOfFox,int noOfRabbit,int noOfDeer)
	{
		int j=0;
		int o = noOfLion+noOfElephant+noOfTiger+noOfFox+noOfRabbit;
		int p = noOfLion+noOfElephant+noOfTiger+noOfFox+noOfRabbit+noOfDeer;
		for (int i=o;i<p;i++,j++) 
		{
			animalList.get(i).setAnimalStrength(4);	
			animalList.get(i).setIsAlive(true);			
		}
	}




}