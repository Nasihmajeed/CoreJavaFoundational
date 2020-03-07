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
	int count =5;
	script.readDialogue("AryaScript.csv",aryadialogue);
	script.readDialogue("JhonScript.csv",jhondialogue);
	System.out.println("\n\nWelcome To All");
	System.out.println("\n________________________\n\n");
 
	do{
		int number1 = random.nextInt(2); 
		int dilogeNumber = random.nextInt(3);
		
		if(actors.get(number1) instanceof Villanisum)
		{
			int number2=number1+1;
		//	PlayDialouge(actors.get(number1),dilogeNumber,actors.get(number2),script);   
	System.out.println(actors.get(number1).getName()+" : "+jhondialogue.get(dilogeNumber).getdialogue());		
	System.out.println(actors.get(number2).getName()+" : "+aryadialogue.get(dilogeNumber+3).getdialogue());
	System.out.println(aryadialogue.size()+"\n"+dilogeNumber);                                           
		 	count--;
		}

		else if(actors.get(number1) instanceof Comic)
		{
			int number2=number1-1;
			//PlayDialouge(actors.get(number2),dilogeNumber,actors.get(number1),script);
	System.out.println(actors.get(number1).getName()+" : "+aryadialogue.get(dilogeNumber).getdialogue());
	System.out.println(actors.get(number2).getName()+" : "+jhondialogue.get(dilogeNumber+3).getdialogue());
	System.out.println(aryadialogue.size()+"\n"+dilogeNumber);             
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

}
