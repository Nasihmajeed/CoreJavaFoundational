package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Rabbit;
import com.lxisoft.animalgame.Deer;
public abstract class Animal
{
	String animalName;
	int strength;
	boolean isDead;

	public Animal fight(Animal animal)
	{
        System.out.println("Fight start");
        return animal;
  	}
  	public abstract void  run();
  	public abstract void  eat();
  	
}