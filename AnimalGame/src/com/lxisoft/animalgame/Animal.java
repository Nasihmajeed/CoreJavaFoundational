package com.lxisoft.animalgame;
public abstract class Animal
{
	public String animalName;
	public int strength;
	public boolean isDead=false;
	public abstract void run();
	public abstract void eat();

}