package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Leopard extends Animal implements Carnivores
{
	
	
    int Aggressivelevel=70;
	public Leopard(String name,int strengthlevel,boolean isAlive)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
	}
	public void eat()
	{
		System.out.println("leopard ate Rabit");
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