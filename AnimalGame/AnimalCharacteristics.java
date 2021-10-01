package com.AnimalGame.Game;

public class AnimalCharacteristics {
private String animalName;
private String animalType;
//all values below under 10 for simplicity
private int strength;
private int hungerlevel;
private int runningSpeed;
private int vision;

public AnimalCharacteristics(String animalName,String animalType,int strength,int hungerlevel,int runningSpeed,int vision){
  this.animalName=animalName;
  this.animalType=animalType;
  this.strength=strength;
  this.hungerlevel=hungerlevel;
  this.runningSpeed=runningSpeed;
  this.vision=vision;
}
public void setanimalName(String animalName){
  this.animalName=animalName;
}
public String getanimalName(){
  return animalName;
}
public void setanimalType(String animalType){
  this.animalType=animalType;
}
public String getanimalType(){
  return animalType;
}
public void setstrength(int strength){
  this.strength=strength;
}
public int getstrength(){
  return strength;
}

public void sethungerlevel(int hungerlevel){
  this.hungerlevel=hungerlevel;
}
public int gethungerlevel(){
  return hungerlevel;
}
public void setrunningSpeed(int runningSpeed){
  this.runningSpeed=runningSpeed;
}
public int getrunningSpeed(){
  return runningSpeed;
}
public void setvision(int vision){
  this.vision=vision;
}
public int getvision(){
  return vision;
}
}