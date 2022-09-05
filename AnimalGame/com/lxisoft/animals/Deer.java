package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Deer extends Animal implements Herbivorous {

public Deer() {

super();

}

public Deer(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}

private int luckFactor;

public int getLuckFactor() {

    Random random = new Random();
    luckFactor = random.nextInt(10);
    return luckFactor;


}

}