package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Tiger extends Animal implements Carnivorous
{
	public void eat()
	{
		System.out.println("tiger eat flesh");
	}
	public void run()
	{
		System.out.println("tiger runs extremely fast");
	}


	public void animalsRoam()
	{
		System.out.println(" Animal--"+name);
		System.out.println(" strength--"+strength);
	}
	
	
	public Animal fight(Animal enemy)
	{
		System.out.println("				"+this.name+" VS "+enemy.name);
		if(this.strength>enemy.strength)
		{
			this.strength--;
			enemy.strength-=2;
			System.out.println("				"+this.name+" WINS  (strength="+this.strength+")\n");
			if (enemy.strength<1)
				enemy.isDead=true;
			return this;
		}
		else
		{
			enemy.strength--;
			this.strength-=2;
			System.out.println("				"+enemy.name+" WINS  (strength="+enemy.strength+")\n");
			if (this.strength<1)
				this.isDead=true;
			return enemy;
		}
	}

	public Animal fight(Animal enemy1,Animal enemy2)
	{
		System.out.println("				FIGHT between "+this.name+" VS "+enemy1.name+" VS "+enemy2.name);
		if((this.strength>enemy1.strength) && (this.strength>enemy2.strength))
		{
			this.strength-=3;
			enemy1.isDead=true;
			enemy2.isDead=true;
			System.out.println("				"+this.name+" WINS  (strength="+this.strength+")");
			System.out.println("				"+enemy1.name+" and "+enemy2.name+" IS DEAD \n");	
			return this;
		}
		else if((enemy1.strength>this.strength) && (enemy1.strength>enemy2.strength))
		{
			enemy1.strength-=3;
			this.isDead=true;
			enemy2.isDead=true;
			System.out.println("				"+enemy1.name+" WINS  (strength="+enemy1.strength+")");
			System.out.println("				"+this.name+" and "+enemy2.name+" IS DEAD \n");	
			return enemy1;
		}
		else
		{
			enemy2.strength-=3;
			enemy1.isDead=true;
			this.isDead=true;
			System.out.println("				"+enemy2.name+" WINS  (strength="+enemy2.strength+")");
			System.out.println("				"+enemy1.name+" and "+this.name+" IS DEAD \n");	
			return enemy2;
		}
	}


	
	
} 