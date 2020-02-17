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

		public int fightEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
		{	
			if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores)
			{	
				animalCount = fightBtwSameSpecies(animalList,index,randomIndex,animalCount);
			}
			else
			{
				animalCount = fightDiffSpecies(animalList,index,randomIndex,animalCount);	
			}
			return animalCount;
		}
	
		public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
		{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println("No Fight");			
		}
		public void ranAway(ArrayList<Animal> animalList,int index,int randomIndex)
		{
			if(animalList.get(index) instanceof Herbivores)
			{	
				boolean luck  = luckFactor();
				if(luck == true)
				{
				System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
				System.out.println(animalList.get(index).getAnimalName()+" Ran away ");		
				}	
			}
			else if(animalList.get(randomIndex) instanceof Herbivores) 
			{
				boolean luck = luckFactor();
				if(luck == true)
				{
					System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
					System.out.println(animalList.get(randomIndex).getAnimalName()+" Ran away ");	
				}
			}			
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
				}
				else
				{
					System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
					System.out.println(animalList.get(randomIndex).getAnimalName()+" Wins");
					animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);	
				}
			}
			return animalCount;
		}
		public int fightDiffSpecies(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
		{	
			boolean escape = runAwayLuck();
			if(escape == true)
			{
				ranAway(animalList,index,randomIndex);
			}
			else 
			{
				suddenKill(animalList,index,randomIndex,animalCount);
			}

			return animalCount;	
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
		public int suddenKill(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
		{
			if(animalList.get(index)instanceof Carnivores && animalList.get(randomIndex).getAnimalStrength()<5)
			{
				System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
				System.out.println(animalList.get(index).getAnimalName()+" kills "+animalList.get(randomIndex).getAnimalName());
				animalList.get(randomIndex).setIsAlive(false);
				animalCount--;
			}
			else if( animalList.get(randomIndex)instanceof Carnivores && animalList.get(index).getAnimalStrength()<5)
			{
				System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
				System.out.println(animalList.get(randomIndex).getAnimalName()+" kills "+animalList.get(index).getAnimalName());
				animalList.get(index).setIsAlive(false);
				animalCount--;
			}
			return animalCount;
		}
		public boolean runAwayLuck()
		{
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
		}
		public boolean luckFactor()
		{	
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
		}
}		