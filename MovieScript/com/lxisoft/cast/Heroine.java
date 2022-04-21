package com.lxisoft.cast;

import com.lxisoft.movie.Actor;
import com.lxisoft.movie.Language;


public class Heroine extends Actor   {

 public void actorDetails()  {

  System.out.println("\t\t" +Language.property.getProperty("HeroineName") + getName());
System.out.println("\t\t "+Language.property.getProperty("HeroineCharacterName") + getCharacterName());


System.out.println("\t\t.................");
System.out.println("\n");

}	

}