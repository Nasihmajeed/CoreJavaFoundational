package com.lxisoft.animalgame;
public class Wolf extends Animal
{
	
	
    int Aggressivelevel=60;
	public Wolf(String name,int strengthlevel)
	{
		this.name=name;
		this.strengthlevel=strengthlevel;
		
	}
	public void eat()
	{
		System.out.println("wolf ate Rabit");
	}
 
  
}  