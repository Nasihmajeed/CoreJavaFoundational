package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Lion extends Animal implements Carnivores {

    Random random = new Random();

public Lion() {

super();

}

public Lion(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}

public void startFight(Animal opponent) {

    int hungryLevelOfPlayer1 = this.getHungryLevel();
    int hungryLevelOfPlayer2 = opponent.getHungryLevel();

    int strengthLevelOfPlayer1 = this.getStrengthLevel();
    int strengthLevelOfPlayer2 = opponent.getStrengthLevel();


        
            System.out.println("\n ............THE  FIGTH BEGINS HERE..........");
            System.out.println("\n" + opponent.getName() + "is caught by " + this.getName());
            System.out.println("\n" + this.getName() + "is attack" + opponent.getName());
            System.out.println("\n Strength of" + this.getName() + "is more than the strength of" + opponent.getName());
            System.out.println("\n HungryLevel of" + this.getName()+ "is more than the Hunger of" + opponent.getName());
            System.out.println("\n Strength of the "+ opponent.getName() + "is become decreasing" + "increasing the Hunger Level" + this.getName());
            System.out.println("\n" + this.getName() + "Attack and Killed the" + opponent.getName());
            System.out.println("The winner is" + this.getName());


} 

}
