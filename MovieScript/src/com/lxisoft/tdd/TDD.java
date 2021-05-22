package com.lxisoft.tdd;

import java.util.*;
import com.lxisoft.cast;
import com.lxisoft.script;
import com.lxisoft.movie;

public class TDD
{
public static void main(String[] args)
{
String movieName,movieGenre;

Scanner scanner=new Scanner(System.in);

Movie movie=new Movie();
Actor actor=new Actor();
Actress actress=new Actress();
Comedian comedian=new Comedian();



System.out.println("---------------------------------------------------------------------------------------------------------");	
System.out.println("---------------------------------------------------------------------------------------------------------");	
System.out.println("------------------------------------------Movie_Script------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");

           try{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}	

System.out.println("Enter the Movie Name : ");	
movieName=scanner.nextLine();			
movie.setMovieName(movieName);
System.out.println("The movie name you have entered is : "+movie.getMovieName());
				 try{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}

System.out.println("Enter the Movie Genre: ");	
System.out.println("Romantic");	
System.out.println("Emotional");	
System.out.println("Comedy");	

movieGenre=scanner.nextLine();				
movie.setMovieGenre(movieGenre);
System.out.println("This movie falls under the category of "+movie.getMovieGenre()+" genre !");

           try{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}
				
				
				
int numOfActor,numOfActress,numOfComedian;



if(movieGenre.equals("Romantic"))
{
	actor.setNumberOfActors(2);
	actress.setNumberOfActresses(2);
	comedian.setNumberOfComedians(1);
	System.out.println("You have selected a Romantic movie");
}

else if(movieGenre.equals("Emotional"))
{
	
	System.out.println("You have selected an Emotional movie");
}

else if(movieGenre.equals("Comedy"))
{
	System.out.println("You have selected a Comedy movie");
}





}
}