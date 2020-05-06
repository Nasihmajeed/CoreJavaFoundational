package com.lxisoft.movie;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Movie{

	private String movieName;
	private String movieGenere;
	private Director dir = new Director();
	private Script script = new Script();
	private ArrayList<Actor> movieCast = new ArrayList<Actor>();
	Random random = new Random();
 	static Scanner sc = new Scanner(System.in);
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMovieGenere() {
		return movieGenere;
	}

	public void setMovieGenere(String movieGenere) {
		this.movieGenere = movieGenere;
	}

	
	
	
	
	
	public void playComicMovie() {
		movieCast.clear();
		dir.setDirname("Russo Brothers");
		setMovieGenere("Comic Movie");
		script.setScriptWriter("Jack Kirby");
		System.out.println("-----Avengers-----");
		System.out.println("Genere:"+getMovieGenere());
		System.out.println("Director:"+dir.getDirname());
		System.out.println("Script Writer:"+script.getScriptWriter());
		movieCast = dir.comicCast();
		HashSet<Actor> hs = new HashSet<Actor>();
		for(Actor c:movieCast)
		{
			hs.add(c);
		}
		Iterator<Actor> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		getComicScript(movieCast);
	}
	
	public void getComicScript(ArrayList<Actor> ac)
	{
		
		File file1 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/ironmanQ.csv");
		File file2 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/ironmanR.csv");
		File file3 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/thanosQ.csv");
		File file4 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/thanosR.csv");
		try {
		file1.createNewFile();file2.createNewFile();file3.createNewFile();file4.createNewFile();
		}
		catch(IOException e) {e.printStackTrace();}
		ArrayList<Dialogue> heroQ = new ArrayList<Dialogue>();
		ArrayList<Dialogue> heroR = new ArrayList<Dialogue>();
		ArrayList<Dialogue> villainQ = new ArrayList<Dialogue>();
		ArrayList<Dialogue> villainR = new ArrayList<Dialogue>();
		heroQ = script.readFromScript(heroQ, file1);
		heroR = script.readFromScript(heroR, file2);
		villainQ = script.readFromScript(villainQ, file3);
		villainR = script.readFromScript(villainR, file4);
		heroQ.addAll(heroR);
		villainQ.addAll(villainR);
		runComic(ac,heroQ,villainQ);
	}	
	
	public void runComic(ArrayList<Actor> ac, ArrayList<Dialogue> hQ, ArrayList<Dialogue> vQ)
	{
		int count = hQ.size();
		do
		{
		for(int i=1;i<=4;i++)
		{
			dir.setDirectionalControl();
			System.out.println("Scene"+i+":"+dir.getDirectionalControl());
//			int diaNo = random.nextInt(4-1+1)+1;
			
			
			for(int j=0;j<=4;j++)
			{
				int randActor = random.nextInt(2);
				int randDia = random.nextInt(8);
				if(ac.get(randActor) instanceof Heroism)
					{
						if(hQ.get(randDia).isDiaStatus() == true)
						{
							
							System.out.println(ac.get(randActor).getActorRoleName()+"("+ac.get(randActor).getActorName()+")::"+hQ.get(randDia));
							System.out.println(ac.get(randActor+1).getActorRoleName()+"("+ac.get(randActor+1).getActorName()+")::"+vQ.get(randDia));
							hQ.get(randDia).setDiaStatus(false);
							vQ.get(randDia).setDiaStatus(false);
							count--;
						}
					}
				if(ac.get(randActor) instanceof Villainism)
				{
					if(hQ.get(randDia).isDiaStatus() == true)
					{
						System.out.println(ac.get(randActor).getActorRoleName()+"("+ac.get(randActor).getActorName()+")::"+vQ.get(randDia));
						System.out.println(ac.get(randActor-1).getActorRoleName()+"("+ac.get(randActor-1).getActorName()+")::"+hQ.get(randDia));
						hQ.get(randDia).setDiaStatus(false);
						vQ.get(randDia).setDiaStatus(false);
						count--;
					}
				}
				
			}
			System.out.println("\n");
			}
		}while(count>0);
		
	System.out.println("---------The End------------");
}
public void viewComicMovieCast()
{
	ironman i = new ironman();
	Thanos t = new Thanos();
	movieCast = dir.comicCast();
	Collections.sort(movieCast);
	System.out.println("Cast Description");
	System.out.println("------------------------");	
	System.out.print(movieCast.get(0).getActorRoleName()+":");t.behaviour();
	System.out.print(movieCast.get(1).getActorRoleName()+":");i.behaviour();
	System.out.println("\n\nActor Name-----Rolename");
	System.out.println("------------------------");
	
	for(Actor c:movieCast)
	{
		
		System.out.println(c.getActorName()+"----------->"+c.getActorRoleName());
	}
}
public void searchComicCast()
{
	boolean found = false;
	movieCast = dir.comicCast();
	System.out.println("Enter The Name Of Actor To Search::");
	String name = sc.nextLine();
		for(int i=0;i<movieCast.size();i++)
		{
			if(movieCast.get(i).getActorName().equals(name))
			{
				found = true;
				break;
			}	
		}
		if(found == true)
		{
			System.out.println("This Actor Portraying A Role In This Movie");
		}
		else
		{
			System.out.println("No Such Actor In This Movie");
		}
		
}


public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
	return result;
}

public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}
	Movie other = (Movie) obj;
	return movieName.equals(other.movieName);
}
public void playSciFiMovie() {
	movieCast.clear();
	dir.setDirname("James Cameron");
	setMovieGenere("Sci-Fi Movie");
	script.setScriptWriter("James Cameron");
	System.out.println("-----Terminator-----");
	System.out.println("Genere:"+getMovieGenere());
	System.out.println("Director:"+dir.getDirname());
	System.out.println("Script Writer:"+script.getScriptWriter());
	movieCast = dir.scifiCast();
	HashSet<Actor> hs = new HashSet<Actor>();
	for(Actor c:movieCast)
	{
		hs.add(c);
	}
	Iterator<Actor> itr = hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("\n");
	getSciFiScript(movieCast);
}
public void getSciFiScript(ArrayList<Actor> ac)
{
	
	File file1 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/t1000Q.csv");
	File file2 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/t1000R.csv");
	File file3 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/terminatorQ.csv");
	File file4 = new File("/home/rahul/eclipse-workspace/MovieScript/src/com/lxisoft/repository/terminatorR.csv");
	try {
	file1.createNewFile();file2.createNewFile();file3.createNewFile();file4.createNewFile();
	}
	catch(IOException e) {e.printStackTrace();}
	ArrayList<Dialogue> heroQ = new ArrayList<Dialogue>();
	ArrayList<Dialogue> heroR = new ArrayList<Dialogue>();
	ArrayList<Dialogue> villainQ = new ArrayList<Dialogue>();
	ArrayList<Dialogue> villainR = new ArrayList<Dialogue>();
	heroQ = script.readFromScript(heroQ, file1);
	heroR = script.readFromScript(heroR, file2);
	villainQ = script.readFromScript(villainQ, file3);
	villainR = script.readFromScript(villainR, file4);
	heroQ.addAll(heroR);
	villainQ.addAll(villainR);
	runSciFi(ac,heroQ,villainQ);
}	
public void runSciFi(ArrayList<Actor> ac, ArrayList<Dialogue> hQ, ArrayList<Dialogue> vQ)
{
	int count = hQ.size();
	do
	{
	for(int i=1;i<=4;i++)
	{
		dir.setDirectionalControl();
		System.out.println("Scene"+i+":"+dir.getDirectionalControl());
//		int diaNo = random.nextInt(4-1+1)+1;
		
		
		for(int j=0;j<=4;j++)
		{
			if(i<=4)
			{
			int randActor = random.nextInt(2);
			int randDia = random.nextInt(8);
			if(ac.get(randActor) instanceof Heroism)
				{
					if(hQ.get(randDia).isDiaStatus() == true)
					{
						
						System.out.println(ac.get(randActor).getActorRoleName()+"("+ac.get(randActor).getActorName()+")::"+hQ.get(randDia));
						System.out.println(ac.get(randActor+1).getActorRoleName()+"("+ac.get(randActor+1).getActorName()+")::"+vQ.get(randDia));
						hQ.get(randDia).setDiaStatus(false);
						vQ.get(randDia).setDiaStatus(false);
						count--;
					}
				}
			if(ac.get(randActor) instanceof Villainism)
			{
				if(hQ.get(randDia).isDiaStatus() == true)
				{
					System.out.println(ac.get(randActor).getActorRoleName()+"("+ac.get(randActor).getActorName()+")::"+vQ.get(randDia));
					System.out.println(ac.get(randActor-1).getActorRoleName()+"("+ac.get(randActor-1).getActorName()+")::"+hQ.get(randDia));
					hQ.get(randDia).setDiaStatus(false);
					vQ.get(randDia).setDiaStatus(false);
					count--;
				}
			}
			}
			else
			{
				break;
			}
		}
		System.out.println("\n");
		}
	}while(count>0);
	
System.out.println("---------The End------------");
}
public void viewSciFiCast()
{
	movieCast.clear();
	T1000 t = new T1000();
	Terminator tt = new Terminator();
	movieCast = dir.scifiCast();
	Collections.sort(movieCast);
	System.out.println("Cast Description");
	System.out.println("------------------------");	
	System.out.print(movieCast.get(0).getActorRoleName()+":");tt.behaviour();
	System.out.print(movieCast.get(1).getActorRoleName()+":");t.behaviour();
	System.out.println("\n\nActor Name-----Rolename");
	System.out.println("------------------------");
	
	for(Actor c:movieCast)
	{
		
		System.out.println(c.getActorName()+"----------->"+c.getActorRoleName());
	}
}
public void searchSciFiCast()
{
	movieCast.clear();
	boolean found = false;
	movieCast = dir.scifiCast();
	System.out.println("Enter The Name Of Actor To Search::");
	String name = sc.nextLine();
		for(int i=0;i<movieCast.size();i++)
		{
			if(movieCast.get(i).getActorName().equals(name))
			{
				found = true;
				break;
			}	
		}
		if(found == true)
		{
			System.out.println("This Actor Portraying A Role In This Movie");
		}
		else
		{
			System.out.println("No Such Actor In This Movie");
		}

}
}


