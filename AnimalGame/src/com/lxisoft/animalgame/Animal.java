package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Forest;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
import java.util.Scanner;
public abstract class Animal 
{
	String name;
	boolean isAlive;
	int strengthlevel;
	
	public void display()
	{
		System.out.println(" name= "+this.name+ "strengthlevel= "+this.strengthlevel +"\n");
	}
	
	
	
	// this method helds the fighting of animals
	/* public Animal animalFight(Animal enemy)
	{  
		return enemy;
	} */
	
	public abstract Animal animalFight(Animal enemy);
	
} 
             