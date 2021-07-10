package com.lxisoft.about;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;
import java.util.*;

public class Movie
{
	String movieName;
	Genere genere;
	Scanner sc=new Scanner(System.in);
	Director director=new Director();
	ArrayList<Actor> actors=new ArrayList<Actor>();
	ScriptWriter scriptWriter=new ScriptWriter();
	





public void getMovieDetailsFromUser()
{

			System.out.println("\t Enter the name of the movie ");
				movieName=sc.next();
				
				setMovieName(movieName);
}

public void casting()
{
			
Map<String,ArrayList<Actor>> castMap=new HashMap<String,ArrayList<Actor>>();
actors=director.castActors();
castMap=director.createMap();
scriptWriter.setActorsMap(castMap);

}



public void setGenere(Genere genere)
 {
 	this.genere=genere;
 }	
	

float rating;

public void setImdb(float rating)
{
	this.rating=rating;
}

public float getRating()
{
	return rating;
}



	public void setMovieName(String movieName)
	{
		this.movieName=movieName;

	} 

	public String getMovieName()
	{
		return movieName;
	}



	public void startMovie()
	{		int againAns;
		Role role;
		String answerTheGenere;
			System.out.println("\t-----------------------------");
			System.out.println("\tMovie Script Project");
			System.out.println("\t-----------------------------");
			getMovieDetailsFromUser();
			
		
		System.out.println("\t Now the Characters and roles has been set");
		System.out.println("\t--------------------------------------------");
		
		do{

				
		
		System.out.println("\t Select the genere of the movie you want");
		System.out.println("							");
		System.out.println("\t 1. "+Genere.valueOf("Comedy").toString());
		System.out.println("\t 2."+Genere.valueOf("Romantic").toString());
		System.out.println("\t 3."+Genere.valueOf("Emotional").toString());
		System.out.println("\t 4. "+Genere.valueOf("Thriller").toString());
		answerTheGenere=sc.next();

		switch(Genere.valueOf(answerTheGenere))
		{
			case Comedy: 	System.out.println("\t\n The name of the movie \n"+getMovieName());
						setGenere(Genere.valueOf("Comedy"));
						casting();

					
						scriptWriter.writeScript(Genere.valueOf("Comedy"));
						
						break;

			case Romantic:	System.out.println("\t\n The name of the movie \n"+getMovieName());
						setGenere(Genere.valueOf("Romantic"));
							casting();
						scriptWriter.writeScript(Genere.valueOf("Romantic"));
					
						break;
			
			case Emotional:	System.out.println("\t\n The name of the movie \n"+getMovieName());	
						setGenere(Genere.valueOf("Emotional"));
							casting();
						scriptWriter.writeScript(Genere.valueOf("Emotional"));
					
						break;

			case Thriller :	System.out.println("\t\n The name of the movie \n"+getMovieName());	
						setGenere(Genere.valueOf("Thriller"));
						casting();
						scriptWriter.writeScript(Genere.valueOf("Thriller"));
						
						break;			

						
			default:	System.out.println("\t Invalid Input");
						break;
			
						

		}

		
		System.out.println("\n \t\t Give your rating for the movie out of 10");
		rating=sc.nextFloat();
		setImdb(rating);
		System.out.println("\t\n The IMDB Rating of this movie :"+getRating());




System.out.println("\n\tDo you want to see more details about the movie(1.to view more 2.exit ) ");
againAns=sc.nextInt();
	}while(againAns==1);

}



}