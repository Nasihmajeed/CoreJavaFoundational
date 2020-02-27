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
		gameLevel();
		nameOfAnimal();
		do
		{	
			int index = random.nextInt(animalList.size());
			int randomIndex = random.nextInt(animalList.size());
			generateRandomCoordinate(animalList,index,randomIndex);
			if(animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true)
			{
				if(index != randomIndex)
				{
					animalCount = checkAnimalInstance(animalList,index,randomIndex,animalCount);
					//animalCount = twoAnimalSurvived(animalList,index,randomIndex,animalCount);
				}
			}	
			//System.out.println("Animal Count="+animalCount);
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
		animalCount = fightBetweenCarnivores(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public int carnivoresVsHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		animalCount = fightBetweenCarnivoresAndHerbivores(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println("\n"+animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		System.out.println("No Fight Between Them\n");		
	}
	public int fightBetweenCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount);
		if(distance>50)
		{
			noFight(animalList,index,randomIndex);
			
		}
		else if(distance<50)
		{
			animalCount = checkStrength(animalList,index,randomIndex,animalCount);	
		}
		return animalCount;
	}
	public int fightBetweenCarnivoresAndHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount);
		if(distance<30)
		{
			animalCount = checkCarnivoresHerbivoresStrength(animalList,index,randomIndex,animalCount);
		}
		else if(distance>30)
		{
			noFight(animalList,index,randomIndex);		
		}
		return animalCount;
	}
	public int checkCarnivoresHerbivoresStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int position;
		if (animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Carnivores) 
		{
			position  = index;
			animalCount = carnivoresVsHerbivoresFight(animalList,position,animalCount,randomIndex);
				
		}
		else if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Herbivores) 
		{
			position  = randomIndex;
			animalCount = carnivoresVsHerbivoresFight(animalList,position,animalCount,index);	
				
		}
		return animalCount;
	}
	public int carnivoresVsHerbivoresFight(ArrayList<Animal> animalList,int position,int animalCount,int x)
	{	
		int n = randomNumber();
		if(n<5) 
		{
			printInitialEnergyLevel(animalList,position,x);
			ranAway(animalList,position,x,animalCount);	
		}
		else if(n>10&&animalList.get(position).getAnimalStrength()>6)
		{
			animalCount = checkStrength(animalList,position,x,animalCount);
		}
		else if(n>10&&animalList.get(position).getAnimalStrength()<=6)
		{
			animalCount = directAttack(animalList,position,x,animalCount);			
		}
		else
		{
			animalCount = directAttack(animalList,position,x,animalCount);
		}
		return animalCount;
	}
	public int checkStrength(ArrayList<Animal> animalList,int position,int x,int animalCount)
	{
		if(animalList.get(position).getAnimalStrength()>animalList.get(x).getAnimalStrength())
		{ 
			animalCount = animalOneOfGreaterStrength(animalList,position,x,animalCount);		
		}
		else if(animalList.get(x).getAnimalStrength()<animalList.get(position).getAnimalStrength())
		{
			animalCount = animaltwoOfGreaterStrength(animalList,position,x,animalCount); 
		}
		else if(animalList.get(x).getAnimalStrength() == animalList.get(position).getAnimalStrength())
		{
			animalCount = fightOfEqualStrength(animalList,position,x,animalCount);		
		}
		return animalCount;
	}
	public int fightOfEqualStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
		printInitialEnergyLevel(animalList,index,randomIndex);
		System.out.println("Fight Between Equal Strength");
		System.out.println("Fighting................");
		changeEnergy(animalList,index,randomIndex,animalCount);
		animalCount = aliveOrNot(animalList,index,randomIndex,animalCount);
		System.out.println("Fight Ends.Both Animal Leaves............");
		printNewEnergyLevel(animalList,index,randomIndex);
		return animalCount;
	}
	public void changeEnergy(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int energyOne = animalList.get(index).getAnimalStrength();
		int energyTwo = animalList.get(randomIndex).getAnimalStrength();
		if(energyOne>=0)
		{
			energyOne = energyOne-energyLevel.getEnergyParamOfOne();
			animalList.get(index).setAnimalStrength(energyOne);
		}
		if(energyTwo>=0)
		{
			energyTwo = energyTwo-energyLevel.getEnergyParamOfTwo();
			animalList.get(randomIndex).setAnimalStrength(energyTwo);
		}
	}
	public int aliveOrNot(ArrayList<Animal> animalList,int position,int x,int animalCount)
	{
		int energyOne = animalList.get(position).getAnimalStrength();
		int energyTwo = animalList.get(x).getAnimalStrength();
		if(energyOne<=0)
		{
			animalList.get(position).setIsAlive(false);
			animalList.get(x).setAnimalStrength(0);
			animalCount--;
		}
		if(energyTwo<=0)
		{
			animalList.get(x).setIsAlive(false);
			animalList.get(x).setAnimalStrength(0);
			animalCount--;
		}
		return animalCount;
	}
	public int animalOneOfGreaterStrength(ArrayList<Animal> animalList,int position,int x,int animalCount)
	{
		System.out.println(animalList.get(position).getAnimalName()+" Vs "+animalList.get(x).getAnimalName());
		printInitialEnergyLevel(animalList,position,x); 
		System.out.println(animalList.get(position).getAnimalName()+" Defeated "+animalList.get(x).getAnimalName());
		changeEnergy(animalList,position,x,animalCount);
		animalCount = aliveOrNot(animalList,position,x,animalCount);
		printNewEnergyLevel(animalList,position,x);
		return animalCount;
	}
	public int animaltwoOfGreaterStrength(ArrayList<Animal> animalList,int position,int x,int animalCount)
	{
		System.out.println(animalList.get(position).getAnimalName()+" Vs "+animalList.get(x).getAnimalName());
		printInitialEnergyLevel(animalList,position,x);
		System.out.println(animalList.get(x).getAnimalName()+" Defeated "+animalList.get(position).getAnimalName());
		changeEnergy(animalList,position,x,animalCount);
		animalCount = aliveOrNot(animalList,position,x,animalCount);
		printNewEnergyLevel(animalList,position,x);
		return animalCount;
	}
	public void ranAway(ArrayList<Animal> animalList,int position,int x,int animalCount)
	{	
		int index = position;
		System.out.println(animalList.get(position).getAnimalName()+" RanAway\n");
		printNewEnergyLevel(animalList,position,x);
	}
	public int directAttack(ArrayList<Animal> animalList,int position,int x,int animalCount)
	{
		if(animalList.get(position) instanceof Herbivores)
		{	
			printInitialEnergyLevel(animalList,position,x);
			System.out.println(animalList.get(position).getAnimalName()+" Directly killed and Eaten By "+animalList.get(x).getAnimalName());
			animalList.get(position).setIsAlive(false);
			animalList.get(position).setAnimalStrength(0);
			int energy = animalList.get(x).getAnimalStrength();
			energy = energy + 2;
			animalList.get(x).setAnimalStrength(energy);
			animalCount--;
			printNewEnergyLevel(animalList,position,x);	
		}	
		else if (animalList.get(position) instanceof Herbivores) 
		{
			printInitialEnergyLevel(animalList,position,x);
			System.out.println(animalList.get(position).getAnimalName()+" Directly killed and Eaten By"+animalList.get(x).getAnimalName());
			animalList.get(position).setIsAlive(false);
			animalList.get(position).setAnimalStrength(0);
			int energy = animalList.get(x).getAnimalStrength();
			energy = energy + 2;
			animalList.get(x).setAnimalStrength(energy);
			animalCount--;
			printNewEnergyLevel(animalList,position,x);
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
		System.out.println("---Strength Before ");
		System.out.println(animalList.get(index).getAnimalName()+" = "+animalList.get(index).getAnimalStrength());
		System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+animalList.get(randomIndex).getAnimalStrength());		
	}
	public void printNewEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println("---Strength After ");
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
		energyLevel.setEnergyParamOfOne(3);
		energyLevel.setEnergyParamOfTwo(3);
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
		energyLevel.setEnergyParamOfOne(1);
		energyLevel.setEnergyParamOfTwo(1);
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
	public int twoAnimalSurvived(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalCount == 2)
		{
			if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Herbivores)
			{
				System.out.println("Two Are Survived");
				animalCount--;
			}
		}
		return animalCount;
	}
}	