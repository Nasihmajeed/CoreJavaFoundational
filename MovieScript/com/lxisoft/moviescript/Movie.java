package com.lxisoft.moviescript;
import java.util.Scanner;

import com.lxisoft.cast.*;


public class Movie {
    
   private String name;
   private String language;
   private Genere genere;
   //private int year;
   //private String director;
   

   int number;

   enum Genere {
       ACTION,COMEDY,ROMANTIC
   } 


      public String getName(){
          return name;
      }
      public void setName(String name){  
        this.name = name;  
        }

        public String getLanguage(){
            return language;
        } 

        public void setLanguage(String language){  
            this.language = language;  
            }

        public Genere getGenere(){
            return genere;
        }

        public void setGenere(Genere genere){  
            this.genere = genere;  
            }

            /*public int getYear(){
                return year;
            } 

            public void setYear(int year){  
                this.year = year;  
                }*/
        
                //public String getDirector(){
                   // return director;
               // } 

                //public void setDirector(String director){  
                   // this.director = director;  
                   // }
        
                  
  
   public void movieDetails() {

    Scanner sc = new Scanner(System.in);
      
    System.out.println("\t\t          -- Movie Details -- ");


       System.out.println("\t\t+----------------------------------+"+"\n");

       System.out.println("\t\t Select The Movie Type");

		System.out.println("\t\t+----------------+");
		System.out.println("\n");

        System.out.println(" 1 = Action");
		System.out.println(" 2 = Romantic");
		System.out.println(" 3 = Comedy");
		
		System.out.println("\n");

        System.out.println("Enter The Number of Genere Type ");
       
          number= sc.nextInt();

           sc.nextLine();

           switch  (number)  {

case 1 :
        Genere genereAction = Genere.ACTION;
        genere=genereAction;

//genere = ("Action");
break;

case 2: 
        Genere genereComedy = Genere.COMEDY;
        genere = genereComedy;

//genere = ("Romantic");
break;

case 3:

        Genere genereRomantic = Genere.ROMANTIC;
        genere = genereRomantic;

//genere =("Comedy");
break;

           }

           System.out.println("Please Select The Movie Language");

           System.out.println(" 1 = ENGLISH ");
           System.out.println(" 2 = MALAYALAM ");
           System.out.println(" 3 = TAMIL ");

           System.out.println("ENGLISH ONLY AVAILABLE");

           System.out.println("Please Enter Number");

           number = sc.nextInt();
          sc.nextLine();

        if (number ==1)  {

            language = ("ENGLISH");

        }
		if(number != 1)   {

			System.out.println("You Are Selected Wrong Number");

		}

           System.out.println("Please Enter The  Movie Name ");

		name = sc.nextLine();

		System.out.println("\n");

       // System.out.println("Enter The Director Name");
        
		//director = sc.nextLine();

		System.out.println("\t\tName :" + this.name); 
	   // System.out.println("\t\tDirctor :" + this.director);
		System.out.println("\t\tGenere :"+ this.genere);
		System.out.println("\t\tLanguage :" +this.language);
	    System.out.println("\n");

     
       Director director = new Director();

       director.setName("JHON GREEN");  

       director.viewdirectorDetails();

       director.createcastDetails();

       Script script = new Script();

       script.getScenes();

    }}
    

