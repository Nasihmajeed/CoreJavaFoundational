package com.lxisoft.movie;

import com.lxisoft.direction.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;
import resources.DisplayUtility;

import java.util.*;


public class Movie
{ 

  DisplayUtility sleep=new DisplayUtility(); 

  Scanner sc=new Scanner(System.in);


    Actor heroo=new Hero();

    Actor heroinee=new Heroine();

    Actor comediann=new Comedian();

    Actor villainn=new Villain();

    Director director=new Director();
    
    ScriptWriter writer=new ScriptWriter();

                    List<Actor> actors;
 
   private int yearOfRelease,genreNum;
   private float rating;
   private String movieName,movieLanguage;

   Genre[] genre;
            

      enum Genre
       {
          Romantic,Emotional,Comedy,Action;
       }


   //Name of the movie

   public void setMovieName(String movieName)
   {
    this.movieName=movieName;	
   }		

   public String getMovieName()
   {
	return movieName; 
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


 public void inputInitialDetails()
  {
   System.out.println("\r\n");
   

   System.out.println("---------------------------------------------------------------------------------------------------------");	
   System.out.println("--------------------------------------: Enter the name of the movie :------------------------------------");
   System.out.println("---------------------------------------------------------------------------------------------------------");

   setMovieName(sc.next());	
 

               sleep.sleepThread();

   System.out.println("\r\n");
   System.out.println("---------------------------------------------------------------------------------------------------------");	
   System.out.println("------------------------------------: Enter the Language of the movie :----------------------------------");
   System.out.println("---------------------------------------------------------------------------------------------------------");

   setMovieLanguage(sc.next());

                  sleep.sleepThread();



   genre=Genre.values();


    System.out.println("\r\n");
  System.out.println("-------------------------------------------------------------------------------------------------------");	
	System.out.println("----------------------------Select the genre of your movie from below list-----------------------------");	
	System.out.println("-------------------------------------------------------------------------------------------------------");	
	System.out.println(java.util.Arrays.asList(genre));
	System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");					
	   

      genreNum=sc.nextInt();
						        
			sleep.sleepThread();


    System.out.println("\r\n");
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println("-----------------------------Enter the Year in which the Movie was Released------------------------------"); 
    System.out.println("---------------------------------------------------------------------------------------------------------");
						  
    setYear(sc.nextInt());
					

    System.out.println("\r\n");

			sleep.sleepThread();



   System.out.println("---------------------------------------------------------------------------------------------------------");
   System.out.println("---------------------------------------Enter the Rating of the Movie-------------------------------------"); 
   System.out.println("---------------------------------------------------------------------------------------------------------");
   setRating(sc.nextFloat());


	
	System.out.println("\r\n");

				sleep.sleepThread();


System.out.println("-----------------------------------------------------------------------------------------------------------");
System.out.println("------------------------------------------Enter the name of the Director-----------------------------------");
System.out.println("-----------------------------------------------------------------------------------------------------------");
director.setName(sc.next());
System.out.println("\r\n");


                 sleep.sleepThread();

 System.out.println("-----------------------------------------------------------------------------------------------------------");
 System.out.println("----------------------------------------Enter the name of the Script Writer---------------------------------");
 System.out.println("-----------------------------------------------------------------------------------------------------------");
 writer.setName(sc.next());
 System.out.println("\r\n");


        actors=new ArrayList<Actor>();


//******************************************************************************
  actors=director.castActors(actors);
//******************************************************************************


}


 public void printInitialDetails()
 {


   System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");
                  
                sleep.sleepThread();


	System.out.println("-------------------------------GOOD FRIDAY MOVIE HOUSE in association with----------------------------------");
                  
                sleep.sleepThread();
	System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");

              sleep.sleepThread();

    



 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
 	System.out.println("\r\n");
                 
    System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");
                  
                 sleep.sleepThread();

	System.out.println("---------------------------------UNIVERSAL PICTURE PRODUCTIONS PRESENTS------------------------------------");
                  
                 sleep.sleepThread();
	System.out.println("/////////////////////////////////----------------------------------------///////////////////////////////////");

                 sleep.sleepThread();

    System.out.println("\r\n");

    System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");		
				System.out.println("Name of the Movie : "+getMovieName());


				
			sleep.sleepThread();

 

               switch(genre[genreNum-1])
               {
               	case Romantic :
               	        System.out.println(getMovieName()+" is a Romantic Movie!!!");
               	        break;
               	case Emotional :
               	        System.out.println(getMovieName()+" is an Emotional Movie!!!");
               	        break;
               	case Comedy :
               	        System.out.println(getMovieName()+" is a Comedy Movie!!!");
               	        break;
               	case Action :
               	        System.out.println(getMovieName()+" is an Action Movie!!!");
               	        break;
               }
                                 
                  
                   sleep.sleepThread();


                System.out.println("Language of the Movie : "+getMovieLanguage());


				
			sleep.sleepThread();


				System.out.println("Year of Release : "+getYear());
				

				sleep.sleepThread();



				System.out.println("Rating of the movie : "+getRating());
				

				sleep.sleepThread();



				System.out.println("Name of the Director : "+director.getName());


				sleep.sleepThread();

				System.out.println("Name of the Script Writer : "+writer.getName());


				sleep.sleepThread();

	System.out.println("////////////////////////////--------------------------------------------------------------------------------");	
	System.out.println("---------------------------////////////////////////////////////////////////---------------------------------");	
	System.out.println("---------------------------------------------------------------------------/////////////////////////////////");	
                
               sleep.sleepThread();


       //******************************************************************************
		director.printCharacters(actors);
     //		 writer.writeScript(genre[genreNum-1] , actors);
	   //******************************************************************************
}





}