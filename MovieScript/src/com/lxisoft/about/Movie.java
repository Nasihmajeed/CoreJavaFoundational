package com.lxisoft.about;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;
import java.util.*;

public class Movie
{
	String movieName;
	Genere genere;
	
	Casting casting=new Casting();
	Scanner sc=new Scanner(System.in);
	Director director=new Director();
	//ScriptWriter scriptWriter=new ScriptWriter();
	
public void getMovieDetailsFromUser()
{

			System.out.println("\t Enter the name of the movie ");
				movieName=sc.next();
				
				setMovieName(movieName);
				
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
	{		int ans,againAns;
			System.out.println("\t-----------------------------");
			System.out.println("\tMovie Script Project");
			System.out.println("\t-----------------------------");
			getMovieDetailsFromUser();
			
		
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
			case 1: 	System.out.println("\t\n The name of the movie \n"+getMovieName());
						setGenere(Genere.valueOf("Comedy"));
						director.doCasting();
						director.scriptSelection(Genere.valueOf("Comedy"));
						
						break;

			case 2:		System.out.println("\t\n The name of the movie \n"+getMovieName());
						setGenere(Genere.valueOf("Romantic"));
							director.doCasting();
						director.scriptSelection(Genere.valueOf("Romantic"));
					
						break;
			
			case 3:		System.out.println("\t\n The name of the movie \n"+getMovieName());	
						setGenere(Genere.valueOf("Emotional"));
							director.doCasting();
						director.scriptSelection(Genere.valueOf("Emotional"));
					
						break;

			case 4:		System.out.println("\t\n The name of the movie \n"+getMovieName());	
						setGenere(Genere.valueOf("Thriller"));
						director.doCasting();
						director.scriptSelection(Genere.valueOf("Thriller"));
						
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