package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
//import com.lxisoft.animalgame.Rabit;
//import com.lxisoft.animalgame.Animal;

public class Rabit extends Animal implements Herbivores
{
	
    int Aggressivelevel=5;
	public Rabit(String name,int strengthlevel,int x,int y,int range)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
		this.x=x;
		this.y=y;
		this.range=range;
	}
  
  public int luckfactor()
	{
		int luckfactor= (int)(Math.random()*50);
		
		return luckfactor;
	}

	 public Animal escape(Animal enemy, int luckfactor)
	 {
		 System.out.println("333333333333333333333333333333333333333333");
		 
	  if(luckfactor<=25)
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
		else
		{
		    System.out.println(this.name+"escaped from"+enemy.name);
			
		}
	 }
  
}