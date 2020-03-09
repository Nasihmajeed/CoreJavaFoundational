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
		System.out.println("\n");
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
		actorList.get(0).setActorId(1);
		actorList.add(new Thanos());
		actorList.get(1).setActorName("Josh");
		actorList.get(1).setNameOfRole("Thanos");
		actorList.get(1).setActorId(2);
	}
	public void createMovie()
	{
		int ch = 0;
		do
		{
			setMovieDetails();
			script.scriptDetails();
			createCharacters();
			int choice;
	 		play.startMovie(actorList,script);
	 		System.ouot.println("Do You Want To Continue Play Movie?\npress 1(Yes)\nPress 2(No)");
	 		ch = sc.nextInt();	
		}while(ch==1);
			
	}
}