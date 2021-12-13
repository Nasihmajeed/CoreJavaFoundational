package com.lxisoft.game;

import com.lxisoft.animals.*;
import com.lxisoft.game.Animal;
import java.util.ArrayList;
import java.util.Random;

public class Forest {

       int i = 0;
       Random rand = new Random();
       ArrayList<Animal> animalsList = new ArrayList<Animal>();
         String winner;
       public void welcomeToForest()
       {

      System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");

      System.out.println("The Deadly Fight Begins Here......................" +"\n");
      
             // Animal animal = new Animal(" ",0,0,0);
              //System.out.println("List of Animals in the Forest :  ");
              //animal.listOfwildAnimals();
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
                     animalsList.get(i).printData(); 
                     System.out.println();  
                     i++;
              } 
		System.out.println( playersMeeting(returnPlayer1(animalsList),returnPlayer2(animalsList)));
       }
       public Animal returnPlayer1(ArrayList<Animal> animalsList){
              int player1 =rand.nextInt(animalsList.size());
              Animal p1 = animalsList.get(player1);
               return p1;
        }

        public Animal returnPlayer2(ArrayList<Animal> animalsList){
              int player2 =rand.nextInt(animalsList.size());
              Animal p2 = animalsList.get(player2);
              return p2;
        }

        /*static String[] getP1AndP2(ArrayList<Animal> animalsList){
              String[] players = new String[2];
              players[0] = rand.nextInt(animalsList.size());
              players[1] = rand.nextInt(animalsList.size());
              return players;
        }*/
        //String player1,player2;
       int starvageOfPlayer1,starvageOfPlayer2;
       int strengthOfPlayer1,strengthOfPlayer2;
        
      public String playersMeeting(Animal player1, Animal player2){
             
            
              if((player1 instanceof Herbivores) && (player2 instanceof Herbivores)){
                     System.out.println("!!!!!!!!!Both the Players are Herbivores Players !!!!!!!");
                     return "we are Best F_R_I_E_N_D_S";
              }
              else if((player1 instanceof Herbivores) && (player2 instanceof Carnivores)){
                     System.out.println("First player is a Herbivore !!!!!!");
                     System.out.println("Player1 is : "+player1.getName()+"    "+" with starvage level "+player1.getStarvage()+" having strength of "+player1.getStrength());
                     System.out.println("Second player is a Carnivore !!!!!!");
                     System.out.println("Player2 is : "+player2.getName()+"    "+" with starvage level "+player2.getStarvage()+" having strength of "+player2.getStrength());
                     System.out.println(player2.getName()+" is only "+player2.getDistance()+" metres far from "+player1.getName());
                     starvageOfPlayer1 = player1.getStarvage();
                     starvageOfPlayer2 = player2.getStarvage();
               
                     strengthOfPlayer1 = player1.getStrength();
                     strengthOfPlayer2 = player2.getStrength();
                     startFight(player1,player2);
                     System.out.println("The Winner of the Game is :- ");
                     return player2.getName();
              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Herbivores))
              {
                     System.out.println("First Player is a Carnivore !!!!!!");
                     System.out.println("Player1 is : "+player1.getName()+"    "+" with starvage level "+player1.getStarvage()+" having strength of "+player1.getStrength());
                     System.out.println("Second Player is a Herbivore !!!!!!");
                     System.out.println("Player2 is : "+player2.getName()+"    "+" with starvage level "+player2.getStarvage()+" having strength of "+player2.getStrength());
                    
                     starvageOfPlayer1 = player1.getStarvage();
                     starvageOfPlayer2 = player2.getStarvage();
               
                     strengthOfPlayer1 = player1.getStrength();
                     strengthOfPlayer2 = player2.getStrength();
                    
                     startFight(player1,player2);
                     System.out.println("The Winner of the Game is :- ");
                     return player1.getName();
              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Carnivores))		
	 {
		System.out.println("!!!!!!!!!Both the beasts are Carnivorous Players !!!!!!!");
		System.out.println("Fight is going to be Drop!!!!!!!!!");
              return "we are Best F_R_I_E_N_D_S and we are trying to catch our Prey";
        }
       return "No such Players existing in my F_O_R_E_S_T";

       }
       public String startFight(Animal player1, Animal player2){

            

              do{
                     if((player1.getStrength() <= 5) && (player2.getStarvage() <= 5))
                           {
                            System.out.println(player1.getName()+" was very unlucky and caught by "+player2.getName());
                            System.out.println(player1.getName()+" is caught by "+player2.getName());
                            System.out.println(player2.getName()+" is attacking "+player1.getName());
                            System.out.println("Starvage of "+player2.getName()+" is higher than  the strength of"+player1.getName());
                            System.out.println("The strength of "+player1.getName()+" is decreasing");
                     }
                     else if((player1.getStrength() > 5))
                            {
                                 System.out.println(player1.getName()+" was very lucky that he ran away from the Beast..........!!!!!!!!!!!!!!!!");
                            } 
                            strengthOfPlayer1 -= 1;
                           System.out.println("Strength of "+player1.getName()+" decreased to "+strengthOfPlayer1);
                     }while(strengthOfPlayer1 > 0);
                     System.out.println(player1.getName()+" Defeated and Killed by "+player1.getName());
                    
                     do{if((player1.getStarvage() <= 5) && (player2.getStrength() <= 5))
                            {
                             System.out.println(player2.getName()+" was very unlucky and caught by "+player1.getName());
                             System.out.println(player2.getName()+" is caught by "+player1.getName());
                             System.out.println(player2.getName()+" is attacking "+player1.getName());
                             System.out.println("Starvage of "+player1.getName()+" is higher than  the strength of"+player2.getName());
                             System.out.println("The strength of "+player2.getName()+" is decreasing");
                      }
                      else if((player2.getStrength() > 5))
                             {
                                  System.out.println(player2.getName()+" was very lucky that he ran away from the Beast..........!!!!!!!!!!!!!!!!");
                             } 
                             strengthOfPlayer1 -= 1;
                            System.out.println("Strength of "+player2.getName()+" decreased to "+strengthOfPlayer1);
                      }while(strengthOfPlayer1 > 0);
                      System.out.println(player2.getName()+" Defeated and Killed by "+player1.getName());
                     return winner;
       }

/*public void startFightCarn(Animal player1, Animal player2){

       
       do{
              if((player1.getStrength() <= 5) && (player2.getStarvage() <= 5))
                    {
                     System.out.println(player2.getName()+" was very unlucky and caught by "+player1.getName());
                     System.out.println(player2.getName()+" is caught by "+player1.getName());
                     System.out.println(player2.getName()+" is attacking "+player1.getName());
                     System.out.println("Starvage of "+player1.getName()+" is higher than  the strength of"+player2.getName());
                     System.out.println("The strength of "+player2.getName()+" is decreasing");
              }
              else if((player2.getStrength() > 5))
                     {
                          System.out.println(player2.getName()+" was very lucky that he ran away from the Beast..........!!!!!!!!!!!!!!!!");
                     } 
                     strengthOfPlayer1 -= 1;
                    System.out.println("Strength of "+player2.getName()+" decreased to "+strengthOfPlayer1);
              }while(strengthOfPlayer1 > 0);
              System.out.println(player2.getName()+" Defeated and Killed by "+player1.getName());
       }*/
}
