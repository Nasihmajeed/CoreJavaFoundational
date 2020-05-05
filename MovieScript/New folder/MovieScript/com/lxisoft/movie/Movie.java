package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
public class Movie
{ 
private String name ="A Comic Movie";
ArrayList<Actor> actors = new ArrayList<Actor>();	
FileReppo script =new FileReppo();
File file1=new File("ComicScript.csv");
File file2=new File("VillanScript.csv");
                
ArrayList<Dialogue> comicdialogue =new ArrayList<Dialogue>(); 
ArrayList<Dialogue> villandialogue =new ArrayList<Dialogue>();
PlayMovie plymovie;

static Scanner input =new Scanner(System.in);
public void createMovie()
{ if(file1.exists()==true&&file2.exists()==true)
	{
		file1.delete();
		file2.delete();
	}
	script.creatFile(file1);
	script.creatFile(file2);

	actors.add(new Villan());
	actors.add(new Comadian());
	System.out.println("\n\t"+name);
		setDialogues();
		setDetails();
		plymovie =new PlayMovie();
		plymovie.play(actors,script,comicdialogue,villandialogue);
}

public void setDetails()
{
	actors.get(0).setName("Actor 1"); 
	actors.get(0).setmovieRoll("Villan"); 

	actors.get(1).setName("Actor 2"); 
	actors.get(1).setmovieRoll("Comadian"); 
}

public int movieControl()
{
	System.out.print("\nPress 1 Play Movie\nPress 0 to Exit\n\n Enter Your Choise :");
	int choise=input.nextInt();
	return choise;
}
public void setDialogues()
{
	for(int i=0;i<6;i++)
	{	
	comicdialogue.add(new Dialogue());	
	villandialogue.add(new Dialogue());
	}
setVillan();
setComic();
for(int i=0;i<comicdialogue.size();i++)
{
 String s1=	comicdialogue.get(i).getdialogue();
 String s2= villandialogue.get(i).getdialogue();
script.writeTofile("ComicScript.csv",s1);    
script.writeTofile("VillanScript.csv",s2);      
}
}
public void setVillan()
{
villandialogue.get(0).setId(1);
villandialogue.get(0).setdialogue("question v 1");
villandialogue.get(1).setId(1);
villandialogue.get(1).setdialogue("question v 2");
villandialogue.get(2).setId(1);
villandialogue.get(2).setdialogue("question v 3");
villandialogue.get(3).setId(2);
villandialogue.get(3).setdialogue("answer v 1");
villandialogue.get(4).setId(2);
villandialogue.get(4).setdialogue("answer v 2");
villandialogue.get(5).setId(2);
villandialogue.get(5).setdialogue("answer v 3");
}

public void setComic()
{
comicdialogue.get(0).setId(1);
comicdialogue.get(0).setdialogue("question c 1");
comicdialogue.get(1).setId(1);
comicdialogue.get(1).setdialogue("question c 2");
comicdialogue.get(2).setId(1);
comicdialogue.get(2).setdialogue("question c 3");
comicdialogue.get(3).setId(2);
comicdialogue.get(3).setdialogue("answer c 1");
comicdialogue.get(4).setId(2);
comicdialogue.get(4).setdialogue("answer c 2");
comicdialogue.get(5).setId(2);
comicdialogue.get(5).setdialogue("answer c 3");
}
}