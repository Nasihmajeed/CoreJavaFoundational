package com.lxisoft.about;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;
import java.util.*;

public class Movie
{
	String movieName;

		
		
	Casting casting=new Casting();
	Scanner sc=new Scanner(System.in);
	Director director=new Director();
	ScriptWriter scriptWriter=new ScriptWriter();
	int ans,againAns;
public void movieDetails()
{

			System.out.println("\t Enter the name of the movie ");
				movieName=sc.next();
				
				setMovieName(movieName);
				


}

	
	


String genere;

 public void setGenere(String genere)
 {
 	this.genere=genere;
 }

public String getGenere()
{
	return genere;
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
	{		
			System.out.println("\t-----------------------------");
			System.out.println("\tMovie Script Project");
			System.out.println("\t-----------------------------");
			
			movieDetails();
		
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
						System.out.println("\t\n The name of the movie \n"+getMovieName());
						

						setGenere("Comedy");
						System.out.println("\t\n The Genere of this movie :"+getGenere());
						
						scriptWriter.scriptSelection(1);
						
						break;

			case 2:		System.out.println("\t\n The name of the movie \n"+getMovieName());
							
						
						/*setImdb(8.1f);
						System.out.println("\t\n The IMDB Rating of this movie :"+getRating());*/
						
						setGenere("Romantic");
						System.out.println("\t\n The Genere of this movie :"+getGenere());

						scriptWriter.scriptSelection(2);
						break;
			
			case 3:		System.out.println("\t\n The name of the movie \n"+getMovieName());	
								
						
						/*setImdb(8.6f);
						System.out.println("\t\n The IMDB Rating of this movie :"+getRating());*/
					
						setGenere("Emotional");
						System.out.println("\t\n The Genere of this movie :"+getGenere());
						scriptWriter.scriptSelection(3);

						break;

			case 4:		System.out.println("\t\n The name of the movie \n"+getMovieName());	
						
						
						//setImdb(8.6f);
						
						
						setGenere("Thriller");
						System.out.println("\t\n The Genere of this movie :"+getGenere());
						scriptWriter.scriptSelection(4);

						break;			

						
			default:		
						System.out.println("\t Invalid Input");
						
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