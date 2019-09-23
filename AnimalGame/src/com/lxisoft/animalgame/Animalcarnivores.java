package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Animalcarnivores extends Animal implements Carnivore
{



	public Animal fight(Animal enemy)
		{
			Animal win;
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
