package com.LxiSoft.Game;

import java.util.*;

public class Fight 
{
    public void startFight(int animal1,int animal2,ArrayList<Animal>animals)
    {
        if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Carnivore)
        {
            this.carnVsCarn(animal1,animal2,animals);
        }
        else if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Herbivore || (animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Carnivore))
        {
			this.carnVsHerb(animal1,animal2,animals);
        }
        
        else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Herbivore)
        {
            System.out.println(animals.get(animal1).getName()+" and "+animals.get(animal2).getName()+" doesn't fight each other");
            System.out.println("\n");
		}
    }

    public void carnVsCarn(int n1,int n2,ArrayList<Animal> animals)
    {

            if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel())
            {
			    System.out.println(animals.get(n1).getName()+" killed "+animals.get(n2).getName());
                animals.remove(n2);
                System.out.println("\n");
            }
            
         
            
            else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel())
            {
                System.out.println(animals.get(n2).getName()+" escaped from "+animals.get(n1).getName()+" ");
                System.out.println("\n");
            } 
            
            else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel())
            {
                System.out.println(animals.get(n1).getName()+" , "+animals.get(n2).getName()+" got tie ");
                System.out.println("\n");
		    }
    }
    

    public void carnVsHerb(int anim1, int anim2,ArrayList<Animal> animals)
    {
            if(animals.get(anim1).getStrength() > animals.get(anim2).getStrength() && animals.get(anim1).getEnergyLevel() > animals.get(anim2).getEnergyLevel())
            {
			    System.out.println(animals.get(anim1).getName()+" killed "+animals.get(anim2).getName());
                animals.remove(anim2);
                System.out.println("\n");
			}
            
          
	}
}
