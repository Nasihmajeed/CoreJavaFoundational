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

	public void checkType(int r1,int r2,ArrayList<Animal> animals)
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
			System.out.println((animals.get(r2)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r1)).getAnimalName());
		}
		else
		{
			int won = checkEnergy(r1,r2,animals);
			
			if(won==1)
			{
				((Carnivorus)animals.get(r1)).eat(animals.get(r2).animalEnergy);
				
			}
			printResult(won,r1,r2,animals);
		}
	}

	public void herbVsCar(int r1,int r2, ArrayList<Animal> animals)
	{

		int luckOfHerb = luckFactor();
		if (luckOfHerb==1)
		{
			System.out.println((animals.get(r1)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r2)).getAnimalName());
		}
		else
		{
			System.out.println( animals.get(r1).getAnimalName()+" have NO LUCK :) ");
			int won = checkEnergy(r1,r2,animals);
		
			if(won==2)
			{
				((Carnivorus)animals.get(r2)).eat(animals.get(r1).animalEnergy);
				
				
			}
			printResult(won,r1,r2,animals);
		}
	}
	public void carVsCar(int r1,int r2, ArrayList<Animal> animals)
	{

		int won = checkEnergy(r1,r2,animals);
		
		if(won==1)
		{
			
			((Carnivorus)animals.get(r1)).eat(animals.get(r2).animalEnergy);
			
		}
		if(won==2)
		{
			
			((Carnivorus)animals.get(r2)).eat(animals.get(r1).animalEnergy);
			
		}
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
		

		if(energy1>energy2)
		{
			
			System.out.println("\tAfter Fight");
			System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
			return 1;
		}
		else if(energy2>energy1)
		{
			
			System.out.println("\tAfter Fight");
			System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
			return 2;
		}
		else
		{
			int luckOf1=luckFactor();
			if(luckOf1==1)
			{
				System.out.println("==> Both Have Same Energy");
				System.out.println("==> " + animals.get(r1).getAnimalName()+ " have MORE LUCK");
				
				System.out.println("\tAfter Fight");
				System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
				return 1;
			}
			else
			{
				System.out.println("==> Both Have Same Energy");
				System.out.println("==> " + animals.get(r2).getAnimalName()+ " have MORE LUCK");
				
				System.out.println("\tAfter Fight");
				System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
				return 2;
			}
			
		}
	}

	public void printResult(int won,int r1,int r2 ,  ArrayList<Animal> animals)
	 {
	 	if(won==1)
	 	{
	 		System.out.println(animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
			(animals.get(r2)).dead();
			
	 	}
	 	else if(won==2)
	 	{
	 		System.out.println(animals.get(r2).getAnimalName() +" killed "+animals.get(r1).getAnimalName());
			(animals.get(r1)).dead();
			
	 	}
	 	else
	 	{
	 		System.out.println(animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
			(animals.get(r2)).dead();
			
	 	}
	 }
	 private int luckFactor()
	 {
	 	Random rand = new Random();
		int n = rand.nextInt(2);
		return n;
	 }



}