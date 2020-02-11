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
		int	randomIndex;
		int index;

		do
		{
	        randomIndex = random.nextInt(animalList.size());
	       	index = random.nextInt(animalList.size());	
			if(animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive() == true)
			{
				if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
				{
					fightBtwEqStrength(animalList,randomIndex,index);						
				}
				else if (animalList.get(index).getAnimalStrength() != animalList.get(randomIndex).getAnimalStrength()) 
				{
					fightBtwDiffStrength(animalList,randomIndex,index);
				}
									
			}
			else if(animalList.get(index).getIsAlive() != animalList.get(randomIndex).getIsAlive()) 
			{
				setAliveOrNot(animalList,randomIndex,index);			
			}
			else if (animalList.get(index).getIsAlive() == false && animalList.get(randomIndex).getIsAlive() == false) 
			{
				for(int i = 0;i<animalList.size();i++)
				{
					if(animalList.get(i).getIsAlive()  == true )
					{
						System.out.println(animalList.get(i).getAnimalName() +" Alive");
					}
				}
			}


		}while(true); 


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
		if(randomIndex == index)
		{
			System.out.println("inside fightBtwEqStrength");
			System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println("Fight between Equal Strength");
			changeEnergyLevel(animalList,randomIndex,index);	
			System.out.println("index="+animalList.get(index).getAnimalStrength());
			System.out.println("randomIndex="+animalList.get(randomIndex).getAnimalStrength());		
		}
		else if (randomIndex != index) 
		{
			System.out.println("inside fightBtwEqStrength");
			System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println("Fight between Equal Strength");
			changeEnergyLevel(animalList,randomIndex,index);
			System.out.println("index="+animalList.get(index).getAnimalStrength());
			System.out.println("randomIndex="+animalList.get(randomIndex).getAnimalStrength());			
		}		
		return animalList;
	}
	public ArrayList<Animal> fightBtwDiffStrength(ArrayList<Animal> animalList,int randomIndex,int index)
	{
		if(randomIndex == index)
		{
			System.out.println("inside fightBtwDiffStrength");
			System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println("Fight between Equal Strength");
			changeEnergyLevel(animalList,randomIndex,index);
			System.out.println("index="+animalList.get(index).getAnimalStrength());
			System.out.println("randomIndex="+animalList.get(randomIndex).getAnimalStrength());					
		}
		else if (randomIndex != index) 
		{	
			System.out.println("inside fightBtwDiffStrength");
			System.out.println(animalList.get(index).getAnimalName()+" meets "+animalList.get(randomIndex).getAnimalName());
			changeEnergyLevel(animalList,randomIndex,index);	
			System.out.println("index="+animalList.get(index).getAnimalStrength());
			System.out.println("randomIndex="+animalList.get(randomIndex).getAnimalStrength());	
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
			if(animalList.get(index).getAnimalStrength() == 0)
				{	
					System.out.println("Animal Is in critical situation");
					setAliveOrNot(animalList,randomIndex,index);
					if(animalList.get(index).getIsAlive() == false)
					{
						System.out.println("Animal Dead");
					}
				}
				else if (animalList.get(randomIndex).getAnimalStrength() == 0) 
				{
					System.out.println("Animal Is in critical situation");
					setAliveOrNot(animalList,randomIndex,index);
					if(animalList.get(randomIndex).getIsAlive() == false)
					{
						System.out.println("Animal Dead");
					}		
				}
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
				if(animalList.get(index).getAnimalStrength() == 0)
				{	
					System.out.println("Animal Is in critical situation");
					setAliveOrNot(animalList,randomIndex,index);
					if(animalList.get(index).getIsAlive() == false)
					{
						System.out.println("Animal Dead");
					}
				}
				else if (animalList.get(randomIndex).getAnimalStrength() == 0) 
				{
					System.out.println("Animal Is in critical situation");
					setAliveOrNot(animalList,randomIndex,index);
					if(animalList.get(randomIndex).getIsAlive() == false)
					{
						System.out.println("Animal Dead");
					}		
				}	
			}
			else if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
			{
				int strength1 = animalList.get(index).getAnimalStrength();
				int strength2 = animalList.get(randomIndex).getAnimalStrength();
				strength1 = strength1 -3;
				strength2 = strength2 -2;
				animalList.get(index).setAnimalStrength(strength1);
				animalList.get(randomIndex).setAnimalStrength(strength2);
				if(animalList.get(index).getAnimalStrength() == 0)
				{	
					System.out.println("Animal Is in critical situation");
					setAliveOrNot(animalList,randomIndex,index);
					if(animalList.get(index).getIsAlive() == false)
					{
						System.out.println("Animal Dead");
					}
				}
				else if (animalList.get(randomIndex).getAnimalStrength() == 0) 
				{
					System.out.println("Animal Is in critical situation");
					setAliveOrNot(animalList,randomIndex,index);
					if(animalList.get(randomIndex).getIsAlive() == false)
					{
						System.out.println("Animal Dead");
					}		
				}	
			}	
		}
		return animalList;
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


