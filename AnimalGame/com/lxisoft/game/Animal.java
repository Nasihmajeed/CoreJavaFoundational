package com.lxisoft.game;

import java.util.Random;
import java.*;

import com.lxisoft.animals.*;
import com.lxisoft.factors.Location;
import com.lxisoft.factors.AnimalEscapeException;
import com.lxisoft.animals.Herbivores;
import com.lxisoft.localization.Localization;
import com.lxisoft.test.TDD;
import com.lxisoft.*;
public class Animal {
	private String animalName;
	private int starvage,strength,distance,luckFactor;
	private boolean isAlive;
	
	public Location animalLocation = new Location() ;
        TDD opt = new TDD();

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
  Localization object = new Localization();

protected void printData() {
         
  
	System.out.println(object.initialize().getProperty("A_statement_26 ") + this.getName());
	System.out.println(object.initialize().getProperty("A_statement_23 ") +": " + this.getStarvage());
	System.out.println(object.initialize().getProperty("A_statement_21 ") +": " + this.getStrength());
	System.out.println(object.initialize().getProperty("A_statement_27 ") + this.getDistance());
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
	if (opt.getOption() == 1) {
	if(this instanceof Herbivores && opponent instanceof Herbivores){

		//if (opt.getOption() == 1) {
			
		
		System.out.println(object.initialize().getProperty("A_statement_1"));
	//	System.out.println(object.initialize().getProperty("A_statement_1"));
		System.out.println(this.getName() + object.initialize().getProperty("A_statement_28")  + opponent.getName());
	//	System.out.println(this.getName() + object.initialize().getProperty("A_statement_28")  + opponent.getName());
	//	System.out.println(object.initialize().getProperty("A_statement_2") +"*~~~~~~~*");
		System.out.println(object.initialize().getProperty("A_statement_2") +"*~~~~~~~*");
			 
		//}
		/*else if(opt.getOption() == 2){
			System.out.println(object.initializeM().getProperty("A_statement_1"));
			System.out.println(this.getName() + object.initializeM().getProperty("A_statement_28")  + opponent.getName());
	    	System.out.println(object.initializeM().getProperty("A_statement_2") +"*~~~~~~~*");
		}*/
		

		
		 return this;
	}
	//return player1;
	else if(this instanceof Carnivores && opponent instanceof Herbivores) {
				
		
		System.out.println("\n" +opponent.getName()+ object.initialize().getProperty("A_statement_3") +this.getName());
		if(opponent.getLuckFactor() >= 5 ){

		System.out.println("\n"+ object.initialize().getProperty("A_statement_4") +opponent.getName()+ object.initialize().getProperty("A_statement_5") +  object.initialize().getProperty("A_statement_6") +this.getName()+"\n");
		
		Herbivores herbivores = (Herbivores) opponent;
		herbivores.escapeFromEnemy(this);
		
	}else{
			System.out.println("\n \t \t \t"+  object.initialize().getProperty("A_statement_7") +"\t \t \n");
		
		System.out.println("\t"+opponent.getName()+ object.initialize().getProperty("A_statement_8") +this.getName());
		System.out.println("\t" +this.getName()+ object.initialize().getProperty("A_statement_9") +opponent.getName());
														System.out.println();			
		System.out.println(object.initialize().getProperty("A_statement_10") +this.getName()+ object.initialize().getProperty("A_statement_11") +opponent.getName() );
	 
		System.out.println("\t\t\t . \t\t\t");
																  
										   System.out.println("\t " + object.initialize().getProperty("A_statement_12") +opponent.getName()+ object.initialize().getProperty("A_statement_13") +"!!!!!!");
										   strengthOfPlayer2  = 0;
										   System.out.println("\t\t\t .. \t\t\t");
										   System.out.println("\t"+ object.initialize().getProperty("A_statement_12") +opponent.getName()+ object.initialize().getProperty("A_statement_14") +strengthOfPlayer2);								  
																  
										   System.out.println("\t\t\t ... \t\t\t");
										  /// System.out.println("The Strength of "+player2.getName()+" is decreasing");
										  if(opponent.getIsAlive() == true && opponent.getStrength() < 7){
											Carnivores c = (Carnivores) this;
															 c.killOpponent(this,opponent);
															
         System.out.println("\t"+ opponent.getName()+ object.initialize().getProperty("A_statement_15") +this.getName());
System.out.println("\t\t\t ------------- \t\t\t");
									}else{
										System.out.println(object.initialize().getProperty("A_statement_16"));
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
	
	System.out.println(this.getName()+ object.initialize().getProperty("A_statement_3") +opponent.getName());
	if(this.getLuckFactor() >= 5 ){

	System.out.println(object.initialize().getProperty("A_statement_17") +this.getName()+ object.initialize().getProperty("A_statement_5")+ object.initialize().getProperty("A_statement_6") +opponent.getName());
	
	Herbivores herbivores = (Herbivores) this;
	herbivores.escapeFromEnemy(opponent);

	}else{

		System.out.println("\n \t \t \t "+ object.initialize().getProperty("A_statement_7") +"\t \t \n");

	System.out.println("\t"+ this.getName()+object.initialize().getProperty("A_statement_8")+opponent.getName());
	System.out.println("\t"+ opponent.getName()+object.initialize().getProperty("A_statement_9")+this.getName());
					System.out.println();											
	System.out.println(object.initialize().getProperty("A_statement_10")+opponent.getName()+object.initialize().getProperty("A_statement_11")+this.getName() );
	System.out.println("\t\t\t . \t\t\t");
	System.out.println("\t" + object.initialize().getProperty("A_statement_12")+this.getName()+ object.initialize().getProperty("A_statement_13"));	
	System.out.println("\t\t\t .. \t\t\t");
//System.out.println("Strength of "+player1.getName()+" is decreasing !!!!!!");
strengthOfPlayer1 = 0;		
System.out.println("\t"+object.initialize().getProperty("A_statement_12") +this.getName()+ object.initialize().getProperty("A_statement_14")+strengthOfPlayer1);								  
System.out.println("\t\t\t ... \t\t\t");
if(this.getIsAlive() == true && this.getStrength() < 7){
		Carnivores c = (Carnivores) opponent;
                         c.killOpponent(this,opponent);
				
         System.out.println("\t"+ this.getName()+ object.initialize().getProperty("A_statement_15") +opponent.getName());
System.out.println("\t\t\t ------------- \t\t\t");
}
else{
//System.out.println("The Strength of "+player1.getName()+" is decreasing");
System.out.println(object.initialize().getProperty("A_statement_16"));

Herbivores herbivores = (Herbivores) this;
										   herbivores.escapeFromEnemy(opponent);
										   
}
	winner = opponent;
	return winner;
	}
}
else{
	if(this instanceof Carnivores && opponent instanceof Carnivores){

		System.out.println(this.getName()+ object.initialize().getProperty("A_statement_18")+opponent.getName());
		System.out.println(this.getName()+ object.initialize().getProperty("A_statement_19")+strengthOfPlayer1+object.initialize().getProperty("A_statement_20")+opponent.getName()+ object.initialize().getProperty("A_statement_19")+strengthOfPlayer2+ object.initialize().getProperty("A_statement_21"));
		System.out.println(this.getName()+object.initialize().getProperty("A_statement_19")+starvageOfPlayer2+object.initialize().getProperty("A_statement_22")+opponent.getName()+ object.initialize().getProperty("A_statement_19")+starvageOfPlayer2+ object.initialize().getProperty("A_statement_23"));
		System.out.println(object.initialize().getProperty("A_statement_24")+"!!!"+ object.initialize().getProperty("A_statement_25")+"............");
	}
return this;
}
	} else if(opt.getOption() == 2){

		if(this instanceof Herbivores && opponent instanceof Herbivores){

			//if (opt.getOption() == 1) {
				
			
			System.out.println(object.initializeM().getProperty("A_statement_1"));
		//	System.out.println(object.initialize().getProperty("A_statement_1"));
			System.out.println(this.getName() + object.initializeM().getProperty("A_statement_28")  + opponent.getName());
		//	System.out.println(this.getName() + object.initialize().getProperty("A_statement_28")  + opponent.getName());
		//	System.out.println(object.initialize().getProperty("A_statement_2") +"*~~~~~~~*");
			System.out.println(object.initializeM().getProperty("A_statement_2") +"*~~~~~~~*");
				 
			//}
			/*else if(opt.getOption() == 2){
				System.out.println(object.initializeM().getProperty("A_statement_1"));
				System.out.println(this.getName() + object.initializeM().getProperty("A_statement_28")  + opponent.getName());
				System.out.println(object.initializeM().getProperty("A_statement_2") +"*~~~~~~~*");
			}*/
			
	
			
			 return this;
		}
		//return player1;
		else if(this instanceof Carnivores && opponent instanceof Herbivores) {
					
			
			System.out.println("\n" +opponent.getName()+ object.initializeM().getProperty("A_statement_3") +this.getName());
			if(opponent.getLuckFactor() >= 5 ){
	
			System.out.println("\n"+ object.initializeM().getProperty("A_statement_4") +opponent.getName()+ object.initializeM().getProperty("A_statement_5") +  object.initializeM().getProperty("A_statement_6") +this.getName()+"\n");
			
			Herbivores herbivores = (Herbivores) opponent;
			herbivores.escapeFromEnemy(this);
			
		}else{
				System.out.println("\n \t \t \t"+  object.initializeM().getProperty("A_statement_7") +"\t \t \n");
			
			System.out.println("\t"+opponent.getName()+ object.initializeM().getProperty("A_statement_8") +this.getName());
			System.out.println("\t" +this.getName()+ object.initializeM().getProperty("A_statement_9") +opponent.getName());
															System.out.println();			
			System.out.println(object.initializeM().getProperty("A_statement_10") +this.getName()+ object.initializeM().getProperty("A_statement_11") +opponent.getName() );
		 
			System.out.println("\t\t\t . \t\t\t");
																	  
											   System.out.println("\t " + object.initializeM().getProperty("A_statement_12") +opponent.getName()+ object.initializeM().getProperty("A_statement_13") +"!!!!!!");
											   strengthOfPlayer2  = 0;
											   System.out.println("\t\t\t .. \t\t\t");
											   System.out.println("\t"+ object.initializeM().getProperty("A_statement_12") +opponent.getName()+ object.initializeM().getProperty("A_statement_14") +strengthOfPlayer2);								  
																	  
											   System.out.println("\t\t\t ... \t\t\t");
											  /// System.out.println("The Strength of "+player2.getName()+" is decreasing");
											  if(opponent.getIsAlive() == true && opponent.getStrength() < 7){
												Carnivores c = (Carnivores) this;
																 c.killOpponent(this,opponent);
																
			 System.out.println("\t"+ opponent.getName()+ object.initializeM().getProperty("A_statement_15") +this.getName());
	System.out.println("\t\t\t ------------- \t\t\t");
										}else{
											System.out.println(object.initializeM().getProperty("A_statement_16"));
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
		
		System.out.println(this.getName()+ object.initializeM().getProperty("A_statement_3") +opponent.getName());
		if(this.getLuckFactor() >= 5 ){
	
		System.out.println(object.initializeM().getProperty("A_statement_17") +this.getName()+ object.initializeM().getProperty("A_statement_5")+ object.initializeM().getProperty("A_statement_6") +opponent.getName());
		
		Herbivores herbivores = (Herbivores) this;
		herbivores.escapeFromEnemy(opponent);
	
		}else{
	
			System.out.println("\n \t \t \t "+ object.initializeM().getProperty("A_statement_7") +"\t \t \n");
	
		System.out.println("\t"+ this.getName()+object.initializeM().getProperty("A_statement_8")+opponent.getName());
		System.out.println("\t"+ opponent.getName()+object.initializeM().getProperty("A_statement_9")+this.getName());
						System.out.println();											
		System.out.println(object.initializeM().getProperty("A_statement_10")+opponent.getName()+object.initializeM().getProperty("A_statement_11")+this.getName() );
		System.out.println("\t\t\t . \t\t\t");
		System.out.println("\t" + object.initializeM().getProperty("A_statement_12")+this.getName()+ object.initializeM().getProperty("A_statement_13"));	
		System.out.println("\t\t\t .. \t\t\t");
	//System.out.println("Strength of "+player1.getName()+" is decreasing !!!!!!");
	strengthOfPlayer1 = 0;		
	System.out.println("\t"+object.initializeM().getProperty("A_statement_12") +this.getName()+ object.initializeM().getProperty("A_statement_14")+strengthOfPlayer1);								  
	System.out.println("\t\t\t ... \t\t\t");
	if(this.getIsAlive() == true && this.getStrength() < 7){
			Carnivores c = (Carnivores) opponent;
							 c.killOpponent(this,opponent);
					
			 System.out.println("\t"+ this.getName()+ object.initializeM().getProperty("A_statement_15") +opponent.getName());
	System.out.println("\t\t\t ------------- \t\t\t");
	}
	else{
	//System.out.println("The Strength of "+player1.getName()+" is decreasing");
	System.out.println(object.initializeM().getProperty("A_statement_16"));
	
	Herbivores herbivores = (Herbivores) this;
											   herbivores.escapeFromEnemy(opponent);
											   
	}
		winner = opponent;
		return winner;
		}
	}
	else{
		if(this instanceof Carnivores && opponent instanceof Carnivores){
	
			System.out.println(this.getName()+ object.initializeM().getProperty("A_statement_18")+opponent.getName());
			System.out.println(this.getName()+ object.initializeM().getProperty("A_statement_19")+strengthOfPlayer1+object.initializeM().getProperty("A_statement_20")+opponent.getName()+ object.initializeM().getProperty("A_statement_19")+strengthOfPlayer2+ object.initializeM().getProperty("A_statement_21"));
			System.out.println(this.getName()+object.initializeM().getProperty("A_statement_19")+starvageOfPlayer2+object.initializeM().getProperty("A_statement_22")+opponent.getName()+ object.initializeM().getProperty("A_statement_19")+starvageOfPlayer2+ object.initializeM().getProperty("A_statement_23"));
			System.out.println(object.initializeM().getProperty("A_statement_24")+"!!!"+ object.initializeM().getProperty("A_statement_25")+"............");
		}
	return this;
	}
		}
return this;
}



}
