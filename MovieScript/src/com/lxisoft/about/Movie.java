package com.lxisoft.about;

import com.lxisoft.cast.Casting;
import com.lxisoft.storyline.*;
import com.lxisoft.script.*;

import java.util.*;


public class Movie
{
	String movieName;

		
		
		Casting casting=new Casting();
	ScriptWriter scriptWriter=new ScriptWriter();
	Scanner sc=new Scanner(System.in);

public void movieDetails()
{

			System.out.println("\t Enter the name of the movie ");
				movieName=sc.next();
				
				setMovieName(movieName);
				casting.setCasting();
				


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


}