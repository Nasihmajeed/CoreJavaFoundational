package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
public class Director
{
Scanner sc =new Scanner(System.in);
Map<String,ArrayList<Actor>> castMap=new HashMap<String,ArrayList<Actor>>();

public ArrayList<Actor> castActors()
{	int i,numberOfCharacters;
	String actorName,characterName,actorRole=" ";
	Role role;

	

	System.out.println("Enter the role: ");
	
	System.out.println(Role.valueOf("Hero").toString());
	System.out.println(Role.valueOf("Heroine").toString());
	System.out.println(Role.valueOf("Comedian").toString());
	System.out.println(Role.valueOf("Villan").toString());
	actorRole=sc.next();

	System.out.println("Enter number of  "+actorRole+": ");
	numberOfCharacters=sc.nextInt();
	
	ArrayList<Actor> actors=new ArrayList<Actor>();
	for(i=0;i<numberOfCharacters;i++)
	{
			

		System.out.println("Enter the name of"+actorRole+" "+(i+1));
		actorName=sc.next();	
		
		
		System.out.println("Enter the Character name of "+actorName);
		characterName=sc.next();
		
		switch(Role.valueOf(actorRole))
		{
			case Hero:actors.add(new Hero(actorName,characterName));
							return actors;
							
			case Heroine:actors.add(new Heroine(actorName,characterName));
							return actors;
							
			case Comedian: actors.add(new Comedian(actorName,characterName));
								return actors;
								
			case Villan: actors.add(new Villan(actorName,characterName));
							return actors;
							
			default :System.out.println("Invalid entry");			
						
		}



		
		 	
		 		
		
		
		}

	return null;	
}

public Map<String,ArrayList<Actor>> createMap()
{	
	castMap.put("Hero",castActors());
	castMap.put("Heroine",castActors());
	castMap.put("Comedian",castActors());
	castMap.put("Villan",castActors());
	return castMap;
}




}
