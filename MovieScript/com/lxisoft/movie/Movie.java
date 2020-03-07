package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
public class Movie
{
	private String movieName;
	private String nameOfDirector;
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	ArrayList<Actor> actorList = new ArrayList<Actor>();
	PlayMovie play = new PlayMovie();
	Script script = new Script();
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
	public void setMovieDetails()
	{
		System.out.println("Enter Movie Name::");
		String nameOfMovie = sc.next();
		System.out.println("Enter Name Of Director::");
		String nameOfDirector = sc.next();
		setMovieName(nameOfMovie);
		setNameOfDirector(nameOfDirector);	
		System.out.println(getMovieName().toUpperCase());
		System.out.println("---------------------");
		System.out.println("Director::"+getNameOfDirector().toUpperCase());
	}
	public void createCharacters()
	{
		actorList.add(new IronMan());
		actorList.get(0).setActorName("Robert");
		actorList.get(0).setNameOfRole("IronMan");
		actorList.add(new Thanos());
		actorList.get(1).setActorName("Josh");
		actorList.get(1).setNameOfRole("Thanos");
	}
	public void createMovie()
	{
		setMovieDetails();
		script.scriptDetails();
		createCharacters();
		int choice;
	 	play.startMovie(actorList,script);
	}
}