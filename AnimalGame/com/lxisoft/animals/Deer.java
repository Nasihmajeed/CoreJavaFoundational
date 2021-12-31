package com.lxisoft.animals;
import java.util.Random;
import java.util.*;
import com.lxisoft.game.Animal;
import java.*;
import com.lxisoft.*;

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
 

       void eatFood(Animal player1,Animal player2){
              if(player1 instanceof Herbivores || player2 instanceof Herbivores){
                     System.out.println("The Player is eating Grass............!");
              }
              else{
                     System.out.println("player nothing eats at now");
              }
       }

}
