package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
//import com.lxisoft.animalgame.Rabit;
//import com.lxisoft.animalgame.Animal;

public class Rabit extends Animal implements Herbivores
{
	
    int Aggressivelevel=5;
	public Rabit(String name,int strengthlevel,boolean isAlive)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
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