package com.lxisoft.animal;

public class Animal {

protected int strengthLevel,hungerLevel,luckFactor;
protected String foodType,animalName;

protected Animal(int strengthLevel,int hungerLevel,int luckFactor, String foodType,String animalName){
   this.strengthLevel=strengthLevel;
 this.hungerLevel=hungerLevel;
 this.luckFactor=luckFactor;
 this.foodType=foodType;
this.animalName=animalName;
}

}