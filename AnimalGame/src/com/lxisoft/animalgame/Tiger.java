package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
 public class Tiger extends Animal implements Carnivores
{
    int Aggressivelevel=50;
	public Tiger(String name,int strengthlevel,boolean isAlive,int x,int y)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
	}
	public void eat()
	{
		System.out.println("Tiger ate Rabit");
		
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