package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public abstract class Animal
{
	String name;
	int strength;
	boolean isDead;
	int luck;
	int xaxis;
	int yaxis;
	int range;
	Hunger hunger;
	
	public abstract void eat();
	public abstract void run();
	public abstract void animalsRoam();

}

