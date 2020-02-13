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
			if(index!=randomIndex)
			{
				if(animalList.get(index).getIsAlive() == true && animalList.get(randomIndex).getIsAlive()== true)
				{
					if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
					{	
						if(index==randomIndex)
						{
							noFight(animalList,index,randomIndex);	
						}		
					}
					else if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength()) 
					{
						runAway(animalList,index,randomIndex);		
					}						
					else if(animalList.get(index).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength()) 
					{
					 fightEachOther(animalList,index,randomIndex,animalCount);
					 continue;	 
					}
				}	
			}	
		}while(animalCount>=0);

		for(int i=0;i<animalList.size();i++)
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
		System.out.println(" No Fight Between Them");
		System.out.println(" ");	
	}	
	public void runAway(ArrayList<Animal> animalList,int index,int randomIndex)
	{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(index).getAnimalName()+" Run away");	
			System.out.println(" ");
	}
	public int fightEachOther(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
			System.out.println(animalList.get(index).getAnimalName()+" Wins ");
			int n = changeEnergyLevel(animalList,index,randomIndex,animalCount);
			System.out.println(" ");		
			return n;
	}
	public int changeEnergyLevel(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
	
		int strength1 = animalList.get(index).getAnimalStrength();
		if(strength1<=0)
		{
			animalList.get(index).setIsAlive(false);
			animalCount--;
		}
		else
		{
			strength1 = strength1 - 1;
			animalList.get(index).setAnimalStrength(strength1);			
		}
		
		int strength2 = animalList.get(randomIndex).getAnimalStrength();

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


















// 	public int fightOrRunAway(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
// 	{		
// 		if(animalList.get(index).getAnimalStrength()==animalList.get(randomIndex).getAnimalStrength())
// 		{
// 			if(index != randomIndex)
// 			{
// 				fightOfEqualStrength(animalList,index,randomIndex,animalCount);			
// 			}
// 		}
// 		if(animalList.get(index).getAnimalStrength()>animalList.get(randomIndex).getAnimalStrength())
// 		{
// 			fightOfUnEqualStrength(animalList,randomIndex,index,animalCount);
// 		}
// 		if(animalList.get(index).getAnimalStrength()<animalList.get(randomIndex).getAnimalStrength())
// 		{
// 			System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 			System.out.println(animalList.get(index).getAnimalName()+" Runaway");	
// 		}	
// 		return animalCount;
// 	}
// 	public int fightOfEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index,int animalCount)
// 	{	
// 		if(animalList.get(index).getAnimalStrength()<=0)
// 		{
// 			animalCount--;
// 		}
// 		else
// 		{
// 		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 		System.out.println("Fight between Equal Strength ");
// 		int strength1 = animalList.get(index).getAnimalStrength();
// 		strength1 = strength1 -1;
// 		System.out.println(strength1);
// 		animalList.get(index).setAnimalStrength(strength1); 
// 		}
// 		return animalCount;
// 	}
// 	public int fightOfUnEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index,int animalCount)
// 	{
// 		if(animalList.get(index).getAnimalStrength()<=0 || animalList.get(randomIndex).getAnimalStrength()<=0)
// 		{
// 			animalCount--;	
// 		}
// 		else
// 		{
// 		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 		System.out.println(animalList.get(index).getAnimalName()+" Wins");
// 		int strength1 = animalList.get(index).getAnimalStrength();
// 		int strength2 = animalList.get(randomIndex).getAnimalStrength();
// 		strength1 = strength1 -1;
// 		strength2 = strength2 -2;
// 		System.out.println(strength1);
// 		System.out.println(strength2);
// 		animalList.get(index).setAnimalStrength(strength1); 		
// 		animalList.get(randomIndex).setAnimalStrength(strength2); 
// 		}
// 		return animalCount;		
// 	}
// }



























// package com.lxisoft.forest;
// import com.lxisoft.forest.*;
// import java.util.ArrayList;
// import java.util.Random;
// public class Game
// {
// 	public void playGame(ArrayList<Animal> animalList)
// 	{		
// 		System.out.println("\t\tGAME STARTS");
// 		animalFight(animalList);		

// 	}
// 	public void animalFight(ArrayList<Animal> animalList)
// 	{
// 		do
// 		{
// 	    	isAliveOrNot(animalList,randomIndex,index);
// 	    	if(isAliveOrNot(animalList,randomIndex,index) == true)
// 	    	{
// 	    		if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength()) 
// 				{
// 					if(index == randomIndex)
// 					{
// 						System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 						fightOfEqualStrength(animalList,randomIndex,index);	
// 					}
// 					else if(index != randomIndex)
// 					{
// 						System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 						fightOfEqualStrength(animalList,randomIndex,index);	
// 					}			
// 				}
// 				else if (animalList.get(index).getAnimalStrength() != animalList.get(randomIndex).getAnimalStrength()) 
// 				{
// 					System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 					fightOfUnEqualStrength(animalList,randomIndex,index);	
// 				}	
// 	    	}
// 	    	else 
// 	    	{
// 	    		System.out.println("One Of the Animal Is Not Alive");	
// 	    	}
			
// 		}while(true);
		
// 	}
// 	public ArrayList<Animal> fightOfEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index)
// 	{		
// 		changeStrength(animalList,randomIndex,index);
// 		return animalList;		
// 	}

// 	public ArrayList<Animal> fightOfUnEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index)
// 	{
// 		changeStrength(animalList,randomIndex,index);
// 		return animalList;
// 	}

// 	public ArrayList<Animal> isAliveOrNot(ArrayList<Animal> animalList,int randomIndex,int index)
// 	{
// 		if(animalList.get(index).getAnimalStrength()!=0 && animalList.get(randomIndex).getAnimalStrength()!=0)
// 		{
// 			animalList.get(index).setIsAlive(true);
// 			animalList.get(randomIndex).setIsAlive(true); 
// 		}
// 		else if (animalList.get(index).getAnimalStrength()==0 || animalList.get(randomIndex).getAnimalStrength()==0) 
// 		{
// 			if (animalList.get(index).getAnimalStrength()==0 && animalList.get(randomIndex).getAnimalStrength()==0)   
// 			{
// 				animalList.get(index).setIsAlive(true);
// 				animalList.get(randomIndex).setIsAlive(true); 	
// 			}
// 			else if (animalList.get(index).getAnimalStrength() == 0 && animalList.get(randomIndex).getAnimalStrength() != 0)   
// 			{
// 				animalList.get(index).setIsAlive(false);
// 				animalList.get(randomIndex).setIsAlive(true); 	
// 			}
// 			else if (animalList.get(index).getAnimalStrength() != 0 && animalList.get(randomIndex).getAnimalStrength() == 0)   
// 			{
// 				animalList.get(index).setIsAlive(true);
// 				animalList.get(randomIndex).setIsAlive(false); 	
// 			}
// 		}
// 		return animalList;
// 	}

// 	public void changeStrength(ArrayList<Animal> animalList,int randomIndex,int index)
// 	{
// 		if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
// 		{
// 			int strength1 = animalList.get(index).getAnimalStrength();
// 			strength1 = strength1 - 1; 
// 			System.out.println(animalList.get(index).getAnimalName()+" Strength =  "+animalList.get(index).getAnimalStrength());
// 			animalList.get(index).setAnimalStrength(strength1);
// 			System.out.println(animalList.get(index).getAnimalName()+" New Strength =  "+animalList.get(index).getAnimalStrength());
// 		}
// 		else if (animalList.get(index).getAnimalStrength() != animalList.get(randomIndex).getAnimalStrength()) 
// 		{
// 			if(animalList.get(index).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength())
// 			{
// 				isAliveOrNot(animalList,randomIndex,index);
// 				if(isAliveOrNot(animalList,randomIndex,index) == true)
// 				{
// 					int strength1 = animalList.get(index).getAnimalStrength();
// 					System.out.println(animalList.get(index).getAnimalName()+" Strength =  "+animalList.get(index).getAnimalStrength());
// 					strength1 = strength1 - 3;
// 					animalList.get(index).setAnimalStrength(strength1);
// 					System.out.println(animalList.get(index).getAnimalName()+" New Strength =  "+animalList.get(index).getAnimalStrength());
// 					int strength2 = animalList.get(randomIndex).getAnimalStrength();
// 					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
// 					strength2 = strength2 - 2;
// 					animalList.get(randomIndex).setAnimalStrength(strength2);	
// 					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
// 				}
// 				else 
// 				{
// 				//code goes herre;		
// 				}	
								
// 			}
// 			if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength())
// 			{
// 				isAliveOrNot(animalList,randomIndex,index);
// 				if(isAliveOrNot(animalList,randomIndex,index) == true)
// 				{
// 					int strength1 = animalList.get(index).getAnimalStrength();
// 					System.out.println(animalList.get(index).getAnimalName()+" Strength =  "+animalList.get(index).getAnimalStrength());
// 					strength1 = strength1 - 2;
// 					animalList.get(index).setAnimalStrength(strength1);
// 					System.out.println(animalList.get(index).getAnimalName()+" New Strength =  "+animalList.get(index).getAnimalStrength());
// 					int strength2 = animalList.get(randomIndex).getAnimalStrength();
// 					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
// 					strength2 = strength2 - 3;
// 					animalList.get(randomIndex).setAnimalStrength(strength2);	
// 					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
// 				}
// 				else
// 				{
// 					//code goes here;
// 				}
			
// 			}
// 		}
// 	}

// }	

