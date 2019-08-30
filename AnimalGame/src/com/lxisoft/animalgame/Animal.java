package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Animal
{
	String animalName;
	int strength;
	
	public void eat()
	{
		System.out.println("animals eats grass and flesh");
	}
	public void run()
	{
		System.out.println("animals runs in the wild ");
	}

	public void details()
	{
		System.out.println("animals details");
	}

	public void fight(Animal aArray[])
	{		
		System.out.println("---------------Six Random fight----------------------");
		for(int i=0;i<6;i++)
		{	
			int x = (int) (Math.random() *4);
			int y = (int) (Math.random() *4);
			
			System.out.println(aArray[x].animalName+"  V/S "+aArray[y].animalName);
			if(aArray[x].strength>aArray[y].strength)
			{
				System.out.println(aArray[x].animalName+" wins ");
			}
			else
			{
				System.out.println(aArray[y].animalName+" wins ");
			}
			System.out.println("\n");
		}		
		
		
	}

}

