package com.lxisoft.forest;
public class Animal
{
	private String animalName;
	private int animalStrength;
	private boolean isAlive;
	private boolean isLuck;

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
	public void setLuckFactor(boolean luck)
	{
		this.isLuck = luck;
	}

	public boolean getIsLuck()
	{
		return isLuck;
	}
		

}