package com.lxisoft.cast;

import com.lxisoft.movie.Actor;
import com.lxisoft.movie.Language;

public class Comedian extends Actor  {

 public void actorDetails()  {

  System.out.println("\t\t" +Language.property.getProperty("ComedianName") + getName());
System.out.println("\t\t"  +Language.property.getProperty("ComedianCharacterName") + getCharacterName());


System.out.println("\t\t.................");
System.out.println("\n");

}	
}