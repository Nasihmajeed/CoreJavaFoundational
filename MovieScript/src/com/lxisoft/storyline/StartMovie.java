package com.lxisoft.storyline;
import com.lxisoft.script.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
import com.lxisoft.cast.*;
import java.io.*;
import java.util.*;
public class StartMovie
{
	Scene1 sc1=new Scene1();
	Scene2 sc2=new Scene2();
	Scene3 sc3=new Scene3();
	Scanner sc=new Scanner(System.in);

	int ans;
	public void startMovie()
	{
		
		
//Casting casting=new Casting();
		Genere genere =new Genere();
		Imdb imdb=new Imdb();
		Plot plot=new Plot();
		StartMovie start =new StartMovie();
		

		Actors hero=new Actor();
		Actors heroine=new Actress();
		Actors comedian=new Actor();
		Actors villan=new Actor();
		
 
		ScriptWriter scriptWriter=new ScriptWriter();


		Movie movie=new Movie();
		String movieName;

		//Characters characters=new Characters();
		

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
				scriptWriter.setAll();
			


		System.out.println("\t Select the genere of the movie you want");
		System.out.println("							");
		System.out.println("\t 1. Comedy");
		System.out.println("\t 2. Romantic");
		System.out.println("\t 3. Emotional");
		System.out.println("\t 4. Thriller");
		ans=sc.nextInt();

		switch(ans)
		{
			case 1: 	movie.comedyMovie();
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