package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Wolf extends Animal implements Carnivorous {

    Random random = new Random();

public Wolf() {

super();

}

public Wolf(String animalName, String eat , int strengthLevel, int hungeryLevel, boolean isAlive) {

super(animalName, eat, strengthLevel, hungeryLevel, isAlive);

}

public Animal startFight(Animal opponent) {

    int hungryLevelOfPlayer1 = this.getHungryLevel();
    int hungryLevelOfPlayer2 = opponent.getHungryLevel();

    int strengthLevelOfPlayer1 = this.getStrengthLevel();
    int strengthLevelOfPlayer2 = opponent.getStrengthLevel();

    if(this.getHungryLevel() >= opponent.getStrengthLevel()) {

        System.out.println("\n" + opponent.getName() + "is in danger situation");
        System.out.println("\n" + opponent.getName() + "is not unlucy charm and caught by" + this.getName());


        System.out.println("\n ............THE  FIGTH BEGINS HERE..........");
        System.out.println("\n" + opponent.getName() + "is caught by " + this.getName());
        System.out.println("\n" + this.getName() + "is attack" + opponent.getName());
        System.out.println("\n Strength of" + this.getName() + "is more than the strength of" + opponent.getName());
        System.out.println("\n HungryLevel of" + this.getName() + "is more than the Hunger of" + opponent.getName());
        System.out.println("\n Strength of the " + opponent.getName() + "is become decreasing" + "increasing the Hunger Level of" + this.getName());
        System.out.println("\n" + this.getName() + "Attack and Killed the" + opponent.getName());
        System.out.println("The winner is" + this.getName());
        
        setStrengthLevel(getStrengthLevel()-2);   

        System.out.println(getStrengthLevel());
        
        
        opponent.setStrengthLevel(getStrengthLevel()-4);
            System.out.println(getStrengthLevel());
         


    }

    else if(opponent.getStrengthLevel() >= this.getHungryLevel()) {

        System.out.println("\n" + opponent.getName() + "is very lucky charm and escaping from the" + this.getName());

           //Herbivorous.escapeFromEnemy(this,opponent);

    }

    return null;
}

}

