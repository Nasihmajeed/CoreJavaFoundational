package com.lxisoft.game;

import java.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import com.lxisoft.test.*;
import com.lxisoft.animals.*;
import com.lxisoft.game.Animal;
import com.lxisoft.factors. FileRepository;
import com.lxisoft.localization.Localization;


public class Forest {

       
       Localization object = new Localization();
      // public List<Animal> animalsList = new ArrayList<Animal>();
       
       FileRepository repo = new  FileRepository();
         
      // List<Animal> fileData = new ArrayList<Animal>();

      TDD opt = new TDD();

       public void welcomeToForest() 
       {

      // int i = 0; 
      
       repo.createFile();
      // repo.showFileInfo();
        //repo.writeToFile();
       repo.readFile();

       if (TDD.getOption() == 1) {
    
      System.out.println(object.initialize().getProperty("intro1"));

      System.out.println(object.initialize().getProperty("intro2") +"\n");
      
         
             
              meetPlayers(returnPlayer(repo.readFile()),returnPlayer(repo.readFile()));
       }else if (TDD.getOption() == 2) {

              System.out.println(object.initializeM().getProperty("intro1"));

              System.out.println(object.initializeM().getProperty("intro2") +"\n");
              
                 
                     
                      meetPlayers(returnPlayer(repo.readFile()),returnPlayer(repo.readFile()));

       }
}
       public Animal returnPlayer(List<Animal> animalsList){
              Random rand = new Random();
              int player1 =rand.nextInt(animalsList.size());
              Animal player = animalsList.get(player1);
              player.setAnimalLocation(rand.nextInt(20),rand.nextInt(20));
               return player;
        }

           
       
        
      public String meetPlayers(Animal player1, Animal player2){
             
      // int starvageOfPlayer1,starvageOfPlayer2;
      // int strengthOfPlayer1,strengthOfPlayer2;



       int starvageOfPlayer1 = player1.getStarvage();
       int starvageOfPlayer2 = player2.getStarvage();
       int strengthOfPlayer1 = player1.getStrength();
       int strengthOfPlayer2 = player2.getStrength();

    
      int x1 = player1.getAnimalLocationX();
      int y1 = player1.getAnimalLocationY(); 
    
      int x2 = player2.getAnimalLocationX();
      int y2 = player2.getAnimalLocationY(); 




       Animal animal = new Animal("",0,0,0,false);
       if (TDD.getOption() == 1) {
              if((player1 instanceof Herbivores) && (player2 instanceof Herbivores)){
                     System.out.println("\t "+ object.initialize().getProperty("F_stmt_1"));
                     System.out.println("\n "+ object.initialize().getProperty("F_stmt_2") +player1.getName()+ "\n"+ object.initialize().getProperty("F_stmt_3") +player1.getName());
                     player1.startFight( player2);
                     return object.initialize().getProperty("F_stmt_4");
              }
              else if((player1 instanceof Herbivores) && (player2 instanceof Carnivores)){
                     System.out.println(" \t"+ object.initialize().getProperty("F_stmt_5")+"\n");
                     System.out.println(object.initialize().getProperty("F_stmt_6")+player1.getName()+"    "+object.initialize().getProperty("F_stmt_7")+player1.getStarvage()+ object.initialize().getProperty("F_stmt_8")+player1.getStrength() +"\n");
                     System.out.println(" \t"+  object.initialize().getProperty("F_stmt_9")+"\n");
                     System.out.println(object.initialize().getProperty("F_stmt_10")+player2.getName()+"    "+object.initialize().getProperty("F_stmt_7")+player2.getStarvage()+object.initialize().getProperty("F_stmt_8")+player2.getStrength() +"\n");
                     System.out.println(player2.getName()+ object.initialize().getProperty("F_stmt_11") +player2.getDistance()+object.initialize().getProperty("F_stmt_12")+player1.getName());
                      

                   System.out.println(animal.createRoamingArea(x1,x2,y1,y2));
                   if(animal.createRoamingArea(x1,x2,y1,y2) <= 13){
                          System.out.println(object.initialize().getProperty("F_stmt_13"));
                         player2.startFight(player1);
                        
                   }  else{
                     System.out.println(object.initialize().getProperty("F_stmt_14"));

                     System.out.println(object.initialize().getProperty("F_stmt_15"));
                  
                     
              }

                     return object.initialize().getProperty("F_stmt_16");

              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Herbivores))
              {
                     System.out.println(" \t"+object.initialize().getProperty("F_stmt_17")+"\n");
                     System.out.println(object.initialize().getProperty("F_stmt_6")+player1.getName()+"    "+object.initialize().getProperty("F_stmt_7")+player1.getStarvage()+ object.initialize().getProperty("F_stmt_8")+player1.getStrength() +"\n");
                     System.out.println(" \t"+object.initialize().getProperty("F_stmt_18")+"\n");
                     System.out.println(object.initialize().getProperty("F_stmt_10")+player2.getName()+"    "+object.initialize().getProperty("F_stmt_7")+player2.getStarvage()+object.initialize().getProperty("F_stmt_8")+player2.getStrength() +"\n");
                    
                    
 
                    System.out.println(animal.createRoamingArea(x1,x2,y1,y2));
                    if(animal.createRoamingArea(x1,x2,y1,y2) <= 13){
                     System.out.println(object.initialize().getProperty("F_stmt_13"));
                          
                          player1.startFight(player2);
                    } else{
                     System.out.println(object.initialize().getProperty("F_stmt_14"));

                     System.out.println(object.initialize().getProperty("F_stmt_15"));
                       
                    }
                
                    return object.initialize().getProperty("F_stmt_16");
              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Carnivores))		
	 {
		System.out.println("\t "+ object.initialize().getProperty("F_stmt_19") +"\t \n");
              System.out.println("\n "+ object.initialize().getProperty("F_stmt_2") +player1.getName()+ "\n"+ object.initialize().getProperty("F_stmt_3") +player1.getName());
              player2.startFight( player1);
              	System.out.println(object.initialize().getProperty("F_stmt_20"));
              return object.initialize().getProperty("F_stmt_21");
        }

       return object.initialize().getProperty("F_stmt_22");
       } else if (TDD.getOption() == 2) {



              if((player1 instanceof Herbivores) && (player2 instanceof Herbivores)){
                     System.out.println("\t "+ object.initializeM().getProperty("F_stmt_1"));
                     System.out.println("\n "+ object.initializeM().getProperty("F_stmt_2") +player1.getName()+ "\n"+ object.initializeM().getProperty("F_stmt_3") +player1.getName());
                     player1.startFight( player2);
                     return object.initializeM().getProperty("F_stmt_4");
              }
              else if((player1 instanceof Herbivores) && (player2 instanceof Carnivores)){
                     System.out.println(" \t"+ object.initializeM().getProperty("F_stmt_5")+"\n");
                     System.out.println(object.initializeM().getProperty("F_stmt_6")+player1.getName()+"    "+object.initializeM().getProperty("F_stmt_7")+player1.getStarvage()+ object.initializeM().getProperty("F_stmt_8")+player1.getStrength() +"\n");
                     System.out.println(" \t"+  object.initializeM().getProperty("F_stmt_9")+"\n");
                     System.out.println(object.initializeM().getProperty("F_stmt_10")+player2.getName()+"    "+object.initializeM().getProperty("F_stmt_7")+player2.getStarvage()+object.initializeM().getProperty("F_stmt_8")+player2.getStrength() +"\n");
                     System.out.println(player2.getName()+ object.initializeM().getProperty("F_stmt_11") +player2.getDistance()+object.initializeM().getProperty("F_stmt_12")+player1.getName());
                     

                   System.out.println(animal.createRoamingArea(x1,x2,y1,y2));
                   if(animal.createRoamingArea(x1,x2,y1,y2) <= 13){
                          System.out.println(object.initializeM().getProperty("F_stmt_13"));
                         player2.startFight(player1);
                        
                   }  else{
                     System.out.println(object.initializeM().getProperty("F_stmt_14"));

                     System.out.println(object.initializeM().getProperty("F_stmt_15"));
                  
                     
              }

                     return object.initializeM().getProperty("F_stmt_16");

              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Herbivores))
              {
                     System.out.println(" \t"+object.initializeM().getProperty("F_stmt_17")+"\n");
                     System.out.println(object.initializeM().getProperty("F_stmt_6")+player1.getName()+"    "+object.initializeM().getProperty("F_stmt_7")+player1.getStarvage()+ object.initializeM().getProperty("F_stmt_8")+player1.getStrength() +"\n");
                     System.out.println(" \t"+object.initializeM().getProperty("F_stmt_18")+"\n");
                     System.out.println(object.initializeM().getProperty("F_stmt_10")+player2.getName()+"    "+object.initializeM().getProperty("F_stmt_7")+player2.getStarvage()+object.initializeM().getProperty("F_stmt_8")+player2.getStrength() +"\n");
                    
                  
 
                    System.out.println(animal.createRoamingArea(x1,x2,y1,y2));
                    if(animal.createRoamingArea(x1,x2,y1,y2) <= 13){
                     System.out.println(object.initializeM().getProperty("F_stmt_13"));
                          
                          player1.startFight(player2);
                    } else{
                     System.out.println(object.initializeM().getProperty("F_stmt_14"));

                     System.out.println(object.initializeM().getProperty("F_stmt_15"));
                       
                    }
                
                    return object.initializeM().getProperty("F_stmt_16");
              }
              else if((player1 instanceof Carnivores) && (player2 instanceof Carnivores))		
	 {
		System.out.println("\t "+ object.initializeM().getProperty("F_stmt_19") +"\t \n");
              System.out.println("\n "+ object.initializeM().getProperty("F_stmt_2") +player1.getName()+ "\n"+ object.initializeM().getProperty("F_stmt_3") +player1.getName());
              player2.startFight( player1);
              	System.out.println(object.initializeM().getProperty("F_stmt_20"));
              return object.initializeM().getProperty("F_stmt_21");
        }

       return object.initializeM().getProperty("F_stmt_22");




       }
       return object.initialize().getProperty("F_stmt_22");
       }
       
            

       
}
