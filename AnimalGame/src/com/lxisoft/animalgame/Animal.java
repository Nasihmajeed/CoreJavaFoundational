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
		int j=0,k=0;
		System.out.println("fight starts ");
		for(int i=0;i<4;i++)
		{
			if(aArray[i].strength>j)
			{
				j=aArray[i].strength;
				k=i;
			}
		}
		System.out.println(k);
		System.out.println(aArray[k].animalName+" wins ");
	}

}