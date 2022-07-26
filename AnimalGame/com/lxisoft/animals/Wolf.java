package com.lxisoft.animals;

import com.lxisoft.game.Animal;

public class Wolf extends Animal implements Carnivores {

public Wolf() {

super();

}

public Wolf(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}

}