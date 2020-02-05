package com.lxisoft.game;
import java.util.*;
import com.lxisoft.forest.*;
public class Game
{
	Random objGenerator = new Random();
	public void startGame(ArrayList<Animal> animal)
	{

		 System.out.println("\n\nYou Entered in to Game\n\n");

		for (int i=0;i<animal.size();i++)
		{
		// for (int j=i+1;j<animal.size();j++)
		// {
			int randomNumber = objGenerator.nextInt(3);
			if(animal.get(i).getAnimalStrength()<animal.get(randomNumber).getAnimalStrength())
			{
				System.out.println("\n"+animal.get(i).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
				System.out.println(animal.get(randomNumber).getAnimalName()+" Winned");
				System.out.println(randomNumber);
				animal.remove(i);
				//i=i+1;
			}
			else if(animal.get(i).getAnimalStrength()>animal.get(randomNumber).getAnimalStrength())
			{
				System.out.println("\n"+animal.get(i).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
				System.out.println(animal.get(i).getAnimalName()+" Winned");
					System.out.println(randomNumber);
				animal.remove(randomNumber);

			}
			else
			{
				System.out.println("\n"+animal.get(i).getAnimalName()+" Meet With "+animal.get(randomNumber).getAnimalName()+"\n......\n");
				System.out.println("No Atack");
									System.out.println(randomNumber);

				continue;
			}

		// }
		}

		
 		
	}
}