package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;
import java.util.*;

public class Rabbit extends Animal implements Herbivores {

       
       public Rabbit(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
             
       }
       private int luckFactor;

       Random rand =new Random();
        
                                               //luckFactor
       public int getLuckFactor()
       {
              luckFactor=rand.nextInt(3);
              return luckFactor;
       }
       
}
