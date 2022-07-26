package com.lxisoft.game;

import java.util.ArrayList;

import com.lxisoft.game.Forest;

import com.lxisoft.game.Animal;

import com.lxisoft.animals.*;

public class Forest {

    int i = 0;

    String meeting;

    public void setMeeting(Animal animal1,Animal animal2) {

        if((animal1 instanceof Herbivores) && (animal2 instanceof Carnivores )) {

            System.out.println("FIGHT BEGINS HERE");

        } 
    }     
        

public void welcomeToForest () {

    System.out.println("WELCOME TO FOREST \n");

Animal animal = new Animal(" "," ",0,0);

// animal.wildAnimals();

ArrayList<Animal> animalsList = new ArrayList<Animal>();

  


animalsList.add(new Lion("King-Lion","meat",50,50));
animalsList.add(new Deer("Alcine-Deer","grass",20,25));
animalsList.add(new Tiger("Dave-Tiger","meat",40,35));
animalsList.add(new Rabbit("Peter-Rabbit","grass",15,12));
animalsList.add(new Leopard("Dale-Leopard","meat",30,15));
animalsList.add(new Giraffe("Custard-Giraffe","grass",14,12));
animalsList.add(new Wolf("Roman-Wolf","meat",25,24));
animalsList.add(new Rhinocer("Grit-Rhinocer","meat",16,17));
animalsList.add(new Cheetah("Fastest-Cheetah","meat",45,45));
animalsList.add(new Zebra("Zippy-Zebra","grass",22,33));

for(i = 0 ; i < animalsList.size() ; i++) {
    System.out.println(animalsList.get(i).getName());
    System.out.println(animalsList.get(i).getEat());
    System.out.println(animalsList.get(i).getStrengthLevel());
    System.out.println(animalsList.get(i).getHungryLevel());


} 

}

}
