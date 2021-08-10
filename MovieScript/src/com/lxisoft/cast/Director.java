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
	
	/*ArrayList<Actor> heros=new ArrayList<Hero>();
	ArrayList<Actor> heroines=new ArrayList<Heroine>();
	ArrayList<Actor> comedians=new ArrayList<Comedian>();
	ArrayList<Actor> villans=new ArrayList<Villan>();*/

	//ArrayList<Actor> actors=new ArrayList<Actor>();
	
	for(i=0;i<numberOfCharacters;i++)
	{
			

		System.out.println("\tEnter the name of "+roleSelected.toString()+" "+(i+1));
		actorName=sc.next();	
		
		
		System.out.println("\tEnter the Character name of "+actorName);
		characterName=sc.next();
		
		switch(roleSelected)
		{
			case Hero:		//actors=new ArrayList<Actor>();
							actors.add(new Hero(actorName,characterName));
							//actors.put("Hero",heros);
							break;
			case Heroine:	//heroines=new ArrayList<Actor>();
							actors.add(new Heroine(actorName,characterName));
							//actors.put("Heroine",heroines);
							break;
							
			case Comedian:	//actors=new ArrayList<Actor>();
							actors.add(new Comedian(actorName,characterName));
							//actors.put("Comedian",comedians);
							break;
									
			case Villan:	//villans=new ArrayList<Actor>();	
							actors.add(new Villan(actorName,characterName));
			 				//actors.put("Villan",villans);
			 				break;

							
			default :System.out.println("Invalid entry");			
						
		}
//System.out.println(cast.get("Hero").getActorName());

		}





System.out.println("\tAdd more actors press 1");
addMore=sc.nextInt();
}while(addMore==1);
	
return actors;

		
		 	
		 		
		
		
		
}



}
