package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Zebra extends Animal implements Herbivorous {

public Zebra() {

super();

}

public Zebra(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}

private int luckFactor;

public int getLuckFactor() {

    Random random = new Random();
    luckFactor = random.nextInt(10);
    return luckFactor;


}

}