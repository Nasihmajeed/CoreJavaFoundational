// package com.lxisoft.forest;
// import com.lxisoft.forest.*;
// import java.util.ArrayList;
// import java.util.Random;
// public class Game
// {
// 	public void playGame(ArrayList<Animal> animalList)
// 	{		
// 		System.out.println("\t\tGAME STARTS");
// 		Random random = new Random();
// 		int randomIndex = random.nextInt(animalList.size());
// 	   	int index = random.nextInt(animalList.size());
// 	   	animalFight(animalList,index,randomIndex);		
// 	}

// 	public void animalFight(ArrayList<Animal> animalList,int index,int randomIndex)
// 	{
// 		fightOrRunAway(animalList,index,randomIndex);	
// 	}

// 	public boolean isAliveOrNot(ArrayList<Animal> animalList,int index,int randomIndex)
// 	{
// 		boolean flag  = false;
// 		if(animalList.get(index).getAnimalStrength()!=0 && animalList.get(randomIndex).getAnimalStrength()!=0)
// 		{
// 			flag = true;
// 		}
// 		else if(animalList.get(index).getAnimalStrength()==0 || animalList.get(randomIndex).getAnimalStrength()==0)
// 		{
// 			flag = false;
// 		}
// 		return flag;
// 	}

	
// 	public void fightOrRunAway(ArrayList<Animal> animalList,int index,int randomIndex)
// 	{	
// 			boolean flag  = isAliveOrNot(animalList,index,randomIndex);
// 			if(flag = true)
// 			{
// 				if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
// 				{
// 					fightOfEqualStrength(animalList,randomIndex,index);
// 				}
// 				else if (animalList.get(index).getAnimalStrength() != animalList.get(randomIndex).getAnimalStrength()) 
// 				{
// 					if (animalList.get(index).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength()) 
// 					{
// 						fightOfUnEqualStrength(animalList,randomIndex,index);
// 					}
// 					else if (animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength()) 
// 					{
// 						System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 						System.out.println(animalList.get(index).getAnimalName()+" Run Away");
// 					}
// 				}
// 			}
// 			else
// 			{
				
// 			}			
// 	}

// 	public void fightOfEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index)
// 	{		
// 		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 		int strength1 = animalList.get(index).getAnimalStrength();
// 		strength1 = strength1 -1;
// 		animalList.get(index).setAnimalStrength(strength1); 	
// 	}
// 	public void fightOfUnEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index)
// 	{
// 		System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
// 		int strength1 = animalList.get(index).getAnimalStrength();
// 		int strength2 = animalList.get(randomIndex).getAnimalStrength();
// 		strength1 = strength1 -2;
// 		strength2 = strength2 -3;
// 		animalList.get(index).setAnimalStrength(strength1); 		
// 		animalList.get(randomIndex).setAnimalStrength(strength2); 		
// 	}
// }



























package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.ArrayList;
import java.util.Random;
public class Game
{
	public void playGame(ArrayList<Animal> animalList)
	{		
		System.out.println("\t\tGAME STARTS");
		animalFight(animalList);		

	}
	public void animalFight(ArrayList<Animal> animalList)
	{
		do
		{
	    	isAliveOrNot(animalList,randomIndex,index);
	    	if(isAliveOrNot(animalList,randomIndex,index) == true)
	    	{
	    		if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength()) 
				{
					if(index == randomIndex)
					{
						System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
						fightOfEqualStrength(animalList,randomIndex,index);	
					}
					else if(index != randomIndex)
					{
						System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
						fightOfEqualStrength(animalList,randomIndex,index);	
					}			
				}
				else if (animalList.get(index).getAnimalStrength() != animalList.get(randomIndex).getAnimalStrength()) 
				{
					System.out.println(animalList.get(index).getAnimalName()+" Meets "+animalList.get(randomIndex).getAnimalName());
					fightOfUnEqualStrength(animalList,randomIndex,index);	
				}	
	    	}
	    	else 
	    	{
	    		System.out.println("One Of the Animal Is Not Alive");	
	    	}
			
		}while(true);
		
	}
	public ArrayList<Animal> fightOfEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index)
	{		
		changeStrength(animalList,randomIndex,index);
		return animalList;		
	}

	public ArrayList<Animal> fightOfUnEqualStrength(ArrayList<Animal> animalList,int randomIndex,int index)
	{
		changeStrength(animalList,randomIndex,index);
		return animalList;
	}

	public ArrayList<Animal> isAliveOrNot(ArrayList<Animal> animalList,int randomIndex,int index)
	{
		if(animalList.get(index).getAnimalStrength()!=0 && animalList.get(randomIndex).getAnimalStrength()!=0)
		{
			animalList.get(index).setIsAlive(true);
			animalList.get(randomIndex).setIsAlive(true); 
		}
		else if (animalList.get(index).getAnimalStrength()==0 || animalList.get(randomIndex).getAnimalStrength()==0) 
		{
			if (animalList.get(index).getAnimalStrength()==0 && animalList.get(randomIndex).getAnimalStrength()==0)   
			{
				animalList.get(index).setIsAlive(true);
				animalList.get(randomIndex).setIsAlive(true); 	
			}
			else if (animalList.get(index).getAnimalStrength() == 0 && animalList.get(randomIndex).getAnimalStrength() != 0)   
			{
				animalList.get(index).setIsAlive(false);
				animalList.get(randomIndex).setIsAlive(true); 	
			}
			else if (animalList.get(index).getAnimalStrength() != 0 && animalList.get(randomIndex).getAnimalStrength() == 0)   
			{
				animalList.get(index).setIsAlive(true);
				animalList.get(randomIndex).setIsAlive(false); 	
			}
		}
		return animalList;
	}

	public void changeStrength(ArrayList<Animal> animalList,int randomIndex,int index)
	{
		if(animalList.get(index).getAnimalStrength() == animalList.get(randomIndex).getAnimalStrength())
		{
			int strength1 = animalList.get(index).getAnimalStrength();
			strength1 = strength1 - 1; 
			System.out.println(animalList.get(index).getAnimalName()+" Strength =  "+animalList.get(index).getAnimalStrength());
			animalList.get(index).setAnimalStrength(strength1);
			System.out.println(animalList.get(index).getAnimalName()+" New Strength =  "+animalList.get(index).getAnimalStrength());
		}
		else if (animalList.get(index).getAnimalStrength() != animalList.get(randomIndex).getAnimalStrength()) 
		{
			if(animalList.get(index).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength())
			{
				isAliveOrNot(animalList,randomIndex,index);
				if(isAliveOrNot(animalList,randomIndex,index) == true)
				{
					int strength1 = animalList.get(index).getAnimalStrength();
					System.out.println(animalList.get(index).getAnimalName()+" Strength =  "+animalList.get(index).getAnimalStrength());
					strength1 = strength1 - 3;
					animalList.get(index).setAnimalStrength(strength1);
					System.out.println(animalList.get(index).getAnimalName()+" New Strength =  "+animalList.get(index).getAnimalStrength());
					int strength2 = animalList.get(randomIndex).getAnimalStrength();
					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
					strength2 = strength2 - 2;
					animalList.get(randomIndex).setAnimalStrength(strength2);	
					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
				}
				else 
				{
				//code goes herre;		
				}	
								
			}
			if(animalList.get(index).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength())
			{
				isAliveOrNot(animalList,randomIndex,index);
				if(isAliveOrNot(animalList,randomIndex,index) == true)
				{
					int strength1 = animalList.get(index).getAnimalStrength();
					System.out.println(animalList.get(index).getAnimalName()+" Strength =  "+animalList.get(index).getAnimalStrength());
					strength1 = strength1 - 2;
					animalList.get(index).setAnimalStrength(strength1);
					System.out.println(animalList.get(index).getAnimalName()+" New Strength =  "+animalList.get(index).getAnimalStrength());
					int strength2 = animalList.get(randomIndex).getAnimalStrength();
					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
					strength2 = strength2 - 3;
					animalList.get(randomIndex).setAnimalStrength(strength2);	
					System.out.println(animalList.get(randomIndex).getAnimalName()+" Strength =  "+animalList.get(randomIndex).getAnimalStrength());
				}
				else
				{
					//code goes here;
				}
			
			}
		}
	}

}	

