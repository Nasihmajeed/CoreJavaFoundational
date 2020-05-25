package com.lxisoft.game ;

import java.util.* ;
import com.lxisoft.forest.Animal ;
import com.lxisoft.ui_elements.* ;
import com.lxisoft.behaviours.animalbehaviour.* ;

public class GameHelper
{
	public static int generateRandomNumber(int x) // <---- Function to generate a random integer from 0 to (x-1)
	{
		Random r = new Random();
		int n = r.nextInt(x);
		return n;
	}

	public static int getNumberOfAnimalsAlive(ArrayList<Animal> animalList)
	{
		int numberOfAnimalsAlive = 0 ;
	
		for(Animal animal : animalList)
		{
			if(animal.getIsAlive())
			{
				numberOfAnimalsAlive++ ;
			}
		}

		return numberOfAnimalsAlive ;
	}

	public static String getRandomAnimalName()
	{
		String[] animalNames = {"FENDER","DUTCH","AJAX","BASH","BOLT","ERMA","FANG","KARA","HANNIBAL","HERCULES","KONG","LUPA","MAGNUS","PHOENIX","RAGNA","OMEGA","REMO","SASHA","SKYLAR","SLEDGE","THANATOS","URSA","TITAN","WILMA"} ;

		return animalNames[generateRandomNumber(24)]+" THE " ;
	}

	public static String convertIsAliveToString(boolean isAlive)
	{
		if(isAlive)
		{
			return "ALIVE" ;
		}
		else
		{
			return "DEAD" ;
		}
	}

	public static boolean checkIfBothPrey(Animal animal1,Animal animal2)
	{
		if( (animal1.getAnimalBehaviour() instanceof AggressivePrey && animal2.getAnimalBehaviour() instanceof AggressivePrey) || (animal1.getAnimalBehaviour() instanceof PassivePrey && animal2.getAnimalBehaviour() instanceof PassivePrey) || (animal1.getAnimalBehaviour() instanceof AggressivePrey && animal2.getAnimalBehaviour() instanceof PassivePrey) || (animal1.getAnimalBehaviour() instanceof PassivePrey && animal2.getAnimalBehaviour() instanceof AggressivePrey) )
		{
			System.out.print("\n\n\t\t\t THESE ANIMALS DON'T FIGHT. THEY MOVE ON PEACEFULLY.\n") ;
					System.out.print("\n +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+\n\n") ;

			return false ;
		}
		else
		{
			return true ;
		}
	}

	public static void compareStrengthofBothAnimalsAndFight(Animal animal1,Animal animal2)
	{
		if(animal1.getStrength() > animal2.getStrength())
		{
			animal1.fightAnimal(animal2) ;
		}
		else
		{
			animal2.fightAnimal(animal1) ;
		}
	}

	public static void reduceAnimalEnergy(Animal animal,int reduceFactor)
	{
		animal.setEnergy(animal.getEnergy() - (generateRandomNumber(reduceFactor)+1)) ;
		System.out.print("\\\n\t\t\t " + animal.getName() +"'S ENERGY REDUCED TO "+ animal.getEnergy()) ;
	}

	public static void reduceAnimalStrength(Animal animal,int reduceFactor)
	{
		animal.setStrength(animal.getStrength() - (generateRandomNumber(reduceFactor)+1)) ;
		System.out.print("\n\t\t\t " + animal.getName() +"'S STRENGTH REDUCED TO "+ animal.getStrength()) ;		
	}

	public static void reduceAnimalEnergy(Animal animal1,Animal animal2,int reduceFactorForAnimal1,int reduceFactorForAnimal2)
	{
		animal2.setEnergy(animal2.getEnergy() - (generateRandomNumber(reduceFactorForAnimal2)+1)) ;
		System.out.print("\n\n\t\t\t " + animal2.getName() +"'S ENERGY REDUCED TO "+ animal2.getEnergy()) ;

		animal1.setEnergy(animal1.getEnergy() - (generateRandomNumber(reduceFactorForAnimal1)+1)) ;
		System.out.print("\n\t\t\t " + animal1.getName() +"'S ENERGY REDUCED TO "+ animal1.getEnergy()) ;
	}

	public static void reduceAnimalStrength(Animal animal1,Animal animal2,int reduceFactorForAnimal1,int reduceFactorForAnimal2)
	{
		animal2.setStrength(animal2.getStrength() - (generateRandomNumber(reduceFactorForAnimal2)+1)) ;
		System.out.print("\n\n\t\t\t " + animal2.getName() +"'S STRENGTH REDUCED TO "+ animal2.getStrength()) ;

		animal1.setStrength(animal1.getStrength() - (generateRandomNumber(reduceFactorForAnimal1)+1)) ;
		System.out.print("\n\t\t\t " + animal1.getName() +"'S STRENGTH REDUCED TO "+ animal1.getStrength()) ;		
	}

	public static void reduceAnimalStats(Animal animal1,Animal animal2)
	{
		int damageDone1 = generateRandomNumber(animal1.getStrength()+1)+1;
		int damageDone2 = generateRandomNumber(animal2.getStrength()+1)+1;

		System.out.print("\n\n\t\t\t " + animal1.getName() + " DID " + damageDone1 + " DAMAGE TO " + animal2.getName()) ;
		animal2.setHealth(animal2.getHealth() - damageDone1) ;
		System.out.print("\n\t\t\t " + animal2.getName() + "'S HEALTH REDUCED TO " + animal2.getHealth()) ;	

		reduceAnimalStrength(animal2,40) ;
		reduceAnimalEnergy(animal2,60) ;

		System.out.print("\n\n\t\t\t " + animal2.getName() + " DID " + damageDone2 + " DAMAGE TO " + animal1.getName()) ;
		animal1.setHealth(animal1.getHealth() - damageDone2) ;
		System.out.print("\n\t\t\t " + animal1.getName() + "'S HEALTH REDUCED TO " + animal1.getHealth()) ;			

		reduceAnimalStrength(animal1,10) ;
		reduceAnimalEnergy(animal1,15) ;
	}

	public static boolean checkIfAllAnimalsArePrey(ArrayList<Animal> animalList)
	{
		for(Animal animal : animalList)
		{
			if(animal.getIsAlive() && (animal.getAnimalBehaviour() instanceof AggressivePredator || animal.getAnimalBehaviour() instanceof PassivePredator))
				return false ;
		}
		return true ;
	}

	public static void checkWinner(ArrayList<Animal> animalList)
	{
		for(Animal animal : animalList)
		{
			if(animal.getIsAlive())
			{
				System.out.print("\n\n\t\t\t*** WINNER IS "+ animal.getName() + " ! ***") ;
				return;
			}
		}

		System.out.print("\n\n\t\t\t\t\t*** THERE IS NO WINNER! ALL ANIMALS KILLED EACH OTHER ***") ;
	}
}