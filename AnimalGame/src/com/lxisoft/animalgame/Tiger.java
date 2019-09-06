package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("tiger eat flesh");
	}
	public void run()
	{
		System.out.println("tiger runs very fast");
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