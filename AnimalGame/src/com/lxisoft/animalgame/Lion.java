package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Lion extends Animal
{
    public Lion(String animalName,int strength)
	{
    this.animalName=animalName;
    this.strength=strength;
	}
	 public void fight()
	{
     System.out.println("Name= "+animalName);
     System.out.println("Power= "+strength);
	}
	
}