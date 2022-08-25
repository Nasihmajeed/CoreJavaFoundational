package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Rhinocer extends Animal implements Herbivores {

public Rhinocer() {

super();

}

public Rhinocer(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}

private int luckFactor;

public int getLuckFactor() {

    Random random = new Random();
    luckFactor = random.nextInt(10);
    return luckFactor;


}

}