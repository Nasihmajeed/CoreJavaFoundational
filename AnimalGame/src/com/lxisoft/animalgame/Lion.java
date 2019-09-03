package com.lxisoft.animalgame;
public class Lion extends Animal
{   
   

    int Aggressivelevel=50; 
    public Lion(String name,int strengthlevel)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		
	}

  public void eat()
  {
	 System.out.println("Lion ate Rabbit");
  }
   

}