package com.lxisoft.cast;

import com.lxisoft.movie.Actor;
import com.lxisoft.movie.Language;




public class Hero extends Actor  {


 public void actorDetails()  {

  
  System.out.println("\t\t"+Language.property.getProperty("HeroName") +getName());
  System.out.println("\t\t"+Language.property.getProperty("HeroCharacterName") + getCharacterName());
  System.out.println("\t\t.................");
  System.out.println("\n");
  

 
}	



}