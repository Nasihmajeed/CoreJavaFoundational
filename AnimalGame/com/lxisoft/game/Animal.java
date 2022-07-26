package com.lxisoft.game;

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

}
