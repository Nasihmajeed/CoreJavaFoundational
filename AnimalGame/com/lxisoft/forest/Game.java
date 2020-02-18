package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.*;
import java.util.Random;
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
	public void checkCoordinate(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores && animalList.get(index) instanceof Carnivores)
		{

		}
		else if(animalList.get(index) instanceof Carnivores && animalList.get(index) instanceof Herbivores)
		{

		}	
	}
	public void distBtwCoordinate(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores)
		{
			int x = animalList.get(index).getX();
			int y = animalList.get(index).getY();

		}
	}
	public void checkDistnce(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
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
	public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
		System.out.println("No Fight");		
	}
	public int fightEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
		{	
			animalCount = fightBtwSameSpecies(animalList,index,randomIndex,animalCount);
		}
		else
		{
			animalCount = fightBtwDiffSpecies(animalList,index,randomIndex,animalCount);	
		}
		return animalCount;
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