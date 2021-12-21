package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;

public class  Lion extends Animal implements Carnivores{

       public Lion(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
       }
      
      /* public Animal startFight(Animal player){
              System.out.println("hello");
              return player;
       }*/

}
