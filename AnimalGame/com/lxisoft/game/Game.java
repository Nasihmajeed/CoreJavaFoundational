package com.lxisoft.game;
import java.util.*;
import com.lxisoft.forest.*;
public class Game
{
	Random objGenerator = new Random();
	public void startGame(ArrayList<Animal> animal)
	{

		 System.out.println("\n\nYou Entered in to Game\n\n");
		int randomNumber = objGenerator.nextInt(3);
		int random=objGenerator.nextInt(3);
		// for (int i=0;i<animal.size();i++)
		// {
		
		// 	int randomNumber = objGenerator.nextInt(3);
		// 	int random=objGenerator.nextInt(3);
		// 	if(animal.get(random).getAnimalStrength()<animal.get(randomNumber).getAnimalStrength())
		// 	{
		// 		System.out.println("\n"+animal.get(i).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
		// 		System.out.println(animal.get(randomNumber).getAnimalName()+" Winned");
		// 		System.out.println(randomNumber);
		// 		System.out.println(random);
		// 		animal.remove(random);
		// 		//i=i+1;
		// 	}
			
		// 	else if(animal.get(random).getAnimalStrength()>animal.get(randomNumber).getAnimalStrength())
		// 	{
		// 		//randomNumber = objGenerator.nextInt(3);
		// 		System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
		// 		System.out.println(animal.get(random).getAnimalName()+" Winned");
		// 			System.out.println(randomNumber);
		// 			System.out.println(random);
		// 		animal.remove(randomNumber);

		// 	}
		// 	else
		// 	{
		// 		System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
		// 		System.out.println("No Atack");
		// 		System.out.println(randomNumber);
  //               System.out.println(random);
		// 		continue;
		// 	}

		// // }
		// }

		do
		{
			
			if(animal.get(random).getAnimalStrength()<animal.get(randomNumber).getAnimalStrength())
			{
				System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
				System.out.println(animal.get(randomNumber).getAnimalName()+" Winned");
				System.out.println(randomNumber);
				System.out.println(random);
				//animal.remove(random);
				//i=i+1;
			}
			
			else if(animal.get(random).getAnimalStrength()>animal.get(randomNumber).getAnimalStrength())
			{
				System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
				System.out.println(animal.get(random).getAnimalName()+" Winned");
					System.out.println(randomNumber);
					System.out.println(random);
				
			}
			else
			{
				System.out.println("\n"+animal.get(random).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
				System.out.println("No Atack");
				System.out.println(randomNumber);
                System.out.println(random);
				continue;
			}

		}while(animal.size()>0);
	
	}

public void  checkStrength(ArrayList<Animal> animal)
{




}

}








