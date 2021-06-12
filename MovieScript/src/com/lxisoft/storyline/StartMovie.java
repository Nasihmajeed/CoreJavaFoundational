package com.lxisoft.storyline;


import com.lxisoft.about.Movie;
import com.lxisoft.cast.*;
import java.io.*;
import java.util.*;
public class StartMovie
{
	
	Scanner sc=new Scanner(System.in);

	int ans,againAns;
	float rating;
Casting casting=new Casting();
Director director=new Director();		
		
		

		/*Actors hero=new Actor();
		Actors heroine=new Actress();
		Actors comedian=new Actor();
		Actors villan=new Actor();*/
		
 
		ScriptWriter scriptWriter=new ScriptWriter();


		Movie movie=new Movie();
		String movieName;

	public void startMovie()
	{		
			System.out.println("\t-----------------------------");
			System.out.println("\tMovie Script Project");
			System.out.println("\t-----------------------------");
			
			movie.movieDetails();
		
		System.out.println("\t Now the Characters and roles has been set");
		System.out.println("\t--------------------------------------------");
		do{

				
		
		System.out.println("\t Select the genere of the movie you want");
		System.out.println("							");
		System.out.println("\t 1. Comedy");
		System.out.println("\t 2. Romantic");
		System.out.println("\t 3. Emotional");
		System.out.println("\t 4. Thriller");
		ans=sc.nextInt();

		switch(ans)
		{
			case 1: 	
						System.out.println("\t\n The name of the movie \n"+movie.getMovieName());
						

						movie.setGenere("Comedy");
						System.out.println("\t\n The Genere of this movie :"+movie.getGenere());
						
						scriptWriter.scriptSelection(1);
						
						break;

			case 2:		System.out.println("\t\n The name of the movie \n"+movie.getMovieName());
							
						
						movie.setImdb(8.1f);
						System.out.println("\t\n The IMDB Rating of this movie :"+movie.getRating());
						
						movie.setGenere("Romantic");
						System.out.println("\t\n The Genere of this movie :"+movie.getGenere());

						scriptWriter.scriptSelection(2);
						break;
			
			case 3:		System.out.println("\t\n The name of the movie \n"+movie.getMovieName());	
								
						
						movie.setImdb(8.6f);
						System.out.println("\t\n The IMDB Rating of this movie :"+movie.getRating());
					
						movie.setGenere("Emotional");
						System.out.println("\t\n The Genere of this movie :"+movie.getGenere());
						scriptWriter.scriptSelection(3);

						break;

			case 4:		System.out.println("\t\n The name of the movie \n"+movie.getMovieName());	
						
						
						movie.setImdb(8.6f);
						
						
						movie.setGenere("Thriller");
						System.out.println("\t\n The Genere of this movie :"+movie.getGenere());
						scriptWriter.scriptSelection(4);

						break;			

						
			default:		
						System.out.println("\t Invalid Input");
						
						break;
			
						

		}

		
		System.out.println("\n \t\t Give your rating for the movie out of 10");
		rating=sc.nextFloat();
		movie.setImdb(rating);
		System.out.println("\t\n The IMDB Rating of this movie :"+movie.getRating());




System.out.println("\n\tDo you want to see more details about the movie(1.to view more 2.exit ) ");
againAns=sc.nextInt();
	}while(againAns==1);








	}

	



}