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
				checkStrength(animal,random,randomNumber);	
			}
			else
			{
				//System.out.println(animal.get(randomNumber).getAnimalName()+"win");
			}
		}while(animal.size()>0);		
	}

public void  checkStrength(Animal animal1,Animal animal2)
{

			// if(animal.get(random).getAnimalStrength()<animal.get(randomNumber).getAnimalStrength())
			// {
			// 	System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
			// 	System.out.println(animal.get(randomNumber).getAnimalName()+"win");
			// 	int i=random;
			// 	int j=randomNumber;
			// 	changeStrength(animal,random,randomNumber);

			// }
			
			// else if(animal.get(random).getAnimalStrength()>animal.get(randomNumber).getAnimalStrength())
			// {
			// 	System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
			// 	System.out.println(animal.get(random).getAnimalName()+" Win");
			// 	int j=random;
			// 	int i=randomNumber;
			// 	changeStrength(animal,random,randomNumber);
			// }
			// else
			// {
			// 	System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
			// 	System.out.println("No Atack");
			// }
}



public void changeStrength(ArrayList<Animal> animal,int random,int randomNumber)
{
	int x=animal.get(i).getAnimalStrength();
	x=x-2;
	animal.get(i).setAnimalStrength(x);
	int y=animal.get(j).getAnimalStrength();
	y=y-1;
	animal.get(j).setAnimalStrength(y);
}
}








