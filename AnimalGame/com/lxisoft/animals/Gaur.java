package com.lxisoft.animals;

import java.util.Random;
import java.*;

import com.lxisoft.game.Animal;
import com.lxisoft.*;
import com.lxisoft.factors.AnimalEscapeException;
import com.lxisoft.test.*;
import com.lxisoft.localization.Localization;


public class Gaur extends Animal implements Herbivores {
       
      
       

       public Gaur(String animalName,int starvage,int strength,int distance,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
             
       }
       	
       private int luckFactor;

      // Random rand = new Random();
       
                                                         //luckFactor
       public int getLuckFactor()
       {
              Random rand = new Random();
              luckFactor = rand.nextInt(10);
              return luckFactor;
       }

      // int x = rand.nextInt(20);
     //  int y = rand.nextInt(20);
     TDD opt = new TDD();
     Localization object = new Localization();
     public void escapeFromEnemy(Animal enemy){ 
        if (opt.getOption() == 1) {
        try{
        if(enemy instanceof Carnivores && this instanceof Herbivores){
    System.out.println(this.getName() +object.initialize().getProperty("E_stmt_1") );
    
        }
        else if(this instanceof Herbivores && enemy instanceof Carnivores){
            System.out.println(this.getName() +object.initialize().getProperty("E_stmt_1"));
            
        }
        throw new AnimalEscapeException(object.initialize().getProperty("E_stmt_2"));
    }catch(AnimalEscapeException e) {
        System.out.println(e);
     }
        }else if (opt.getOption() == 2) {

            try{
                if(enemy instanceof Carnivores && this instanceof Herbivores){
            System.out.println(this.getName() +object.initializeM().getProperty("E_stmt_1") );
            
                }
                else if(this instanceof Herbivores && enemy instanceof Carnivores){
                    System.out.println(this.getName() +object.initializeM().getProperty("E_stmt_1"));
                    
                }
                throw new AnimalEscapeException(object.initializeM().getProperty("E_stmt_2"));
            }catch(AnimalEscapeException e) {
                System.out.println(e);
             }

        }
    }

}
