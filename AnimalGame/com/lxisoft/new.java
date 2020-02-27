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
		System.out.println("\t\tGAME STARTS");
		int animalCount = animalList.size();
		gameLevel();
		nameOfAnimal();
		do
		{	
			int index = random.nextInt(animalList.size());
			int randomIndex = random.nextInt(animalList.size());
			randomCoordinates(animalList,index,randomIndex);
			if (animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true) 
			{
				if(index != randomIndex)
				{
						animalCount = checkInstanceOfAnimal(animalList,index,randomIndex,animalCount);
				}
			}	
			//System.out.println("ANIMAL COUNT==="+animalCount);
		}while(animalCount>1);
		printSurvivedAnimal(animalList,animalCount);
	}
	public void randomCoordinates(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		int x = random.nextInt(50);
		int y = random.nextInt(50);
		animalList.get(index).setX(x);
		animalList.get(randomIndex).setY(y);
	}
	public int checkInstanceOfAnimal(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof  Herbivores && animalList.get(randomIndex) instanceof  Herbivores)
		{
			herbivoresVsHerbivores(animalList,index,randomIndex,animalCount);
		}
		else if(animalList.get(index) instanceof  Carnivores && animalList.get(randomIndex) instanceof  Carnivores)
		{
			animalCount = carnivoresVsCarnivores(animalList,index,randomIndex,animalCount);									
		}
		else
		{
			animalCount = herbivoresVsCarnivores(animalList,index,randomIndex,animalCount);
		}
		return animalCount;
	}
	public void herbivoresVsHerbivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		noFight(animalList,index,randomIndex);
	}
	public int carnivoresVsCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		animalCount = checkAnimalRegion(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public int herbivoresVsCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Carnivores) 
		{
			animalCount = checkAnimalRegion(animalList,index,randomIndex,animalCount);
		}
		else if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Herbivores) 
		{
			animalCount = checkAnimalRegion(animalList,index,randomIndex,animalCount);
		}	
		return animalCount;
	}
	public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		System.out.println("No Fight\n");		
	}
	public int checkAnimalRegion(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			animalCount = checkFightCondition(animalList,index,randomIndex,animalCount);
		}
		else
		{
			animalCount = checkFightCondition(animalList,index,randomIndex,animalCount);	
		}
		return animalCount;
	}
	public int checkFightCondition(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Herbivores)
		{	
			animalCount = checkRegionCriteria(animalList,index,randomIndex,animalCount);
		}
		else if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Carnivores) 
		{
			animalCount = checkRegionCriteria(animalList,index,randomIndex,animalCount);
		}
		else
		{
			int distance = calculateDistance(animalList,index,randomIndex,animalCount);
			if(distance<30)
			{
				animalCount = fightBtwSameSpecies(animalList,index,randomIndex,animalCount);	
			}
			else
			{
				noFight(animalList,index,randomIndex);	
			}		
		}
		return animalCount;
	}
	public int checkRegionCriteria(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount);
		if(distance<30)
		{
			animalCount = fightBtwDiffSpecies(animalList,index,randomIndex,animalCount);	
		}
		else
		{
			noFight(animalList,index,randomIndex);	
		}
		return animalCount;
	}
	public int fightBtwDiffSpecies(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		boolean luck = luckFactor();
		if(luck==true)
		{
			ranAway(animalList,index,randomIndex,animalCount);			
		}
		else 
		{
			animalCount = attackEachOther(animalList,index,randomIndex,animalCount);		
		}
		return animalCount;	
	}
	public void ranAway(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores)
		{
			System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
			escape(animalList,index);
		}	
		else if (animalList.get(randomIndex) instanceof Herbivores) 
		{
			System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
			escape(animalList,randomIndex);
		}
	}
	public int attackEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores && animalList.get(index).getAnimalStrength()<5)
			{
				System.out.println(animalList.get(index).getAnimalName() + " Vs  "+ animalList.get(randomIndex).getAnimalName());
				animalCount =  directAttack(animalList,index,randomIndex,animalCount);
			}
			else if (animalList.get(randomIndex) instanceof Herbivores && animalList.get(randomIndex).getAnimalStrength()<5) 
			{
				System.out.println(animalList.get(index).getAnimalName() + " Vs  "+ animalList.get(randomIndex).getAnimalName());
				animalCount =  directAttack(animalList,index,randomIndex,animalCount);			
			}
			else
			{
				animalCount = diffSpeciesFightWin(animalList,index,randomIndex,animalCount);
			}
		return animalCount;
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
	public int diffSpeciesFightWin(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores)
		{
			System.out.println(animalList.get(index).getAnimalName() + " Vs  "+ animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(index).getAnimalName() + " Wins ");
			printInitialEnergyLevel(animalList,index,randomIndex);
			animalCount =  changeEnergyLevel(animalList,index,randomIndex,animalCount);
			//printNewEnergyLevel(animalList,index,randomIndex);
		}
		else if (animalList.get(randomIndex) instanceof Carnivores) 
		{
			System.out.println(animalList.get(index).getAnimalName() + " Vs  "+ animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(randomIndex).getAnimalName() + " Wins ");
			printInitialEnergyLevel(animalList,index,randomIndex);
			animalCount =  changeEnergyLevel(animalList,index,randomIndex,animalCount);
			//printNewEnergyLevel(animalList,index,randomIndex);
		}
		return animalCount;
	}
	public int changeEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores)
		{
			animalCount = animalOneEnergy(animalList,index,animalCount);
			animalCount = animalTwoEnergy(animalList,randomIndex,animalCount);	
		}
		else if(animalList.get(randomIndex) instanceof Carnivores)
		{
			animalCount = animalOneEnergy(animalList,index,animalCount);
			animalCount = animalTwoEnergy(animalList,randomIndex,animalCount);
		}	
		return animalCount;
	}
	public int animalOneEnergy(ArrayList<Animal> animalList,int index,int animalCount)
	{	
			int energyOne = animalList.get(index).getAnimalStrength();
			if(energyOne<1)
			{	
			animalList.get(index).setIsAlive(false);
			animalCount--;
			}
			else
			{
			energyOne = energyOne - energyLevel.getEnergyParamOfOne();
			animalList.get(index).setAnimalStrength(energyOne);
			}	
			return animalCount;
	}
	public int animalTwoEnergy(ArrayList<Animal> animalList,int randomIndex,int animalCount)
	{
			int energyTwo = animalList.get(randomIndex).getAnimalStrength();
			if(energyTwo<1)
			{	
			animalList.get(randomIndex).setIsAlive(false);
			animalCount--;
			}
			else
			{
			energyTwo =  energyTwo - energyLevel.getEnergyParamOfTwo();
			animalList.get(randomIndex).setAnimalStrength(energyTwo);
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
	public int fightBtwSameSpecies(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
			{
				printInitialEnergyLevel(animalList,index,randomIndex);
				animalCount = animalOneOfGreaterStrength(animalList,index,randomIndex,animalCount);
				//printNewEnergyLevel(animalList,index,randomIndex);
			}
			else
			{
				printInitialEnergyLevel(animalList,index,randomIndex);
				animalCount = animaltwoOfGreaterStrength(animalList,index,randomIndex,animalCount);
				//printNewEnergyLevel(animalList,index,randomIndex);
			}
		}
		return animalCount;
	}
	public int animalOneOfGreaterStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		System.out.println(animalList.get(index).getAnimalName()+" Wins");
		animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public int animaltwoOfGreaterStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		System.out.println(animalList.get(randomIndex).getAnimalName()+" Wins");
		animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);
		return animalCount;
	}
	public void printInitialEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex)
	{
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
		energyLevel.setEnergyParamOfTwo(1);
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







// public int carnivoresVsCarnivoresStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	// {
	// 	int position;
	// 	if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
	// 	{
	// 		defeated(animalList,index,randomIndex,animalCount);	
	// 	}
	// 	else if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
	// 	{
	// 		defeated(animalList,randomIndex,index,animalCount);	
	// 	}
	// 	else if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
	// 	{ 	
	// 		printInitialEnergyLevel(animalList,index,randomIndex);
	// 		animalCount = fightOfEqualStregth(animalList,index,randomIndex,animalCount);
	// 		printNewEnergyLevel(animalList,index,randomIndex);		
	// 	}
	// 	return animalCount;
	// }
	// public int defeated(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	// {
	// 	printInitialEnergyLevel(animalList,index,randomIndex);
	// 	System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
	// 	System.out.println(animalList.get(index).getAnimalName()+" Defeated "+animalList.get(randomIndex).getAnimalName());
	// 	animalCount = changeEnergy(animalList,index,randomIndex,animalCount);
	// 	printNewEnergyLevel(animalList,index,randomIndex);
	// 	return animalCount;
	// } 




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
		printInitialEnergyLevel(animalList,index,randomIndex);
		printNewEnergyLevel(animalList,index,randomIndex);
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
		System.out.println("No Fight Between Them");		
	}
	
	public int fightBetweenCarnivores(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int distance = calculateDistance(animalList,index,randomIndex,animalCount);
		if(distance<50)
		{
			animalCount = checkStrength(animalList,index,randomIndex,animalCount);
		}
		else
		{
			noFight(animalList,index,randomIndex);	
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
		else 
		{
			noFight(animalList,index,randomIndex);		
		}
		return animalCount;
	}
	public int checkCarnivoresHerbivoresStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int position1,position2;
		if (animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Carnivores) 
		{
			position1  = index;
			position2  = randomIndex;
			animalCount = carnivoresVsHerbivoresFight(animalList,position1,animalCount,position2);
				
		}
		else if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Herbivores) 
		{
			position1  = randomIndex;
			position2 = index;
			animalCount = carnivoresVsHerbivoresFight(animalList,position1,animalCount,position2);	
				
		}
		return animalCount;
	}
	public int carnivoresVsHerbivoresFight(ArrayList<Animal> animalList,int position1,int animalCount,int position2)
	{	
		int n = randomNumber();
		if(n<5) 
		{
			printInitialEnergyLevel(animalList,position1,position2);
			ranAway(animalList,position1,position2,animalCount);	
		}
		else if(n>10&&animalList.get(position1).getAnimalStrength()>6)
		{
			animalCount = checkStrength(animalList,position1,position2,animalCount);
		}
		else if(n>10&&animalList.get(position1).getAnimalStrength()<6)
		{
			animalCount = directAttack(animalList,position1,position2,animalCount);
			printNewEnergyLevel(animalList,position1,position2);
			
		}
		else
		{
			animalCount = directAttack(animalList,position1,position2,animalCount);
			printNewEnergyLevel(animalList,position1,position2);
	
		}
		return animalCount;
	}
	public int checkStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
		{ 
			animalCount = animalOneOfGreaterStrength(animalList,index,randomIndex,animalCount);		
		}
		else if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
		{
			animalCount = animaltwoOfGreaterStrength(animalList,index,randomIndex,animalCount); 
		}
		else
		{
			animalCount = fightOfEqualStrength(animalList,index,randomIndex,animalCount);		
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
		if(energyOne!=0)
		{
			energyOne = energyOne-energyLevel.getEnergyParamOfOne();
			animalList.get(index).setAnimalStrength(energyOne);
		}
		if(energyTwo!=0)
		{
			energyTwo = energyTwo-energyLevel.getEnergyParamOfTwo();
			animalList.get(randomIndex).setAnimalStrength(energyTwo);	
		}
	}
	public int aliveOrNot(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int energyOne = animalList.get(index).getAnimalStrength();
		int energyTwo = animalList.get(randomIndex).getAnimalStrength();
		if(energyOne==0)
		{
			animalList.get(index).setIsAlive(false);
			animalCount--;
		}
		if(energyTwo==0)
		{
			animalList.get(randomIndex).setIsAlive(false);
			animalCount--;
		}
		return animalCount;
	}
	public int animalOneOfGreaterStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		printInitialEnergyLevel(animalList,index,randomIndex); 
		System.out.println(animalList.get(index).getAnimalName()+" Defeated "+animalList.get(randomIndex).getAnimalName());
		changeEnergy(animalList,index,randomIndex,animalCount);
		animalCount = aliveOrNot(animalList,index,randomIndex,animalCount);
		printNewEnergyLevel(animalList,index,randomIndex);
		return animalCount;
	}
	public int animaltwoOfGreaterStrength(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Vs "+animalList.get(randomIndex).getAnimalName());
		printInitialEnergyLevel(animalList,index,randomIndex);
		System.out.println(animalList.get(randomIndex).getAnimalName()+" Defeated "+animalList.get(index).getAnimalName());
		changeEnergy(animalList,index,randomIndex,animalCount);
		animalCount = aliveOrNot(animalList,index,randomIndex,animalCount);
		printNewEnergyLevel(animalList,index,randomIndex);
		return animalCount;
	}
	public void ranAway(ArrayList<Animal> animalList,int position1,int position2,int animalCount)
	{	
		int index = position1;
		System.out.println(animalList.get(position1).getAnimalName()+" RanAway\n");
		printNewEnergyLevel(animalList,position1,position2);
	}
	public int directAttack(ArrayList<Animal> animalList,int position1,int position2,int animalCount)
	{
		if(animalList.get(position1) instanceof Herbivores)
		{	
			printInitialEnergyLevel(animalList,position1,position2);
			System.out.println(animalList.get(position1).getAnimalName()+" Directly killed\n");
			// animalList.get(position).setIsAlive(false);
			// animalCount--;	
			animalCount = aliveOrNot(animalList,position1,position2,animalCount);
		}	
		else if (animalList.get(position1) instanceof Herbivores) 
		{
			printInitialEnergyLevel(animalList,position1,position2);
			System.out.println(animalList.get(position1).getAnimalName()+" Directly killed\n");
			// animalList.get(position).setIsAlive(false);
			// animalCount--;
			animalCount = aliveOrNot(animalList,position1,position2,animalCount);
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