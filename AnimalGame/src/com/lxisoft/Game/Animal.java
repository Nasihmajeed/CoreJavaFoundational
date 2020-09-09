package com.lxisoft.Game;
import com.lxisoft.Animals.*;

public abstract class Animal
{
	private boolean animalLife;
	private String name;
	private int animalStrength;
	int range;


	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
		public String getAnimalName()
		{
		return name;
     	}


	public void setAnimalStrength(int a)
	{
		this.animalStrength=a;
	}
	public int getAnimalStrength()
	{
		return animalStrength;
	}

	public void setAnimalLife(boolean life)

	{
		this.animalLife=life;
	}

	public boolean getAnimalLife()
	{
		return animalLife;
	}

	public void setRange(int r)
	{
		range=r;
	}
	public int getRange()
	{
		return range;
	}


}