package com.lxisoft.animals;

import com.lxisoft.game.Animal;

public class Rabbit extends Animal implements Herbivores {

public Rabbit() {

super();

}

public Rabbit(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}

}