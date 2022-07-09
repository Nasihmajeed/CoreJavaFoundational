package com.lxisoft.game;

import com.lxisoft.game.Forest;

import com.lxisoft.game.Animal;

import com.lxisoft.animals.*;

public class Forest {

private String name;
private String location;

public Forest(String name, String location) {

this.name = name;

this.location = location;

}


public String getName() {
 return name;

}

public void setName(String newName) {
 this.name = newName;

}

public String getLocation() {
 return location;

}

public void setLocation(String newLocation) {
 this.location = newLocation;

}

public void printDetails() {

System.out.println("\n......WELCOME TO FOREST.......\n");

System.out.println("Forest Name : "+this.name);

System.out.println("Forest Location : "+this.location);

}

}


