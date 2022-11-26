package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.factors.customException;

import com.lxisoft.game.Animal;

public class Zebra extends Animal implements Herbivorous {

    private int luckFactor;

public Zebra() {

super();

}

public Zebra(String animalName, String eat , int strengthLevel, int hungeryLevel, boolean isAlive) {

super(animalName, eat, strengthLevel, hungeryLevel, isAlive);

}

public  void escapeFromEnemy(Animal opponent )  throws customException {

    Random random = new Random();
    luckFactor = random.nextInt(10);
   
if(luckFactor >= 5){
     
    System.out.println("The player is Escaping");
    System.out.println("The player is very Lucky");

}
else{

    System.out.println("No Hope to Escaping");
    System.out.println("The Player is Trapped");
    throw new customException("Exception occured at while Escaping");

}


    
}
     







}

