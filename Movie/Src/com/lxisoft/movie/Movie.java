package com.lxisoft.movie;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Actor;
import java.lang.Math;
import com.lxisoft.movie.Scriptwriter;
public class Movie
{
	Director director;
	Scriptwriter scriptwriter;

	public void playScene()
	{
		director=new Director();
		scriptwriter=new Scriptwriter();	
		director.name="Mysskin";
		scriptwriter.name="P.A.Renjith";

		System.out.println("    ----------------------");
		System.out.println("      . . .THE HOUR. . .");
		System.out.println("    ----------------------");
		System.out.println("\n");
		System.out.println("__________________________");

		System.out.println("Director :"+director.name);
		System.out.println("Producer : S.Thanu");
		System.out.println("Story    :"+scriptwriter.name);
		System.out.println("__________________________");

		director.setCastActor();
		Actor[] actorlist=director.getCastActor();
		for (int i=0;i<actorlist.length;i++) 
		{
			System.out.println(actorlist[i].getActorName()+" play as "+actorlist[i].getCharecter());
		}
		System.out.println("__________________________");
		runScenes(actorlist);
		
		
	}

	public void runScenes(Actor[] actorlist)
	{
		int randscenes=(int)(Math.random()*5)+4;	
		
		
		for (int j=1;j<=randscenes;j++) 
		{
			
			director.SetDirectes();
			System.out.println("Scene "+j+" : "+director.getDirectes());
			int randdialogue=(int)(Math.random()*randscenes)+1;
			for (int i=0;i<randdialogue;i++) 
			{
				scriptwriter.setScript(actorlist);
				actorlist=scriptwriter.getScript();
				int randindex=(int)(Math.random()*actorlist.length);
			    System.out.println( actorlist[randindex].getActorName()+""+actorlist[randindex].getCharecter()+" : "+actorlist[randindex].getDialogues());
				System.out.println(" ");
			
			}
			System.out.println("\n");
			
		}
		System.out.println("\n");
		System.out.println("A film by  "+director.name);
	}
	
}