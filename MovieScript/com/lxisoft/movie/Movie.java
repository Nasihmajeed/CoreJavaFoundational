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
	//script.creatFile();
	actors.add(new Villan());
	actors.add(new Comadian());
	System.out.println("\n\t"+name);
	int ch=MovieControl();
	if(ch==1)
	{
		SetDetails();
		plymovie =new PlayMovie();
		plymovie.Play(actors,script);
	}
	else if(ch==0)
	{		System.out.println("EXited");	}
	else
		{	System.out.println("You Entered A Rong Choise");}

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