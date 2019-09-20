package com.lxisoft.animalgame;
public class Wildbull extends Animal
{
	
	
    int Aggressivelevel=30;
	public Wildbull(String name,int strengthlevel,boolean isAlive)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
	}
	/* public void eat()
	{
		System.out.println("wildbull killed Wolf");
	}
    */
	
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