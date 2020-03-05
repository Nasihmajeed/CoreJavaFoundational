package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
public class Movie
{
	private String movieName;
	private String nameOfDirector;
	Scanner sc = new Scanner(System.in);
	Actor actor = new Actor();
	Script script = new Script();
	FileRepository repo = new FileRepository();
	ArrayList<Actor> actorList = new ArrayList<Actor>();
	Random random = new Random();
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
	public void setCharacters()
	{
		actorList.add(new IronMan());
		actorList.get(0).setActorName("Robert");
		actorList.get(0).setNameOfRole("IronMan");
		actorList.add(new Thanos());
		actorList.get(1).setActorName("Josh");
		actorList.get(1).setNameOfRole("Thanos");
		
	}
	public void  createMovie()
	{
		setMovieDetails();
		setCharacters();
		playMovie(actorList,repo);	
	}
	public void playMovie(ArrayList<Actor> actorList,FileRepository repo)
	{
			int actorOne = random.nextInt(actorList.size());
			int actorTwo = random.nextInt(actorList.size());
			startMovie(actorList,actorOne,actorTwo,repo);
	}
	public void startMovie(ArrayList<Actor> actorList,int actorOne,int actorTwo,FileRepository repo)
	{
		int dialogueOne = random.nextInt(5);
		int dialogueTwo = random.nextInt(5);
		if(actorOne!=actorTwo)
		{
			if(actorList.get(actorOne) instanceof Heroism)
			{
				repo.readFromHeroScript(actorList,actorOne,actorTwo,dialogueOne,dialogueTwo,"C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//HeroScript.csv");
			}
			if(actorList.get(actorOne) instanceof Villanism)
			{
				repo.readFromVillainScript(actorList,actorOne,actorTwo,dialogueOne,dialogueTwo,"C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//VillainScript.csv");
			}
		}
	}
}