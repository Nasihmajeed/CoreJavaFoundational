package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;

public class Rhinoceros extends Animal implements Herbivores{
     
      

       public Rhinoceros(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
              
       }
       private int luckFactor;

       Random r=new Random();
           
              
                                                               //luckFactor
       public int getLuckFactor()
       {
              luckFactor=r.nextInt(10);
              return luckFactor;
       }
       
  
}
