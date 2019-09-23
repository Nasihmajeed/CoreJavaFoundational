package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public abstract class Canimal extends Animal implements Carnivore
{
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
	public int[] roam()
	{
		int[] one= new int[2];
		for(int i=0; i<one.length; i++)
		{
			one[i]=(int)(50* Math.random());
		}
		return one;
	} 

} 