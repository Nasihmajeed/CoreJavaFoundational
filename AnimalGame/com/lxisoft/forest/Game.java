package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.ArrayList;

import java.util.Iterator;

import java.util.Random;
public class Game
{
	//Forest forest = new Forest();
	public void playGame(ArrayList<Animal> animalList)
	{
		Random random = new Random();

		//int randomIndex = random.nextInt(animalList.size());
		//System.out.println(animalList.size());
		//System.out.println(randomIndex);
		 for(int i=0;i<animalList.size();i++)
		 {	
		 	for(int j=i+1;j<animalList.size()-1;i++)
		 	{
				if(animalList.get(i).getAnimalStrength() < animalList.get(j).getAnimalStrength())
				{
						System.out.println("oof==>"+animalList.get(i).getAnimalName()+" meets with "+animalList.get(j).getAnimalName()); 
		 				System.out.print(animalList.get(j).getAnimalName()+" wins\t");
		  				System.out.print(animalList.get(i).getAnimalName()+ " Loses");
		  				System.out.println("\n");
						animalList.remove(i);

						

		 		 }
		  		else
		  		{	
		  				
						System.out.println("foo==>"+animalList.get(i).getAnimalName()+" meets with "+animalList.get(j).getAnimalName()); 
		 				System.out.print(animalList.get(i).getAnimalName()+" wins\t");
		  				System.out.print(animalList.get(j).getAnimalName()+ " Loses");
		  				System.out.println("\n");
		  				animalList.remove(j);

		  				

		  		}


		  		for(Animal a : animalList)
						{
					 		System.out.println(a.getAnimalName());
						}
		 		
			}		 		
		 }	



		 // 		if(animalList.get(i).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength())
		 // 		{
		 // 			System.out.println("==>"+animalList.get(i).getAnimalName()+" meets with "+animalList.get(randomIndex).getAnimalName()); 
		 // 			if(i == randomIndex)
		 // 			{
		 // 				System.out.println("Battle of equal strength");
		 // 			}
		 // 			else
		 // 			{
		 // 				System.out.print(animalList.get(randomIndex).getAnimalName()+" wins\t");
		 // 				System.out.print(animalList.get(i).getAnimalName()+ " Loses");
		 // 				System.out.println("\n");

		 // 			}
		 // 		}
		 // 		else if(animalList.get(i).getAnimalStrength() < animalList.get(randomIndex).getAnimalStrength())
		 // 		{
		 // 			System.out.println("==>"+animalList.get(i).getAnimalName()+" meets with "+animalList.get(randomIndex).getAnimalName()); 
		 // 			if(i == randomIndex)
		 // 			{
		 // 				System.out.println("Battle of equal strength");
		 // 			}
		 // 			else
		 // 			{
		 // 				System.out.print(animalList.get(i).getAnimalName()+" wins\t");
		 // 				System.out.print(animalList.get(randomIndex).getAnimalName()+ " Loses");
		 // 				System.out.println("\n");

		 // 			}
		 // 		}
		 // }




	}
	
}