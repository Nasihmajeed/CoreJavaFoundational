package com.lxisoft.animalgame;
public class Tiger extends Animal
{
    int Aggressivelevel=50;
	public Tiger(String name,int strengthlevel,boolean isAlive)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
	}
	public void eat()
	{
		System.out.println("Tiger ate Rabit");
		
	}
	
	public Animal animalFight(Animal enemy)
	{  
		if(this.strengthlevel>enemy.strengthlevel)
		{	
		  return this;
		}
		else
		{
			return enemy;
		}

	}
 
  
}  