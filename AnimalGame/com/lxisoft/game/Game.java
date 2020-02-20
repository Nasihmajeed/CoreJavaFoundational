package com.lxisoft.game;
import java.util.*;
import java.lang.*;
import com.lxisoft.forest.*;
public class Game
{
	Random objGenerator = new Random();
	public void startGame(ArrayList<Animal> animals)
	{
		Area area=new Area();
		int temp=animals.size();
		System.out.println("\n\nYou Entered in to Game");
		System.out.println("\n________________________\n\n");

	do{
		int randomNumber = objGenerator.nextInt(5); 
		int random=objGenerator.nextInt(5);
		int distance=checkDistance(animals.get(randomNumber),animals.get(random));
				
		if(randomNumber!=random)
		{
			if(animals.get(randomNumber).getAlive()==true&&animals.get(random).getAlive()==true)
			{

			    System.out.println(animals.get(randomNumber).getAnimalName());	
				System.out.println(animals.get(random).getAnimalName());
				System.out.println("distance = "+distance);	
				if(distance<20)
				{
				temp =checkStrength(animals.get(randomNumber),animals.get(random),temp);
					System.out.println("\n**********\n\n");
				}
			}
		}	
		 	area.setAnimalPosition(animals);
		}while(temp>1);	

		for(int i=0;i<animals.size();i++)
		{
		if(animals.get(i).getAlive()==true)
		{
			System.out.println(animals.get(i).getAnimalName()+" Survrived At last");	
		}
		}

	}



public int changeStrength(Animal animala,Animal animalb,int temp)
{
	int x=animala.getAnimalStrength();
	if(x<=0)
	{	animala.setAlive(false);
		temp--;	}
	else
	{	x=x-2;	}
	animala.setAnimalStrength(x);
	int y=animalb.getAnimalStrength();
	if(y<=0)
	{	animalb.setAlive(false);
		temp--;	}
	else
	{	y=y-1;	}

	animalb.setAnimalStrength(y);
return temp;
}

public int checkDistance(Animal animal1,Animal animal2)
{
int a=animal1.getxaxis();
int b=animal1.getyaxis();
int c=animal2.getxaxis();
int d=animal2.getyaxis();
int z=c-a;
int q=d-b;
int result=(int)Math.sqrt((int)Math.pow(z,2)+(int)Math.pow(q,2));
return result;
}
	public int checkStrength(Animal animal1,Animal animal2,int temp)
		{
			if(animal1 instanceof Herbivores&&animal2 instanceof Herbivores)
			{
				noAtack(animal1,animal2);
			}
			else if(animal1 instanceof  Carnivores||animal2 instanceof  Carnivores)
			{
				if(animal1.getAnimalStrength()>animal2.getAnimalStrength())
				{
					temp =fight(animal1,animal2,temp);	
				}
				else if(animal1.getAnimalStrength()<animal2.getAnimalStrength())
				{
					temp =fight(animal2,animal1,temp);
				}
				else
				{
					temp =fight(animal2,animal1,temp);	
				}
			}
				return temp;
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


	public void noAtack(Animal animal1,Animal animal2)
	{
			
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal1.getAnimalStrength()+" Strength"+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength"+animal2.getAnimalName());
			System.out.println("No Atack");
	}	

	public int fight(Animal animal1,Animal animal2,int temp)
{
boolean x=luckyFactor();
			if((x==true)&&(animal1 instanceof Herbivores||animal2 instanceof Herbivores))
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
					temp=win(animal1,animal2,temp);
				}
				
				
			}
			return temp;

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


public void luckrunAway(Animal animal1,Animal animal2)
{
	if(animal2 instanceof Herbivores)
	{
		System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
		System.out.println(animal2.getAnimalName()+" Runned Away By Luck Factor");
		System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
		System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
	}
	else
	{
		System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
		System.out.println(animal1.getAnimalName()+" Runned Away By Luck Factor");
		System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
		System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
	}		
}
public int win(Animal animal1,Animal animal2,int temp) 
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
	
		return temp;
	}
}


