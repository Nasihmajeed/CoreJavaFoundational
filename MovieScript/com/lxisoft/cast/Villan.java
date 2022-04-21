package com.lxisoft.cast;

import com.lxisoft.movie.Actor;
import com.lxisoft.movie.Language;

public class Villan extends Actor  {

 public void actorDetails()  {

  System.out.println("\t\t" +Language.property.getProperty("VillanName") +getName());
System.out.println("\t\t" +Language.property.getProperty("VillanCharacterName") + getCharacterName());

System.out.println("\t\t.................");
System.out.println("\n");

}	

}   