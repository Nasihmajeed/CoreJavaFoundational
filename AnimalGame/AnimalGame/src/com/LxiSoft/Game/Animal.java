package com.LxiSoft.Game;

public class Animal 
{
    String animalName;
    int energyLevel;
    int strength;
    int hungerLevel;
	int domain;
	int eyeSight;

    public void setName(String name)
    {
        this.animalName = name;
    }
    public String getName()
    {
        return animalName;
    } 
   
    public void setEnergyLevel(int energy)
    {
        this.energyLevel = energy;
    }
    public int getEnergyLevel()
    {
        return energyLevel;
    }

    public void setStrength(int strenth)
    {
        this.strength = strenth;
    }
    public int getStrength()
    {
        return strength;
    }

    public void setHungerLevel(int hunger)
    {
        this.hungerLevel = hunger;
    }
    public int getHungerLevel()
    {
        return hungerLevel;
    }

    public void setDomain(int area)
    {
		this.domain = area;
	}
    public int getArea()
    {
		return domain;
    }
    
    public void setView(int view)
    {
		this.eyeSight = view;
	}
    public int getView()
    {
		return eyeSight;
	}
}
