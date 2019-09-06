package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Lion extends Animal implements Carnivorous
{
	public void eat()
	{
		System.out.println("lion eat flesh");
	}
	public void run()
	{
		System.out.println("lion runs fast");
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