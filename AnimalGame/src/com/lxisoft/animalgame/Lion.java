package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Lion extends Animal implements Carnivores
{	
	public void run()
	{
		System.out.println("\n lion run fast");
	}
	public void eat()
	{
		System.out.println("\n lion eat flush");
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
	public int[] roam()
	{
		int x2,y2;
		int[] position;
		x2=(int) (Math.random()*10);
		y2=(int) (Math.random()*10);
		// System.out.println("x2 of lion--"+x2);
		// System.out.println("y2 of lion--"+y2);
		position=new int[2];
		position[0]=x2;
		position[1]=y2;

		return position;
	}
}