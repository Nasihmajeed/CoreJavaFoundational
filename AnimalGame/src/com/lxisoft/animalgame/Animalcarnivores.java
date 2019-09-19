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
}
