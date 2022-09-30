package com.lxisoft.animals;

import java.util.Random;

import com.lxisoft.game.Animal;

public class Deer extends Animal implements Herbivorous {

    private int luckFactor;

public Deer() {

super();

}

public Deer(String animalName, String eat , int strengthLevel, int hungeryLevel,boolean isAlive) {

super(animalName, eat, strengthLevel, hungeryLevel, isAlive);

}

public  void escapeFromEnemy(Animal opponent) {

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
