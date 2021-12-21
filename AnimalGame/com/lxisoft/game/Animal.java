package com.lxisoft.game;

import com.lxisoft.animals.*;
public abstract class Animal {
	private String animalName;
	private int starvage,strength,distance;
	Animal winner;
         int starvageOfPlayer1,starvageOfPlayer2;
         int strengthOfPlayer1,strengthOfPlayer2;

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


public Animal startFight(Animal player1,Animal player2){  // new venture
	
	
	starvageOfPlayer1 = player1.getStarvage();
	starvageOfPlayer2 = player2.getStarvage();

	strengthOfPlayer1 = player1.getStrength();
	strengthOfPlayer2 = player2.getStrength();
	//System.out.println("hello");
	//return player1;
	if(player1 instanceof Carnivores) {
				
		System.out.println(player2.getName()+" was very unlucky and caught by "+player1.getName());
		

			System.out.println("player" +player2.getName()+ "is very lucky_!!!  just escaped from " +player1.getName());
	
		System.out.println(player2.getName()+" is caught by "+player1.getName());
		System.out.println(player1.getName()+" is attacking "+player2.getName());
																	
		System.out.println("Starvage of "+player1.getName()+" is higher than the Strength of "+player2.getName());
	 
		
																  
										   System.out.println("Strength of "+player2.getName()+" is decreasing !!!!!!");
										   strengthOfPlayer2  = 0;
												   
										   System.out.println("Strength of "+player2.getName()+" reduced to "+strengthOfPlayer2);								  
																  
										
										   System.out.println("The Strength of "+player2.getName()+" is decreasing");
										   System.out.println(player1.getName()+" Defeated and Killed by "+player2.getName());
										   
			  winner = player1;
			  return winner;
}
else if(player2 instanceof Carnivores){
	System.out.println(player1.getName()+" was very unlucky and caught by "+player2.getName());
	System.out.println(player1.getName()+" is caught by "+player2.getName());
	System.out.println(player2.getName()+" is attacking "+player1.getName());
																
	System.out.println("Starvage of "+player2.getName()+" is higher than the Strength of "+player1.getName());
	System.out.println("The Strength of "+player1.getName()+" is decreasing");	
	
System.out.println("Strength of "+player1.getName()+" is decreasing !!!!!!");
strengthOfPlayer1 = 0;		
System.out.println("Strength of "+player1.getName()+" reduced to "+strengthOfPlayer1);								  
	

System.out.println("The Strength of "+player1.getName()+" is decreasing");
System.out.println(player1.getName()+" Defeated and Killed by "+player2.getName());

	winner = player2;
	return winner;
}



return player1;
}



}
