package com.lxisoft.animals;

import java.util.Random;
import java.util.*;
import java.*;

import com.lxisoft.game.Animal;
import com.lxisoft.*;
import com.lxisoft.factors.AnimalEscapeException;

public class Deer extends Animal implements Herbivores {

       

 
       public Deer(String animalName,int starvage,int strength,int distance ,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
             
       }
      
       private int luckFactor;

      
       
       public int getLuckFactor()
       {
            
              Random rand=new Random();
              luckFactor=rand.nextInt(10);
              return luckFactor;
       }
 
       public void escapeFromEnemy(Animal enemy){ 
        try{
        if(enemy instanceof Carnivores && this instanceof Herbivores){
    System.out.println(this.getName() +" escaping ..........");
    
        }
        else if(this instanceof Herbivores && enemy instanceof Carnivores){
            System.out.println(this.getName() +" escaping ............");
            
        }
        throw new AnimalEscapeException("Players are Just Escaping");
    }catch(AnimalEscapeException e) {
        System.out.println(e);
     }
    
    }
      

}
