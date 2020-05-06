package com.lxisoft.moviescript;
import java.util.*;
import java.io.*;
public class Movie
{
	public static Scanner scanner = new Scanner(System.in); 
	private String name;
	Director director = new Director();
	public Movie(String name)
	{
		this.name=name;
	}
	public void movieDetails()
	{
		director.setName("Arun Bose");
		System.out.println("Movie Name : "+name);
		System.out.println("Director Name : "+director.getName());
	}
	public void startMovie()
	{
		try
		{
			boolean isTrue = true;
			do
			{
				System.out.println(" 1.Start Movie  2.Add Dialouge");
			    int x = scanner.nextInt();
				isTrue = true;
				switch(x)
				{
				case 1:
				   movieDetails();
				   director.selectActor();
				   isTrue = false;
				   break;
				case 2:
				   director.addDialogue(scanner);
				   break;
				default :
				   System.out.println("!!! select any Options From Above");
				   break;
				}
		    }while(isTrue);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	
}