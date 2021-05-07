package com.forest;

import com.animals.*;
import com.tdd.TDD;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Forest
{
	
Scanner sc=new Scanner(System.in);
	
Animal animal=new Animal();

String animal1,animal2;

Random random=new Random();

ArrayList<Animal> animalsList=new ArrayList<Animal>();

	{
		animalsList.add(new Tiger());
		animalsList.add(new Rabbit());
		animalsList.add(new Deer());
		animalsList.add(new Zebra());
		animalsList.add(new Lion());
		animalsList.add(new Crocodile());
		animalsList.add(new Antelope());
		animalsList.add(new Fox());
	
		animalsList.get(0).setName("Beast-Tiger");
		animalsList.get(0).setEnergy(10);
		animalsList.get(0).setDistance(4);
		animalsList.get(0).setStamina(9);
		
		animalsList.get(1).setName("Cutey-Rabbit");
		animalsList.get(1).setEnergy(1);
		animalsList.get(1).setDistance(4);
		animalsList.get(1).setStamina(1);
	
        animalsList.get(2).setName("Little-Deer");
		animalsList.get(2).setEnergy(2);
		animalsList.get(2).setDistance(4);
		animalsList.get(2).setStamina(2);
        
        animalsList.get(3).setName("Black&White-Zebra");
		animalsList.get(3).setEnergy(4);
		animalsList.get(3).setDistance(2);
		animalsList.get(3).setStamina(3);

        animalsList.get(4).setName("King-Lion");
		animalsList.get(4).setEnergy(15);
		animalsList.get(4).setDistance(3);
		animalsList.get(4).setStamina(12);
				
		animalsList.get(5).setName("Strong-Crocodile");
		animalsList.get(5).setEnergy(14);
		animalsList.get(5).setDistance(5);
		animalsList.get(5).setStamina(10);
		
		animalsList.get(6).setName("Silent-Antelope");
		animalsList.get(6).setEnergy(3);
		animalsList.get(6).setDistance(2);
		animalsList.get(6).setStamina(4);
		
		animalsList.get(7).setName("Cunning-Fox");
		animalsList.get(7).setEnergy(6);
		animalsList.get(7).setDistance(4);
		animalsList.get(7).setStamina(7);
	}

public void welcomeToForest()
{
System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");	
System.out.println("The Deadly Fight Begins Here......................");

   try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }



animal.wildAnimals();

try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }


startFight();
}

//To start the game

String winner;

public void startFight()
{
	int first =random.nextInt(animalsList.size());
	int second =random.nextInt(animalsList.size());
	
	winner=fight( animalsList.get(first) , animalsList.get(second) );
	
	try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
	
	
	
	
	System.out.println("-------------------------------------------------------------------");
	System.out.println("-------------------------------------------------------------------");
	System.out.println("<<<<<<<<<<The Winner of the Fight is >>>>>>>>>>");
	
	     try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
	
	
	System.out.println("<<<<<<<<<<<"+winner+">>>>>>>>>>>>>>>>>>>");
	System.out.println("-------------------------------------------------------------------");
	System.out.println("-------------------------------------------------------------------");
}


int fighter1Stamina,fighter2Stamina;
int fighter1Energy,fighter2Energy;

public String fight(Animal a,Animal b)
{        
	do{
	     //When both of the animals are herbivorous
				  
	if((a instanceof Herbivore) && (b instanceof Herbivore))
	{
		
		 try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Chance of Occurrence of a Fight is Zero!!!!!");
		System.out.println("Both animals are herbivorous!!!!!!");
		System.out.println("--------------------------------------------------------");
		                  try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		
		return "Sorry!......There was no fight!!!!We are Good -F-R-I-E-N-D-S-";
	}
	
	
	//When first is Prey and second is Hunter
	
	else if((a instanceof Herbivore) && (b instanceof Carnivore))
	{
		System.out.println("First animal is a Herbivore !!!!!!");
		
		            try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		System.out.println("Animal is : "+a.getName()+"    "+" with energy level "+a.getEnergy()+" having stamina of "+a.getStamina());
		
		System.out.println("Second animal is a Carnivore !!!!!!");
		
		
		                     try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		
		System.out.println("Animal is : "+b.getName()+"    "+" with energy level "+b.getEnergy()+" having stamina of "+b.getStamina());
        
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		
		
		System.out.println(b.getName()+" is only "+b.getDistance()+" metres far from "+a.getName());
		
		fighter1Stamina=a.getStamina();
		fighter2Stamina=b.getStamina();
        fighter1Energy=a.getEnergy();
		fighter2Energy=b.getEnergy();
		
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		
		do{
		          if(((a.getLuckFactor()<=3) && (b.getDistance()<=3)))
				  {
					  System.out.println(a.getName()+" was very unlucky and caught by "+b.getName());
					  System.out.println(a.getName()+" is caught by "+b.getName());
			          System.out.println(b.getName()+" is attacking "+a.getName());
					  
					             try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
					  
			          System.out.println("Energy of "+b.getName()+" is higher than "+a.getName());
					  
					  try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
					  
					  System.out.println("The stamina of "+a.getName()+" is decreasing");
				

							 do
							   {
								                                                          
								  System.out.println("Energy of "+a.getName()+" is decreasing !!!!!!");
                                  fighter1Energy -= 1;		
                                  System.out.println("Energy of "+a.getName()+" reduced to "+fighter1Energy);								  
							   }while(fighter1Energy>0);
					             
								 
								 try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
								 
								 
			          System.out.println("The stamina of "+a.getName()+" is decreasing");	  
			
			}
			else if((a.getLuckFactor()>3))
				  {
					  System.out.println(a.getName()+" was very lucky that he ran away from the Beast..........!!!!!!!!!!!!!!!!");
				  }
				  
			fighter1Stamina -= 1;
			
			                   try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
			
			
			
			System.out.println("Stamina of "+a.getName()+" decreased to "+fighter1Stamina);
			
			
		      }while(fighter1Stamina>0);
			  
			  try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
			  
			  
        
		System.out.println(b.getName()+" Defeated and Killed "+a.getName());
		
	   return b.getName();
	}
	
	
	
	//When first is Hunter and second is Prey
	else if((a instanceof Carnivore) && (b instanceof Herbivore))
	{
		System.out.println("First animal is a Carnivore !!!!!!");
		
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		System.out.println("Animal is : "+a.getName()+"    "+" with energy level "+a.getEnergy()+" having stamina of "+a.getStamina());
		System.out.println("Second animal is a Herbivore !!!!!!");
		
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		System.out.println("Animal is : "+b.getName()+"    "+" with energy level "+b.getEnergy()+" having stamina of "+b.getStamina());
        System.out.println(b.getName()+" is only "+b.getDistance()+" metres far from "+a.getName());
		
		fighter1Stamina=b.getStamina();
		fighter2Stamina=a.getStamina();
        fighter1Energy=b.getEnergy();
		fighter2Energy=a.getEnergy();
		
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		do{
		          if(((b.getLuckFactor()<=3) && (a.getDistance()<=3)))
				  {
					  
					  
					  
					  System.out.println(b.getName()+" was very unlucky and caught by "+a.getName());
					  System.out.println(b.getName()+" is caught by "+a.getName());
			          System.out.println(a.getName()+" is attacking "+b.getName());
					  
					  try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
					  
					  
					  
			          System.out.println("Energy of "+a.getName()+" is higher than "+b.getName());
			          System.out.println("The stamina of "+b.getName()+" is decreasing");	
                                        try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
                 
                               do
							   {
								  System.out.println("Energy of "+b.getName()+" is decreasing !!!!!!");
                                  fighter1Energy -= 1;		
                                  System.out.println("Energy of "+b.getName()+" reduced to "+fighter1Energy);								  
							   }while(fighter2Energy>0);
					             
			          System.out.println("The stamina of "+b.getName()+" is decreasing");
					  
				  }
				  
				  else if((b.getLuckFactor()>3))
				  {
					  System.out.println(b.getName()+" was very lucky that he ran away from the Beast..........!!!!!!!!!!!!!!!!");
				  }
				  
			fighter2Stamina -= 1;
			
			System.out.println("Stamina of "+b.getName()+" decreased to "+fighter2Stamina);
		}while(fighter2Stamina>0);
		        
				try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
				
				
				
				
		System.out.println(b.getName()+" is Defeated and Killed by "+a.getName());
		
	   return a.getName();
	}	
	
	
            //When both are Carnivore
    else if((a instanceof Carnivore) && (b instanceof Carnivore))		
	{
		System.out.println("!!!!!!!!!Both the beasts are Carnivorous animals !!!!!!!");
		System.out.println("Fight is going to be Deadly!!!!!!!!!");
		
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		System.out.println("First animal is : "+a.getName()+" with energy of "+a.getEnergy()+" and stamina of "+a.getStamina());
		
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		System.out.println("Second animal is : "+b.getName()+" with energy of "+b.getEnergy()+" and stamina of "+b.getStamina());
		
		fighter1Energy=a.getEnergy();
		fighter1Stamina=a.getStamina();
		fighter2Energy=b.getEnergy();
		fighter2Stamina=b.getStamina();
		
		try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		
		if(((fighter1Energy>fighter2Energy) && (fighter1Stamina>fighter2Stamina)))
		      {
			System.out.println(a.getName()+" is Stronger compared to "+b.getName());
			System.out.println(a.getName()+" is only "+b.getDistance()+" metres far from "+b.getName());
			
			try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
			
			System.out.println(a.getName()+" is marching towards "+b.getName());
	       
		   try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
		   
			System.out.println(a.getName()+" caught  "+b.getName());
			System.out.println(b.getName()+" is not ready to give up ");
			
			         try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
			
			System.out.println("--------------------------------------------");
			System.out.println("Deadly Fight !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("--------------------------------------------");
			
			try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
			
			              
						  do{
			                                   System.out.println("Energy of "+b.getName()+" is decreasing!!!!!!!");
			                                 fighter2Energy -= 1;
			                              System.out.println("Energy of "+b.getName()+" is reduced to "+fighter2Energy);

                                          try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }


                                           System.out.println("Stamina of "+b.getName()+" is decreasing!!!!!!!");
			                                 fighter2Stamina -= 1;
			                              System.out.println("Energy of "+b.getName()+" is reduced to "+fighter2Stamina);										  
									     
								  }while(fighter2Stamina>0);
						
             try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }						

						
		System.out.println("The Beast : "+b.getName()+" is Killed in the Brutal Fight........!!!!!!!!");
		return a.getName();
		}
			
	  else if(((fighter2Energy>fighter1Energy) && (fighter2Stamina>fighter1Stamina)))
		{
			System.out.println(b.getName()+" is Stronger compared to "+a.getName());
			System.out.println(b.getName()+" is only "+a.getDistance()+" metres far from "+a.getName());
			
			
			
			System.out.println(b.getName()+" is marching towards "+a.getName());
			
			try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
			
			
			System.out.println(b.getName()+" caught  "+a.getName());
			System.out.println(a.getName()+" is not ready to give up ");
			
			try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
			
			
			
			System.out.println("--------------------------------------------");
			System.out.println("Deadly Fight !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("--------------------------------------------");
			           try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }           
								
										  
								  do{
			                                   System.out.println("Energy of "+a.getName()+" is decreasing!!!!!!!");
			                                 fighter1Energy -= 1;
			                              System.out.println("Energy of "+a.getName()+" is reduced to "+fighter1Energy);

                                                          try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }

        
                                           System.out.println("Stamina of "+a.getName()+" is decreasing!!!!!!!");
			                                 fighter1Stamina -= 1;
			                              System.out.println("Energy of "+a.getName()+" is reduced to "+fighter1Stamina);										  
									     
								  }while(fighter1Stamina>0);
								  
                   try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }						

						
		System.out.println("The Beast : "+a.getName()+" is Killed in the Brutal Fight........!!!!!!!!");
		
		return b.getName();
		}
		
}	
	
else
{
	try{ 
			         Thread.sleep(1000);
				 }
	       catch(InterruptedException e)
		              {
						  Thread.currentThread().interrupt();
					  }
	
System.out.println("!!!!!!!The Animals you selected for the fight is not present in this -F-O-R-E-S-T !!!!!!!!!");
}
return "Sorry!!!!!!!!.......Either it is an invalid combination or Both Animals are the same!!!!";

}
}