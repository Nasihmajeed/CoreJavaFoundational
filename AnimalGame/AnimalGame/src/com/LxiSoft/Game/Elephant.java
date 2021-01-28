package com.LxiSoft.Game;

public class Elephant extends Animal implements Herbivore
{
    public void animalDetails()
    {
        System.out.println("\n        4. Elephant");
        System.out.println("            -> Elephants are mammals of the family Elephantidae and the largest existing land animals.");
        System.out.println("            -> Three species are currently recognised: the African bush elephant, the African forest elephant, and the Asian elephant.");
        System.out.println("            -> Elephantidae is the only surviving family of the order Proboscidea; extinct members include the mastodons.");
    }

    public void behaviour()
    {
        System.out.println("\n            -> Elephant is a Herbivore.");
        // System.out.println("            -> Herbivores are plant eating animals. They are usually calm and quiet.");
    }
    
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
    
    public void seDomain(int area)
    {
		this.domain = area;
	}
    public int getDomain()
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
