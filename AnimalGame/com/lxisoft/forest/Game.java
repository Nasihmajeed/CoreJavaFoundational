package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.*;
import java.util.Random;
import java.lang.Math;
public class Game
{
	public void playGame(ArrayList<Animal> animalList)
	{		
		System.out.println("\t\tGAME STARTS");
		int animalCount = animalList.size();
		do
		{
			Random random = new Random();
			int index = random.nextInt(animalList.size());
			int randomIndex = random.nextInt(animalList.size());
			if (animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true) 
			{
				if(index!=randomIndex)
				{
					animalCount = doOrDie(animalList,index,randomIndex,animalCount);
				}
			}
		}while(animalCount>1);
		printSurvivedAnimal(animalList);
	}
	public int doOrDie(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Herbivores)
		{
			noFight(animalList,index,randomIndex);
		}
		else
		{
		 	animalCount = fightEachOther(animalList,index,randomIndex,animalCount);
		}
		return animalCount;		
	}
	public int fightEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{	
			animalCount = checkCoordinate(animalList,index,randomIndex,animalCount);
			//animalCount = fightBtwSameSpecies(animalList,index,randomIndex,animalCount);
		}
		else
		{
			animalCount = checkCoordinate(animalList,index,randomIndex,animalCount);
			//animalCount = fightBtwDiffSpecies(animalList,index,randomIndex,animalCount);	
		}
		return animalCount;
	}




	public int checkCoordinate(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores)
		{
			animalCount = distBtwCoordinate(animalList,index,randomIndex,animalCount);
		}
		else if(animalList.get(randomIndex) instanceof Carnivores)
		{
			animalCount = distBtwCoordinate(animalList,index,randomIndex,animalCount);
		}	
		return animalCount;
	}
	public int distBtwCoordinate(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Herbivores)
		{	
			int distance = calculateDistnce(animalList,index,randomIndex,animalCount);
			if(distance<20 )
			{
				animalCount = fightBtwDiffSpecies(animalList,index,randomIndex,animalCount);	
			}
		}
		else if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Carnivores) 
		{
			int distance = calculateDistnce(animalList,index,randomIndex,animalCount);
			if(distance<20)
			{
				animalCount = fightBtwDiffSpecies(animalList,index,randomIndex,animalCount);	
			}
		}
		else
		{
			animalCount = fightBtwSameSpecies(animalList,index,randomIndex,animalCount);		
		}
		return animalCount;
	}
	public int calculateDistnce(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
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
	public void printSurvivedAnimal(ArrayList<Animal> animalList)
	{
		for (int i=0;i<animalList.size();i++ ) 
		{
			if(animalList.get(i).getIsAlive() == true)
			{
				System.out.println(animalList.get(i).getAnimalName()+" Survived");
			}	
		}
	}
	public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
		System.out.println("No Fight");		
	}	
	public int fightBtwSameSpecies(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{
			if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
			{
				System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
				System.out.println(animalList.get(index).getAnimalName()+" Wins");
				animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);
				printNewEnergyLevel(animalList,index,randomIndex);
			}
			else
			{
				System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
				System.out.println(animalList.get(randomIndex).getAnimalName()+" Wins");
				animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);
				printNewEnergyLevel(animalList,index,randomIndex);	
			}
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
			if(animalList.get(index) instanceof Herbivores && animalList.get(index).getAnimalStrength()<5)
			{
				System.out.println(animalList.get(index).getAnimalName() + " meets  "+ animalList.get(randomIndex).getAnimalName());
				animalCount =  directAttack(animalList,index,randomIndex,animalCount);
			}
			else if (animalList.get(randomIndex) instanceof Herbivores && animalList.get(randomIndex).getAnimalStrength()<5) 
			{
				System.out.println(animalList.get(index).getAnimalName() + " meets  "+ animalList.get(randomIndex).getAnimalName());
				animalCount =  directAttack(animalList,index,randomIndex,animalCount);			
			}
			else
			{
				animalCount = diffSpeciesFightWin(animalList,index,randomIndex,animalCount);
			}		
		}
		return animalCount;	
	}
	public int diffSpeciesFightWin(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Carnivores)
		{
			System.out.println(animalList.get(index).getAnimalName() + " meets  "+ animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(index).getAnimalName() + " WIns ");
			animalCount =  changeEnergyLevel(animalList,index,randomIndex,animalCount);
		}
		else if (animalList.get(randomIndex) instanceof Carnivores) 
		{
			System.out.println(animalList.get(index).getAnimalName() + " meets  "+ animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(randomIndex).getAnimalName() + " WIns ");
			animalCount =  changeEnergyLevel(animalList,index,randomIndex,animalCount);	
		}
		return animalCount;
	}
	public void printNewEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println("---Strength After Fighting---");
		System.out.println(animalList.get(index).getAnimalName()+" = "+animalList.get(index).getAnimalStrength());
		System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+animalList.get(randomIndex).getAnimalStrength());			
	}
	public int directAttack(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores)
		{	
			System.out.println(animalList.get(index).getAnimalName()+" Directly killed ");
			animalList.get(index).setIsAlive(false);
			animalCount--;	
		}	
		else if (animalList.get(randomIndex) instanceof Herbivores) 
		{
			System.out.println(animalList.get(randomIndex).getAnimalName()+" Directly killed ");
			animalList.get(randomIndex).setIsAlive(false);
			animalCount--;
		}
		return animalCount;
	}
	public void ranAway(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores)
		{
			System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
			escape(animalList,index);
		}	
		else if (animalList.get(randomIndex) instanceof Herbivores) 
		{
			System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
			escape(animalList,randomIndex);
		}
	}
	public void escape(ArrayList<Animal> animalList,int index)
	{	
		System.out.println(animalList.get(index).getAnimalName()+"RanAway");		
	}
	public boolean luckFactor()
	{
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
	}		
	public int changeEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
			int energyOne = animalList.get(index).getAnimalStrength();
			int energyTwo = animalList.get(randomIndex).getAnimalStrength();
			if(energyOne<=0)
			{	
				animalList.get(index).setIsAlive(false);
				animalCount--;
			}
			else
			{
				energyOne =  energyOne - 1;
				animalList.get(index).setAnimalStrength(energyOne);
			}
			if(energyTwo<=0)
			{	
				animalList.get(randomIndex).setIsAlive(false);
				animalCount--;
			}
			else
			{
				energyTwo =  energyTwo - 2;
				animalList.get(randomIndex).setAnimalStrength(energyTwo);
			}
			return animalCount;
	}
		
}		