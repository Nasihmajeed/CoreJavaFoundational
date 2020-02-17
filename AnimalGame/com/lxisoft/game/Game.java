package com.lxisoft.game;
import java.util.*;
import com.lxisoft.forest.*;
public class Game
{
	Random objGenerator = new Random();
	public void startGame(ArrayList<Animal> animals)
	{
		int temp=animals.size();
		System.out.println("\n\nYou Entered in to Game\n\n");

	do{
		int randomNumber = objGenerator.nextInt(5);
		int random=objGenerator.nextInt(5);
		if(randomNumber!=random)
		{
			if(animals.get(randomNumber).getAlive()==true&&animals.get(random).getAlive()==true)
			{
				temp =checkStrength(animals.get(randomNumber),animals.get(random),temp);	
			}
		}	
 
		}while(temp>1);	

	for(int i=0;i<animals.size();i++)
	{
		if(animals.get(i).getAlive()==true)
		{
			System.out.println(animals.get(i).getAnimalName()+" is Alive");	
		}
	}


	}

public int checkStrength(Animal animal1,Animal animal2,int temp)
{
			if(animal1.getAnimalStrength()<animal2.getAnimalStrength())
			{
			runAway(animal1,animal2);
			}
		else if(animal1.getAnimalStrength()>animal2.getAnimalStrength()&&(animal1 instanceof  Carnivores||animal2 instanceof  Carnivores))
		{
			temp =win(animal1,animal2,temp);
		} 
			else
			{
			noAtack(animal1,animal2);
			}
			return temp;
}



public int changeStrength(Animal animala,Animal animalb,int temp)
{
	int x=animala.getAnimalStrength();
	if(x<=0)
	{
		animala.setAlive(false);
		temp--;
	}
	else
	{	
	x=x-2;
	}
	animala.setAnimalStrength(x);
	int y=animalb.getAnimalStrength();
	if(y<=0)
	{
		animalb.setAlive(false);
		temp--;
	}
	else
	{	
	y=y-1;
	}

	animalb.setAnimalStrength(y);
return temp;
}

public void runAway(Animal animal1,Animal animal2)
{
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal1.getAnimalName()+" Runned Away");
			System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
			
}



public void noAtack(Animal animal1,Animal animal2)
{
			
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal1.getAnimalStrength()+" Strength"+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength"+animal2.getAnimalName());
			System.out.println("No Atack");
}

public boolean luckyFactor()
{
	int luckyfactor=objGenerator.nextInt(3);
	if(luckyfactor==1)
	{
		return true;
	}
	else 
	{
		return false;
	}

}

public int win(Animal animal1,Animal animal2,int temp)
{
boolean x=luckyFactor();
			if((x==true)&&(animal2 instanceof Herbivores))
			{
			luckrunAway(animal1,animal2);
			}
			else
			{
				if((animal2 instanceof Herbivores)&&(animal2.getAnimalStrength()<5))
				{
					directAtack(animal1,animal2);
					animal2.setAlive(false);
					temp--;
				}

				else
				{
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println("Strength before Atack");
			System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
			temp=changeStrength(animal2,animal1,temp);
			System.out.println(animal1.getAnimalName()+"win");
										System.out.println("Strength After Atack");
			System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
				}
			}
			return temp;

}



public void luckrunAway(Animal animal1,Animal animal2)
{
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal2.getAnimalName()+" Runned Away By Luck Factor");
			System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
			
}

public void directAtack(Animal animal1,Animal animal2)
{
System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
					System.out.println("Strength before Atack");
					System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
					System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
					System.out.println(animal1.getAnimalName()+"win");
					System.out.println("Strength After Atack");
					System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
					System.out.println(animal2.getAnimalName()+" Dead");
}

}












