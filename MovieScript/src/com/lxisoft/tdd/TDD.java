package com.lxisoft.tdd;
import com.lxisoft.storyline.*;
import com.lxisoft.script.*;
import com.lxisoft.cast.*;
import com.lxisoft.about.*;
import java.util.*;

public class TDD
{
	public static void main(String [] args)
	{	Casting casting=new Casting();
		Genere genere =new Genere();
		Imdb imdb=new Imdb();
		Plot plot=new Plot();
		StartMovie start =new StartMovie();
		Actors hero=new Actor();
		Actors heroine=new Actress();
		Actors comedian=new Actor();
		Actors villan=new Actor();
		NonActors director=new NonActors();
 
		Mapping map=new Mapping();
		Movie movie=new Movie();
		String movieName;

		

		Scanner sc =new Scanner(System.in);
		int ans;
		int againAns,genereSelect;
		System.out.println("\tMovie Script Project");
		System.out.println("\t-----------------------------");

		do{

				System.out.println("\t Enter the name of the movie ");
				movieName=sc.next();
				//movieName.append(movieName);
				movie.setMovieName(movieName);

			




		System.out.println("\t Select the genere of the movie you want");
		System.out.println("							");
		System.out.println("\t 1. Comedy");
		System.out.println("\t 2. Romantic");
		System.out.println("\t 3. Emotional");

		/*System.out.println("\t 1. Cast");
		System.out.println("\t 2. Genere");
		System.out.println("\t 3. IMDB Rating");
		System.out.println("\t 4. Plot ");
		System.out.println("\t 5. Storyline");*/
		ans=sc.nextInt();

		switch(ans)
		{
			case 1: 	System.out.println("\t\n The name of the movie \n"+movie.getMovieName());
						System.out.println("\t\n The Cast of this movie");	
						map.setCasting();
						map.displayCasting();
						imdb.setImdb(7.6f);
						System.out.println("\t\n The IMDB Rating of this movie :"+imdb.getRating());
						System.out.println("\t\n Plot of the movie is \n");
						plot.getPlot();
						genere.setGenere("Comedy");
						System.out.println("\t\n The Genere of this movie :"+genere.getGenere());
						//genereSelect=sc.nextInt();
						map.scriptSelection(1);
						
						break;

			case 2:		System.out.println("\t\n The name of the movie \n"+movie.getMovieName());
						System.out.println("\t\n The Cast of this movie");	
						map.setCasting();
						map.displayCasting();
						imdb.setImdb(8.1f);
						System.out.println("\t\n The IMDB Rating of this movie :"+imdb.getRating());
						System.out.println("\t\n Plot of the movie is \n");
						plot.getPlot();
						genere.setGenere("Romantic");
						System.out.println("\t\n The Genere of this movie :"+genere.getGenere());
						map.scriptSelection(2);
						break;
			
			case 3:		System.out.println("\t\n The name of the movie \n"+movie.getMovieName());	
						System.out.println("\t\n The Cast of this movie");	
						map.setCasting();
						map.displayCasting();
						imdb.setImdb(8.6f);
						System.out.println("\t\n The IMDB Rating of this movie :"+imdb.getRating());
						System.out.println("\t\n Plot of the movie is \n");
						plot.getPlot();
						genere.setGenere("Emotional");
						System.out.println("\t\n The Genere of this movie :"+genere.getGenere());
						map.scriptSelection(3);

						break;
			default:		
						System.out.println("\t Invalid Input");
						
						break;
			
						

		}
System.out.println("\n\tDo you want to see more details about the movie(1.to view more 2.exit ) ");
againAns=sc.nextInt();
	}while(againAns==1);





	}
}