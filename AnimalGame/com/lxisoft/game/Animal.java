package com.lxisoft.game;

public class Animal {
	private String animalName;
	private int starvage,strength,distance;

public Animal(String animalName,int starvage,int strength,int distance){
	
	this.animalName = animalName;
	this.starvage = starvage;
	this.strength = strength;
	this.distance = distance;

}


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


protected void printData() {
         
  
	System.out.println("Name : " + this.getName());
	System.out.println("Starvage : " + this.getStarvage());
	System.out.println("strength : " + this.getStrength());
	System.out.println("Distance: " + this.getDistance());
	System.out.println();
 
}

}
