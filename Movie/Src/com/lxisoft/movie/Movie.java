package com.lxisoft.movie;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Actor;
import java.lang.Math;
import com.lxisoft.movie.Scriptwriter;
public class Movie
{
	Director director;
	Scriptwriter scriptwriter;
	Actor actor;

	
	public Actor[] playscene()
	{
		director=new Director();
		scriptwriter=new Scriptwriter();
		actor=new Actor();
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

		Actor[] actorlist=director.castActor();
		
		System.out.println("__________________________");
		runscenes(actorlist);
		return actorlist;
		
	}

	public void runscenes(Actor[] actorlist)
	{
		int n=(int)(Math.random()*3)+1;	
		
		
		for (int j=1;j<=n;j++) 
		{
			int ran=n;
			System.out.println("Scene "+j+" : "+director.directes());
			for (int i=0;i<ran;i++) 
			{
				actorlist=scriptwriter.setScript(actorlist);

				int ra=ran;
			    System.out.println( actorlist[ra].getActorname()+""+actorlist[ra].getCharecter()+" : "+actorlist[ra].getDialogues());
				System.out.println(" ");
			}
			System.out.println("\n");
			
		}
		System.out.println("\n");
		System.out.println("A film by  "+director.name);
	}
	
}