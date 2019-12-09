package com.lxisoft.movie;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Actor;
import com.lxisoft.movie.Scriptwriter;
public class Movie
{
	Director director;
	Scriptwriter scriptwriter;
	Actor actor;

	
	public void runscenes()
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

		Actor[] actorlist=director.casting();
		
		System.out.println("__________________________");

/*		actor.playcharecter();
*/		director.direction();
		actorlist=scriptwriter.setScript(actorlist);
		for (int i=0;i<actorlist.length;i++) 
		{
			
			System.out.println( actorlist[i].getActorname()+""+actorlist[i].getCharecter()+" : "+actorlist[i].getDialogues());
			
			
		}
		System.out.println("\n");
		System.out.println("A film by  "+director.name);
	}
	
}