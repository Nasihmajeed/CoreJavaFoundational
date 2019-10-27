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
		if (this.luck<50 && (this.speed>enemy.speed))
		{
			System.out.println("\t\t\t\t"+enemy.name+" FIGHTS AND KILLS "+this.name+"\n");
			this.isDead=true;
		}
		else
			System.out.println("\t\t\t\t"+this.name+" ESCAPES TO THE JUNGLE DUE TO LUCK OR SPEED\n");
	}


	public void escape(Animal enemy1,Animal enemy2)
	{
		System.out.println("\t\t\t\t\t"+enemy1.name+" and "+enemy2.name+" ATTACKS "+this.name); 
		if ((this.luck)/2<50 && (this.speed>enemy1.speed) && (this.speed>enemy2.speed))
		{
			System.out.println("\t\t\t\t"+enemy1.name+" and "+enemy2.name+" FIGHTS AND KILLS "+this.name+"\n");
			this.isDead=true;
		}
		else
			System.out.println("\t\t\t\t"+this.name+" ESCAPES TO THE JUNGLE DUE TO LUCK OR SPEED\n");
	}
	

	public void escape(Animal enemy1,Animal enemy2,Animal enemy3)
	{
		System.out.println("\t\t\t\t\t"+enemy1.name+" and "+enemy2.name+" and "+enemy3.name+" ATTACKS "+this.name); 
		if ((this.luck)/3<50 && (this.speed>enemy1.speed) && (this.speed>enemy2.speed) && (this.speed>enemy3.speed))
		{
			System.out.println("\t\t\t\t"+enemy1.name+" and "+enemy2.name+" and "+enemy3.name+" FIGHTS AND KILLS "+this.name+"\n");
			this.isDead=true;
		}
		else
			System.out.println("\t\t\t\t"+this.name+" ESCAPES TO THE JUNGLE DUE TO LUCK OR SPEED\n");
	}


}

	
