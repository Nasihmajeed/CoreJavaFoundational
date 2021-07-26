package com.lxisoft.movie;

import com.lxisoft.direction.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;
import com.lxisoft.sleep.*;

import java.util.*;


//ArrayList
public class Movie
{

  SleepStatement slp=new SleepStatement();

  Scanner sc=new Scanner(System.in);


    Hero heroo=new Hero();

    Heroine heroinee=new Heroine();

    Comedian comediann=new Comedian();

    Villain villainn=new Villain();



    Director director=new Director();
    ScriptWriter writer=new ScriptWriter();


 
   private int yearOfRelease,movieGenre;
   private float rating;
   private String movieName,movieLanguage;


   HashMap<Integer,ArrayList<Actor>> actors;


   //Name of the movie

   public void setMovieName(String movieName)
   {
    this.movieName=movieName;	
   }		

   public String getMovieName()
   {
	return movieName; 
   } 



   //Genre of the movie

   public void setMovieGenre(int movieGenre)
   {
    this.movieGenre=movieGenre;	
   }		

   public int getMovieGenre()
   {
	return movieGenre;
   }



   //Language of the movie

   public void setMovieLanguage(String movieLanguage)
   {
    this.movieLanguage=movieLanguage;	
   }		

   public String getMovieLanguage()
   {
	return movieLanguage;
   }



   //Movie Rating

    public void setRating(float rating)
	{
		this.rating=rating;
	}

	public float getRating()
	{
		return rating;
	}



    //Year of Release

    public void setYear(int yearOfRelease)
	{
		this.yearOfRelease=yearOfRelease;
	}
		
	public int getYear()
	{
		return yearOfRelease;
	}

	



    public enum Genre
    {
    	Romantic
    	{
    		public String toString()
    		  {
    			return "RomanticMovie";
    		  }
    	},

        Emotional
    	{
            public String toString()
    		  {
    			return "EmotionalMovie";
    		  } 
    	},

    	Comedy
    	{
            public String toString()
    		  {
    			return "ComedyMovie";
    		  }
    	},
    	Action
    	{
            public String toString()
    		  {
    			return "ActionMovie";
    		  }
    	}

    };






 public void inputInitialDetails()
  {
   System.out.println("\r\n");
   

   System.out.println("---------------------------------------------------------------------------------------------------------");	
   System.out.println("--------------------------------------: Enter the name of the movie :------------------------------------");
   System.out.println("---------------------------------------------------------------------------------------------------------");

   setMovieName(sc.next());	
 

                slp.sleepThread();



   System.out.println("\r\n");
   System.out.println("---------------------------------------------------------------------------------------------------------");	
   System.out.println("------------------------------------: Enter the Language of the movie :----------------------------------");
   System.out.println("---------------------------------------------------------------------------------------------------------");

   setMovieLanguage(sc.next());

                  slp.sleepThread();



    System.out.println("\r\n");
    System.out.println("-------------------------------------------------------------------------------------------------------");	
	System.out.println("------Enter a number corresponding to the given below options to select genre of your movie------------");	
	System.out.println("-------------------------------------------------------------------------------------------------------");	
	System.out.println(java.util.Arrays.asList(Genre.values()));
	System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");					
	
       

       setMovieGenre(sc.nextInt());
						  
	            
				slp.sleepThread();




    System.out.println("\r\n");
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println("-----------------------------Enter the Year in which the Movie was Released------------------------------"); 
    System.out.println("---------------------------------------------------------------------------------------------------------");
						  
    setYear(sc.nextInt());
					

    System.out.println("\r\n");

				slp.sleepThread();




   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("---------------------------------------Enter the Rating of the Movie-------------------------------------"); 
   System.out.println("---------------------------------------------------------------------------------------------------------");
   setRating(sc.nextFloat());


	
	System.out.println("\r\n");

				slp.sleepThread();
	 





System.out.println("-----------------------------------------------------------------------------------------------------------");
System.out.println("------------------------------------------Enter the name of the Director-----------------------------------");
System.out.println("-----------------------------------------------------------------------------------------------------------");
director.setDirectorName(sc.next());
System.out.println("\r\n");


                   slp.sleepThread();

 System.out.println("-----------------------------------------------------------------------------------------------------------");
 System.out.println("----------------------------------------Enter the name of the Script Writer---------------------------------");
 System.out.println("-----------------------------------------------------------------------------------------------------------");
 writer.setScriptWriterName(sc.next());
 System.out.println("\r\n");


//******************************************************************************
  actors=director.castingTheActors();
//******************************************************************************


}


 public void printInitialDetails()
 {

   System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");
                  
                  slp.sleepThread();


	System.out.println("-------------------------------GOOD FRIDAY MOVIE HOUSE in association with----------------------------------");
                  
                  slp.sleepThread();


	System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");

                 slp.sleepThread();

    



 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
                 
    System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");
                  
                  slp.sleepThread();


	System.out.println("---------------------------------UNIVERSAL PICTURE PRODUCTIONS PRESENTS------------------------------------");
                  
                  slp.sleepThread();


	System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");

                 slp.sleepThread();


    System.out.println("\r\n");

    System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");		
				System.out.println("Name of the Movie : "+getMovieName());


				
				slp.sleepThread();

 

               switch(getMovieGenre())
               {
               	case 1 :
               	        System.out.println("Genre of the Movie : "+Genre.Romantic.toString());
               	        break;
               	case 2 :
               	        System.out.println("Genre of the Movie : "+Genre.Emotional.toString());
               	        break;
               	case 3 :
               	        System.out.println("Genre of the Movie : "+Genre.Comedy.toString());
               	        break;
               	case 4 :
               	        System.out.println("Genre of the Movie : "+Genre.Action.toString());
               	        break;
               }
                                 
                  
                     slp.sleepThread();



                System.out.println("Language of the Movie : "+getMovieLanguage());


				
				slp.sleepThread();


				System.out.println("Year of Release : "+getYear());
				

				slp.sleepThread();



				System.out.println("Rating of the movie : "+getRating());
				

				slp.sleepThread();



				System.out.println("Name of the Director : "+director.getDirectorName());


				slp.sleepThread();

				System.out.println("Name of the Script Writer : "+writer.getScriptWriterName());


				slp.sleepThread();


	System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");	
                
                 slp.sleepThread();



       //******************************************************************************
		director.printCharactersOfTheMovie();
		writer.writeScript(getMovieGenre(),actors);
	   //******************************************************************************
}





}