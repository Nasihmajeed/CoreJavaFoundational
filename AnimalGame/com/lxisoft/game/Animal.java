package com.lxisoft.game;

import java.util.Random;
import java.*;

import com.lxisoft.animals.*;
import com.lxisoft.factors.Location;
import com.lxisoft.factors.MyException;
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
	s
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

public void setAnimalLocation(int x,int y)
	{
		animalLocation.setLocationXAxis(x) ;
		animalLocation.setLocationYAxis(y) ;
	}

public int getAnimalLocationX()
	{
		//System.out.println("\t Scale of X - Axis : \t" +animalLocation.getLocationXAxis());
		return animalLocation.getLocationXAxis();
	}

	public int getAnimalLocationY()
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


public Animal startFight(Animal opponent){  // new venture
	
	
	int starvageOfPlayer1 = this.getStarvage();
	int starvageOfPlayer2 = opponent.getStarvage();
	Animal winner;
	int strengthOfPlayer1 = this.getStrength();
	int strengthOfPlayer2 = opponent.getStrength();
	//System.out.println("hello");
	if(this instanceof Herbivores && opponent instanceof Herbivores){

		
		System.out.println("We are Trying to Attack both us!!!");
		System.out.println(this.getName() +" BOOM _ BOOM _ BOOM " + opponent.getName());
		System.out.println("We can't Fight Togather Because We are Best FRIENDS *~~~~~~~*");

		
		

		
		 return this;
	}
	//return player1;
	else if(this instanceof Carnivores && opponent instanceof Herbivores) {
				
		System.out.println("\n" +opponent.getName()+" was very unlucky and caught by "+this.getName());
		if(opponent.getLuckFactor() >= 5 ){

		System.out.println(" \n But fortunately player " +opponent.getName()+ " is very lucky_!!!  just escaped from " +this.getName()+"\n");
		Herbivores.escapeFromEnemy(this,opponent);
	}else{
			System.out.println("\n \t \t \t THE REAL FIGHT @@@BEGINS@@@ \t \t \n");
		
		System.out.println("\t"+opponent.getName()+" is caught by "+this.getName());
		System.out.println("\t" +this.getName()+" is attacking "+opponent.getName());
														System.out.println();			
		System.out.println(" Starvage of "+this.getName()+" is higher than the Strength of "+opponent.getName() );
	 
		System.out.println("\t\t\t . \t\t\t");
																  
										   System.out.println("\t Strength of "+opponent.getName()+" is decreasing !!!!!!");
										   strengthOfPlayer2  = 0;
										   System.out.println("\t\t\t .. \t\t\t");
										   System.out.println("\t Strength of "+opponent.getName()+" reduced to "+strengthOfPlayer2);								  
																  
										   System.out.println("\t\t\t ... \t\t\t");
										  /// System.out.println("The Strength of "+player2.getName()+" is decreasing");
										  if(opponent.getIsAlive() == true && opponent.getStrength() < 7){
											Carnivores c = (Carnivores) this;
															 c.killOpponent(this,opponent);
															
         System.out.println("\t"+ opponent.getName()+" Defeated and Killed by "+this.getName());
System.out.println("\t\t\t ------------- \t\t\t");
									}else{
										System.out.println("There have some chances to escape");
										Herbivores.escapeFromEnemy(this,opponent);
									}
										 /*  System.out.println("\t"+ player1.getName()+" Defeated and Killed by "+player2.getName());
										   System.out.println("\t\t\t ------------- \t\t\t");*/
										  

			  winner = this;
			  return winner;
		}
		
}
else if(this instanceof Herbivores && opponent instanceof Carnivores){
	
	System.out.println(this.getName()+" was very unlucky and caught by "+opponent.getName());
	if(this.getLuckFactor() >= 5 ){

	System.out.println(" player " +this.getName()+ " is very lucky_!!!  just escaped from " +opponent.getName());

	Herbivores.escapeFromEnemy(this,opponent);

	}else{

		System.out.println("\n \t \t \t THE REAL FIGHT @@@BEGINS@@@ \t \t \n");

	System.out.println("\t"+ this.getName()+" is caught by "+opponent.getName());
	System.out.println("\t"+ opponent.getName()+" is attacking "+this.getName());
					System.out.println();											
	System.out.println(" Starvage of "+opponent.getName()+" is higher than the Strength of "+this.getName() );
	System.out.println("\t\t\t . \t\t\t");
	System.out.println("\t The Strength of "+this.getName()+" is decreasing");	
	System.out.println("\t\t\t .. \t\t\t");
//System.out.println("Strength of "+player1.getName()+" is decreasing !!!!!!");
strengthOfPlayer1 = 0;		
System.out.println("\t Strength of "+this.getName()+" reduced to "+strengthOfPlayer1);								  
System.out.println("\t\t\t ... \t\t\t");
if(this.getIsAlive() == true && this.getStrength() < 7){
		Carnivores c = (Carnivores) opponent;
                         c.killOpponent(this,opponent);
				
         System.out.println("\t"+ this.getName()+" Defeated and Killed by "+opponent.getName());
System.out.println("\t\t\t ------------- \t\t\t");
}
else{
//System.out.println("The Strength of "+player1.getName()+" is decreasing");
System.out.println("There have some chances to escape");
										   Herbivores.escapeFromEnemy(this,opponent);
										   
}
	winner = opponent;
	return winner;
	}
}
else{
	if(this instanceof Carnivores && opponent instanceof Carnivores){

		System.out.println(this.getName()+" meeting "+opponent.getName());
		System.out.println(this.getName()+" has "+strengthOfPlayer1+" Strength Level And "+opponent.getName()+" has "+strengthOfPlayer2+" Strength Level");
		System.out.println(this.getName()+" has "+starvageOfPlayer2+" Starvage Level And "+opponent.getName()+" has "+starvageOfPlayer2+" Starvage Level");
		System.out.println("shitt!!! WE WILL NEVER WIN BECAUSE WE CAN'T KILL BOTH OF US............");
	}
return this;
}

return this;
}



}
