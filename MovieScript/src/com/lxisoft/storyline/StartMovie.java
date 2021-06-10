package com.lxisoft.storyline;
import com.lxisoft.script.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
import com.lxisoft.cast.*;
import java.io.*;
import java.util.*;
public class StartMovie
{
	
	Scanner sc=new Scanner(System.in);

	int ans;


	public void startMovie()
	{
		
		
		Casting casting=new Casting();
		
		
		

		Actors hero=new Actor();
		Actors heroine=new Actress();
		Actors comedian=new Actor();
		Actors villan=new Actor();
		
 
		ScriptWriter scriptWriter=new ScriptWriter();


		Movie movie=new Movie();
		String movieName;

		
		

		Scanner sc =new Scanner(System.in);
		int ans;
		int againAns,genereSelect;
		

		
			


		System.out.println("\t Select the genere of the movie you want");
		System.out.println("							");
		System.out.println("\t 1. Comedy");
		System.out.println("\t 2. Romantic");
		System.out.println("\t 3. Emotional");
		System.out.println("\t 4. Thriller");
		ans=sc.nextInt();

		switch(ans)
		{
			case 1: 	System.out.println("\t\n The name of the movie \n"+movie.getMovieName());
						System.out.println("\t\n The Cast of this movie");	

						setGenere("Comedy");
						System.out.println("\t\n The Genere of this movie :"+movie.getGenere());
						
						scriptWriter.scriptSelection(1);
						
						break;

			case 2:		movie.romanticMovie();
						scriptWriter.scriptSelection(2);
						break;
			
			case 3:		movie.emotionalMovie();
						scriptWriter.scriptSelection(3);

						break;

			case 4:		movie.thrillerMovie();
						scriptWriter.scriptSelection(4);

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