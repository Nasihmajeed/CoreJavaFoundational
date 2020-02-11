package com.lxisoft.game;
import java.util.*;
import com.lxisoft.forest.*;
public class Game
{
	Random objGenerator = new Random();
	public void startGame(ArrayList<Animal> animal)
	{
		System.out.println("\n\nYou Entered in to Game\n\n");


	do{
		int randomNumber = objGenerator.nextInt(3);
		int random=objGenerator.nextInt(3);
			if(animal.get(randomNumber).getAlive()==true&&animal.get(random).getAlive()==true )
			{
				checkStrength(animal.get(randomNumber),animal.get(random));	

			}
			else
			{
			//	System.out.println(animal.get(randomNumber).getAnimalName()+"win");
			}
 
		}while(/*animal.get(randomNumber).getAlive()==true&&animal.get(random).getAlive()==*/true);		      
	}

public void  checkStrength(Animal animal1,Animal animal2)
{
		if(animal1.getAnimalStrength()<animal2.getAnimalStrength())
		{
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal2.getAnimalName()+" win");
			System.out.println(animal2.getAnimalStrength()+"Strength");
			System.out.println(animal1.getAnimalStrength()+"Strength");
			changeStrength(animal1,animal2);

		}
		else if(animal1.getAnimalStrength()>animal2.getAnimalStrength())
		{
			System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
			System.out.println(animal1.getAnimalName()+"win");
			System.out.println(animal2.getAnimalStrength()+"Strength");
			System.out.println(animal1.getAnimalStrength()+"Strength");
			changeStrength(animal2,animal1);
		}
			
			else
			{
				
				System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
				System.out.println(animal2.getAnimalStrength()+"Strength");
			System.out.println(animal1.getAnimalStrength()+"Strength");
				System.out.println("No Atack");
			}
}



public void changeStrength(Animal animala,Animal animalb)
{
	int x=animala.getAnimalStrength();
	if(x==0)
	{
		animala.setAlive(false);
	}
	else
	{	
	x=x-2;
	}
	animala.setAnimalStrength(x);
	int y=animalb.getAnimalStrength();
	if(y==0)
	{
		animalb.setAlive(false);
	}
	else
	{	
	y=y-1;
	}
	
	animalb.setAnimalStrength(y);

}
}















