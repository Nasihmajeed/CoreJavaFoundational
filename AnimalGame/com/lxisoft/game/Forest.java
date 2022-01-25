package com.lxisoft.game;
import java.*;
import java.io.*;
import com.lxisoft.*;
import com.lxisoft.animals.*;
import com.lxisoft.game.Animal;
import com.lxisoft.factors. FileRepository;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Forest {

       
      
      // public List<Animal> animalsList = new ArrayList<Animal>();
       
       FileRepository repo = new  FileRepository();
         
      // List<Animal> fileData = new ArrayList<Animal>();

       public void welcomeToForest() 
       {

       int i = 0; 
      
       repo.createFile();
       repo.showFileInfo();
        //repo.writeToFile();
       repo.readFile();

  
    
      System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");

      System.out.println("The Deadly Fight Begins Here......................" +"\n");
      
            /*  Random rand = new Random();
              System.out.println("Details of !_F_I_G_H_T_E_R_S_!" +"\n");
              animalsList.add(new Tiger("Bengal-Tiger",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Rabbit("Cutey-Rabbit",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Deer("Little-Deer",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Fox("Cunning-Fox",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Lion("King-Lion",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Elephant("Indian-Elephant",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new LeoPard("Angry-LeoPard",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Gaur("Hungry-Guar",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Crocodile("Lazy-Crocodile",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
              animalsList.add(new Rhinoceros("Indian-Rhinoceros",rand.nextInt(15),rand.nextInt(15),rand.nextInt(20),true));
 
          
               while(i < animalsList.size()){
                     animalsList.get(i).printData(); 
                     System.out.println();  
                     i++;
              } */
		
          // fileData.add(repo.readFile());
          
             // System.out.println(repo.readFile());
             
              meetPlayers(returnPlayer(repo.readFile()),returnPlayer(repo.readFile()));
       }
       public Animal returnPlayer(List<Animal> animalsList){
              Random rand = new Random();
              int player1 =rand.nextInt(animalsList.size());
              Animal player = animalsList.get(player1);
              player.setAnimalLocation(rand.nextInt(20),rand.nextInt(20));
               return player;
        }

        public double createRoamingArea(int x1, int x2, int y1,int y2){

              double roamArea = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 - y1));
              return roamArea;
        }         
       
        
      public String meetPlayers(Animal player1, Animal player2){
             
       int starvageOfPlayer1,starvageOfPlayer2;
       int strengthOfPlayer1,strengthOfPlayer2;
              if((player1 instanceof Herbivores) && (player2 instanceof Herbivores)){
                     System.out.println("\t !!!!!!!!!Both the Players are Herbivores Players !!!!!!!");
                     System.out.println("\n Our First Player is : " +player1.getName()+ "\n Our Secound Player is : " +player1.getName());
                     player1.startFight( player2);
                     return "we are Best F_R_I_E_N_D_S";
              }
              else if((player1 instanceof Herbivores) && (player2 instanceof Carnivores)){
                     System.out.println(" \t !!!!!!! First player is a Herbivore !!!!!! \n");
                     System.out.println("Player1 is : "+player1.getName()+"    "+" with starvage level "+player1.getStarvage()+" having strength of "+player1.getStrength() +"\n");
                     System.out.println(" \t !!!!!!! Second player is a Carnivore !!!!!! \n");
                     System.out.println("Player2 is : "+player2.getName()+"    "+" with starvage level "+player2.getStarvage()+" having strength of "+player2.getStrength() +"\n");
                     System.out.println(player2.getName()+" is only "+player2.getDistance()+" metres far from "+player1.getName());
                     starvageOfPlayer1 = player1.getStarvage();
                     starvageOfPlayer2 = player2.getStarvage();
                     strengthOfPlayer1 = player1.getStrength();
                     strengthOfPlayer2 = player2.getStrength();

                  
                    int x1 = player1.getAnimalLocationX();
                    int y1 = player1.getAnimalLocationY(); 
                  
                    int x2 = player2.getAnimalLocationX();
                    int y2 = player2.getAnimalLocationY();   

                   System.out.println(createRoamingArea(x1,x2,y1,y2));
                   if(createRoamingArea(x1,x2,y1,y2) <= 13){
                          System.out.println("FIGHT STARTS NOW");
                         player2.startFight(player1);
                        
                   }  else{
                     System.out.println("Nothing Happends");

                     System.out.println("Players are just Enjoying their time with their area!!!");
                  
                     
              }

                     return "Game Is Over !";

              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Herbivores))
              {
                     System.out.println(" \t !!!!!!! First Player is a Carnivore !!!!!! \n");
                     System.out.println("Player1 is : "+player1.getName()+"    "+" with starvage level "+player1.getStarvage()+" having strength of "+player1.getStrength() +"\n");
                     System.out.println(" \t !!!!!!!Second Player is a Herbivore !!!!!! \n");
                     System.out.println("Player2 is : "+player2.getName()+"    "+" with starvage level "+player2.getStarvage()+" having strength of "+player2.getStrength() +"\n");
                    
                     starvageOfPlayer1 = player1.getStarvage();
                     starvageOfPlayer2 = player2.getStarvage();
               
                     strengthOfPlayer1 = player1.getStrength();
                     strengthOfPlayer2 = player2.getStrength();
                    
                   
                     int x1 = player1.getAnimalLocationX();
                     int y1 = player1.getAnimalLocationY(); 
                     
                     int x2 = player2.getAnimalLocationX();
                     int y2 = player2.getAnimalLocationY();   
 
                    System.out.println(createRoamingArea(x1,x2,y1,y2));
                    if(createRoamingArea(x1,x2,y1,y2) <= 13){
                           System.out.println("FIGHT STARTS NOW");
                          
                          player1.startFight(player2);
                    } else{
                           System.out.println("Nothing Happends");
                           System.out.println("Players are just Enjoying their time with their area!!!");
                       
                    }
                
                     return "Game Is Over !";
              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Carnivores))		
	 {
		System.out.println("\t !!!!!!!!!Both the beasts are Carnivorous Players !!!!!!! \t \n");
              System.out.println("\n Our First Player is : " +player1.getName()+ "\n Our Secound Player is : " +player1.getName());
              player1.startFight( player2);
              	System.out.println("Fight is going to be Drop!!!!!!!!!");
              return "we are Best F_R_I_E_N_D_S and we are trying to catch our Prey";
        }

       return "No such Players existing in my F_O_R_E_S_T";

       }
       
            

       
}
