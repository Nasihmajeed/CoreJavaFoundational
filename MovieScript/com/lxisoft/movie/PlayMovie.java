package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
class PlayMovie
{
	Random random = new Random();
	ArrayList<Dialogue> jhondialogue =new ArrayList<Dialogue>();
	ArrayList<Dialogue> aryadialogue =new ArrayList<Dialogue>();
public void Play(ArrayList<Actor> actors,FileReppo script)
{
	
	script.readDialogue("AryaScript.csv",aryadialogue);
	script.readDialogue("JhonScript.csv",jhondialogue);
	System.out.println("\n\n");
	System.out.println("\n________________________\n\n");
 	int n=(aryadialogue.size()/2);
 	int count=n;
	do{
		int number1 = random.nextInt(2); 
		int dilogeNumber = random.nextInt(n);
		
		if(actors.get(number1) instanceof Villanisum)
		{
			if(jhondialogue.get(dilogeNumber).getFlag()==true)
			{
			int number2=number1+1;
			PlayDialoge(actors.get(number1),actors.get(number2),jhondialogue,aryadialogue,dilogeNumber);            
	    	count--;}
		}

		else if(actors.get(number1) instanceof Comic)
		{
			if(aryadialogue.get(dilogeNumber).getFlag()==true)
			{
			int number2=number1-1;
			PlayDialoge(actors.get(number1),actors.get(number2),aryadialogue,jhondialogue,dilogeNumber);	
			count--;}
		}

	}while(count > 0);

	MovieDetails(actors);
}

public void PlayDialoge(Actor a1,Actor a2,ArrayList<Dialogue> d1,ArrayList<Dialogue> d2,int dilogeNumber)
{
	int temp=(d2.size()/2);
	System.out.println(a1.getName()+" : "+d1.get(dilogeNumber).getdialogue());
	d1.get(dilogeNumber).setFlag(false);	
	System.out.println(a2.getName()+" : "+d2.get(dilogeNumber+temp).getdialogue());
	System.out.println("\n");                                      
}

public void MovieDetails(ArrayList<Actor> actors)
{
	System.out.println("\nScript Writer  : UNKNOWN");
	System.out.println("\n\nActors");
	System.out.println(actors.get(0).getName()+" : "+actors.get(0).getmovieRoll());
	System.out.println(actors.get(1).getName()+" : "+actors.get(1).getmovieRoll());
}

public void EditScript()
{
	System.out.print("\nPress 1 To add Dialogue\nPress 2 to Delete a Dialogue\nPress 0 to Exit\n\n Enter Your Choise :");
	int option=input.nextInt();
	if(option==1)
	{		addDialouge();	}	
	if(option==2)
	{		deleteDialouge();	}	
	else if(ch==0)
	{		System.out.println("EXited");	}
	else
	{	System.out.println("You Entered A Rong Choise");}
}
}