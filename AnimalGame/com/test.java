public int aliveOrNot(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int energyOne = animalList.get(index).getAnimalStrength();
		int energyTwo = animalList.get(randomIndex).getAnimalStrength();
		if(energyOne!=0)
		{
			animalList.get(index).setIsAlive(false);
			animalCount--;
		}
		if(energyTwo!=0)
		{
			animalList.get(randomIndex).setIsAlive(false);
			animalCount--;	
		}
		return animalCount;
	}












package com.lxisoft.game;
import com.lxisoft.forest.*;
import java.util.*;
import java.io.*;
import java.util.Random;
import java.lang.Math;
public class Game
{
	EnergyLevel energyLevel = new EnergyLevel();
	static Random random = new Random();
	public void playGame(ArrayList<Animal> animalList)
	{		  
		int animalCount = animalList.size();
		gameLevel();
		nameOfAnimal();
		do
		{	
			pickRandomAnimal();
			generateRandomCoordinate(animalList,index,randomIndex);
			if(animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true)
			{
				if(index!=randomIndex)
				{
					animalCount = checkAnimalInstance(animalList,index,randomIndex,animalCount);
				}
			}			
		}while(animalCount>1);
		printSurvivedAnimal(animalList,animalCount);
	}
	public void pickRandomAnimal()
	{
		int index = random.nextInt(animalList.size());
		int randomIndex = random.nextInt(animalList.size());
	}
	public void generateRandomCoordinate(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		int x = random.nextInt(50);
		int y = random.nextInt(50);
		animalList.get(index).setX(x);
		animalList.get(randomIndex).setY(y);
	}
	public int checkAnimalInstance(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Herbivores)
		{
			herbivoresVsHerbivores(animalList,index,randomIndex,animalCount);
		}
		else if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores) 
		{
			carnivoresVsCarnivores(animalList,index,randomIndex,animalCount);	
		}
		else
		{
			carnivoresVsHerbivores(animalList,index,randomIndex,animalCount);
		}
	}
	public void herbivoresVsHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		noFight(animalList,index,randomIndex);
	}
	public void carnivoresVsCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		fightEachOther(animalList,index,randomIndex,animalCount)
	}
	public void carnivoresVsHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		fightEachOther(animalList,index,randomIndex,animalCount);
	}
	public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		System.out.println("No Fight Between Them\n");		
	}
	public int fightEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			fightBetweenCarnivores(animalList,index,randomIndex,animalCount);
		}
		else
		{
			fightBetweenCarnivoresAndHerbivores(animalList,index,randomIndex,animalCount);
		}
	}
	public int fightBetweenCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount)
		if(distance<50)
		{
			attack(animalList,index,randomIndex,animalCount);
		}
	}
	public int fightBetweenCarnivoresAndHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount)
		if(distance<30)
		{
			attack(animalList,index,randomIndex,animalCount);
		}
	}
	public int attack(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			checkStrength(animalList,index,randomIndex,animalCount);
		}
		else
		{
			checkStrength(animalList,index,randomIndex,animalCount);
		}
	}
	public void checkStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			carnivoresVsCarnivoresStrength();
		}
		else
		{
			carnivoresVsHerbivoresStrength();
		}
	}
	public void carnivoresVsCarnivoresStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
		{
			animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName();
			System.out.println(animalList.get(index).getAnimalName()+" Defeated "+animalList.get(randomIndex).getAnimalName());
		}
		else if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
		{
			animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName();
			System.out.println(animalList.get(randomIndex).getAnimalName()+" Defeated "+animalList.get(index).getAnimalName());
		}
		else
		{ 
			fightOfEqualStregth(animalList,index,randomIndex,animalCount);		
		}
	}
	public void fightOfEqualStregth(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName();
		System.out.println("Fight Between Equal Strength");
		boolean fightOrLeave = luckFactor();
		if(fightOrLeave == true)
		{
			System.out.println("Fighting................");
			System.out.println("One Of the animal Defeated");
			//change energy;
		}
		else
		{
			System.out.println("Fighting................");
			System.out.println("animal leaves");

		}

	}
	public void carnivoresVsHerbivoresStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
		{
			carnivoresVsHerbivoresFightCondition(animalList,randomIndex,animalCount);		
		}
		if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
		{
			carnivoresVsHerbivoresFightCondition(animalList,index,animalCount);		
		}		
	}
	public void carnivoresVsHerbivoresFightCondition(ArrayList<Animal> animalList,int index,int animalCount)
	{
		boolean luckFactor = luckFactor();
		if(luckFactor == true)
		{
			ranaway(animalList,index);
		}
		else
		{
			attackEachOther()		
		}
	}
	public void ranAway(ArrayList<Animal> animalList,int index)
	{	
		System.out.println(animalList.get(index).getAnimalName()+" RanAway\n");		
	}
	public int directAttack(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores)
		{	
			System.out.println(animalList.get(index).getAnimalName()+" Directly killed\n");
			animalList.get(index).setIsAlive(false);
			animalCount--;	
		}	
		else if (animalList.get(randomIndex) instanceof Herbivores) 
		{
			System.out.println(animalList.get(randomIndex).getAnimalName()+" Directly killed\n");
			animalList.get(randomIndex).setIsAlive(false);
			animalCount--;
		}
		return animalCount;
	}
	public void printSurvivedAnimal(ArrayList<Animal> animalList,int animalCount)
	{
		for (int i=0;i<animalList.size();i++) 
		{
			if(animalList.get(i).getIsAlive() == true)
			{
				System.out.println(animalList.get(i).getAnimalName()+" Survived");
			}	
		}
		if(animalCount==0)		
		try
		{
			throw new MyException("No Animal Survived");	
		}
		catch(MyException e)
		{
			System.out.println("Caught");
		}
	}
	public int calculateDistance(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int x1 = animalList.get(index).getX();
		int y1 = animalList.get(index).getY();
		int x2 = animalList.get(randomIndex).getX();
		int y2 = animalList.get(randomIndex).getY();
		int newX = x2-x1;
		int newY = y2-y1;
		int distance = (int)Math.sqrt((int)Math.pow(newX,2)+(int)Math.pow(newY,2));
		System.out.println("Distance Between "+animalList.get(index).getAnimalName()+" & "+animalList.get(randomIndex).getAnimalName()+" = "+distance);	
		return distance;
	}
	public boolean luckFactor()
	{
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
	}
	public void gameLevel()
	{
		GameLevel level;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t1.LOW\n\t2.MEDIUM\n\t3.HARD\n\tEnter Ur Choice::\t");
		int ch = sc.nextInt();
		switch (ch) 
		{
			case 1:	low(GameLevel.LOW);break;
			case 2:	medium(GameLevel.MEDIUM);break;
			case 3:	hard(GameLevel.HARD);break;
			default:System.out.println("Invalid Choice");
		}	
	}
	public void low(GameLevel level)
	{
		System.out.println("Level = "+level);
		energyLevel.setEnergyParamOfOne(1);
		energyLevel.setEnergyParamOfTwo(1);
	}
	public void medium(GameLevel level)
	{
		System.out.println("Level = "+level);
		energyLevel.setEnergyParamOfOne(2);
		energyLevel.setEnergyParamOfTwo(2);
	}
	public void hard(GameLevel level)
	{
		System.out.println("Level = "+level);
		energyLevel.setEnergyParamOfOne(3);
		energyLevel.setEnergyParamOfTwo(3);
	}
	public void nameOfAnimal()
	{		
		int a;
		try
		{
			File file = new File("C://Users//rahul//Desktop//Java Projects//AnimalGame//v3.0.1//com//lxisoft//forest//Animal.txt");
			FileReader filereader = new FileReader(file);
			System.out.println("Animals In The Forest");
			while((a=filereader.read())!=-1)
			{
				System.out.print((char)a);
			}	
		}
		catch(IOException e)
		{
			System.out.println(e);
		}	
	}
}	