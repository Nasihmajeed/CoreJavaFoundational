package com.lxisoft.movie;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Actor;
import java.lang.Math;
import com.lxisoft.movie.Scriptwriter;
public class Movie
{
	Director director;
	Scriptwriter scriptwriter;
	Actor[] actor;

	
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

		Actor[] actorlist=director.getCastActor();
		scriptwriter.setScript(actorlist);
		actorlist=scriptwriter.getScript();
		System.out.println("__________________________");
		runscenes(actorlist);
		return actorlist;
		
	}

	public void runscenes(Actor[] actorlist)
	{
		
		int ran=(int)(Math.random()*4)+1;
		for (int j=1;j<=ran;j++) 
		{	
			
			
			System.out.println("Scene "+j+" : "+director.directes());
			for (int i=0;i<ran;i++) 
			{
				//actorlist=scriptwriter.getScript();
				/*int ra=(int)(Math.random()*4);*/
				
			    System.out.println( actorlist[i].getActorName()+""+actorlist[i].getCharecter()+" : "+actorlist[i].getDialogues());
				System.out.println(" ");
			}
			System.out.println("\n");
			
		}
		System.out.println("\n");
		System.out.println("A film by  "+director.name);
	}
	
}