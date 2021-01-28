package com.LxiSoft.Game;

public class Lion extends Animal implements Carnivore
{
    public void animalDetails()
    {
        System.out.println("\n        2. Lion");
        System.out.println("            -> The lion is a species in the family Felidae and a member of the genus Panthera.");
        System.out.println("            -> It has a muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail.");
        System.out.println("            -> It is sexually dimorphic; adult male lions have a prominent mane.");
    }

    public void behaviour()
    {
        System.out.println("\n            -> Lion is a Carnivore.");
        // System.out.println("            -> Carnivores are violent flesh eating animals. They usually hunt for food.");
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
