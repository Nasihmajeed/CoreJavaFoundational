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

        else if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Herbivore)
        {
			this.carnVsHerb(animal1,animal2,animals);
        }

        else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Carnivore)
        {
            this.herbVsCarn(animal1,animal2,animals);
        }
        
        else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Herbivore)
        {
			System.out.println("		"+animals.get(animal1).getName()+" met "+animals.get(animal2).getName());
			this.result(animal1,animal2,animals);
			System.out.println("\n");
			System.out.println("+------------------------------------------------------------------+"); 
            System.out.println("	"+animals.get(animal1).getName()+" and "+animals.get(animal2).getName()+" doesn't fight each other");
		}
    }

    public void carnVsCarn(int anml1,int anml2,ArrayList<Animal> animals)
    {
		boolean area = this.setDomain(anml1,anml2,animals);
        if(area == true)
        {
            if(animals.get(anml1).getView() > animals.get(anml2).getView() || animals.get(anml2).getView() > animals.get(anml1).getView())
            {
				System.out.println("	"+animals.get(anml1).getName()+" and "+animals.get(anml2).getName()+" meet and fight each other");
                if(animals.get(anml1).getHungerLevel() > 2 || animals.get(anml2).getHungerLevel() > 2)
                {
        /*1*/       if(animals.get(anml1).getStrength() > animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() > animals.get(anml2).getEnergyLevel())
                    {
						this.result(anml1,anml2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(anml1).getName()+" killed "+animals.get(anml2).getName());
                        System.out.println("\n");

			            animals.remove(anml2);
			            this.hungerLevel(anml1, animals);
                    }
                    
        /*2*/       else if(animals.get(anml2).getStrength() > animals.get(anml1).getStrength() && animals.get(anml2).getEnergyLevel() > animals.get(anml1).getEnergyLevel())
                    {
						this.result(anml1,anml2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(anml2).getName()+" killed "+animals.get(anml1).getName());
                        System.out.println("\n");

			            animals.remove(anml1);
			            this.hungerLevel(anml2, animals);
                    }
                    
        /*3*/       else if(animals.get(anml1).getStrength() > animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() < animals.get(anml2).getEnergyLevel())
                    {
						this.result(anml1,anml2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(anml1).getName()+" killed "+animals.get(anml2).getName());
                        System.out.println("\n");

		                animals.remove(anml2);
		                this.hungerLevel(anml1, animals);
                    }
                    
		/*4*/       else if(animals.get(anml1).getStrength() < animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() > animals.get(anml2).getEnergyLevel()){
						this.result(anml1,anml2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(anml2).getName()+" killed "+animals.get(anml1).getName());
                        System.out.println("\n");

		                animals.remove(anml1);
		                this.hungerLevel(anml2, animals);
                    }
                    
		/*5*/       else if(animals.get(anml1).getStrength() > animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() == animals.get(anml2).getEnergyLevel()){
						this.result(anml1,anml2,animals);
						System.out.println("\n");
		                System.out.println(" \t"+animals.get(anml1).getName()+" killed "+animals.get(anml2).getName());
                        System.out.println("\n");

                        animals.remove(anml2);
		                this.hungerLevel(anml1, animals);
                    }
                    
		/*6*/       else if(animals.get(anml1).getStrength() < animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() == animals.get(anml2).getEnergyLevel()){
						this.result(anml1,anml2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(anml2).getName()+" killed "+animals.get(anml1).getName());
                        System.out.println("\n");

                        animals.remove(anml1);
		                this.hungerLevel(anml2, animals);
                    }
                    
		/*7*/       else if(animals.get(anml1).getStrength() == animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() > animals.get(anml2).getEnergyLevel()){
						this.result(anml1,anml2,animals);
						System.out.println("\n");
                        System.out.println(" "+animals.get(anml1).getName()+" escaped from "+animals.get(anml2).getName()+" ");
                        System.out.println("\n");
                    }
                    
		/*8*/       else if(animals.get(anml1).getStrength() == animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() < animals.get(anml2).getEnergyLevel()){
		                this.result(anml1,anml2,animals);
                        System.out.println(" "+animals.get(anml2).getName()+" escaped from "+animals.get(anml1).getName()+"  ");
                        System.out.println("\n");
                    } 
                    
		/*9*/       else if(animals.get(anml1).getStrength() == animals.get(anml2).getStrength() && animals.get(anml1).getEnergyLevel() == animals.get(anml2).getEnergyLevel()){
		                this.result(anml1,anml2,animals);
		                System.out.println(" "+animals.get(anml1).getName()+" , "+animals.get(anml2).getName()+" got tie ");
						System.out.println("+------------------------------------------------------------------+"); 
					}
                
        /*10*/  	else if(animals.get(anml1).getHungerLevel() <= 2 || animals.get(anml2).getHungerLevel() <= 2)
                	{
				    	System.out.println(animals.get(anml1).getName()+" and "+animals.get(anml2).getName()+"Not hungry & doesn't fight");
		        	}
            	}
            	else 
            	{
		    		System.out.println(animals.get(anml1).getName()+" and "+animals.get(anml2).getName()+" doesn't meet ");
	    		}
			}
		}
	}
    
    public void carnVsHerb(int anim1, int anim2,ArrayList<Animal> animals)
    {
    boolean area = this.setDomain(anim1,anim2,animals);
		if(area == true)
		{

/*1*/       if(animals.get(anim1).getView() > animals.get(anim2).getView())
			{
                System.out.println("\t\t"+animals.get(anim1).getName()+" spotted "+animals.get(anim2).getName()+" and start to attack");
/*2*/           if(animals.get(anim1).getHungerLevel() > 2)
				{
/*3*/				if(animals.get(anim1).getStrength() > animals.get(anim2).getStrength() && animals.get(anim1).getEnergyLevel() > animals.get(anim2).getEnergyLevel())
					{
						this.result(anim1,anim2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(anim1).getName()+" killed "+animals.get(anim2).getName());
                        System.out.println("\n");

			            animals.remove(anim2);
			            this.hungerLevel(anim1, animals);
			        }
		        
/*4*/	            else if(animals.get(anim1).getStrength() > animals.get(anim2).getStrength() && animals.get(anim1).getEnergyLevel() < animals.get(anim2).getEnergyLevel())
                    {
						this.result(anim1,anim2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(anim1).getName()+" killed "+animals.get(anim2).getName());
                        System.out.println("\n");

		                animals.remove(anim2);
		                this.hungerLevel(anim1, animals);
			        }
		        
			    }
/*5*/		    else if(animals.get(anim1).getHungerLevel() < 2)
                {
				    System.out.println("The Carnivore isn't hungry, doesn't attack");
			    }
			}
/*6*/		else
            {
				System.out.println(" "+animals.get(anim2).getName()+" escaped from "+animals.get(anim1).getName());
			}
		}
	}

    public void herbVsCarn(int animl1, int animl2 ,ArrayList<Animal> animals)
    {
		boolean area = this.setDomain(animl1,animl2,animals);
        if(area == true)
        {
/*1*/       if(animals.get(animl1) instanceof Herbivore && animals.get(animl2) instanceof Carnivore)
            {
/*2*/           if(animals.get(animl1).getView() < animals.get(animl2).getView())
                {
			    	System.out.println(" "+animals.get(animl2).getName()+" spotted "+animals.get(animl1).getName()+" and start to attack");
/*3*/               if(animals.get(animl2).getStrength() > animals.get(animl1).getStrength() && animals.get(animl2).getEnergyLevel() > animals.get(animl1).getEnergyLevel())
                    {
						this.result(animl1,animl2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(animl2).getName()+" killed "+animals.get(animl1).getName());
                        System.out.println("\n");

		                animals.remove(animl1);
						this.hungerLevel(animl2, animals);                    }
                    
/*4*/               else if(animals.get(animl1).getStrength() < animals.get(animl2).getStrength() && animals.get(animl1).getEnergyLevel() > animals.get(animl2).getEnergyLevel())
                    {
						this.result(animl1,animl2,animals);
						System.out.println("\n");
                        System.out.println(" \t"+animals.get(animl2).getName()+" killed "+animals.get(animl1).getName());
                        System.out.println("\n");

		                animals.remove(animl1);
		                this.hungerLevel(animl2, animals);
			    	}
/*5*/		    	else
                	{
				    	System.out.println(" "+animals.get(animl1).getName()+" escaped from "+animals.get(animl2).getName());
			    	}
		    	}
			}
		}    
	}
    
    public boolean setDomain(int animl1, int animl2, ArrayList<Animal> animals)
    {	
		int range = 10;
		int territory = (animals.get(animl1).getArea()) - (animals.get(animl2).getArea());
        if(range>territory)
        {
			System.out.println("+------------------------------------------------------------------+"); 
			System.out.println("		"+animals.get(animl1).getName()+" and "+animals.get(animl2).getName()+" are in same territory ");
			System.out.println("\n");
			return true;
		}
        else
        {
			System.out.println("+------------------------------------------------------------------+"); 
			System.out.println("    "+animals.get(animl1).getName()+" and "+animals.get(animl2).getName()+" doesn't meet as they aren't in same territory");
			return false;
		}
	}
	
	public void hungerLevel(int x, ArrayList<Animal> animals)
	{
		int hunger = animals.get(x).getHungerLevel();
		hunger = hunger-1;
		animals.get(x).setHungerLevel(hunger);
	}
    
    public void result(int animl1,int animl2,ArrayList<Animal> animals)
    {
		System.out.println("+------------------------------------------------------------------+"); 
		System.out.println("\n");       
		System.out.println("		"+animals.get(animl1).getName()+" \tv/s\t"+animals.get(animl2).getName());
		System.out.println("\n");

		System.out.println(" \tEnergy Level    :      "+animals.get(animl1).getEnergyLevel()+"\tv/s\t"+animals.get(animl2).getEnergyLevel());
		System.out.println(" \tStrength Level  :      "+animals.get(animl1).getStrength()+"\tv/s\t"+animals.get(animl2).getStrength());
		System.out.println(" \tHunger Level    :      "+animals.get(animl1).getHungerLevel()+"\tv/s\t"+animals.get(animl2).getHungerLevel());
	}
}