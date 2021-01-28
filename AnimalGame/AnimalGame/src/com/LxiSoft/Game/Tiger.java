package com.LxiSoft.Game;

public class Tiger extends Animal implements Carnivore
{
    public void animalDetails()
    {
        System.out.println("\n        1. Tiger");
        System.out.println("            -> The tiger is the largest extant cat species and a member of the genus Panthera.");
        System.out.println("            -> It is most recognisable for its dark vertical stripes on orange-brown fur with a lighter underside.");
        System.out.println("            -> It is an apex predator, primarily preying on ungulates such as deer and wild boar.");
    }

    public void behaviour()
    {
        System.out.println("\n            -> Tiger is a Carnivore.");
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
