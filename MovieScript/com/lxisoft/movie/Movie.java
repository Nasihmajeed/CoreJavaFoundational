package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
import java.io.*;
public class Movie
{
	private String movieName = "Avengers InfintyWar";
	private String nameOfDirector = "Russo Brothers";
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	ArrayList<Actor> actorList = new ArrayList<Actor>();
	Script script  = new Script();
	Actor actor = new Actor();
			File fileOne = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//ironManQ.csv");
			File fileTwo = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//ironManR.csv");
			File fileThree = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//thanosQ.csv");
			File fileFour = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//thanosR.csv");
			ArrayList<Dialogue> ironManQ = new ArrayList<Dialogue>();
			ArrayList<Dialogue> ironManR = new ArrayList<Dialogue>();
			ArrayList<Dialogue> thanosQ = new ArrayList<Dialogue>();
			ArrayList<Dialogue> thanosR = new ArrayList<Dialogue>();

	public void setMovieName(String moviename)
	{
		this.movieName = moviename;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setNameOfDirector(String directorname)
	{
		this.nameOfDirector = directorname;
	}
	public String getNameOfDirector()
	{
		return nameOfDirector;
	}
	public void setMovieDetails()
	{
		System.out.println(getMovieName().toUpperCase());
		System.out.println("---------------------");
		System.out.println("Director::"+getNameOfDirector().toUpperCase());
		System.out.println("ScriptWriter::"+script.getScriptWriter().toUpperCase());
	}
	public void createCharacters()
	{
		actorList.add(new IronMan());
		actorList.get(0).setActorName("Robert");
		actorList.get(0).setNameOfRole("IronMan");
		actorList.get(0).setActorId(1);
		actorList.add(new Thanos());
		actorList.get(1).setActorName("Josh");
		actorList.get(1).setNameOfRole("Thanos");
		actorList.get(1).setActorId(2);
	}  
	public void createMovie()
	{	
		int x;
		do{
		System.out.println("1.Play Movie\n2.Edit Script\n3.Back\nEnter Ur Choice:\n");
		x = sc.nextInt();
		switch(x)
		{
			case 1:playMovie();break;
			case 2:editScript();break;
			case 3:createMovie();break;
			default:System.out.println("Enter valid Choice");break;
		}
		System.out.println("Do You Want To Continue Play:Yes(press 1)/No(Press 0)");
		}while(x==1);
	}
	public  void playMovie()
	{
		setMovieDetails();
		createCharacters();
		startMovie(actorList,fileOne,fileTwo,fileThree,fileFour);
	}
	public  void startMovie(ArrayList<Actor> actorList,File a,File b,File c,File d)
	{
		ironManQ = script.readFromScript(a);
		ironManR = script.readFromScript(b);
		thanosQ  = script.readFromScript(c);
		thanosR  = script.readFromScript(d);
		int count = ironManQ.size()+ironManR.size();
		do
		{
			int randomActor = random.nextInt(2);
			int randomDialogue = random.nextInt(ironManQ.size());
			if(actorList.get(randomActor) instanceof Heroism)
			{
				if(ironManQ.get(randomDialogue).getMarkDialogue() == true)
				{
				System.out.println(actorList.get(randomActor).getNameOfRole()+"-->"+ ironManQ.get(randomDialogue));
				System.out.println(actorList.get((randomActor+1)).getNameOfRole()+"-->"+thanosR.get(randomDialogue));
				ironManQ.get(randomDialogue).setMarkDialogue(false);
				thanosR.get(randomDialogue).setMarkDialogue(false);
				count--;
				}
			}
			else if(actorList.get(randomActor) instanceof Villanism) 
			{
				if(thanosQ.get(randomDialogue).getMarkDialogue() == true)
				{
				System.out.println(actorList.get(randomActor).getNameOfRole()+"-->"+ thanosQ.get(randomDialogue));
				System.out.println(actorList.get((randomActor-1)).getNameOfRole()+"-->"+ironManR.get(randomDialogue));
				thanosQ.get(randomDialogue).setMarkDialogue(false);
				ironManR.get(randomDialogue).setMarkDialogue(false);
				count--;
				}
			}
		}while(count>0);	
	}		
	public void editScript()
	{
		System.out.println("Whose Script You Want To Edit\n1.IronMan\n2.Thanos\n3.Back\n");
		int x = sc.nextInt();
		switch(x)
		{
			case 1:ironManScript();break;
			case 2:thanosScript();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}
	}
	public  void ironManScript()
	{
		System.out.println("\n1.Qusetion\n2.Answer\n3.Back\n");
		int x = sc.nextInt();
		switch(x)
		{
			case 1:addIronManQuest();break;
			case 2:addIronManAns();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}
	public  void thanosScript()
	{
		System.out.println("\n1.Qusetion\n2.Answer\n3.Back\n");
		int x = sc.nextInt();
		switch(x)
		{
			case 1:addThanosQuest();break;
			case 2:addThanosAns();break;
			case 3:editScript();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}
	public void addIronManQuest()
	{
		int length1 = ironManQ.size();
		System.out.println("Enter Qustion to add::");
		String quest = sc.nextLine();
		quest = sc.nextLine();
		ironManQ.add(new Dialogue());
		ironManQ.get(length1).setMovieDialogue(quest);
		ironManQ.get(length1).setMarkDialogue(true);
		script.writeToScript(fileOne,quest);
	}
	public void addIronManAns()
	{
		int length2 = ironManR.size();
		System.out.println("Enter Answer to add::");
		String ans = sc.nextLine();
		ans = sc.nextLine();
		ironManQ.add(new Dialogue());
		ironManQ.get(length2).setMovieDialogue(ans);
		ironManQ.get(length2).setMarkDialogue(true);
		script.writeToScript(fileTwo,ans);
	}
	public void addThanosQuest()
	{
		int length3 = thanosQ.size();
		System.out.println("Enter Qustion to add::");
		String quest = sc.nextLine();
		quest = sc.nextLine();
		thanosQ.add(new Dialogue());
		thanosQ.get(length3).setMovieDialogue(quest);
		thanosQ.get(length3).setMarkDialogue(false);
		script.writeToScript(fileThree,quest);
	}
	public void addThanosAns()
	{
		int length4 = thanosR.size();
		System.out.println("Enter Answer to add::");
		String ans = sc.nextLine();
		ans = sc.nextLine();
		thanosR.add(new Dialogue());
		thanosR.get(length4).setMovieDialogue(ans);
		thanosR.get(length4).setMarkDialogue(true);
		script.writeToScript(fileFour,ans);
	}
	
}