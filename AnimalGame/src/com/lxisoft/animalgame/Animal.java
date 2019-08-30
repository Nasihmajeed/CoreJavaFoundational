package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Rabbit;
public class Animal
{
	String animalName;
	int strength;
    
	public void details()
	{
     System.out.println("-Animal Details-");
	}
	public void fight(Animal animalArr[])
	{
		System.out.println("Animal Meet & Fight Starts");
		System.out.println("\n");
		for(int i=0;i<5;i++)
		{
			int m=(int)(Math.random()*3);
			int n=(int)(Math.random()*3);
			System.out.println(animalArr[m].animalName+"  VS  "+animalArr[n].animalName);
			if(animalArr[m].strength>animalArr[n].strength)
			{
				System.out.println(animalArr[m].animalName+"  WIN");
			}
			else
			{
				System.out.println(animalArr[n].animalName+"  WIN");
			}
		}

    }

    
}