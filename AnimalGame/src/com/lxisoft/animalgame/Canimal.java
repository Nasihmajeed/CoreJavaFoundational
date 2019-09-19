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

} 