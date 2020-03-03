package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;
public class Movie
{
	private String movieName;
	private String nameOfDirector;
	Scanner sc = new Scanner(System.in);
	Actor actor = new Actor();
	public void setMovieName(String moviename)
	{
		this.movieName = moviename;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setNameOfDirector(String directorname)
	{
		this.nameOfDirector = directorname;
	}
	public String getNameOfDirector()
	{
		return nameOfDirector;
	}

	public void createMovie()
	{
		System.out.println("Enter Movie Name::");
		String nameOfMovie = sc.next();
		System.out.println("Enter Name Of Director::");
		String directorOfMovie = sc.next();
		setMovieName(nameOfMovie);
		setNameOfDirector(directorOfMovie);
		actor.createActor(actor);
	}

}