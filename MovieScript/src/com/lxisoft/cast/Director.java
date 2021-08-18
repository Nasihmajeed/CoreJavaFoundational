package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
public class Director
{
Scanner sc =new Scanner(System.in);


public ArrayList<Actor> castActors(ArrayList<Actor> actors)
{	int i,numberOfCharacters,selectActorRole,addMore=0;
	String actorName,characterName;
	Role roleSelected;

//Map<String,ArrayList<Actor>> cast=new HashMap<String,ArrayList<Actor>>();
do{

System.out.println("\t Enter the role: ");

Role [] roles=Role.values();
for(Role role: roles)
{
	System.out.println(role.ordinal()+1+" "+role);
}

	selectActorRole=sc.nextInt();
	roleSelected=Role.getRole(selectActorRole-1);

	System.out.println("\tEnter number of  "+roleSelected.toString()+": ");
	numberOfCharacters=sc.nextInt();
	
	for(i=0;i<numberOfCharacters;i++)
	{
	System.out.println("\tEnter the name of "+roleSelected.toString()+" "+(i+1));
		actorName=sc.next();	
		
	System.out.println("\tEnter the Character name of "+actorName);
	characterName=sc.next();
		
		switch(roleSelected)
		{
			case Hero:		actors.add(new Hero(actorName,characterName));
							break;
			case Heroine:	actors.add(new Heroine(actorName,characterName));
							break;
							
			case Comedian:	actors.add(new Comedian(actorName,characterName));
							break;
									
			case Villan:	actors.add(new Villan(actorName,characterName));
			 				break;

			default :System.out.println("Invalid entry");			
						
		}


		}

System.out.println("\tAdd more actors press 1");
addMore=sc.nextInt();
}while(addMore==1);
	
return actors;

		
		 	
		 		
		
		
		
}



}
