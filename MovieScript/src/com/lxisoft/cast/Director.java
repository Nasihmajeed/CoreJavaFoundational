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

System.out.println("Enter the role: ");
	
	System.out.println("1 "+Role.valueOf("Hero").toString());
	System.out.println("2 "+Role.valueOf("Heroine").toString());
	System.out.println("3 "+Role.valueOf("Comedian").toString());
	System.out.println("4 "+Role.valueOf("Villan").toString());
	selectActorRole=sc.nextInt();
	roleSelected=Role.getRole(selectActorRole-1);

	System.out.println("Enter number of  "+roleSelected.toString()+": ");
	numberOfCharacters=sc.nextInt();
	
	ArrayList<Actor> heros=new ArrayList<Actor>();
	ArrayList<Actor> heroines=new ArrayList<Actor>();
	ArrayList<Actor> comedians=new ArrayList<Actor>();
	ArrayList<Actor> villans=new ArrayList<Actor>();
	
	for(i=0;i<numberOfCharacters;i++)
	{
			

		System.out.println("Enter the name of "+roleSelected.toString()+" "+(i+1));
		actorName=sc.next();	
		
		
		System.out.println("Enter the Character name of "+actorName);
		characterName=sc.next();
		
		switch(roleSelected)
		{
			case Hero:heros.add(new Hero(actorName,characterName));
						//	cast.put("Hero",);
							//return actors;
							cast.put("Hero",heros);
							break;
			case Heroine:heroines.add(new Heroine(actorName,characterName));
			//cast.put("Heroine",);
							//return actors;
			cast.put("Heroine",heroines);
			break;
							
			case Comedian:comedians.add(new Comedian(actorName,characterName));
			// cast.put("Comedian",);
								cast.put("Comedian",comedians);
								break;
								
			case Villan:villans.add(new Villan(actorName,characterName));
			 			cast.put("Villan",villans);
			 			break;
			 //cast.put("Villan",);
							//return actors;
							
			default :System.out.println("Invalid entry");			
						
		}
System.out.println(cast.get("Hero").get(i).getActorName());

		}




		/*for(int k=0;k<actors.size();k++)
		{
			if(actors.get(i) instanceof Hero)
			{
				cast.get("Hero").put(actors);
				
			}
		}
*/
System.out.println("Add more actors press 1");
addMore=sc.nextInt();
}while(addMore==1);
	
return cast;

		
		 	
		 		
		
		
	//return null;	
}
/*
public Map<String,ArrayList<Actor>> assignRolesForActors()
{	
		ArrayList<Actor> actors=new ArrayList<Actor>();
		actors=castActors();
		for(int i=0;i<actors.size();i++)
	{	if(actors.get(i) instanceof Hero)
		{
			System.out.println(actors.get(i).getActorName());
		}
		
	}
	cast.put("Hero",actors);
		cast.put("Heroine",actors);
		cast.put("Comedian",actors);
		cast.put("Villan",actors);
	return cast;
}
*/



}
