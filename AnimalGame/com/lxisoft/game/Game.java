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
		System.out.println(animalCount);
		for(int i=0;i<animalCount;i++)
		{
			System.out.println(animalList.get(i).getAnimalName());	
		}
		
		gameLevel();
		nameOfAnimal();
		do
		{	
			int index = random.nextInt(animalList.size());
			int randomIndex = random.nextInt(animalList.size());
			generateRandomCoordinate(animalList,index,randomIndex);
			if(animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true)
			{
				if(index!=randomIndex)
				{
					animalCount = checkAnimalInstance(animalList,index,randomIndex,animalCount);
				}
			}	
			System.out.println(animalCount);		
		}while(animalCount>1);
		printSurvivedAnimal(animalList,animalCount);
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
			animalCount = carnivoresVsCarnivores(animalList,index,randomIndex,animalCount);	
		}
		else
		{
			animalCount = carnivoresVsHerbivores(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public void herbivoresVsHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		noFight(animalList,index,randomIndex);
	}
	public int carnivoresVsCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		animalCount = fightEachOther(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public int carnivoresVsHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		animalCount = fightEachOther(animalList,index,randomIndex,animalCount);
		return animalCount;
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
			animalCount = fightBetweenCarnivores(animalList,index,randomIndex,animalCount);
		}
		else
		{
			animalCount = fightBetweenCarnivoresAndHerbivores(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public int fightBetweenCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount);
		if(distance<50)
		{
			animalCount = attack(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public int fightBetweenCarnivoresAndHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount);
		if(distance<30)
		{
			animalCount = attack(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public int attack(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			animalCount = checkStrength(animalList,index,randomIndex,animalCount);
		}
		else
		{
			animalCount = checkStrength(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public int checkStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			printInitialEnergyLevel(animalList,index,randomIndex);
			animalCount = carnivoresVsCarnivoresStrength(animalList,index,randomIndex,animalCount);
			printInitialEnergyLevel(animalList,index,randomIndex);
		}
		else
		{
			animalCount = carnivoresVsHerbivoresStrength(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public int carnivoresVsCarnivoresStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int position;
		if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
		{
			defeated(animalList,index,randomIndex,animalCount);	
		}
		else if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
		{
			defeated(animalList,randomIndex,index,animalCount);	
		}
		else if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
		{ 	
			printInitialEnergyLevel(animalList,index,randomIndex);
			animalCount = fightOfEqualStregth(animalList,index,randomIndex,animalCount);
			printNewEnergyLevel(animalList,index,randomIndex);		
		}
		return animalCount;
	}
	public int defeated(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		printInitialEnergyLevel(animalList,index,randomIndex);
		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
		System.out.println(animalList.get(index).getAnimalName()+" Defeated "+animalList.get(randomIndex).getAnimalName());
		animalCount = changeEnergy(animalList,index,randomIndex,animalCount);
		printNewEnergyLevel(animalList,index,randomIndex);
		return animalCount;
	} 
	public int fightOfEqualStregth(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
		System.out.println("Fight Between Equal Strength");
		System.out.println("Fighting................");
		animalCount = changeEnergy(animalList,index,randomIndex,animalCount);
		System.out.println("Fight Ends with an Equal Win Ratio");
		return animalCount;
	}
	public int changeEnergy(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int energyOne = animalList.get(index).getAnimalStrength();
		int energyTwo = animalList.get(randomIndex).getAnimalStrength();
		if(energyOne!=0)
		{
			energyOne = energyOne-energyLevel.getEnergyParamOfOne();
			animalList.get(index).setAnimalStrength(energyOne);
		}
		else
		{
			animalList.get(index).setIsAlive(false);
			animalCount--;
		}
		if(energyTwo!=0)
		{
			energyTwo = energyTwo-energyLevel.getEnergyParamOfTwo();
			animalList.get(randomIndex).setAnimalStrength(energyTwo);	
		}
		else
		{
			animalList.get(randomIndex).setIsAlive(false);
			animalCount--;
		}
		return animalCount;
	}

	public int carnivoresVsHerbivoresStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
		{ 
			animalCount = carnivoresVsHerbivoresFightCondition(animalList,index,randomIndex,animalCount);		
		}
		if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
		{ 
			animalCount = carnivoresVsHerbivoresFightCondition(animalList,index,randomIndex,animalCount);		
		}	
		return animalCount;	
	}
	public int carnivoresVsHerbivoresFightCondition(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			animalCount = diffSpeciesFight(animalList,index,randomIndex,animalCount);
		}	
		else if(animalList.get(index) instanceof  Carnivores && animalList.get(randomIndex) instanceof Herbivores)
		{
			animalCount =  diffSpeciesFight(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public int diffSpeciesFight(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index).getAnimalStrength()>6 || animalList.get(randomIndex).getAnimalStrength()>6)
		{
			animalCount = herbivoresAttackCarnivores(animalList,index,randomIndex,animalCount);
		}
		else if(animalList.get(index).getAnimalStrength()<6 || animalList.get(randomIndex).getAnimalStrength()<6)
		{
			int n = randomNumber();
			if(n<10)
			{
				ranAway(animalList,index,randomIndex,animalCount);
			}
			else
			{
				directAttack(animalList,index,randomIndex,animalCount);
			}	
		}
		return animalCount;
	}
	public int herbivoresAttackCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		
		return animalCount;
	}
	public int animalOneOfGreaterStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		System.out.println(animalList.get(index).getAnimalName()+" Defeated "+animalList.get(randomIndex).getAnimalName());
		animalCount = changeEnergy(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public int animaltwoOfGreaterStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		System.out.println(animalList.get(randomIndex).getAnimalName()+" Defeated "+animalList.get(index).getAnimalName());
		animalCount = changeEnergy(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public void ranAway(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores)
		{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			escape(animalList,index);
		}	
		else if (animalList.get(randomIndex) instanceof Herbivores) 
		{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			escape(animalList,randomIndex);
		}
	}
	public void escape(ArrayList<Animal> animalList,int index)
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
	public void printInitialEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println(" \n ");
		System.out.println("---Strength Before Fighting---");
		System.out.println(animalList.get(index).getAnimalName()+" = "+animalList.get(index).getAnimalStrength());
		System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+animalList.get(randomIndex).getAnimalStrength());
		System.out.println(" \n ");			
	}
	public void printNewEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println("---Strength After Fighting---");
		System.out.println(animalList.get(index).getAnimalName()+" = "+animalList.get(index).getAnimalStrength());
		System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+animalList.get(randomIndex).getAnimalStrength());
		System.out.println(" \n ");			
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
	public int randomNumber()
	{
		Random random = new Random();
		int num = random.nextInt(30);
		return num;
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