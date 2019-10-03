package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import  java.lang.Math;

public abstract class Animal
{
	public int luckyfact;
	int strength,range,forsight,speed;
	public String name;
	boolean isDead;
	Hunger hunger;
	int[] location=new int[2];

 	public void getAnimalDetails()
	{
		System.out.print("\t" + name + "  Strength= " + strength +"\tDefault location: "+location[0]+"  "+location[1]+" ");	
	}

}