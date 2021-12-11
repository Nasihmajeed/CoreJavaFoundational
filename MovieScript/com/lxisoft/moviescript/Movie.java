package com.lxisoft.moviescript;

import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import java.util.*;

public class Movie {
    String name;
    String genere;
    int year;
    String director;
    String producer;
    
   public void inputDetails() {
       this.name= "THE FAULT IN OUR STARS";
       this.genere="Romance - Drama";
       this.year= 2014;
       this.director="Josh Boone";
       this.producer= "Marty Bowen and Wyck Godfrey";

   }
    
   public void printDetails (){

      
    System.out.println("\t\t          -- Movie Details --");


       System.out.println("\t\t+----------------------------------+");
    
       System.out.println("\t\t\t"   +name +"\n");

       System.out.println("\t\tGnere:" +genere);
       System.out.println("\t\tYear Of Release:" +year);
       System.out.println("\t\tDirector:" +director);
       System.out.println("\t\tProducers:" +producer +"\n");

       System.out.println("\t\t+----------------------------------+");

       System.out.println();

       System.out.println();

       System.out.println("\t\t         -- Cast Details --" +"\n");

   
     	 Hero hero = new Hero();
         hero.name = "\t\tHero Name: Ansel Elgort";
         hero.characterName ="\t\tCharacter Name: Augustus Waters";
         hero.showDetails();

         System.out.println("\t\t+----------------------------------+");

        Heroine heroine = new Heroine();
        heroine.name = "\t\tHeroine Name: Shailene Woodley";
        heroine.characterName ="\t\tCharacter Name:Hazel Graze Lancaster";
        heroine.showDetails();

    
		
        Script script = new Script();
        script.inputDetails();
        script.printDetails();


   


   }

}
