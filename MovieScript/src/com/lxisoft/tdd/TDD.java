package com.lxisoft.tdd;
import com.lxisoft.storyline.*;
import com.lxisoft.script.*;
import com.lxisoft.cast.*;
import com.lxisoft.about.*;
import java.util.*;

public class TDD
{
	public static void main(String [] args)
	{	Casting casting=new Casting();
		Genere genere =new Genere();
		Imdb imdb=new Imdb();
		Plot plot=new Plot();
		StartMovie start =new StartMovie();
		Scanner sc =new Scanner(System.in);
		int ans;
		int againAns;
		System.out.println("\tMovie Script Project");
		System.out.println("\t-----------------------------");

		do{
		System.out.println("\tSelect The option you want to see about the movie ---VinnaiThandi Varuvaya-----");
		System.out.println("							");
		System.out.println("\t 1. Cast");
		System.out.println("\t 2. Genere");
		System.out.println("\t 3. IMDB Rating");
		System.out.println("\t 4. Plot ");
		System.out.println("\t 5. Storyline");
		ans=sc.nextInt();

		switch(ans)
		{
			case 1: 	System.out.println("\t The Cast of this movie");	
						casting.setCasting();
						casting.displayCasting();
						break;

			case 2:		System.out.println("\t The Genere of this movie :"+genere.getGenere());
						break;
			case 3:		System.out.println("\t The IMDB Rating of this movie :"+imdb.getRating());
						break;
			case 4:		System.out.println("\t Plot of the movie is \n");
						plot.getPlot();
						break;
			case 5:		System.out.println("\t Scene from  the movie is \n");
						start.startMovie();
						break;	

		}
System.out.println("\n\tDo you want to see more details about the movie(1.to view more 2.exit ) ");
againAns=sc.nextInt();
	}while(againAns==1);





	}
}