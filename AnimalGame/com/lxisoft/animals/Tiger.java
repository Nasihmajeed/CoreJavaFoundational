package com.lxisoft.animals;

import com.lxisoft.game.Animal;

public class Tiger extends Animal implements Carnivores 
{
        
public Tiger(String animalName,int starvage,int strength,int distance){
       super(animalName,starvage,strength,distance);

}

/*public Animal startFight(Animal player){
       System.out.println("hello");
       return player;
}*/

}
