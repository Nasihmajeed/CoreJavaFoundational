package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Rabbit;
public abstract class Animal
{
	public String animalName;
	public int strength;
	boolean isDead;
	public void eat()
	{
		System.out.println("Carnivores eat meat");		
		System.out.println("Herbivores eat grass and vegitables");
	}
	public void escape(Animal animal)
	{
		
	}
}
	