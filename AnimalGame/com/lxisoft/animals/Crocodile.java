package com.lxisoft.animals;

import java.util.Random;
import java.*;
import com.lxisoft.*;
import com.lxisoft.game.Animal;
import com.lxisoft.test.*;
import com.lxisoft.localization.Localization;


public class Crocodile extends Animal implements Carnivores {
       
      // Random rand = new Random();

       public Crocodile(String animalName,int starvage,int strength,int distance,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
       }

      // TDD opt = new TDD();
       Localization object = new Localization();
       public String killOpponent(Animal player1,Animal player2){
       if (TDD.getOption() == 1) {
              
       if (player1 instanceof Herbivores && player2 instanceof Carnivores){
        System.out.println(object.initialize().getProperty("Design_1") );
        System.out.println( object.initialize().getProperty("Fight_stmt1")+player1.getName()+ object.initialize().getProperty("Fight_stmt2") +player2.getName()+ object.initialize().getProperty("Fight_stmt3"));
        System.out.println(object.initialize().getProperty("Fight_stmt4")+player1.getName());
        player1.setIsAlive(false);
        System.out.println(object.initialize().getProperty("Fight_stmt5")+player1.getName()+ object.initialize().getProperty("Fight_stmt6")+player1.getIsAlive());
        
       
       }else if(player1 instanceof Carnivores && player2 instanceof Herbivores){
 
 System.out.println(object.initializeM().getProperty("Design_1"));
        System.out.println( object.initialize().getProperty("Fight_stmt1")+player1.getName()+  object.initialize().getProperty("Fight_stmt2") +player2.getName()+  object.initialize().getProperty("Fight_stmt3"));
        System.out.println( object.initialize().getProperty("Fight_stmt4")+player2.getName());
        player2.setIsAlive(false);
        
        System.out.println( object.initialize().getProperty("Fight_stmt5")+player2.getName()+ object.initialize().getProperty("Fight_stmt6")+player2.getIsAlive());
    
 
       }
    return  object.initialize().getProperty("Fight_stmt7");
} else if (TDD.getOption() == 2) {
              
       if (player1 instanceof Herbivores && player2 instanceof Carnivores){
        System.out.println(object.initializeM().getProperty("Design_1") );
        System.out.println( object.initializeM().getProperty("Fight_stmt1")+player1.getName()+ object.initializeM().getProperty("Fight_stmt2") +player2.getName()+ object.initializeM().getProperty("Fight_stmt3"));
        System.out.println(object.initializeM().getProperty("Fight_stmt4")+player1.getName());
        player1.setIsAlive(false);
        System.out.println(object.initializeM().getProperty("Fight_stmt5")+player1.getName()+ object.initializeM().getProperty("Fight_stmt6")+player1.getIsAlive());
        
       
       }else if(player1 instanceof Carnivores && player2 instanceof Herbivores){
 
 System.out.println(object.initializeM().getProperty("Design_1") );
        System.out.println( object.initializeM().getProperty("Fight_stmt1")+player1.getName()+  object.initializeM().getProperty("Fight_stmt2") +player2.getName()+  object.initializeM().getProperty("Fight_stmt3"));
        System.out.println( object.initializeM().getProperty("Fight_stmt4")+player2.getName());
        player2.setIsAlive(false);
        System.out.println( object.initializeM().getProperty("Fight_stmt5")+player2.getName()+ object.initializeM().getProperty("Fight_stmt6")+player2.getIsAlive());
    
 
       }
    return  object.initializeM().getProperty("Fight_stmt7");
}
           
return  object.initialize().getProperty("Fight_stmt7");    
             }


          




     

}
