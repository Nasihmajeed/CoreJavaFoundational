package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public abstract class HerbivoresAnimal extends Animal implements Herbivores
{
	public void run()
	{
		System.out.println("\n herbivores runs normally slowly");
	}
	public void eat()
	{
		System.out.println("\n herbivores eat vegetables ");
	}
	public int attack(Animal enemy1)
	{
		System.out.println("\n "+enemy1.animalName+"  attacks  "+this.animalName);
		if(this.luck>enemy1.luck)
		{
			System.out.println(" "+this.animalName+"-----1-ESCAPED TO JUNGLE---------");
			return 0;
		}
		else
		{
			System.out.println("\n "+enemy1.animalName+" eat "+this.animalName);
			this.isDead=true;
			return 1;
		}
	}
	
	public int attack(Animal enemy1,Animal enemy2)
	{
		System.out.println("\n "+enemy1.animalName+"  and  "+enemy2.animalName+" attacks "+this.animalName);
		if((this.luck>enemy1.luck)&(this.luck>enemy2.luck))
		{
			System.out.println(" "+this.animalName+"----2--ESCAPED TO JUNGLE---------");
			return 0;
		}
		else
		{
			System.out.println("\n "+enemy1.animalName+" and "+enemy2.animalName+" eat "+this.animalName);
			this.isDead=true;
			return 1;
		}	
	}
	public int attack(Animal[] enemy,int[] arr)
	{
		int x=5;
		int a=arr.length;
		enemy=new Animal[a];
		for(int i=0;i<enemy.length;i++)
		{
			System.out.println("\n "+enemy[i].animalName+"  attacks  "+this.animalName);
			if(this.luck>enemy[arr[i]].luck)
			{
				System.out.println(" "+this.animalName+"---3---ESCAPED TO JUNGLE---------");
				x=0;
			}
			else
			{
				System.out.println("\n "+enemy[i].animalName+" eat "+this.animalName);
				this.isDead=true;
				x=1;
			}
		}
		return x;
	}
	public int[] graze()
	{
		int x2,y2;
		int[] position;
		position=new int[2];
		x2=(int) (Math.random()*10);
		y2=(int) (Math.random()*10);
		position[0]=x2;
		position[1]=y2;
		return position;
	}

}