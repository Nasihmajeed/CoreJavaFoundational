package com.lxisoft.game;

import com.lxisoft.animals.*;

public class Animal {

private String animalName;    
private String eat;
private int strengthLevel;
private int hungryLevel;

Animal winner;

int hungryLevelOfPlayer1;
int hungryLevelOfPlayer2;
int strengthLevelOfPlayer1;
int strengthLevelOfPlayer2;

public Animal()
{
}

public Animal(String animalName, String eat, int strengthLevel, int hungryLevel){
 
this.animalName = animalName;    
this.eat = eat;
this.strengthLevel = strengthLevel;
this.hungryLevel = hungryLevel;


}

public void wildAnimals() {

System.out.println("1.Lion");
System.out.println("2.Deer");
System.out.println("3.Tiger");
System.out.println("4.Rabbit");
System.out.println("5.Leopard");
System.out.println("6.Giraffe");
System.out.println("7.Wolf");
System.out.println("8.Rhinocer");
System.out.println("9.Cheetah");
System.out.println("10.Zebra");

}

public String getName() {
    return animalName;
}

public void setName(String animalName) {
    this.animalName = animalName;
}

public String getEat() {
 return eat;

}

public void setEat(String newEat) {
 this.eat = newEat;

}

public int getStrengthLevel() {
 return strengthLevel;

}

public void setStrengthLevel(int newStrengthLevel) {
 this.strengthLevel = newStrengthLevel;

}

public int getHungryLevel() {
 return hungryLevel;

}

public void setHungryLevel(int newHungryLevel) {
 this.hungryLevel = newHungryLevel;

}


public void animalDetails () {

    System.out.println("\n.....ANIMAL.....\n");

System.out.println("Animal Name : "+this.getName());

System.out.println("Animal Eat : "+this.getEat());

System.out.println("Animal StrengthLevel : "+this.getStrengthLevel());

System.out.println("Animal HungryLevel : "+this.getHungryLevel());

}

public Animal animalsFight(Animal player1 , Animal player2) {

    if((player1 instanceof Herbivores) && (player2 instanceof Herbivores)) {

        System.out.println("The Both Players Are Herbivores");
        System.out.println("Didn't Figth Each Other");
        System.out.println("They are Good Friends");

    }
    
    else if((player1 instanceof Herbivores) && (player2 instanceof Carnivores)) {

        System.out.println("The First Player Is Herbivores");
        System.out.println("Player1 is : "+player1.getName()+" "+"  with hungry level "+player1.getHungryLevel()+" having strength of "+player1.getStrengthLevel());
        System.out.println("The Second Player Is Carnivores");
        System.out.println("Player2 is : "+player2.getName()+" "+"  with hungry level "+player2.getHungryLevel()+" having strength of "+player2.getStrengthLevel());
        System.out.println("Player 2 is Winner : "+player2.getName()+" ");
       
}

else if((player1 instanceof Carnivores) && (player2 instanceof Carnivores)){

    System.out.println("The Both Players Are Carnivores");
    System.out.println("They Are Good Friends");

}

else if((player1 instanceof Carnivores) && (player2 instanceof Herbivores)){

    System.out.println("The First Player Is Carnivores");
    System.out.println("Player1 is : "+player1.getName()+" "+"  with hungry level "+player1.getHungryLevel()+" having strength of "+player1.getStrengthLevel());
    System.out.println("The Second Player Is Herbivores");
    System.out.println("Player2 is : "+player2.getName()+" "+"  with hungry level "+player2.getHungryLevel()+" having strength of "+player2.getStrengthLevel());
    System.out.println("player1 is Winner : "+player1.getName()+"");
   

}
    return null;

}

}
