package com.lxisoft.game;

import java.util.Random;
import com.lxisoft.animals.*;
import com.lxisoft.factors.Location;
import java.*;
import com.lxisoft.*;
public abstract class Animal {
	private String animalName;
	private int starvage,strength,distance,luckFactor;
	private boolean isAlive;
	
	public Location animalLocation = new Location() ;
        

public Animal(String animalName,int starvage,int strength,int distance,boolean isAlive){
	
	this.animalName = animalName;
	this.starvage = starvage;
	this.strength = strength;
	this.distance = distance;
	this.isAlive =  isAlive;
	
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

public boolean getIsAlive()
	{
		return isAlive;
	}

public void setIsAlive(boolean alive)
	{
		this.isAlive = alive;
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


public Animal startFight(Animal player1,Animal player2){  // new venture
	
	
	int starvageOfPlayer1 = player1.getStarvage();
	int starvageOfPlayer2 = player2.getStarvage();
	Animal winner;
	int strengthOfPlayer1 = player1.getStrength();
	int strengthOfPlayer2 = player2.getStrength();
	//System.out.println("hello");
	if(player1 instanceof Herbivores && player2 instanceof Herbivores){

		System.out.println("We are Trying to Attack both us!!!");
		System.out.println(player1.getName() +"BOOM _ BOOM _ BOOM" + player2.getName());
		System.out.println("We can't Fight Togather Because We are Best FRIENDS*~~~~~~~*");

		return player1;

	}
	//return player1;
	else if(player1 instanceof Carnivores && player2 instanceof Herbivores) {
				
		System.out.println("\n" +player2.getName()+" was very unlucky and caught by "+player1.getName());
		if(player2.getLuckFactor() >= 5 ){

		System.out.println(" \n But fortunately player " +player2.getName()+ " is very lucky_!!!  just escaped from \n" +player1.getName());
		Herbivores.escapeFromEnemy(player1,player2);
	}else{
			System.out.println("\n \t \t \t THE REAL FIGHT @@@BEGINS@@@ \t \t \n");
		
		System.out.println("\t"+player2.getName()+" is caught by "+player1.getName());
		System.out.println("\t" +player1.getName()+" is attacking "+player2.getName());
														System.out.println();			
		System.out.println(" Starvage of "+player1.getName()+" is higher than the Strength of "+player2.getName() );
	 
		System.out.println("\t\t\t . \t\t\t");
																  
										   System.out.println("\t Strength of "+player2.getName()+" is decreasing !!!!!!");
										   strengthOfPlayer2  = 0;
										   System.out.println("\t\t\t .. \t\t\t");
										   System.out.println("\t Strength of "+player2.getName()+" reduced to "+strengthOfPlayer2);								  
																  
										   System.out.println("\t\t\t ... \t\t\t");
										  /// System.out.println("The Strength of "+player2.getName()+" is decreasing");
										  if(player2.getIsAlive() == true && player2.getStrength() < 7){
											Carnivores c = (Carnivores) player1;
															 c.killOpponent(player1,player2);
															
         System.out.println("\t"+ player2.getName()+" Defeated and Killed by "+player1.getName());
System.out.println("\t\t\t ------------- \t\t\t");
									}else{
										System.out.println("There have some chances to escape");
										Herbivores.escapeFromEnemy(player1,player2);
									}
										 /*  System.out.println("\t"+ player1.getName()+" Defeated and Killed by "+player2.getName());
										   System.out.println("\t\t\t ------------- \t\t\t");*/
										  

			  winner = player1;
			  return winner;
		}
		
}
else if(player1 instanceof Herbivores && player2 instanceof Carnivores){
	
	System.out.println(player1.getName()+" was very unlucky and caught by "+player2.getName());
	if(player2.getLuckFactor() >= 5 ){

	System.out.println(" player " +player1.getName()+ " is very lucky_!!!  just escaped from " +player2.getName());

	Herbivores.escapeFromEnemy(player1,player2);

	}else{

		System.out.println("\n \t \t \t THE REAL FIGHT @@@BEGINS@@@ \t \t \n");

	System.out.println("\t"+ player1.getName()+" is caught by "+player2.getName());
	System.out.println("\t"+ player2.getName()+" is attacking "+player1.getName());
					System.out.println();											
	System.out.println(" Starvage of "+player2.getName()+" is higher than the Strength of "+player1.getName() );
	System.out.println("\t\t\t . \t\t\t");
	System.out.println("\t The Strength of "+player1.getName()+" is decreasing");	
	System.out.println("\t\t\t .. \t\t\t");
//System.out.println("Strength of "+player1.getName()+" is decreasing !!!!!!");
strengthOfPlayer1 = 0;		
System.out.println("\t Strength of "+player1.getName()+" reduced to "+strengthOfPlayer1);								  
System.out.println("\t\t\t ... \t\t\t");
if(player1.getIsAlive() == true && player1.getStrength() < 7){
		Carnivores c = (Carnivores) player2;
                         c.killOpponent(player1,player2);
				
         System.out.println("\t"+ player2.getName()+" Defeated and Killed by "+player1.getName());
System.out.println("\t\t\t ------------- \t\t\t");
}
else{
//System.out.println("The Strength of "+player1.getName()+" is decreasing");
System.out.println("There have some chances to escape");
										   Herbivores.escapeFromEnemy(player1,player2);
										   
}
	winner = player2;
	return winner;
	}
}
else{
	if(player1 instanceof Carnivores && player2 instanceof Carnivores){

		System.out.println(player1.getName()+" meeting "+player2.getName());
		System.out.println(player1.getName()+" has "+strengthOfPlayer1+" Strength Level And "+player2.getName()+" has "+strengthOfPlayer2+" Strength Level");
		System.out.println(player1.getName()+" has "+starvageOfPlayer2+" Starvage Level And "+player2.getName()+" has "+starvageOfPlayer2+" Starvage Level");
		System.out.println("shitt!!! WE WILL NEVER WIN BECAUSE WE CAN'T KILL BOTH OF US............");
	}
return player2;
}

return player1;
}



}
