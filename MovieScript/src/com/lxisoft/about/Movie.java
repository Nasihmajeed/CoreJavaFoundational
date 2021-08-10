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
	{		int againAns,selectTheGenere;
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
		Genere [] geners=Genere.values();
		selectTheGenere=sc.nextInt();
		int setGenere=selectTheGenere-1;
		Genere genereSelected=geners[setGenere];
		System.out.println(genereSelected.toString());

		
		actors=director.castActors(actors);
	
		scriptWriter.writeScript(genereSelected,actors);



		
		
		System.out.println("\n \t\t Give your rating for the movie out of 10");
		rating=sc.nextFloat();
		setImdb(rating);
		System.out.println("\t\n The IMDB Rating of this movie :"+getRating());




System.out.println("\n\tDo you want to see more details about the movie(1.to view more 2.exit ) ");
againAns=sc.nextInt();
	}while(againAns==1);

}



}