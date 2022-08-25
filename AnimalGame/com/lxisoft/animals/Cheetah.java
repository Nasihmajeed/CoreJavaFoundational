package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Cheetah extends Animal implements Carnivores {

    Random random = new Random();

public Cheetah() {

super();

}

public Cheetah(String animalName, String eat , int strengthLevel, int hungeryLevel) {

super(animalName, eat, strengthLevel, hungeryLevel);

}
public void startFight(Animal opponent){


    int hungryLevelOfPlayer1 = this.getHungryLevel();
    int hungryLevelOfPlayer2 = opponent.getHungryLevel();

    int strengthLevelOfPlayer1 = this.getStrengthLevel();
    int strengthLevelOfPlayer2 = opponent.getStrengthLevel();

    if(this.getHungryLevel() >= opponent.getStrengthLevel()) {

        System.out.println("\n" + opponent.getName() + "is in danger situation");
        System.out.println("\n" + opponent.getName() + "is not unlucy charm and caught by" + this.getName());

    }

    else if(opponent.getStrengthLevel() >= this.getHungryLevel()) {

        System.out.println("\n" + opponent.getName() + "is very lucky charm and escaping from the" + this.getName());

        Herbivores.escapeFromEnemy(this,opponent);

    }
    else {
        
    

    
 
        
            System.out.println("\n ............THE  FIGTH BEGINS HERE..........");
            System.out.println("\n"+ opponent.getName() + "is caught by " + this.getName());
            System.out.println("\n" + this.getName() + " is attack " + opponent.getName());
            System.out.println("\n Strength of " + this.getName() + "is more than the strength of" + opponent.getName());
            System.out.println("\n HungryLevel of" + this.getName() + "is more than the Hunger of" + opponent.getName());
            System.out.println("\n Strength of the " + opponent.getName() + "is become decreasing" + "increasing the Hunger Level of" + this.getName());
            System.out.println("\n"+ this.getName() + "Attack and Killed the" + opponent.getName());
            System.out.println("The winner is" + this.getName());

            

        }

}    
    }



