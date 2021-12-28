package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;
import java.util.*;

public class Rabbit extends Animal implements Herbivores {

       Random rand = new Random();

       public Rabbit(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
             
       }
       private int luckFactor;

      
        
                                               //luckFactor
       public int getLuckFactor()
       {
              luckFactor=rand.nextInt(10);
              return luckFactor;
       }
       
    //   int x = rand.nextInt(20);
      // int y = rand.nextInt(20);

}
