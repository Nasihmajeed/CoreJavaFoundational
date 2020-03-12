package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
public class Movie
{ 
private String name ="A Comic Movie";
ArrayList<Actor> actors = new ArrayList<Actor>();	
FileReppo script =new FileReppo();
PlayMovie plymovie;
static Scanner input =new Scanner(System.in);
public void CreateMovie()
{
	actors.add(new Villan());
	actors.add(new Comadian());
	System.out.println("\n\t"+name);
	
		SetDetails();
		plymovie =new PlayMovie();
		plymovie.Play(actors,script);
}

public void SetDetails()
{
	actors.get(0).setName("jhon"); 
	actors.get(0).setmovieRoll("Villan"); 

	actors.get(1).setName("Arya"); 
	actors.get(1).setmovieRoll("Comadian"); 
}

public int MovieControl()
{
	System.out.print("\nPress 1 Play Movie\nPress 0 to Exit\n\n Enter Your Choise :");
	int choise=input.nextInt();
	return choise;
}

}