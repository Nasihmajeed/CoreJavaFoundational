package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Wildbull extends Animal implements Herbivores
{
	
	
    int Aggressivelevel=30;
	public Wildbull(String name,int strengthlevel,int x,int y,int range)
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
	
	
	 public Animal escape(Animal enemy ,int luckfactor)
	 {
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
		    System.out.println("\t\t"+this.name+"\t\t"+"escaped from"+enemy.name);
			return null;
		}
		
	 }
        
  
}  