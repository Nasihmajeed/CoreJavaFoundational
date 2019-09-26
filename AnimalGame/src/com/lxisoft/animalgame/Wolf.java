package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Wolf extends Animal implements Carnivores
{
	
	
    int Aggressivelevel=60;
	public Wolf(String name,int strengthlevel,boolean isAlive)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
	}
	public void eat()
	{
		System.out.println("wolf ate Rabit");
	}
 
 
	 public Animal attack(Animal enemy)
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