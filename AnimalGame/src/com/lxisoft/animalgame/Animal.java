package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public abstract class Animal
{
	String name;
	int strength;
	boolean isDead;
	int luck;
	int xCordinate;
	int yCordinate;
	int range;
	
	public abstract void eat();
	public abstract void run();
	public abstract void animalsRoam();

}

