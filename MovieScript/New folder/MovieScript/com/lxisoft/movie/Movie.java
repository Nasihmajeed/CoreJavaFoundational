package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
public class Movie
{ 
private String name ="A Comic Movie";
ArrayList<Actor> actors = new ArrayList<Actor>();	
FileReppo script =new FileReppo();	

public void createMovie()
{
	int choise=movieControl();
  
	switch(choise)
	{

	}

}

public int movieControl()
{
	System.out.print("\nPress 1 Play Movie\nPress 0 to Exit\n\n Enter Your Choise :");
	int value=input.nextInt();
	return value;
}
}