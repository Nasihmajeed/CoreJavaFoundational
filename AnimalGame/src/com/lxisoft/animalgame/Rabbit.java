package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Rabbit extends Animal implements Herbivorous
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

	
	public void escape(Animal enemy)
	{
		System.out.println("\t\t\t\t\t"+enemy.name+" ATTACKS "+this.name); 
		if (enemy.luck>this.luck)
		{
			System.out.println("\t\t\t\t"+enemy.name+" FIGHTS AND KILLS "+this.name+"\n");
			this.isDead=true;
		}
		else
			System.out.println("\t\t\t\t"+this.name+" ESCAPES TO THE JUNGLE \n");
	}

}

	
