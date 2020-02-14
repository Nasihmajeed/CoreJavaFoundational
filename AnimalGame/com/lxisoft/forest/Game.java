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
			//System.out.println(animalList.size());
			if(animalList.get(index).getIsAlive()==true && animalList.get(randomIndex).getIsAlive()==true)
				{
					if (index!=randomIndex) 
					{
						if ((animalList.get(index)) instanceof Herbivores && (animalList.get(randomIndex)) instanceof Herbivores) 
						{	
							noFight(animalList,index,randomIndex);	
						}
						else if (animalList.get(index) instanceof Carnivores && animalList.get(randomIndex) instanceof Carnivores) 
						{
							animalCount = fightEachOther(animalList,index,randomIndex,animalCount);	
						}
						else if (animalList.get(index) instanceof Carnivores || animalList.get(randomIndex) instanceof Herbivores) 
						{
							animalCount = fightEachOther(animalList,index,randomIndex,animalCount);	
						}
					}
				}	
		}while(animalCount>1);
		for(int i=0;i<animalList.size();i++)
		{
			if(animalList.get(i).getIsAlive() == true)
			{
				System.out.println(animalList.get(i).getAnimalName()+" Survived...");	
			}
		}
		
	}
	public void noFight(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
		System.out.println(" No Fight Between Them, Because They Belongs To Herbivores");
		System.out.println(" ");	
	}	
	public void runAway(ArrayList<Animal> animalList,int index,int randomIndex)
	{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(index).getAnimalName()+" Run away");	
			System.out.println(" ");
	}
	public int fightEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{		boolean flag =  luckFactor();
			if(flag == true)
			{
				System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
				System.out.println(animalList.get(randomIndex).getAnimalName()+" Runaway");
				System.out.println(" ");
			}
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(index).getAnimalName()+" Wins ");
			int n = changeEnergyLevel(animalList,index,randomIndex,animalCount);
			System.out.println(" ");			
			return n;
	}
	public int changeEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		// System.out.println("index="+index);
		// System.out.println("randomIndex="+randomIndex);
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

	public boolean luckFactor()
	{
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
	} 
}























