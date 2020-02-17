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
			if(animalList.get(index).getIsAlive()==true && animalList.get(randomIndex).getIsAlive()==true)
				{
					if (index!=randomIndex) 
					{
						if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Herbivores)
						{
							noFight(animalList,index,randomIndex);
						}
						else if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores) 
						{
							animalCount = fightEachOther(animalList,index,randomIndex,animalCount);	
						}
						else if(animalList.get(index) instanceof Herbivores && animalList.get(randomIndex) instanceof Carnivores)
						{
							animalCount = fightEachOther(animalList,index,randomIndex,animalCount);
						}
						else if(animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Herbivores) 
						{
							animalCount = fightEachOther(animalList,index,randomIndex,animalCount);
						}
					}
					else
					{
						System.out.println(animalList.get(index).getAnimalName()+" and "+animalList.get(randomIndex).getAnimalName());
						System.out.println("Same index dont Fight together");
					}	
				}
				else
				{
					animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);	
				}							
		}while(animalCount>1);
		for(int i=0;i<animalCount;i++)
		{
			if(animalList.get(i).getIsAlive() == true)
			{
				System.out.println(animalList.get(i).getAnimalName()+" = "+animalList.get(i).getAnimalStrength() +" Survived...");	
			}
		}
		
	}
	public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
		System.out.println(animalList.get(index).getAnimalName()+" = "+animalList.get(index).getAnimalStrength());
		System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+animalList.get(randomIndex).getAnimalStrength());
		System.out.println(" No Fight");
		System.out.println(" ");	
	}	
	public int fightEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{	
		if(animalList.get(index) instanceof Carnivores&&animalList.get(randomIndex) instanceof Carnivores)
		{
			if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength())
			{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println("Both Fighting Each Other");
			System.out.println(animalList.get(randomIndex).getAnimalName() +" Wins");
			animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);
			System.out.println(animalList.get(index).getAnimalName()+" = "+animalList.get(index).getAnimalStrength());
			System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+animalList.get(randomIndex).getAnimalStrength());
			}
			else if(animalList.get(index).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength())
			{	
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println("Both Fighting Each Other");
			System.out.println(animalList.get(index).getAnimalName() +" Wins");
			animalCount = changeEnergyLevel(animalList,index,randomIndex,animalCount);
			System.out.println(animalList.get(index).getAnimalName()+" = "+animalList.get(index).getAnimalStrength());
			System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+animalList.get(randomIndex).getAnimalStrength());

			}	
		}
		else if(animalList.get(index) instanceof Herbivores || animalList.get(randomIndex) instanceof Carnivores) 
		{
			boolean luck = ((Herbivores)animalList.get(index)).luckFactor();
			if(animalList.get(index) instanceof Herbivores)
			{
				if(luck == true)
				{
					ranAway(animalList,index,randomIndex,animalCount);				
				}
			}
			else if(animalList.get(randomIndex) instanceof Carnivores) 
			{
				if(luck == true)
				{
					ranAway(animalList,index,randomIndex,animalCount);				
				}
			}
		}
		
		return animalCount;
	}

	public  void ranAway (ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		if(animalList.get(index) instanceof Herbivores)
		{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(index).getAnimalName() +" Ran Away");
		}
		else if (animalList.get(randomIndex) instanceof Herbivores) 
		{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(randomIndex).getAnimalName() +" Ran Away");	
		}
	}
	
	public int changeEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int strength1 = animalList.get(index).getAnimalStrength();
		int strength2 = animalList.get(randomIndex).getAnimalStrength();
		if(strength1<=0 )
		{
			animalList.get(index).setIsAlive(false);
			animalCount--;
		}
		else
		{
			strength1 = strength1 - 1;
			animalList.get(index).setAnimalStrength(strength1);
		}

		if(strength2<=0)
		{
			animalList.get(randomIndex).setIsAlive(false);
			animalCount--;	
		}
		else 
		{
			strength2 = strength2 - 2;
			animalList.get(randomIndex).setAnimalStrength(strength2);	
		}
		return animalCount;
	}
}























