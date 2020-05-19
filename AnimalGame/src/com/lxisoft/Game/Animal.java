package com.lxisoft.Game ;

public abstract class Animal
{
	private String animalName ;
	private int animalStrength,animalEnergy=100 ;

	public String getAnimalName()
	{
		return animalName ;
	}
	public void setAnimalName(String name)
	{
		animalName = name ;
	}

	public int getAnimalStrength()
	{
		return animalStrength ;
	}
	public void setAnimalStrength(int str)
	{
		animalStrength = str ;
	}

	public int getAnimalEnergy()
	{
		return animalEnergy ;
	}
	public void setAnimalEnergy(int e)
	{
		animalEnergy = e ;
	}

}