package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
class PlayMovie
{
	Random random = new Random();
public void Play(ArrayList<Actor> actors,FileReppo script)
{
	int count =2;
	System.out.println("\n\nWelcome To All");
	System.out.println("\n________________________\n\n");

	do{
		int number1 = random.nextInt(2); 
		int dilogeNumber = random.nextInt(2);

		if(actors.get(number1) instanceof Villanisum)
		{
			int number2=number1+1;
		 PlayDialouge(number1,dilogeNumber,number2);
		 count--;
		}

		else if(actors.get(number1) instanceof Comic)
		{
			int number2=number1-1;
		PlayDialouge(number1,dilogeNumber,number2);
		count--;
		}

	}while(count > 0);

	MovieDetails();
}

public void MovieDetails()
{
	System.out.print("Thanks To All");
	System.out.print(actors.get(0).getName()+" : "+actors.get(0).getmovieRoll());
	System.out.print(actors.get(1).getName()+" : "+actors.get(1).getmovieRoll());
}

public int  PlayDialouge(int number1,int dilogeNumber,int number2)
{
	
	System.out.print(actors.get(number1).getName()+" : ");
	script.readDialogue(dilogeNumber,"ComicScript.csv");
	
	System.out.print(actors.get(number2).getName()+" : ");
	script.readDialogue(dilogeNumber,"VillanScript.csv");
	
}

}