package com.lxisoft.animalgame;
public abstract class Animal
{
	public String animalName;
	public int strength;
	public int range;
	public boolean isDead=false;
	public int luck;
	public int xAxis;
	public int yAxis;
	public int sight;
	
	public abstract void run();
	public abstract void eat();
	
}