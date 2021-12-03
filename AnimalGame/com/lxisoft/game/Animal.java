package com.lxisoft.game;

public class Animal {
       String animalName;
int energy,stamina,distance;


public void wildAnimals()
{
	
	System.out.println("1.Tiger");
	System.out.println("2.Rabbit");
	System.out.println("3.Deer");
	System.out.println("4.Fox");
	System.out.println("5.Lion");
	System.out.println("6.Elephant");
	System.out.println("7.Leopard");
	System.out.println("8.Guar");
	System.out.println("9.Crocodile");
	System.out.println("10.Rhinoceros");
                     System.out.println("The above Animals are ...... FIGHTERS");
	
	
			try{ 
				Thread.sleep(1000);
			      }
	     catch(InterruptedException e)
			     {
						Thread.currentThread().interrupt();
					}
	
}
								//name
public void setName(String animalName)
{
	this.animalName=animalName;
}

public String getName()
{
	return animalName;
}
                                                      //energy

public void setEnergy(int energy)
{
	this.energy=energy;
}

public int getEnergy()
{
return energy; 	
}

                                                       //distance
public void setDistance(int distance)
{
	this.distance=distance;
}

public int getDistance()
{
return distance;
}

                                                     //stamina

public void setStamina(int stamina)
{
	this.stamina=stamina;
}

public int getStamina()
{
	return stamina;
}
}
