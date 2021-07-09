package com.lxisoft.actors;
import java.util.*;
public class Actor{
  private String charName;
  private String actorName;
  //private int numOfActors;
  public Actor(String actorName,String charName){
    this.actorName=actorName;
    this.charName=charName;
  }
  public void setCharName(String charName){
    this.charName=charName;
  }
  public String getCharName(){
    return charName;
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
