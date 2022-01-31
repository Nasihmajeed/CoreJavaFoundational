package com.lxisoft.game;

import java.util.Random;
import java.*;

import com.lxisoft.animals.*;
import com.lxisoft.factors.Location;
import com.lxisoft.factors.AnimalEscapeException;
import com.lxisoft.animals.Herbivores;
import com.lxisoft.*;
public class Animal {
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

	public double createRoamingArea(int x1, int x2, int y1,int y2){

		double roamArea = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 - y1));
		return roamArea;
  }    

protected void printData() {
         
  
	System.out.println("Name : " + this.getName());
	System.out.println("Starvage_Level : " + this.getStarvage());
	System.out.println("strength_Level : " + this.getStrength());
	System.out.println("Distance : " + this.getDistance());
	System.out.println();
 
}


public Animal startFight(Animal opponent){  // new venture
	
	
	int starvageOfPlayer1 = this.getStarvage();
	int starvageOfPlayer2 = opponent.getStarvage();
	Animal winner;
	//final Animal animal1;
	int strengthOfPlayer1 = this.getStrength();
	int strengthOfPlayer2 = opponent.getStrength();
	//System.out.println("hello");
	if(this instanceof Herbivores && opponent instanceof Herbivores){

		
		System.out.println("We_are_Trying_to_Attack_both_us !!!");
		System.out.println(this.getName() +" BOOM _ BOOM _ BOOM " + opponent.getName());
		System.out.println("We_cannot_Fight_Togather_Because_We_are_Best_FRIENDS *~~~~~~~*");

		
		

		
		 return this;
	}
	//return player1;
	else if(this instanceof Carnivores && opponent instanceof Herbivores) {
				
		System.out.println("\n" +opponent.getName()+" was_very_unlucky_and_caught_by "+this.getName());
		if(opponent.getLuckFactor() >= 5 ){

		System.out.println(" \n But_fortunately_player " +opponent.getName()+ " is_very_lucky !!!  just_escaped_from " +this.getName()+"\n");
		
		Herbivores herbivores = (Herbivores) opponent;
		herbivores.escapeFromEnemy(this);
	}else{
			System.out.println("\n \t \t \t THE_REAL_FIGHT_BEGINS \t \t \n");
		
		System.out.println("\t"+opponent.getName()+" is_caught_by "+this.getName());
		System.out.println("\t" +this.getName()+" is_attacking "+opponent.getName());
														System.out.println();			
		System.out.println(" Starvage_of "+this.getName()+" is_higher_than_the_Strength_of "+opponent.getName() );
	 
		System.out.println("\t\t\t . \t\t\t");
																  
										   System.out.println("\t Strength_of "+opponent.getName()+" is_decreasing !!!!!!");
										   strengthOfPlayer2  = 0;
										   System.out.println("\t\t\t .. \t\t\t");
										   System.out.println("\t Strength_of "+opponent.getName()+" reduced_to "+strengthOfPlayer2);								  
																  
										   System.out.println("\t\t\t ... \t\t\t");
										  /// System.out.println("The Strength of "+player2.getName()+" is decreasing");
										  if(opponent.getIsAlive() == true && opponent.getStrength() < 7){
											Carnivores c = (Carnivores) this;
															 c.killOpponent(this,opponent);
															
         System.out.println("\t"+ opponent.getName()+" Defeated_and_Killed_by "+this.getName());
System.out.println("\t\t\t ------------- \t\t\t");
									}else{
										System.out.println("There_have_some_chances_to_escape ");
										Herbivores herbivores = (Herbivores) opponent;
										herbivores.escapeFromEnemy(this);
									}
										 /*  System.out.println("\t"+ player1.getName()+" Defeated and Killed by "+player2.getName());
										   System.out.println("\t\t\t ------------- \t\t\t");*/
										  

			  winner = this;
			  return winner;
		}
		
}
else if(this instanceof Herbivores && opponent instanceof Carnivores){
	
	System.out.println(this.getName()+" was_very_unlucky_and_caught_by "+opponent.getName());
	if(this.getLuckFactor() >= 5 ){

	System.out.println(" player " +this.getName()+ " is_very_lucky !!!  just_escaped_from " +opponent.getName());
	
	Herbivores herbivores = (Herbivores) this;
	herbivores.escapeFromEnemy(opponent);

	}else{

		System.out.println("\n \t \t \t THE_REAL_FIGHT_BEGINS \t \t \n");

	System.out.println("\t"+ this.getName()+" is_caught_by "+opponent.getName());
	System.out.println("\t"+ opponent.getName()+" is_attacking "+this.getName());
					System.out.println();											
	System.out.println(" Starvage_of "+opponent.getName()+" is_higher_than_the_Strength_of "+this.getName() );
	System.out.println("\t\t\t . \t\t\t");
	System.out.println("\t Strength_of "+this.getName()+" is_decreasing ");	
	System.out.println("\t\t\t .. \t\t\t");
//System.out.println("Strength of "+player1.getName()+" is decreasing !!!!!!");
strengthOfPlayer1 = 0;		
System.out.println("\t Strength_of "+this.getName()+" reduced_to "+strengthOfPlayer1);								  
System.out.println("\t\t\t ... \t\t\t");
if(this.getIsAlive() == true && this.getStrength() < 7){
		Carnivores c = (Carnivores) opponent;
                         c.killOpponent(this,opponent);
				
         System.out.println("\t"+ this.getName()+" Defeated_and_Killed_by "+opponent.getName());
System.out.println("\t\t\t ------------- \t\t\t");
}
else{
//System.out.println("The Strength of "+player1.getName()+" is decreasing");
System.out.println("There_have_some_chances_to_escape ");

Herbivores herbivores = (Herbivores) this;
										   herbivores.escapeFromEnemy(opponent);
										   
}
	winner = opponent;
	return winner;
	}
}
else{
	if(this instanceof Carnivores && opponent instanceof Carnivores){

		System.out.println(this.getName()+" meeting "+opponent.getName());
		System.out.println(this.getName()+" has "+strengthOfPlayer1+" Strength_Level_And "+opponent.getName()+" has "+strengthOfPlayer2+" Strength Level");
		System.out.println(this.getName()+" has "+starvageOfPlayer2+" Starvage_Level_And "+opponent.getName()+" has "+starvageOfPlayer2+" Starvage Level");
		System.out.println("shitt!!! WE_WILL_NEVER_WIN_BECAUSE_WE_CANNOT_KILL_BOTH_OF_US............");
	}
return this;
}

return this;
}



}
