package com.lxisoft.animalgame;
public class Zeebra extends Animal implements Herbivores
{
	
	public void printDetails()
	{
	
		System.out.println(name+" "+strength);
	}

	public void printName()
	{
		System.out.println(name);
	}
	public void eat()
	{
		System.out.println("Zeebra eats");
	}
	public void run()
	{
		System.out.println("Zeebra runs");
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