package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Rabbit;
public class Animal
{
	public String animalName;
	public int strength;
	Animal[] animalArray;	
	
	public void meet()
	{
		System.out.println("Animals meet each other");	
		
	}
	
	public void fight(Animal animalArray[])
	{
		int x,y;
		System.out.println("-----------fight begins---------------");	
		for(int i=0;i<6;i++)
		{
			 x=(int) (Math.random()*3);
			 y=(int) (Math.random()*3);
			System.out.println(animalArray[x].animalName+" Vs "+animalArray[y].animalName);
			if(animalArray[x].strength<animalArray[y].strength)
			{
				System.out.println("winner====="+animalArray[y].animalName);
			}
			else
			{
				System.out.println("winner========"+animalArray[x].animalName);
			}	
		}
	}
	
	
}
