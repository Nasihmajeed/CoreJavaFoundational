package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Forest;
import java.util.Scanner;
public abstract class Animal 
{
	String name;
	boolean isAlive;
	int strengthlevel;
	int x,y;
	
	public void display()
	{
		System.out.println(" name= "+this.name+ "strengthlevel= "+this.strengthlevel +"\n");
	}	
    
	
	
}
             