package com.lxisoft.movie;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Actor;
import com.lxisoft.movie.Scriptwriter;
public class Movie
{
	Scriptwriter scriptwriter=new Scriptwriter();
	Actor actor;
	
	public void runscenes()
	{
		String[] cdialouge=null;
	String[] vdialouge=null;
		Script s=new Script();
		actor=new Actor();
		actor.playcharecter();
		scriptwriter.setscript(cdialouge,vdialouge);
	}
	
}