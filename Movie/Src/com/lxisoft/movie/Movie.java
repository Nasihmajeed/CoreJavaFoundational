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
		scriptwriter.name="P.A.Renjith";

		System.out.println("    ----------------------");
		System.out.println("      . . .THE HOUR. . .");
		System.out.println("    ----------------------");
		System.out.println("\n");
		System.out.println("__________________________");

		System.out.println("Director :"+director.castactor());
		System.out.println("Producer : S.Thanu");
		System.out.println("Story    :"+scriptwriter.name);
		System.out.println("__________________________");

		System.out.println("Actor 1  :Ajith  (Hero)");
		System.out.println("Actor 2  :Sankil (villain)");
		System.out.println("__________________________");

/*		actor.playcharecter();
*/
		scriptwriter.setscript();
		System.out.println("\n");
		System.out.println("A film by  "+director.castactor());
	}
	
}