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
		for(int i=0;i<animalList.size();i++)
		{
			int randomIndex = random.nextInt(animalList.size());
			index = i;
			if(animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true)
			{
				if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
				{
					System.out.println(animalList.get(index).getAnimalName() +" meets " );
					System.out.println("Fight between Equal Strength");
					animalList.get(index).getAnimalStrength()-1;
				}	
				else if (index != randomIndex) 
				{
					if(animalList.get(index).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength())
					{
						System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
						System.out.println(animalList.get(index).getAnimalName()+" wins");
						int strengthOne = animalList.get(index).getAnimalStrength;
						strengthOne = strengthOne -2;
						int strengthTwo = animalList.get(randomIndex).getAnimalStrength;
						strengthTwo = strengthTwo-3;
						continue;
					}
					else if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength()) 
					{
						System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
						System.out.println(animalList.get(randomIndex).getAnimalName()+" wins");
						animalList.get(index).getAnimalStrength-3;
						animalList.get(randomIndex).getAnimalStrength-2;
						continue;	
					}
				}
			}
			else
			{
				continue;
			}	
		}
	}
}				






























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


