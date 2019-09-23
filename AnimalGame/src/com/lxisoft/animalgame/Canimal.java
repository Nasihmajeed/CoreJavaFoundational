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
	public Animal fight (Animal enemy,Animal animal1)
	{
		System.out.println("the " +this.name+" and "+animal1.name+ " are fighting "+ enemy.name );
		Animal win;
		enemy.strength=(int)enemy.strength/2;
		if(this.strength>animal1.strength)
		{
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
			}
		}
		else
		{
			if(animal1.strength>enemy.strength)
			{
				win=animal1;
				System.out.println(animal1.name +" wins");
				enemy.isDead=true;
			}
			else
			{
				win=enemy;
				System.out.println(enemy.name +" wins");
			}
		}
		return win;
	}
	public Animal fight(Animal enemy,Animal[] animal,int[] near,int nearby)
	{
		Animal win=null;
		Animal temp=animal[near[0]];
		for (int i=0;i<nearby;i++)
		{
			if(animal[near[i]].strength>temp.strength)
			{
				temp=animal[near[i]];
				//win=temp;

			}
		}
		System.out.println(temp.name +" wins");
		enemy.isDead=true;

		return temp;
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