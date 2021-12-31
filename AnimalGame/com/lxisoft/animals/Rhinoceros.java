package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;
import java.*;
import com.lxisoft.*;

public class Rhinoceros extends Animal implements Herbivores{
     
       

       public Rhinoceros(String animalName,int starvage,int strength,int distance, boolean isAlive)
       {
              super(animalName,starvage,strength,distance, isAlive);
              
       }
       private int luckFactor;

       
           
              
                                                               //luckFactor
       public int getLuckFactor()
       {
              Random rand = new Random();
              luckFactor = rand.nextInt(10);
              return luckFactor;
       }
       
      
       
}
