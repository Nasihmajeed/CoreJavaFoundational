package com.lxisoft.movies;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie
{
String movieName,movieGenre;

Scanner sc=new Scanner();

List<Movie> cinema=new ArrayList<Movie>(); 

{
cinema.add(new Movie());
cinema.get(0).setMovieName("Soorarai-Pottru");
cinema.get(0).setGenre("Drama");	


cinema.add(new Movie());
cinema.get(1).setMovieName("King-Liar");
cinema.get(1).setGenre("Comedy");	


cinema.add(new Movie());
cinema.get(2).setMovieName("Niram");
cinema.get(2).setGenre("Romance");	

}
        
		 //Movie Name
		
public void setMovieName(String movieName)
{
	this.movieName=movieName;
}

public String getMovieName()
{
	return movieName;
}







public String selectMovie()
{
	System.out.println("------------------Select the Movie of your choice :------------------ ");
	
	
	
}



}