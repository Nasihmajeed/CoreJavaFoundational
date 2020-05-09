package com.lxisoft.Game;
public class Animal
{
	private String animalName;
	public int animalEnergy;



	public void setAnimalName(String name)
	{
		animalName=name;
	}

	
	public String getAnimalName()
	{
		return animalName;
	}
	public void setAnimalDetail(String name,int energy)
	{
		animalName=name;
		animalEnergy=energy;
	}

}