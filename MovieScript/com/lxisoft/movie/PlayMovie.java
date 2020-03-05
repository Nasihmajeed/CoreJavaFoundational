package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
class PlayMovie
{
	Random random = new Random();
public void Play(ArrayList<Actor> actors,FileReppo script)
{
	int count =5;
	System.out.println("\n\nWelcome To All");
	System.out.println("\n________________________\n\n");

	do{
		int number1 = random.nextInt(2); 
		int dilogeNumber = random.nextInt(4);

		if(actors.get(number1) instanceof Villanisum)
		{
			int number2=number1+1;
			PlayDialouge(actors.get(number1),dilogeNumber,actors.get(number2),script);
		 	count--;
		}

		else if(actors.get(number1) instanceof Comic)
		{
			int number2=number1-1;
			PlayDialouge(actors.get(number1),dilogeNumber,actors.get(number2),script);
			count--;
		}

	}while(count > 0);

	MovieDetails(actors);
}

public void MovieDetails(ArrayList<Actor> actors)
{
	System.out.println("\n\n\nThanks To All");
	System.out.println(actors.get(0).getName()+" : "+actors.get(0).getmovieRoll());
	System.out.println(actors.get(1).getName()+" : "+actors.get(1).getmovieRoll());
}

public void  PlayDialouge(Actor number1,int dilogeNumber,Actor number2,FileReppo script)
{
	if((dilogeNumber+1)%2==0)	
	{
	System.out.print(number1.getName()+" : ");
	script.readDialogue(dilogeNumber,"ComicScript.csv");
	
	System.out.print(number2.getName()+" : ");
	script.readDialogue(dilogeNumber,"VillanScript.csv");
	System.out.println("\n");
	}
	else
	{
	System.out.print(number2.getName()+" : ");
	script.readDialogue(dilogeNumber,"VillanScript.csv");

	System.out.print(number1.getName()+" : ");
	script.readDialogue(dilogeNumber,"ComicScript.csv");
	System.out.println("\n");
	}	
}

}
