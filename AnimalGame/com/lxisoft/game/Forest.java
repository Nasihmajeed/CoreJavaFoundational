package com.lxisoft.game;

import com.lxisoft.animals.*;
import com.lxisoft.game.Animal;
import java.util.ArrayList;
import java.util.Random;

public class Forest {

       int i = 0;
       Random rand = new Random();
       ArrayList<Animal> animalsList = new ArrayList<Animal>();
       
         int fightChance;
         int escapeProbability;
       public void welcomeToForest()
       {

      System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");

      System.out.println("The Deadly Fight Begins Here......................" +"\n");
      
            
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
		System.out.println( playersMeeting(returnPlayers(animalsList),returnPlayers(animalsList)));
       }
       public Animal returnPlayers(ArrayList<Animal> animalsList){
              int player1 =rand.nextInt(animalsList.size());
              Animal player = animalsList.get(player1);
               return player;
        }

        
       
        
      public String playersMeeting(Animal player1, Animal player2){
             
       int starvageOfPlayer1,starvageOfPlayer2;
       int strengthOfPlayer1,strengthOfPlayer2;
              if((player1 instanceof Herbivores) && (player2 instanceof Herbivores)){
                     System.out.println("!!!!!!!!!Both the Players are Herbivores Players !!!!!!!");
                     fightChance = 0;
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
       
                   //  fightChance = 1;
                    // startFight(player1,player2);
                    // escapeProbability =1;
                   //  escapeFromEnemy(player1,player2);
                   //Carnivores player2 = (Carnivores) Animal;
                  // player2.startFight(player2);
                   player2.startFight(player1,player2);
                     return "Game Is Over !";
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
                    
                   
                  //   fightChance = 1;
                    /// startFight(player1,player2);
                //     escapeProbability = 1;
                  //   escapeFromEnemy(player1,player2);
                  player1.startFight(player1,player2);
                     return "Game Is Over !";
              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Carnivores))		
	 {
		System.out.println("!!!!!!!!!Both the beasts are Carnivorous Players !!!!!!!");
              fightChance = 0;
		System.out.println("Fight is going to be Drop!!!!!!!!!");
              return "we are Best F_R_I_E_N_D_S and we are trying to catch our Prey";
        }

       return "No such Players existing in my F_O_R_E_S_T";

       }
       
            /*  public Animal startFight(Animal player1, Animal player2){
       if(fightChance == 1){
              if(player1 instanceof Carnivores) {
                    
                     System.out.println(player2.getName()+" was very unlucky and caught by "+player1.getName());
                     System.out.println(player2.getName()+" is caught by "+player1.getName());
                     System.out.println(player1.getName()+" is attacking "+player2.getName());
                                                                                 
                     System.out.println("Starvage of "+player1.getName()+" is higher than the Strength of "+player2.getName());
                     System.out.println("The Strength of "+player2.getName()+" is decreasing");
                     
                                                                               
                                                        System.out.println("Strength of "+player2.getName()+" is decreasing !!!!!!");
                                                        strengthOfPlayer2  = 0;
                                                        		
                                                        System.out.println("Strength of "+player2.getName()+" reduced to "+strengthOfPlayer2);								  
                                                                               
                                                     
                                                        System.out.println("The Strength of "+player2.getName()+" is decreasing");
                                                        System.out.println(player1.getName()+" Defeated and Killed by "+player2.getName());
                                                        
                           winner = player1;
                           return winner;
         }else if(player2 instanceof Carnivores){
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
       }
       return winner;
       }*/

       
}
