package com.lxisoft.game;
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
			herbVsCar(r1,r2,animals);
		else if(type1.equals("Carnivorus") && type2.equals("Carnivorus"))
		{
			((Carnivorus)animals.get(r1)).fight();
			((Carnivorus)animals.get(r2)).fight();
			carVsCar(r1,r2,animals);
		}
		 else if(type1.equals("Herbivorus") && type2.equals("Herbivorus"))
			herbVsHerb(r1,r2,animals);
		else
			carVsHerb(r1,r2,animals);		
	
	}
	public void carVsHerb(int r1,int r2, ArrayList<Animal> animals)
	{
		int luckOfHerb = luckFactor();
		if(animals.get(r2) instanceof WeakAnimal)
		{
			if (luckOfHerb==1)
			{
				System.out.println("\n"+(animals.get(r2)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r1)).getAnimalName());
			}
			else
			{
				System.out.println("=> " + animals.get(r2).getAnimalName() + " is a  WEAK ANIMAL ");
				System.out.println( "\n"+animals.get(r2).getAnimalName()+" have NO LUCK :) ");
				int won = checkStrength(r1,r2,animals);
				printResult(won,r1,r2,animals);
				((Carnivorus)animals.get(r1)).fight();
				((Herbivorus)animals.get(r2)).fight();
			}
		}
		else
		{
			int won = checkStrength(r1,r2,animals);
			printResult(won,r1,r2,animals);
			((Carnivorus)animals.get(r1)).fight();
			((Herbivorus)animals.get(r2)).fight();
		}
	}

	public void herbVsCar(int r1,int r2, ArrayList<Animal> animals)
	{
		int luckOfHerb = luckFactor();
		if(animals.get(r1) instanceof WeakAnimal)
		{
				if (luckOfHerb==1)
				{
					System.out.println("=> " + animals.get(r1).getAnimalName() + " is a  WEAK ANIMAL ");
					System.out.println("=>"+(animals.get(r1)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r2)).getAnimalName());
				}
				else
				{
					System.out.println("=> " + animals.get(r1).getAnimalName() + " is a  WEAK ANIMAL ");
					System.out.println(" =>"+animals.get(r1).getAnimalName()+" have NO LUCK :) ");
					int won = checkStrength(r1,r2,animals);
					printResult(won,r1,r2,animals);
					((Herbivorus)animals.get(r1)).fight();
					((Carnivorus)animals.get(r2)).fight();
				}
		}
		else
		{

			int won = checkStrength(r1,r2,animals);
			printResult(won,r1,r2,animals);
			((Herbivorus)animals.get(r1)).fight();
			((Carnivorus)animals.get(r2)).fight();
		}
	}
	public void carVsCar(int r1,int r2, ArrayList<Animal> animals)
	{

		int won = checkStrength(r1,r2,animals);
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
	public int checkStrength(int r1,int r2,ArrayList<Animal> animals)
	{
		int strength1,strength2;
		int ret = checkEnergy(r1,r2,animals);
		strength1=animals.get(r1).getStrength();
		strength2=animals.get(r2).getStrength();
		if(ret==1 && strength1>strength2 )
			return 1;
		else if(ret==2 && strength2>strength1)
			return 2;
		else if(ret==1 && strength2>strength1)
		{
			if(animals.get(r2).animalEnergy<45)
			{
				System.out.println(animals.get(r2).getAnimalName() + " Have less Energy ");
				return 1;
			}
			else
			{
				return 2;
			}
		}
		else if(ret==2 && strength1>strength2)
		{
			if(animals.get(r1).animalEnergy<45)
			{
				System.out.println("\n => animals.get(r2).animalEnergy = " + animals.get(r1).animalEnergy);
				System.out.println(animals.get(r1).getAnimalName() + " Have less Energy ");
				return 2;
			}
			else
				return 1;
		}
		else
			return ret;
		

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
		 	(animals.get(r2)).setKilledBy(animals.get(r1).getAnimalName());
			
			
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
		 	(animals.get(r1)).setKilledBy(animals.get(r2).getAnimalName());
			(animals.get(r1)).dead();
			
	 	}
	 }
	 private int luckFactor()
	 {
	 	Random rand = new Random();
		int n = rand.nextInt(2);
		return n;
	 }
	public boolean checkArea(int r1, int r2, ArrayList<Animal> animals)
	{
		int animal1X,animal1Y,animal2X,animal2Y;

		animal1X= 10 + (int) (Math.random()*50);
		animal1Y= 10 + (int) (Math.random()*50);
		animal2X= 10 + (int) (Math.random()*50);
		animal2Y= 10 + (int) (Math.random()*50);
		System.out.println("\t TERRITORY DETAILS ");
		System.out.println("   **************************");
		System.out.println("\n"+animals.get(r1).getAnimalName() +"=> \t( "+animal1X+", " +animal1Y+")" + "\t Range =  " +animals.get(r1).range );
		System.out.println("\n"+animals.get(r2).getAnimalName()+" => \t( "+animal2X+", " +animal2Y+")" + "\t Range =  " +animals.get(r2).range);

		int dist = (int) (Math.sqrt(((animal1X - animal2X)*(animal1X - animal2X))+((animal1Y - animal2Y)*(animal1Y - animal2Y))));
		int rad = ((animals.get(r1).getRange())+(animals.get(r2).getRange()));
		if(dist<= rad)
		{

			System.out.println("\n\t\t=> "+animals.get(r1).getAnimalName() + " AND " +  animals.get(r2).getAnimalName() + " are in SAME TERRITORY \n");
			return true;
		}
		else
		{
			if(((animals.get(r1)) instanceof Herbivorus) && ((animals.get(r2)) instanceof Herbivorus))
				System.out.println("\n\t\t=> "+" Both Are Herbivorus => No Fight Happens");
			System.out.println("\n\t\t=> "+animals.get(r1).getAnimalName() + " AND " +  animals.get(r2).getAnimalName() + " are in DIFFERENT TERRITORY \n\t\t=> No FIGHT TAKES PLACE");
			return false;

		}

	}


}