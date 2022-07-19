package com.lxisoft.game;

public class Animal {

private String eat;
private String strengthLevel;
private String hungryLevel;

public Animal()
{
}

public Animal(String eat, String strengthLevel, String hungryLevel){
 
this.eat = eat;
this.strengthLevel = strengthLevel;
this.hungryLevel = hungryLevel;

}


public String getEat() {
 return eat;

}

public void setEat(String newEat) {
 this.eat = newEat;

}

public String getStrengthLevel() {
 return strengthLevel;

}

public void setStrengthLevel(String newStrengthLevel) {
 this.strengthLevel = newStrengthLevel;

}

public String getHungryLevel() {
 return hungryLevel;

}

public void setHungryLevel(String newHungryLevel) {
 this.hungryLevel = newHungryLevel;

}

public void printAnimalDetails() {

System.out.println("\n.....ANIMAL.....\n");

System.out.println("Animal Eat : "+this.eat);

System.out.println("Animal StrengthLevel : "+this.strengthLevel);

System.out.println("Animal HungryLevel : "+this.hungryLevel);

}

}
