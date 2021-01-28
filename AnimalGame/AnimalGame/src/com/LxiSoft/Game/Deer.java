package com.LxiSoft.Game;

public class Deer extends Animal implements Herbivore
{
    public void animalDetails()
    {
        System.out.println("\n        3. Deer ");
        System.out.println("            -> Deer or true deer are hoofed ruminant mammals forming the family Cervidae.");
        System.out.println("            -> The two main groups of deer are the Cervinae, including the muntjac, the elk, the red deer, the fallow deer, and the chital;");
        System.out.println("                                           and the Capreolinae, including the reindeer, the roe deer, the mule deer, and the moose.");
    }

    public void behaviour()
    {
        System.out.println("\n            -> Deer is a Herbivore.");
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
