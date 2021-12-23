package com.lxisoft.game;

import java.util.Random;

import com.lxisoft.animals.*;
public abstract class Animal {
	private String animalName;
	private int starvage,strength,distance,luckFactor;
	Animal winner;
         int starvageOfPlayer1,starvageOfPlayer2;
         int strengthOfPlayer1,strengthOfPlayer2;

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
	if(player1 instanceof Carnivores && player2 instanceof Herbivores) {
				
		System.out.println("\n" +player2.getName()+" was very unlucky and caught by "+player1.getName());
		if(player2.getLuckFactor() >= 5 ){

		System.out.println(" \n But fortunately player " +player2.getName()+ " is very lucky_!!!  just escaped from \n" +player1.getName());
		escapeFromEnemy(player1,player2);
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
										   System.out.println("\t"+ player1.getName()+" Defeated and Killed by "+player2.getName());
										   System.out.println("\t\t\t ------------- \t\t\t");

			  winner = player1;
			  return winner;
		}
		
}
else if(player1 instanceof Herbivores && player2 instanceof Carnivores){
	
	System.out.println(player1.getName()+" was very unlucky and caught by "+player2.getName());
	if(player2.getLuckFactor() >= 5 ){

	System.out.println(" player " +player1.getName()+ " is very lucky_!!!  just escaped from " +player2.getName());

	escapeFromEnemy(player1,player2);
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

//System.out.println("The Strength of "+player1.getName()+" is decreasing");
System.out.println("\t"+ player1.getName()+" Defeated and Killed by "+player2.getName());
System.out.println("\t\t\t ------------- \t\t\t");
	winner = player2;
	return winner;
	}
}



return player1;
}

public void escapeFromEnemy(Animal player1,Animal player2){ 
	if(player1 instanceof Carnivores && player2 instanceof Herbivores){
System.out.println(player2.getName() +" escaping ..........");
	}
	else if(player1 instanceof Herbivores && player2 instanceof Carnivores){
		System.out.println(player1.getName() +" escaping ............");
	}
}

}
