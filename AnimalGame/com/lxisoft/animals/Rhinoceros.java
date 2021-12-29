package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;

public class Rhinoceros extends Animal implements Herbivores{
     
       

       public Rhinoceros(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
              
       }
       private int luckFactor;

       
           
              
                                                               //luckFactor
       public int getLuckFactor()
       {
              Random rand = new Random();
              luckFactor = rand.nextInt(10);
              return luckFactor;
       }
       
      // int x = rand.nextInt(20);
       //int y = rand.nextInt(20);

}
