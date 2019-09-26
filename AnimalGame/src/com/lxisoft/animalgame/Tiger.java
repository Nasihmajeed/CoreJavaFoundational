package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Tiger extends Animal implements Carnivores
{
	public void run()
	{
		System.out.println("\n tiger run fastly");
	}
	public void eat()
	{
		System.out.println("\n tiger eat meat");
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
		position=new int[2];
		x2=(int) (Math.random()*10);
		y2=(int) (Math.random()*10);
		// System.out.println("x2 of tiger--"+x2);
		// System.out.println("y2 of tiger--"+y2);
		position[0]=x2;
		position[1]=y2;
		
		
		// int location=(int) (Math.sqrt((x2-(this.xAxis))*(x2-(this.xAxis))+(y2-(this.yAxis))*(y2-(this.yAxis))));
		
		return position;
	}
}