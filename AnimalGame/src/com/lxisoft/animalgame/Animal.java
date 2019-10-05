package com.lxisoft.animalgame;
public abstract class Animal
{
	public String animalName;
	public int strength;
	public int range;
	public boolean isDead;
	public int luck;
	public int xAxis;
	public int yAxis;
	public int sight;
	public Hunger hunger;
	public int speed;
	
	public abstract void run();
	public abstract void eat();
	
}