package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Bear extends Animal implements Carnivorous 
{
	public void eat()
	{
		System.out.println("bear eat honey");
	}
	public void run()
	{
		System.out.println("bear runs slow");
	}

	public void animalsRoam()
	{
		System.out.println(" Animal--"+name);
		System.out.println(" strength--"+strength);
	}
	
	public Animal fight(Animal enemy)
	{
		if(this.strength>enemy.strength)
		{
			return this;
		}
		else
		{
			return enemy;
		}
	}

	


	
}

