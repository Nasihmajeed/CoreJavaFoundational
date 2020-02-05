package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.ArrayList;
import java.util.Random;
public class Game
{
	//Forest forest = new Forest();
	public void playGame(ArrayList<Animal> animalList)
	{
		Random random = new Random();
		
		
		for(int i = 0;i<animalList.size();i++)
		{	
			int randomIndex = random.nextInt(animalList.size());	
			if(i == randomIndex)
			{
				System.out.println(animalList.get(i).getAnimalName()+ " Meets "+ animalList.get(randomIndex).getAnimalName());
				System.out.println("Battle Tied");	
			}
			 
			else if(animalList.get(i).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength())
			{
				System.out.println(animalList.get(i).getAnimalName()+ " Meets "+ animalList.get(randomIndex).getAnimalName());
				System.out.println(animalList.get(i).getAnimalName()+ " Wins and "+ animalList.get(randomIndex).getAnimalName()+" Loses");
				animalList.remove(randomIndex);
			}
			else if (animalList.get(i).getAnimalStrength() > animalList.get(randomIndex).getAnimalStrength()) 
			{
				System.out.println(animalList.get(randomIndex).getAnimalName()+ " Meets "+ animalList.get(i).getAnimalName());
				System.out.println(animalList.get(randomIndex).getAnimalName()+ " Wins and "+ animalList.get(i).getAnimalName()+" Loses");
				animalList.remove(i);	
			}
		}
	}
}	
