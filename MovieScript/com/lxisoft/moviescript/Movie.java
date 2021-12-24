package com.lxisoft.moviescript;

import com.lxisoft.cast.*;
import com.lxisoft.moviescript.Actor;

public class Movie {
   private String name;
   private String genere;
   private int year;
   private String director;
   private String producer;
    
  // public void setupMovie() {
      public String getName(){
          return name;
      }
      public void setName(String name){  
        this.name=name;  
        }

        public String getGenere(){
            return genere;
        }

        public void setGenere(String genere){  
            this.genere=genere;  
            }

            public int getYear(){
                return year;
            } 

            public void setYear(int year){  
                this.year=year;  
                }
        
                public String getDirector(){
                    return director;
                } 

                public void setDirector(String director){  
                    this.director=director;  
                    }
        
                    public String getProducer(){
                        return producer;
                    } 

                    public void setProducer(String producer){  
                        this.producer=producer;  
                        }

      /* this.name= "THE FAULT IN OUR STARS";
       this.genere="Romance - Drama";
       this.year= 2014;
       this.director="Josh Boone";
       this.producer= "Marty Bowen and Wyck Godfrey";

   }*/
    
   public void playMovie () {

      
    System.out.println("\t\t          -- Movie Details -- ");


       System.out.println("\t\t+----------------------------------+"+"\n");
    
       System.out.println("\t\t\t"   +name);
       System.out.println("\t\t      +------------------------+"+"\n");

       System.out.println("\t\tGnere:" +genere);
       System.out.println("\t\tYear Of Release:" +year);
       System.out.println("\t\tDirector:" +director);
       System.out.println("\t\tProducers:" +producer);

       System.out.println("\t\t+----------------------------------+");

       System.out.println();

       System.out.println("\t\t         -- Cast Details --");

       System.out.println("\t\t+----------------------------------+"+"\n");

   
     	 Hero hero = new Hero();
         hero.setName ("\t\tHero Name: Ansel Elgort");
         hero.setCharacterName ("\t\tCharacter Name: Augustus Waters");
         hero.showDetails();

         System.out.println("\t\t+----------------------------------+"+"\n");

        Heroine heroine = new Heroine();
        heroine.setName  ("\t\tHeroine Name: Shailene Woodley");
        heroine.setCharacterName ("\t\tCharacter Name:Hazel Graze Lancaster");
        heroine.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian1 = new Comedian();
        comedian1.setName ("\t\tComedian Name:  Jennifer Aniston ");
        comedian1.setCharacterName ("\t\tCharacter Name: Rachel Green");
        comedian1.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian2 = new Comedian();
        comedian2.setName ("\t\tComedian Name: Courteney Cox ");
        comedian2.setCharacterName( "\t\tCharacter Name: Monica ");
        comedian2.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian3 = new Comedian();
        comedian3.setName ("\t\tComedian Name: Matthew Perry ");
        comedian3.setCharacterName ("\t\tCharacter Name: Chandler ");
        comedian3.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian4 = new Comedian();
        comedian4.setName ("\t\tComedian Name: Matt LeBlanc ");
        comedian4.setCharacterName ("\t\tCharacter Name: Jeoy ");
        comedian4.showDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian5 = new Comedian();
        comedian5.setName ("\t\tComedian Name: Lisa Kudrow ");
        comedian5.setCharacterName("\t\tCharacter Name: Phoebe ");
        comedian5.showDetails();

        System.out.println("\t\t+----------------------------------+");

    
        Script script = new Script();
        script.setupMovie();
        script.playMovie();

   }

}

