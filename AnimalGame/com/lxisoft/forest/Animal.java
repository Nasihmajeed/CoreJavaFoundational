package com.lxisoft.forest;
import java.util.*;
public abstract class Animal
{
	private String animalName;
	private int animalStrength;
	private boolean isAlive;

	
	
	public void setAnimalName(String name)
	{
		this.animalName = name;
	}
	public String getAnimalName()
	{
		return animalName;
	}
	public void setAnimalStrength(int strength)
	{
		this.animalStrength = strength;
	}
	public int getAnimalStrength()
	{
		return animalStrength;
	}
	public void setIsAlive(boolean alive)
	{
		this.isAlive = alive;
	}
	public boolean getIsAlive()
	{
		return isAlive;
	}
}