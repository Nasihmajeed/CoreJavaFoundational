package com.lxisoft.game;

import com.lxisoft.animals.*;
import com.lxisoft.game.Animal;

import java.util.Random;
import java.util.ArrayList;

public class Forest {

       ArrayList<Animal> animalsList = new ArrayList<Animal>();
       Random rand = new Random();
       
       int player1 =rand.nextInt(animalsList.size());
	int player2 =rand.nextInt(animalsList.size());
       int starvageOfPlayer1;
       int starvageOfPlayer2;
       int strengthOfPlayer1;
       int strengthOfPlayer2;
       int i = 0;

       String meeting;
       public String setMeeting(Animal animal1,Animal animal2){
       
       if((animal1 instanceof Herbivores) && (animal2 instanceof Herbivores)){
              System.out.println("????????????????????????????????????????????");
              System.out.println("Chance of Occurrence of a Fight is Zero!!!!!");
             
              System.out.println("Both players are herbivorous!!!!!!");
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
              //System.out.println("Sorry!...... fight isn't possible !!!!We are Good -F-R-I-E-N-D-S-");
              return "Sorry!...... fight isn't possible !!!!We are Good -F-R-I-E-N-D-S-";
              //return animal1,animal2;
             }
             else if((animal1 instanceof Herbivores) && (animal2 instanceof Carnivores)){
              System.out.println("First Player is a Herbivore !!!!!!");
              System.out.println("Player1 is : "+animal1.getName()+"    "+" with starvage level "+animal1.getStarvage()+" having strength of "+animal1.getStrength());
		System.out.println("Second Player is a Carnivore !!!!!!");
              System.out.println("Player2 is : "+animal2.getName()+"    "+" with starvage level "+animal2.getStarvage()+" having strength of "+animal2.getStrength());
              System.out.println(animal2.getName()+" is only "+animal2.getDistance()+" metres far from "+animal1.getName());

              starvageOfPlayer1 = animal1.getStarvage();
		starvageOfPlayer2 = animal2.getStarvage();
        
              strengthOfPlayer1 = animal1.getStrength();
		strengthOfPlayer2 = animal2.getStrength();

              do{
                     if(((animal1.getLuckFactor()<=3) && (animal2.getDistance()<=5)))
                           {
                            System.out.println(animal1.getName()+" was very unlucky and caught by "+animal2.getName());
                            System.out.println(animal1.getName()+" is caught by "+animal2.getName());
                            System.out.println(animal2.getName()+" is attacking "+animal1.getName());
                            System.out.println("Strength of "+animal2.getName()+" is higher than "+animal1.getName());
                            System.out.println("The strength of "+animal1.getName()+" is decreasing");
                     }
                     else if((animal1.getLuckFactor() > 3))
                            {
                                 System.out.println(animal1.getName()+" was very lucky that he ran away from the Beast..........!!!!!!!!!!!!!!!!");
                            } 
                            strengthOfPlayer1 -= 1;
                           System.out.println("Stamina of "+animal1.getName()+" decreased to "+strengthOfPlayer1);
                     }while(strengthOfPlayer1 > 0);

                     System.out.println(animal2.getName()+" Defeated and Killed "+animal1.getName());
                     return animal2.getName();
              }
              //When first is Hunter and second is Prey
              else if((animal1 instanceof Carnivores) && (animal2 instanceof Herbivores))
              {
                     System.out.println("First Player is a Carnivore !!!!!!");
                     System.out.println("Player1 is : "+animal1.getName()+"    "+" with starvage level "+animal1.getStarvage()+" having strength of "+animal1.getStrength());
                     System.out.println("Second Player is a Herbivore !!!!!!");
                     System.out.println("Player2 is : "+animal2.getName()+"    "+" with starvage level "+animal2.getStarvage()+" having strength of "+animal2.getStrength());

                     starvageOfPlayer1 = animal2.getStarvage();
                     starvageOfPlayer2 = animal1.getStarvage();
               
                     strengthOfPlayer1 = animal2.getStrength();
                     strengthOfPlayer2 = animal1.getStrength();

                     do{
                            if(((animal2.getLuckFactor()<=3) && (animal1.getDistance()<=5)))
                                  {
                                         System.out.println(animal2.getName()+" was very unlucky and caught by "+animal1.getName());
                                         System.out.println(animal2.getName()+" is caught by "+animal1.getName());
                                         System.out.println(animal1.getName()+" is attacking "+animal2.getName());
                                         System.out.println("Starvage of "+animal1.getName()+" is higher than "+animal2.getName());
                                         System.out.println("The Strength of "+animal2.getName()+" is decreasing");
                                         
                                   }
                          
                              else if((animal2.getLuckFactor()>3))
                                              {
                                                   System.out.println(animal2.getName()+" was very lucky that he ran away from the Beast..........!!!!!!!!!!!!!!!!");
                                              }
                          
                                              strengthOfPlayer2  -= 1;
                 System.out.println("Strength of "+animal2.getName()+" decreased to "+strengthOfPlayer2);
          
          }while(strengthOfPlayer2 > 0); 
          System.out.println(animal2.getName()+" is Defeated and Killed by "+animal1.getName()); 
          return animal1.getName();
	}
       else if((animal1 instanceof Carnivores) && (animal2 instanceof Carnivores))		
	 {
		System.out.println("!!!!!!!!!Both the beasts are Carnivorous Players !!!!!!!");
		System.out.println("Fight is going to be Deadly!!!!!!!!!");
              System.out.println("First player is : "+animal1.getName()+" with starvage level "+animal1.getStarvage()+" having strength of "+animal1.getStrength());
              System.out.println("Second player is : "+animal2.getName()+" with starvage level "+animal2.getStarvage()+" having strength of "+animal2.getStrength());
              starvageOfPlayer1 = animal1.getStarvage();
		starvageOfPlayer2 = animal2.getStarvage();
        
              strengthOfPlayer1 = animal1.getStrength();
		strengthOfPlayer2 = animal2.getStrength();

              if((strengthOfPlayer1 > strengthOfPlayer2) && (starvageOfPlayer1 > starvageOfPlayer2))
		  {
			System.out.println(animal1.getName()+" is Stronger compared to "+animal2.getName());
			System.out.println(animal1.getName()+" is only "+animal2.getDistance()+" metres far from "+animal2.getName());
                     System.out.println(animal1.getName()+" is marching towards "+animal2.getName());
                     System.out.println(animal1.getName()+" caught  "+animal2.getName());
			System.out.println(animal2.getName()+" is not ready to give up ");
                     System.out.println("Deadly Fight !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                     System.out.println("The Beast : "+animal2.getName()+" is Killed in the Brutal Fight........!!!!!!!!");
                     return animal1.getName();
		}
              else if((strengthOfPlayer2 > strengthOfPlayer1) && (starvageOfPlayer2 > starvageOfPlayer1)){
                     System.out.println(animal2.getName()+" is Stronger compared to "+animal1.getName());
			System.out.println(animal2.getName()+" is only "+animal1.getDistance()+" metres far from "+animal1.getName());
                     System.out.println(animal2.getName()+" is marching towards "+animal1.getName());
                     System.out.println(animal2.getName()+" caught  "+animal1.getName());
			System.out.println(animal1.getName()+" is not ready to give up ");
                     System.out.println("Deadly Fight !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                     System.out.println("The Beast : "+animal1.getName()+" is Killed in the Brutal Fight........!!!!!!!!");
                     return animal2.getName();
              }else
              {
                     
              System.out.println("!!!!!!!The Animals you selected for the fight is not present in this -F-O-R-E-S-T !!!!!!!!!");
              }
              
       }
       return "Sorry!!!!!!!!.......Either it is an invalid combination or  both the Animals are same!!!!";
       }

       

       
     

       public void welcomeToForest()
       {

      System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");

      System.out.println("The Deadly Fight Begins Here......................" +"\n");
      
              Animal animal = new Animal(" ",0,0,0);
              System.out.println("List of Animals in the Forest :  ");
              animal.printAnimals();
      
	       System.out.println("Details of !_F_I_G_H_T_E_R_S_!" +"\n");

              animalsList.add(new Tiger("Bengal-Tiger",14,10,5));
              animalsList.add(new Rabbit("Cutey-Rabbit",10,7,5));
              animalsList.add(new Deer("Little-Deer",2,4,2));
              animalsList.add(new Fox("Cunning-Fox",6,4,4));
              animalsList.add(new Lion("King-Lion",15,3,12));
              animalsList.add(new Elephant("Indian-Elephant",8,5,10));
              animalsList.add(new LeoPard("Angry-LeoPard",17,9,13));
              animalsList.add(new Gaur("Hungry-Guar",9,8,4));
              animalsList.add(new Crocodile("Lazy-Crocodile",10,6,4));
              animalsList.add(new Rhinoceros("Indian-Rhinoceros",7,6,7));

                while(i < animalsList.size()){
                     animalsList.get(i).printDetails();   
                     i++;
              
                }
                   
		 meeting = setMeeting(animalsList.get(player1) , animalsList.get(player2));
	
       }
}        

             
   
       










