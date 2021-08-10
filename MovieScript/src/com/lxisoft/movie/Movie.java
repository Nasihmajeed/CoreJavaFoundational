package com.lxisoft.movie;

import com.lxisoft.direction.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;
import com.lxisoft.resources.DisplayUtility;

import java.util.*;


public class Movie
{ 

  DisplayUtility sleep=new DisplayUtility(); 

  Scanner sc=new Scanner(System.in);


    Hero heroo=new Hero();

    Heroine heroinee=new Heroine();

    Comedian comediann=new Comedian();

    Villain villainn=new Villain();



    Director director=new Director();
    ScriptWriter writer=new ScriptWriter();

    ArrayList<Actor> actors=new ArrayList<Actor>();
 
   private int yearOfRelease,movieGenre;
   private float rating;
   private String movieName,movieLanguage;



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
 

                sleep.sleepStatement();



   System.out.println("\r\n");
   System.out.println("---------------------------------------------------------------------------------------------------------");	
   System.out.println("------------------------------------: Enter the Language of the movie :----------------------------------");
   System.out.println("---------------------------------------------------------------------------------------------------------");

   setMovieLanguage(sc.next());

                  sleep.sleepStatement();



    System.out.println("\r\n");
    System.out.println("-------------------------------------------------------------------------------------------------------");	
	System.out.println("------Enter a number corresponding to the given below options to select genre of your movie------------");	
	System.out.println("-------------------------------------------------------------------------------------------------------");	
	System.out.println(java.util.Arrays.asList(Genre.values()));
	System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");					
	
       

       setMovieGenre(sc.nextInt());
						  
	            
				sleep.sleepStatement();




    System.out.println("\r\n");
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println("-----------------------------Enter the Year in which the Movie was Released------------------------------"); 
    System.out.println("---------------------------------------------------------------------------------------------------------");
						  
    setYear(sc.nextInt());
					

    System.out.println("\r\n");

				sleep.sleepStatement();



   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("---------------------------------------Enter the Rating of the Movie-------------------------------------"); 
   System.out.println("---------------------------------------------------------------------------------------------------------");
   setRating(sc.nextFloat());


	
	System.out.println("\r\n");

				sleep.sleepStatement();
	 





System.out.println("-----------------------------------------------------------------------------------------------------------");
System.out.println("------------------------------------------Enter the name of the Director-----------------------------------");
System.out.println("-----------------------------------------------------------------------------------------------------------");
director.setName(sc.next());
System.out.println("\r\n");


                  sleep.sleepStatement();

 System.out.println("-----------------------------------------------------------------------------------------------------------");
 System.out.println("----------------------------------------Enter the name of the Script Writer---------------------------------");
 System.out.println("-----------------------------------------------------------------------------------------------------------");
 writer.setName(sc.next());
 System.out.println("\r\n");


//******************************************************************************
  actors=director.castingTheActors(actors);
//******************************************************************************


}


 public void printInitialDetails()
 {

   System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");
                  
                 sleep.sleepStatement();


	System.out.println("-------------------------------GOOD FRIDAY MOVIE HOUSE in association with----------------------------------");
                  
                 sleep.sleepStatement();

	System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");

               sleep.sleepStatement();

    



 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
                 
    System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");
                  
                 sleep.sleepStatement();

	System.out.println("---------------------------------UNIVERSAL PICTURE PRODUCTIONS PRESENTS------------------------------------");
                  
                 sleep.sleepStatement();
	System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");

                 sleep.sleepStatement();

    System.out.println("\r\n");

    System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");		
				System.out.println("Name of the Movie : "+getMovieName());


				
				sleep.sleepStatement();

 

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
                                 
                  
                    sleep.sleepStatement();


                System.out.println("Language of the Movie : "+getMovieLanguage());


				
				sleep.sleepStatement();


				System.out.println("Year of Release : "+getYear());
				

				sleep.sleepStatement();



				System.out.println("Rating of the movie : "+getRating());
				

				sleep.sleepStatement();



				System.out.println("Name of the Director : "+director.getName());


				sleep.sleepStatement();

				System.out.println("Name of the Script Writer : "+writer.getName());


				sleep.sleepStatement();

	System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");	
                
               sleep.sleepStatement();


       //******************************************************************************
		director.printCharactersOfTheMovie(actors);
     		// writer.writeScript(getMovieGenre(),actors);
	   //******************************************************************************
}





}