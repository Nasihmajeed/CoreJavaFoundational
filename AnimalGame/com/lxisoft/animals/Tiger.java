package com.lxisoft.animals;

import com.lxisoft.game.Animal;
import java.util.Random;

public class Tiger extends Animal implements Carnivores 
{
  Random rand = new Random();

public Tiger(String animalName,int starvage,int strength,int distance){
       super(animalName,starvage,strength,distance);

}

//int x = rand.nextInt(20);
//int y = rand.nextInt(20);
/*public Animal startFight(Animal player){
       System.out.println("hello");
       return player;
}*/

}
