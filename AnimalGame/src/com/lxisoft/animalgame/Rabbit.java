package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Rabbit extends Animal
{
	public void eat()
	{
		System.out.println("rabbit eat carrot");
	}
	public void run()
	{
		System.out.println("rabbit runs fast");
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