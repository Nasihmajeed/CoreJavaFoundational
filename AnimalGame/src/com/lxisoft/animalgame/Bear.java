package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Bear extends Animal implements Herbivores
{
	public void run()
	{
		System.out.println("\n bear run slowly");
	}
	public void eat()
	{
		System.out.println("\n bear eat honey");
	}
	public Animal fight(Animal animal)
	{
		if(this.strength>animal.strength)
		{
			return this;
		}
		else
		{
			return animal;
		}
	}
	public Animal escape(Animal animal)
	{
		if(this.luck>animal.luck)
		{
			return this;
		}
		else
		{
			return animal;
		}
	}
	public void graze()
	{
		int x2,y2;
		int[] position;
		x2=(int) (Math.random()*10);
		y2=(int) (Math.random()*10);
		System.out.println("x2 coordinate--"+x2);
		System.out.println("y2 coordinate--"+y2);
		position=new int[2];
		position[0]=x2;
		position[1]=y2;
	}

}
