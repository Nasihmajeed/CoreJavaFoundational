package com.lxisoft.Game;
import java.util.*;
public class AnimalFight
{


	public void assignAnimalType(int r1 , int r2, ArrayList<Animal> animals)
	{
		if(animals.get(r1) instanceof Herbivorus)
			animals.get(r1).setType("Herbivorus");
		else 
			animals.get(r1).setType("Carnivorus");

		if(animals.get(r2) instanceof Herbivorus)
			animals.get(r2).setType("Herbivorus");
		else 
			animals.get(r2).setType("Carnivorus");
	}

	public void checkFightType(int r1,int r2,ArrayList<Animal> animals)
	{
		
		String type1,type2;
		type1=animals.get(r1).getType();
		type2 = animals.get(r2).getType();
		if(type1.equals("Herbivorus") && type2.equals("Carnivorus"))
		{
			
			((Herbivorus)animals.get(r1)).fight();
			((Carnivorus)animals.get(r2)).fight();
			herbVsCar(r1,r2,animals);
		}
		else if(type1.equals("Carnivorus") && type2.equals("Carnivorus"))
		{
			
			((Carnivorus)animals.get(r1)).fight();
			((Carnivorus)animals.get(r2)).fight();
			carVsCar(r1,r2,animals);
		}
		 else if(type1.equals("Herbivorus") && type2.equals("Herbivorus"))
		{
			((Herbivorus)animals.get(r1)).fight();
			((Herbivorus)animals.get(r2)).fight();
			herbVsHerb(r1,r2,animals);
		}
		else
		{	
			
			((Carnivorus)animals.get(r1)).fight();
			((Herbivorus)animals.get(r2)).fight();
			carVsHerb(r1,r2,animals);
		}		
	
	}
	public void carVsHerb(int r1,int r2, ArrayList<Animal> animals)
	{
		int luckOfHerb = luckFactor();
		if (luckOfHerb==1)
		{
			System.out.println("\n"+(animals.get(r2)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r1)).getAnimalName());
		}
		else
		{
			System.out.println( "\n"+animals.get(r2).getAnimalName()+" have NO LUCK :) ");
			int won = checkEnergy(r1,r2,animals);
			printResult(won,r1,r2,animals);
		}
	}

	public void herbVsCar(int r1,int r2, ArrayList<Animal> animals)
	{

		int luckOfHerb = luckFactor();
		if (luckOfHerb==1)
		{
			System.out.println("\n"+(animals.get(r1)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r2)).getAnimalName());
		}
		else
		{
			System.out.println( "\n"+animals.get(r1).getAnimalName()+" have NO LUCK :) ");
			int won = checkEnergy(r1,r2,animals);
			printResult(won,r1,r2,animals);
		}
	}
	public void carVsCar(int r1,int r2, ArrayList<Animal> animals)
	{

		int won = checkEnergy(r1,r2,animals);
		printResult(won,r1,r2,animals);

	}


	public void herbVsHerb(int r1,int r2, ArrayList<Animal> animals)
	{
		System.out.println("Both are Herbivorus Currently No Fight Happens ");
	}

	public int checkEnergy(int r1, int r2, ArrayList<Animal> animals)
	{
		
		int energy1 = animals.get(r1).animalEnergy;
		int energy2 = animals.get(r2).animalEnergy;
		// System.out.print("\nAnimal Energy -->");
		// System.out.println(" After Fight");
		// System.out.println("\t\t  ***********");
		// System.out.println("\t\t"+animal1+" <=> "+animal2);
		// System.out.println("\t\t"+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy+"\n" );
		

		if(energy1>energy2)
		{
			return 1;
		}
		else if(energy2>energy1)
		{
			 return 2;
		}
		else
		{
			int luckOf1=luckFactor();
			if(luckOf1==1)
			{
				System.out.println("\n==> Both Have Same Energy");
				System.out.println("==> " + animals.get(r1).getAnimalName()+ " have MORE LUCK");
				return 1;
			}
			else
			{
				System.out.println("\n==> Both Have Same Energy");
				System.out.println("==> " + animals.get(r2).getAnimalName()+ " have MORE LUCK");
				return 2;
			}
			
		}
	}

	public void printResult(int won,int r1,int r2 ,  ArrayList<Animal> animals)
	 {
	 	String animal1,animal2;
		animal1=animals.get(r1).getAnimalName();
		animal2=animals.get(r2).getAnimalName();
	 	if(won==1)
	 	{
	 		System.out.println("\n"+animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
	 		(animals.get(r2)).dead();
	 		System.out.print("\nAnimal Energy -->");
			System.out.println(" After Fight");
			System.out.println("\t\t  ***********");
			System.out.println("\t\t"+animal1+" <=> "+animal2);
			System.out.println("\t\t"+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy+"\n" );
	 		if(animals.get(r1) instanceof Carnivorus )
	 		{
	 			System.out.print(animals.get(r1).getAnimalName() + " eat " +animals.get(r2).getAnimalName() +" => " );
		 		((Carnivorus)animals.get(r1)).eat((animals.get(r1)).animalEnergy);
	 		}
		 	(animals.get(r2)).killedBy=animals.get(r1).getAnimalName();
			
			
	 	}
	 	else if(won==2)
	 	{
	 		System.out.println("\n"+animals.get(r2).getAnimalName() +" killed "+animals.get(r1).getAnimalName());
	 		(animals.get(r1)).dead();

	 		System.out.print("\nAnimal Energy -->");
			System.out.println(" After Fight");
			System.out.println("\t\t  ***********");
			System.out.println("\t\t"+animal1+" <=> "+animal2);
			System.out.println("\t\t"+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy+"\n" );

	 		if(animals.get(r2) instanceof Carnivorus )
	 		{
		 		System.out.print(animals.get(r2).getAnimalName() + " eat " +animals.get(r1).getAnimalName() +" => " );
		 		((Carnivorus)animals.get(r2)).eat(animals.get(r2).animalEnergy);

	 		}
		 	(animals.get(r1)).killedBy=animals.get(r2).getAnimalName();
			(animals.get(r1)).dead();
			
	 	}
	 	// else
	 	// {
	 	// 	(animals.get(r2)).dead();
	 		
	 	// 	System.out.print("\nAnimal Energy -->");
			// System.out.println(" After Fight");
			// System.out.println("\t\t  ***********");
			// System.out.println("\t\t"+animal1+" <=> "+animal2);
			// System.out.println("\t\t"+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy+"\n" );


	 	// 	System.out.println("\n"+animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
	 	// 	if(animals.get(r1) instanceof Carnivorus )
	 	// 	{
	 	// 		System.out.print(animals.get(r1).getAnimalName() + " eat " +animals.get(r2).getAnimalName() +" => " );
		 // 		((Carnivorus)animals.get(r1)).eat(animals.get(r2).animalEnergy);
	 	// 	}
		 // 	(animals.get(r2)).killedBy=animals.get(r1).getAnimalName();
			
			
	 	// }
	 }
	 private int luckFactor()
	 {
	 	Random rand = new Random();
		int n = rand.nextInt(2);
		return n;
	 }



}