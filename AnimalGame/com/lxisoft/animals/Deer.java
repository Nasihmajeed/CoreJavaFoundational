package com.lxisoft.animals;

import com.lxisoft.game.Animal;

public class Deer extends Animal implements Herbivores {

       public Deer(String animalName,int starvage,int stamina,int distance)
       {
              super(animalName,starvage,stamina,distance);        
       }
}
