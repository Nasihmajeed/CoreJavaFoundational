package com.lxisoft.animalgame;


import com.lxisoft.animalgame.Tiger;

public class Animal
{
	int strength;
	String name;
	boolean isDead;
	public void printDetails()
	{
	}
	public void printName()
	{
	}
	


	public void eat()
	{
		System.out.println("animal eat");

	}
	public void run()
	{
		System.out.println("animal runs");
	}
	
	public Animal fight (Animal enemy)
	{
		System.out.println("the " +this.name+ " fighting "+ enemy.name );
		Animal win;
		if(this.strength>enemy.strength)
		{
			win=this;
			System.out.println(this.name +" wins");
			enemy.isDead=true;
		}
		else
		{
			win=enemy;
			System.out.println(enemy.name +" wins");
			this.isDead=true;
		}
		return win;

	}

}