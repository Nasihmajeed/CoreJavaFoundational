package com.animals;

import java.util.*;
import java.util.Random;

public class Animal 
{
String animalName;
int energy,stamina,distance,luckFactor;

Random ran=new Random();

public void wildAnimals()
{
	System.out.println("There are many wild animals in the forest.............Animals given below can be used for the _F_I_G_H_T_");
	System.out.println("1.Tiger");
	System.out.println("2.Rabbit");
	System.out.println("3.Deer");
	System.out.println("4.Zebra");
	System.out.println("5.Lion");
	System.out.println("6.Crocodile");
	System.out.println("7.Antelope");
	System.out.println("8.Fox");
	
	try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
	
	
	
}

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

public int getLuckFactor()
{
	
	luckFactor=ran.nextInt(3);
	return luckFactor;

}

}