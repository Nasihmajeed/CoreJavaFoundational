package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import  java.lang.Math;

public abstract class Animal
{
	int strength,range,forsight;
	public String name;
	boolean isDead;
	Hunger hunger;
	int[] location=new int[2];

 	public void getDetails()
	{
		System.out.print("\t" + name + "  Strength= " + strength +"\tDefault location: "+location[0]+"  "+location[1]+" ");	
	}

}