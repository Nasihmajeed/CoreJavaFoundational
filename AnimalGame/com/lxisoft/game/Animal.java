package com.lxisoft.game;
import java.util.Random;
import com.lxisoft.factors.Location;
import com.lxisoft.animals.*;

public class Animal {

   

private String animalName;    
private String food;
private int strengthLevel;
private int hungryLevel;
private int luckFactor;
private boolean Alive=true;

private Location location = new Location();

public Animal()
{
    
}

public Animal(String animalName, String food, int strengthLevel, int hungryLevel, boolean Alive){
 
this.animalName = animalName;    
this.food = food;
this.strengthLevel = strengthLevel;
this.hungryLevel = hungryLevel;
this.Alive = Alive;


}

//FIXME this does not follow a setter signature. this should accept a Location object
public void setLocation(int x , int y) {

    location.setLocationXaxis(x);
    location.setLocationYaxis(y);
}


//FIXME replace getLocationX and getLocationY by 'getLocation'
public int getLocationX() {
    return location.getLocationXaxis();
}

public int getLocationY() {
    return location.getLocationYaxis();
}


public String getName() {
    return animalName;
}

public void setName(String animalName) {
    this.animalName = animalName;
}

public String getFood() {
 return food;

}

public void setFood(String newFood) {
 this.food = newFood;

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

public int generateLuckFactor() {
    Random random = new Random();
    luckFactor = random.nextInt(10);
    return luckFactor;
}

public boolean getAlive() {

    return Alive;
}

public void setAlive(boolean alive) {

    this.Alive = alive;
}


public void printAnimalDetails () {

    System.out.println("\n.....ANIMAL.....\n");

System.out.println("Animal Name : "+this.getName());

System.out.println("Animal Eat : "+this.getFood());

System.out.println("Animal StrengthLevel : "+this.getStrengthLevel());

System.out.println("Animal HungryLevel : "+this.getHungryLevel());

}

}


