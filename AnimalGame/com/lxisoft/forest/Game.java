package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.ArrayList;
import java.util.Random;
public class Game
{
	public void playGame(ArrayList<Animal> animalList)
	{
		Random random = new Random();		
		for(int i = 0;i<animalList.size();i++)
		{
			animalList.get(i).setIsAlive(true);	
		}
		System.out.println("\t\tGAME STARTS");
		int index;
		do
		{
	       	int	randomIndex = random.nextInt(animalList.size());
	       	int i=0;
	       	index = i;	
	       	System.out.println("randomIndex="+randomIndex);
	       	System.out.println("Index ="+index);
			
			if(animalList.get(index).getIsAlive() == animalList.get(randomIndex).getIsAlive())
			{
				System.out.println("In isalive method");			
			}
			else if(animalList.get(index).getIsAlive() != animalList.get(randomIndex).getIsAlive()) 
			{
				System.out.println("In notIsalive method");
			}

			index++;

		}while(index<=animalList.size()); 


	}
	public ArrayList<Animal> setAliveOrNot(ArrayList<Animal> animalList,int randomIndex,int index)
	{	
		changeEnergyLevel(animalList,randomIndex,index);
		if(animalList.get(index).getAnimalStrength() == 0)
		{
			animalList.get(index).setIsAlive(false);
		}			
		else if (animalList.get(randomIndex).getAnimalStrength() == 0) 
		{
			animalList.get(randomIndex).setIsAlive(false);
		}

		return animalList;
	}

	public ArrayList<Animal> fightBtwEqStrength(ArrayList<Animal> animalList,int randomIndex,int index)
	{
		setAliveOrNot(animalList,randomIndex,index);
		if(randomIndex == index)
		{
			if(animalList.get(index).getIsAlive() == animalList.get(randomIndex).getIsAlive())
			{
				if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
				{
					System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
					System.out.println("Fight between Equal Strength");
					int strength = animalList.get(index).getAnimalStrength();
					strength = strength -1;
					animalList.get(index).setAnimalStrength(strength);		
				}		
			}
			else if (animalList.get(index).getIsAlive() != animalList.get(randomIndex).getIsAlive())
			{ 
				if(animalList.get(index).getIsAlive() == false)
				{
					System.out.println("Not Alive");
				}
				else if (animalList.get(randomIndex).getIsAlive()) 
				{
					System.out.println("Not Alive");			
				}		
			}	
		}
		else if (randomIndex != index) 
		{
			if(animalList.get(index).getIsAlive() == animalList.get(randomIndex).getIsAlive())
			{
				if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
				{
					System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
					System.out.println("Fight between Equal Strength");
					int strength = animalList.get(index).getAnimalStrength();
					strength = strength -1;
					animalList.get(index).setAnimalStrength(strength);		
				}		
			}
			else if (animalList.get(index).getIsAlive() != animalList.get(randomIndex).getIsAlive())
			{ 
				if(animalList.get(index).getIsAlive() == false)
				{
					System.out.println("Not Alive");
				}
				else if (animalList.get(randomIndex).getIsAlive()) 
				{
					System.out.println("Not Alive");			
				}		
			}		
		}
		return animalList;
	}
	public ArrayList<Animal> fightBtwDiffStrength(ArrayList<Animal> animalList,int randomIndex,int index)
	{
		
		if(animalList.get(index).getIsAlive() == animalList.get(randomIndex).getIsAlive())
		{
			changeEnergyLevel(animalList,randomIndex,index);			
		}
		else if (animalList.get(index).getIsAlive() != animalList.get(randomIndex).getIsAlive()) 
		{
			if(animalList.get(index).getIsAlive() == false )
			{
				System.out.println("Not Alive");
			}		
			else if (animalList.get(randomIndex).getIsAlive() == false)
			{
				System.out.println("Not Alive");
			}
		}
		return animalList;
	}

	public ArrayList<Animal> changeEnergyLevel(ArrayList<Animal> animalList,int randomIndex,int index)
	{
		if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
		{
			int strength = animalList.get(index).getAnimalStrength();
			strength = strength -1;
			animalList.get(index).setAnimalStrength(strength);
		}
		else if (animalList.get(index).getAnimalStrength() != animalList.get(randomIndex).getAnimalStrength()) 
		{
			if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
			{
				int strength1 = animalList.get(index).getAnimalStrength();
				int strength2 = animalList.get(randomIndex).getAnimalStrength();
				strength1 = strength1 -2;
				strength2 = strength2 -3;
				animalList.get(index).setAnimalStrength(strength1);
				animalList.get(randomIndex).setAnimalStrength(strength2);	
			}
			else if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
			{
				int strength1 = animalList.get(index).getAnimalStrength();
				int strength2 = animalList.get(randomIndex).getAnimalStrength();
				strength1 = strength1 -3;
				strength2 = strength2 -2;
				animalList.get(index).setAnimalStrength(strength1);
				animalList.get(randomIndex).setAnimalStrength(strength2);	
			}	
		}
		return animalList;
	}

}





























		// for(int i=0;i<animalList.size();i++)
		// {
		// 	int randomIndex = random.nextInt(animalList.size());
		// 	System.out.println("randomIndex = "+randomIndex);
		// 	int index = i;
		// 	if(animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true)
		// 	{
		// 		if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
		// 		{
		// 			System.out.println("foo121");
		// 			System.out.println(animalList.get(index).getAnimalName() +" meets "+animalList.get(randomIndex).getAnimalName());
		// 			System.out.println("Fight between Equal Strength");
		// 			int strength = animalList.get(index).getAnimalStrength();
		// 			strength = strength - 1;
		// 		}	
		// 		else if (index != randomIndex) 
		// 		{
		// 			if(animalList.get(index).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength())
		// 			{
		// 				System.out.println("foo");
		// 				System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
		// 				System.out.println(animalList.get(index).getAnimalName()+" wins");
		// 				int strengthOne = animalList.get(index).getAnimalStrength();
		// 				strengthOne = strengthOne -2;
		// 				System.out.println(animalList.get(index).getAnimalName() +" = "+ strengthOne);
		// 				int strengthTwo = animalList.get(randomIndex).getAnimalStrength();
		// 				strengthTwo = strengthTwo-3;
		// 				System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+strengthTwo);
		// 				int newindex = index;
		// 				if(animalList.get(newindex).getAnimalStrength())
		// 				{

		// 				}
		// 			}
		// 			else if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength()) 
		// 			{
		// 				System.out.println("foo00");
		// 				System.out.println(animalList.g
		// 					et(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
		// 				System.out.println(animalList.get(randomIndex).getAnimalName()+" wins");
		// 				int strengthOne = animalList.get(index).getAnimalStrength();
		// 				strengthOne =strengthOne -3;
		// 				System.out.println(animalList.get(index).getAnimalName() + " = "+ strengthOne);
		// 				int strengthTwo = animalList.get(randomIndex).getAnimalStrength();
		// 				strengthTwo =strengthTwo -2;
		// 				System.out.println(animalList.get(randomIndex).getAnimalName()+" = "+strengthTwo);
		// 				if(animalList.get(index).getAnimalStrength() == 0)
		// 				{
		// 					animalList.get(index).setIsAlive(false);
		// 					System.out.println("ANIMAL "+animalList.get(index).getAnimalName() + " is dead " );
		// 				}
		// 				else if (animalList.get(randomIndex).getAnimalStrength() == 0) 
		// 				{
		// 					animalList.get(randomIndex).setIsAlive(false);
		// 					System.out.println("ANIMAL "+animalList.get(randomIndex).getAnimalName() + " is dead ");	
		// 				}	
		// 			}
		// 		}
		// 	}
		// 	else
		// 	{
		// 		continue;
		// 	}	
		// }
	
			
































		// 	int index = i;
		// 	if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength() || animalList.get(randomIndex).getAnimalStrength() < animalList.get(index).getAnimalStrength())
		// 	{
		// 		if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength())
		// 		{
		// 			System.out.println(animalList.get(index).getAnimalName()+" meets "+ animalList.get(randomIndex).getAnimalName());
		// 			System.out.println(animalList.get(randomIndex).getAnimalName()+" wins ");
		// 			animalList.remove(index);
		// 			System.out.println(animalList.get(index).getAnimalName()+" removed from forest ");
		// 			index = randomIndex;
		// 			int newRandomIndex = random.nextInt(animalList.size());
		// 			while (randomIndex!=newRandomIndex) 
		// 			{
		// 				if(animalList.get(index).getAnimalStrength() < animalList.get(newRandomIndex).getAnimalStrength() || animalList.get(newRandomIndex).getAnimalStrength() < animalList.get(index).getAnimalStrength())
		// 				{	
		// 					System.out.println(animalList.get(index).getAnimalName()+" meets "+ animalList.get(newRandomIndex).getAnimalName());
		// 					System.out.println(animalList.get(newRandomIndex).getAnimalName()+" wins ");
		// 					animalList.remove(index);
		// 					index = newRandomIndex;
		// 					newRandomIndex = random.nextInt(animalList.size());
		// 				}	
		// 			}
					
		// 		}

		// 	}		
		// }


