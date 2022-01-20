package com.lxisoft.animals;

import java.util.Random;
import java.*;
import com.lxisoft.*;
import com.lxisoft.game.Animal;

public class Crocodile extends Animal implements Carnivores {
       
      // Random rand = new Random();

       public Crocodile(String animalName,int starvage,int strength,int distance,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
       }

       public String killOpponent(Animal player1,Animal player2){
              if (player1 instanceof Herbivores && player2 instanceof Carnivores){
               System.out.println(" < \t\t\t-------------***------------- \t\t\t> ");
               System.out.println("The Fight Between "+player1.getName()+ " And " +player2.getName()+ "going to Deep Stage@!!!! ");
               System.out.println("There is no hope existing for "+player1.getName());
               player1.setIsAlive(false);
               System.out.println("Now the state of "+player1.getName()+" is alive condition is "+player1.getIsAlive());
               
             
 
              }else if(player1 instanceof Carnivores && player2 instanceof Herbivores){
        
        System.out.println(" < \t\t\t-------------***------------- \t\t\t> ");
               System.out.println("The Fight Between "+player1.getName()+ " And " +player2.getName()+ "going to Deep Stage@!!!! ");
               System.out.println("There is no hope existing for "+player2.getName());
               player2.setIsAlive(false);
               
               System.out.println("Now the state of "+player2.getName()+" is alive condition is "+player2.getIsAlive());
               
               

              }
           return "nothing more existing";
           
           
             }


          




     

}
