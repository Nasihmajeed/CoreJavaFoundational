package com.lxisoft.animals;
import java.util.Random;
import java.util.*;
import com.lxisoft.game.Animal;

public class Deer extends Animal implements Herbivores {

 
 
       public Deer(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
             
       }
      
       private int luckFactor;

       Random r=new Random();
       
       public int getLuckFactor()
       {
              luckFactor=r.nextInt(10);
              return luckFactor;
       }
 

}
