package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Rabbit extends Animal implements Herbivorous {

public Rabbit() {

super();

}

public Rabbit(String animalName, String eat , int strengthLevel, int hungeryLevel, boolean isAlive) {

super(animalName, eat, strengthLevel, hungeryLevel, isAlive);

}

public  void escapeFromEnemy(Animal player1) 
     
{

}

private int luckFactor;

public int getLuckFactor() {

    Random random = new Random();
    luckFactor = random.nextInt(10);
    return luckFactor;


}

}