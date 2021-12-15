package com.lxisoft.moviescript;

import com.lxisoft.cast.*;
import com.lxisoft.moviescript.Actor;

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

      
    System.out.println("\t\t          -- Movie Details -- ");


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

        System.out.println("\t\t+----------------------------------+");

        Comedian comedian1 = new Comedian();
        comedian1.name = "\t\tComedian Name:  Jennifer Aniston ";
        comedian1.characterName = "\t\tCharacter Name: Rachel Green";
        comedian1.showDetails();

        System.out.println("\t\t+----------------------------------+");

        Comedian comedian2 = new Comedian();
        comedian2.name = "\t\tComedian Name: Courteney Cox ";
        comedian2.characterName = "\t\tCharacter Name: Monica ";
        comedian2.showDetails();

        System.out.println("\t\t+----------------------------------+");

        Comedian comedian3 = new Comedian();
        comedian3.name = "\t\tComedian Name: Matthew Perry ";
        comedian3.characterName = "\t\tCharacter Name: Chandler ";
        comedian3.showDetails();

        System.out.println("\t\t+----------------------------------+");

        Comedian comedian4 = new Comedian();
        comedian4.name = "\t\tComedian Name: Matt LeBlanc ";
        comedian4.characterName = "\t\tCharacter Name: Jeoy ";
        comedian4.showDetails();

        System.out.println("\t\t+----------------------------------+");

        Comedian comedian5 = new Comedian();
        comedian5.name = "\t\tComedian Name: Lisa Kudrow ";
        comedian5.characterName = "\t\tCharacter Name: Phoebe ";
        comedian5.showDetails();

    
        Script script = new Script();
        script.inputDetails();
        script.printDetails();



   }

}

