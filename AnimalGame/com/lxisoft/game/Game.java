package com.lxisoft.game;
import java.util.*;
import com.lxisoft.forest.*;
public class Game
{
	Random objGenerator = new Random();
	public void startGame(ArrayList<Animal> animal)
	{
		int temp=animal.size();
		System.out.println("\n\nYou Entered in to Game\n\n");

	do{
		int randomNumber = objGenerator.nextInt(4);
		int random=objGenerator.nextInt(4);
			if((animal.get(randomNumber).getAlive()==true&&animal.get(random).getAlive()==true)&&(animal.get(randomNumber).getAnimalName()!=animal.get(random).getAnimalName()) )
			{
				temp =checkStrength(animal.get(randomNumber),animal.get(random),temp);	
				System.out.println(temp+" Temp");
			}
			
 
		}while(temp>1);		      
	for(int i=0;i<animal.size();i++)
	{
		if(animal.get(i).getAlive()==true)
		{
			System.out.println(animal.get(i).getAnimalName()+" is Alive");	
		}
	}


	}

public int checkStrength(Animal animal1,Animal animal2,int temp)
{
		if(animal1.getAnimalStrength()<animal2.getAnimalStrength())
		{
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal1.getAnimalName()+" Runned Away");
			System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
			

		}
		else if(animal1.getAnimalStrength()>animal2.getAnimalStrength())
		{
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal1.getAnimalName()+"win");
			System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
			temp=changeStrength(animal2,animal1,temp);
		}
			
			else
			{
				
				System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal1.getAnimalStrength()+" Strength"+animal1.getAnimalName());
			System.out.println(animal2.getAnimalStrength()+" Strength"+animal2.getAnimalName());
				System.out.println("No Atack");
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
}












