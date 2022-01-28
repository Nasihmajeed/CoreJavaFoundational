package com.lxisoft.animals;

import java.util.Random;
import java.util.*;
import java.*;

import com.lxisoft.*;
import com.lxisoft.game.Animal;
import com.lxisoft.factors.AnimalEscapeException;

public class Rabbit extends Animal implements Herbivores {

      

       public Rabbit(String animalName,int starvage,int strength,int distance ,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
             
       }
       private int luckFactor;

      
        
                                               //luckFactor
       public int getLuckFactor()
       {
              Random rand = new Random();
              luckFactor=rand.nextInt(10);
              return luckFactor;
       }
       
    //   int x = rand.nextInt(20);
      // int y = rand.nextInt(20);

      public void escapeFromEnemy(Animal player1,Animal player2){ 
       try{
       if(player1 instanceof Carnivores && player2 instanceof Herbivores){
   System.out.println(player2.getName() +" escaping ..........");
   
       }
       else if(player1 instanceof Herbivores && player2 instanceof Carnivores){
           System.out.println(player1.getName() +" escaping ............");
           
       }
       throw new AnimalEscapeException("Players are Just Escaping");
   }catch(AnimalEscapeException e) {
       System.out.println(e);
    }
   
   }

}
