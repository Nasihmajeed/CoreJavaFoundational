package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
 public class Lion extends Animal implements Carnivores
{   
   

    int Aggressivelevel=50; 
    public Lion(String name,int strengthlevel,int x,int y,int range)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
		this.x=x;
		this.y=y;
		this.range=range;
	}

  public void eat()
  {
	 System.out.println("Lion ate Rabbit");
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

	public int[] roam()
	 {
		 int[] x=new int[2];
		x[0]=(int)(Math.random()*40);
		x[1]=(int)(Math.random()*40);
		return x;
	 }
  
 

}