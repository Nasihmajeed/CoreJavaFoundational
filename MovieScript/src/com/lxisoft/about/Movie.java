package com.lxisoft.about;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;
import com.lxisoft.script.*;
import com.lxisoft.about.*;

public class Movie
{
	String movieName;

Plot plot =new Plot();
Imdb imdb=new Imdb();
Genere genere=new Genere();



	public void comedyMovie()
	{

						System.out.println("\t\n The name of the movie \n"+getMovieName());
						System.out.println("\t\n The Cast of this movie");	
						//map.setCasting();
						//map.displayCasting();
						imdb.setImdb(7.6f);
						System.out.println("\t\n The IMDB Rating of this movie :"+imdb.getRating());
						System.out.println("\t\n Plot of the movie is \n");
						plot.getPlot();
						genere.setGenere("Comedy");
						System.out.println("\t\n The Genere of this movie :"+genere.getGenere());

	}

	public void romanticMovie()
	{

						System.out.println("\t\n The name of the movie \n"+getMovieName());
						System.out.println("\t\n The Cast of this movie");	
						//map.setCasting();
						//map.displayCasting();
						imdb.setImdb(8.1f);
						System.out.println("\t\n The IMDB Rating of this movie :"+imdb.getRating());
						System.out.println("\t\n Plot of the movie is \n");
						plot.getPlot();
						genere.setGenere("Romantic");
						System.out.println("\t\n The Genere of this movie :"+genere.getGenere());
	
	}

	public void emotionalMovie()
	{

						System.out.println("\t\n The name of the movie \n"+getMovieName());	
						System.out.println("\t\n The Cast of this movie");	
						//map.setCasting();
						//map.displayCasting();
						imdb.setImdb(8.6f);
						System.out.println("\t\n The IMDB Rating of this movie :"+imdb.getRating());
						System.out.println("\t\n Plot of the movie is \n");
						plot.getPlot();
						genere.setGenere("Emotional");
						System.out.println("\t\n The Genere of this movie :"+genere.getGenere());
	}

	public void thrillerMovie()
	{
						System.out.println("\t\n The name of the movie \n"+getMovieName());	
						System.out.println("\t\n The Cast of this movie");	
						//map.setCasting();
						//map.displayCasting();
						imdb.setImdb(8.6f);
						System.out.println("\t\n The IMDB Rating of this movie :"+imdb.getRating());
						System.out.println("\t\n Plot of the movie is \n");
						plot.getPlot();
						genere.setGenere("Thriller");
						System.out.println("\t\n The Genere of this movie :"+genere.getGenere());
	}




	public void setMovieName(String movieName)
	{
		this.movieName=movieName;

	} 

	public String getMovieName()
	{
		return movieName;
	}


}