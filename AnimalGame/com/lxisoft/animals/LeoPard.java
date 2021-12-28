package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;

public class LeoPard extends Animal implements Carnivores{

       Random rand = new Random();

       public LeoPard(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
       }
       
     //  int x = rand.nextInt(20);
       //int y = rand.nextInt(20);

     /*  public Animal startFight(Animal player){
              System.out.println("hello");
              return player;
       }*/

}
