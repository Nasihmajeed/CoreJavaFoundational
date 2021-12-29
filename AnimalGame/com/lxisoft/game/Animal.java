package com.lxisoft.game;

import java.util.Random;
import com.lxisoft.animals.*;
import com.lxisoft.factors.Location;

public class Animal {
	private String animalName;
	private int starvage,strength,distance,luckFactor;
	public Location animalLocation = new Location() ;
        

public Animal(String animalName,int starvage,int strength,int distance){
	
	this.animalName = animalName;
	this.starvage = starvage;
	this.strength = strength;
	this.distance = distance;
	
}

Random rand = new Random();

public String getName()
{
	return animalName;
}
																	//name
public void setName(String animalName)
{
	
	this.animalName=animalName;
}

public int getStarvage()
{
return starvage; 	
}
                                    

public void setStarvage(int starvage)	               //starvage
{
	this.starvage=starvage;
}

public int getDistance()
{
return distance;
}

                                        
public void setDistance(int distance)		               //distance
{
	this.distance=distance;
}

public int getStrength()
{
	return strength;
}                                        

public void setStrength(int strength)			           //stamina
{
	this.strength = strength;
}

public int getLuckFactor()									//luckFactor
{
	
	luckFactor=rand.nextInt(3);
	return luckFactor;

}

public void setLocation(int x,int y)
	{
		animalLocation.setLocationXAxis(x) ;
		animalLocation.setLocationYAxis(y) ;
	}

public int getLocationX()
	{
		//System.out.println("\t Scale of X - Axis : \t" +animalLocation.getLocationXAxis());
		return animalLocation.getLocationXAxis();
	}

	public int getLocationY()
	{
		
		//System.out.println("\t Scale of Y - Axis : \t" +animalLocation.getLocationYAxis());
		return animalLocation.getLocationYAxis();
	}

protected void printData() {
         
  
	System.out.println("Name : " + this.getName());
	System.out.println("Starvage : " + this.getStarvage());
	System.out.println("strength : " + this.getStrength());
	System.out.println("Distance: " + this.getDistance());
	System.out.println();
 
}






}
