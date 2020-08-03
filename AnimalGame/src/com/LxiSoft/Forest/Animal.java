package com.LxiSoft.Forest;
public class Animal
{
	private String name;
	private int animalStrength;
	private Boolean animalLife;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
		public String getAnimalName(){
		return name;
	}


	public void setAnimalStrength(int a)
	{
		this.animalStrength=a;
	}
	public int getAnimalStrength(){
		return animalStrength;
	}

	
	public void getAnimalLife(boolean life)

	{
		this.animalLife=life;
	}
	public void setAnimalLife()
	{
		return animalLife;
	}


}