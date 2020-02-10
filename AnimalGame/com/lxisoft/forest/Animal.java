package com.lxisoft.forest;
public class Animal
{
	private String animalName;
	private int animalStrength;
	private boolean isAlive;
	public void setAnimalName(String str)
	{
		this.animalName = str;
	}

	public String getAnimalName()
	{
		return animalName;
	}

	public void setAnimalStrength(int n)
	{
		this.animalStrength = n;
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