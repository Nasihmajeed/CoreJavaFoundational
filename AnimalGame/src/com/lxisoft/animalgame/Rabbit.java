package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Rabbit extends Animal implements Herbivores
{
	public void run()
	{
		System.out.println("\n rabbit run slowly");
	}
	public void eat()
	{
		System.out.println("\n rabbit eat carrot");
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
	public int[] graze()
	{
		int x2,y2;
		int[] position;
		position=new int[2];
		x2=(int) (Math.random()*10);
		y2=(int) (Math.random()*10);
		// System.out.println("x2 of rabbit--"+x2);
		// System.out.println("y2 of rabbit--"+y2);
		position[0]=x2;
		position[1]=y2;
		return position;
	}
	
}