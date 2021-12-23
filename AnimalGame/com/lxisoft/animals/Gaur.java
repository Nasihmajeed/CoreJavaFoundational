package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;

public class Gaur extends Animal implements Herbivores {
       
      

       public Gaur(String animalName,int starvage,int strength,int distance)
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
