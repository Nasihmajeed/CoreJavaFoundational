package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Rhinocer extends Animal implements Herbivorous {

    private int luckFactor;

public Rhinocer() {

super();

}

public Rhinocer(String animalName, String eat , int strengthLevel, int hungeryLevel,boolean isAlive) {

super(animalName, eat, strengthLevel, hungeryLevel, isAlive);

}

public  void escapeFromEnemy(Animal player1) 
     
{
    Random random = new Random();
    luckFactor = random.nextInt(10);
   
if(luckFactor >= 5){
     
    System.out.println("The player is Escaping");
    System.out.println("The player is very Lucky");

}
else{

    System.out.println("No Hope to Escaping");
    System.out.println("The Player is Trapped");

}

}


}