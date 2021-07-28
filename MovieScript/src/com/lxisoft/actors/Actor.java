package com.lxisoft.actors;
import java.util.*;
public class Actor{
  private String characterName;
  private String actorName;
  //private int numOfActors;
  public Actor(String actorName,String charName){
    this.actorName=actorName;
    this.characterName=charName;
  }
  public void setCharacterName(String characterName){
    this.characterName=characterName;
  }
  public String getCharacterName(){
    return characterName;
  }
  public void setActorName(String actorName){
    this.actorName=actorName;
  }
  public String getActorName(){
    return actorName;
  }
/*  public void setNumOfActors(int numOfActors){
    this.numOfActors=numOfActors;
  }
  public int getNumOfActors(){
    return numOfActors;
  }*/
}
