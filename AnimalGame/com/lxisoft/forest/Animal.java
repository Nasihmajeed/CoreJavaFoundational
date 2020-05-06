package com.lxisoft.forest;
import java.util.*;
public abstract class Animal
{
	private String animalName;
	private int animalStrength;
	private boolean isAlive;
	private int x;
	private int y;

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
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
}