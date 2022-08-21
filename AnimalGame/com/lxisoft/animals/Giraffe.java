package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Giraffe extends Animal implements Herbivores {

public Giraffe() {

super();

}

public Giraffe(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}

}