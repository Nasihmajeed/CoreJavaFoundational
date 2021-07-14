package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
public class Director
{
Scanner sc =new Scanner(System.in);


public Map<String,ArrayList<Actor>> castActors()
{	int i,numberOfCharacters,selectActorRole,addMore=0;
	String actorName,characterName;
	Role role,roleSelected;

	Map<String,ArrayList<Actor>> cast=new HashMap<String,ArrayList<Actor>>();
do{

System.out.println("\t Enter the role: ");
	
	System.out.println("\t1 "+Role.valueOf("Hero").toString());
	System.out.println("\t2 "+Role.valueOf("Heroine").toString());
	System.out.println("\t3 "+Role.valueOf("Comedian").toString());
	System.out.println("\t4 "+Role.valueOf("Villan").toString());
	selectActorRole=sc.nextInt();
	roleSelected=Role.getRole(selectActorRole-1);

	System.out.println("\tEnter number of  "+roleSelected.toString()+": ");
	numberOfCharacters=sc.nextInt();
	ArrayList<Actor> actors=new ArrayList<Actor>();
	ArrayList<Actor> heros=new ArrayList<Actor>();
	ArrayList<Actor> heroines=new ArrayList<Actor>();
	ArrayList<Actor> comedians=new ArrayList<Actor>();
	ArrayList<Actor> villans=new ArrayList<Actor>();
	
	for(i=0;i<numberOfCharacters;i++)
	{
			

		System.out.println("\tEnter the name of "+roleSelected.toString()+" "+(i+1));
		actorName=sc.next();	
		
		
		System.out.println("\tEnter the Character name of "+actorName);
		characterName=sc.next();
		
		switch(roleSelected)
		{
			case Hero:heros.add(new Hero(actorName,characterName));
						cast.put("Hero",heros);
							break;
			case Heroine:heroines.add(new Heroine(actorName,characterName));
			
						cast.put("Heroine",heroines);
						break;
							
			case Comedian:comedians.add(new Comedian(actorName,characterName));
			
								cast.put("Comedian",comedians);
								break;
								
			case Villan:villans.add(new Villan(actorName,characterName));
			 			cast.put("Villan",villans);
			 			break;

							
			default :System.out.println("Invalid entry");			
						
		}
//System.out.println(cast.get("Hero").getActorName());

		}





System.out.println("\tAdd more actors press 1");
addMore=sc.nextInt();
}while(addMore==1);
	
return cast;

		
		 	
		 		
		
		
		
}



}
