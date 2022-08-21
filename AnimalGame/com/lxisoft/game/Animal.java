package com.lxisoft.game;
import java.util.Random;
import com.lxisoft.animals.*;

public class Animal {

private String animalName;    
private String eat;
private int strengthLevel;
private int hungryLevel;



public Animal()
{
}

public Animal(String animalName, String eat, int strengthLevel, int hungryLevel){
 
this.animalName = animalName;    
this.eat = eat;
this.strengthLevel = strengthLevel;
this.hungryLevel = hungryLevel;


}

Random random = new Random();

public void wildAnimals() {
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



}


