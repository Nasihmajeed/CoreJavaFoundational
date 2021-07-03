package com.lxisoft.actors;
import java.util.*;
public class Actor{
  private String charName;
  private String actorName;
  private int numOfActors;
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
  public void setNumOfActors(int numOfActors){
    this.numOfActors=numOfActors;
  }
  public int getNumOfActors(){
    return numOfActors;
  }
}
