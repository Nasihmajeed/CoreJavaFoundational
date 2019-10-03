package com.lxisoft.animalgame;

public class Buffallo extends Animal implements Carnivore
{
	Animal win;
	public Animal fight(Animal enemy)
	{
			System.out.println(this.name +" fight with " +enemy.name);
			if(this.strength>enemy.strength)
			{ 
				win=this;
				enemy.isDead=true;
				System.out.println(this.name + "  wins " + enemy.name +"  died  \n");
			}
			else
			{
				win=enemy;
				this.isDead=true;
				System.out.println(enemy.name + "  wins " + this.name + "  died \n");
			}
			return win;
	}
	public Animal fight(Animal enemy1,Animal enemy2)
	{
		System.out.println(" The "+this.name +"  and " +enemy1.name +" fights with " +enemy2.name);
		enemy1.strength=(int)enemy1.strength/2;
		if(this.strength>enemy2.strength)
			{
				if(this.strength>enemy1.strength)
				{ 
					win=this;
					enemy1.isDead=true;
					System.out.println(this.name + "  wins  \n");
				}
				else
				{
					win=enemy1;
					this.isDead=true;
					System.out.println(enemy1.name + "  wins \n");
				}
			}
			else
			{
				if(enemy2.strength>enemy1.strength)
				{ 
					win=enemy2;
					enemy1.isDead=true;
					System.out.println(enemy2.name + "  wins  \n");
				}
				else
				{
					win=enemy1;
					this.isDead=true;
					System.out.println(enemy1.name + "  wins \n");
				}
			}	
		   return win;
	}
	public Animal fight(Animal enemy,Animal[]animals,int[]nearbyAnimals,int count)
	{       
		for(int i=0;i<count;i++)
		{
			if(animals[nearbyAnimals[i]].strength>enemy.strength)
			{
				win=animals[nearbyAnimals[i]];
				enemy.isDead=true;
				System.out.println(win.name +"wins\n");
			}
			else
			{
				animals[nearbyAnimals[i]].isDead=true;
				win=enemy;

			}
		}
		return win;		
	}
	public int[] roam()
	{
		int[] position=new int[2];
		for(int i=0;i<position.length;i++)
		{
			position[i]=(int)(Math.random() *50);
			location[i]=position[i];
		}
		return location;
	}

		

}