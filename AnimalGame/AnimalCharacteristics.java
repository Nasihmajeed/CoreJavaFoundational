package com.animalGame.game;

public class AnimalCharacteristics {
private String animalName;
private String animalType;
//all values below under 10 for simplicity
private int strength;
private int hungerLevel;
private int runningSpeed;
private int vision;

public AnimalCharacteristics(String animalName,String animalType,int strength,int hungerLevel,int runningSpeed,int vision){
  this.animalName=animalName;
  this.animalType=animalType;
  this.strength=strength;
  this.hungerLevel=hungerLevel;
  this.runningSpeed=runningSpeed;
  this.vision=vision;
}
public void setAnimalName(String animalName){
  this.animalName=animalName;
}
public String getAnimalName(){
  return animalName;
}
public void setAnimalType(String animalType){
  this.animalType=animalType;
}
public String getAnimalType(){
  return animalType;
}
public void setStrength(int strength){
  this.strength=strength;
}
public int getStrength(){
  return strength;
}

public void setHungerLevel(int hungerLevel){
  this.hungerLevel=hungerLevel;
}
public int getHungerLevel(){
  return hungerLevel;
}
public void setRunningSpeed(int runningSpeed){
  this.runningSpeed=runningSpeed;
}
public int getRunningSpeed(){
  return runningSpeed;
}
public void setVision(int vision){
  this.vision=vision;
}
public int getVision(){
  return vision;
}
}