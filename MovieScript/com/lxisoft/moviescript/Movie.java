package com.lxisoft.moviescript;

//import java.util.Scanner;

import com.lxisoft.cast.*;


public class Movie {
   private String name;
   private String genere;
   private int year;
   private String director;
   private String producer;

   Dialogue dialogue = new Dialogue();
   

      public String getName(){
          return name;
      }
      public void setName(String name){  
        this.name = name;  
        }

        public String getGenere(){
            return genere;
        }

        public void setGenere(String genere){  
            this.genere = genere;  
            }

            public int getYear(){
                return year;
            } 

            public void setYear(int year){  
                this.year = year;  
                }
        
                public String getDirector(){
                    return director;
                } 

                public void setDirector(String director){  
                    this.director = director;  
                    }
        
                    public String getProducer(){
                        return producer;
                    } 

                    public void setProducer(String producer){  
                        this.producer = producer;  
                        }
   
   
  
   public void movieDetails() {

      
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
   //}
    
      // public void viewCast(){

       System.out.println("\t\t         -- Cast Details --");

       System.out.println("\t\t+----------------------------------+"+"\n");

   
         Hero hero = new Hero();
         hero.setName (" Ansel Elgort");
         hero.setCharacterName (" Augustus Waters");
         hero.actorsDetails();

         
         System.out.println("\t\t+----------------------------------+"+"\n");

         Heroine heroine = new Heroine();
        heroine.setName  (" Shailene Woodley");
        heroine.setCharacterName ("Hazel Graze Lancaster");
        heroine.actorsDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian1 = new Comedian();
        comedian1.setName (" Jennifer Aniston ");
        comedian1.setCharacterName (" Rachel Green");
        comedian1.actorsDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian2 = new Comedian();
        comedian2.setName (" Courteney Cox ");
        comedian2.setCharacterName( " Monica ");
        comedian2.actorsDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian3 = new Comedian();
        comedian3.setName (" Matthew Perry ");
        comedian3.setCharacterName (" Chandler ");
        comedian3.actorsDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        Comedian comedian4 = new Comedian();
        comedian4.setName (" Matt LeBlanc ");
        comedian4.setCharacterName (" Jeoy ");
        comedian4.actorsDetails();

        System.out.println("\t\t+----------------------------------+"+"\n");

        
        dialogue.actor[0] = hero.getCharacterName();
        dialogue.actor[1]= heroine.getCharacterName();
        dialogue.actor[2]= comedian1.getCharacterName();
        dialogue.actor[3]= comedian2.getCharacterName();
        dialogue.actor[4]= comedian3.getCharacterName();
        dialogue.actor[5]= comedian4.getCharacterName();
        dialogue.viewDialogue();
       
   }
  
}


