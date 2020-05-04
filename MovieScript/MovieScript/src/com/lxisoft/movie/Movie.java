package com.lxisoft.movie;
import java.util.*;
import java.io.*;
public class Movie 
{ 
	String[] movieList = new String[10];
	ArrayList<Actor>  scifiMovieCast = new ArrayList<Actor>();
	ArrayList<Actor>  comicMovieCast = new ArrayList<Actor>();
	static Scanner sc = new Scanner(System.in);
	public void movieMenu()
	{
		System.out.println("-----MovieScript-----\n1.Play Movie\n2.Options\nSelect a choice:\t");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:movieListMenu();break;
			default:System.out.println("Enter a valid choice!!!!!");break;
		}
	}
	public void movieListMenu()
	{
		movieList[0] = "Comic Movie";
		movieList[1] = "Sci-Fi Movie";
		System.out.println("1."+movieList[0]+"\n2."+movieList[1]+"\nSelect an  choice");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:comicMovie(ch);break;
			case 2:scifiMovie(ch);break;
			default:System.out.println("Enter a valid choice!!!!!");break;
		}	
	}
	public void comicMovie()
	{
		System.out.println("1.Play Comic Movie\n2.View Cast\nSelect a choice:\t");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:playComicMovie();break;
			case 2:comicCast();break;
			default:System.out.println("Enter a valid choice!!!!!");break;
		}	
	}
	public void scifiMovie()
	{
		System.out.println("1.Play Sci-Fi Movie\n2.View Cast\nSelect a choice:\t");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:playScifiMovie();break;
			case 2:scifiCast();break;
			default:System.out.println("Enter a valid choice!!!!!");break;
		}	
	}
	public void scifiCast()
	{
		Collections.sort(scifiMovieCast);
		for (Actor c2:scifiMovieCast) 
		{
			System.out.println(c2.name+"-->"+c2.rolename);		
		}	
	}
	public void comicCast()
	{
		Collections.sort(comicMovieCast);
		for (Actor c1:comicMovieCast) 
		{
			System.out.println(c1.name+"-->"+c1.rolename);		
		}	
	}
	public void playScifiMovie()
	{	
		setscifiMovieCast();
		System.out.println("Movie: Inception.\nDirector:Cristopher Nolan.\nScript Writer:Cristopher Nolan.");
		
	}
	public void playComicMovie()
	{
		setComicMovieCast();
		System.out.println("Movie: Avengers.\nDirector:Russo Brothers.\nScript Writer:Jack Kirby.");
	}
	public void setComicMovieCast()
	{
		comicMovieCast.add(new Actor());
		comicMovieCast.get(0).setName("Robert Downey jr");
		comicMovieCast.get(0).setRoleName("ironman");
		comicMovieCast.add(new Actor());
		comicMovieCast.get(1).setName("Josh Brolin");
		comicMovieCast.get(1).setRoleName("thanos");
		
	}
	public void setscifiMovieCast()
	{
		scifiMovieCast.add(new Actor());
		scifiMovieCast.get(0).setName("De Caprio");
		scifiMovieCast.get(0).setRoleName("Cobb");
		scifiMovieCast.add(new Actor());
		scifiMovieCast.get(1).setName("Ellen Page");
		scifiMovieCast.get(1).setRoleName("Ariadne");
		
	}
}