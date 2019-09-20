package com.lxisoft.animalgame;
public class Lion extends Animal
{   
   

    int Aggressivelevel=50; 
    public Lion(String name,int strengthlevel,boolean isAlive)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		this.isAlive=true;
	}

  public void eat()
  {
	 System.out.println("Lion ate Rabbit");
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