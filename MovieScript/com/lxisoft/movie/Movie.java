package com.lxisoft.movie;
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
		int x,ch;
		try
		{
		do{
		System.out.println("1.Play Movie\n2.Edit Script\n3.Delete Script\n4.Back\nEnter Ur Choice:\n");
		x = sc.nextInt();
		try
		{
			switch(x)
			{
			case 1:playMovie();break;
			case 2:editScript();break;
			case 3:deleteScript();break;
			case 4:createMovie();break;
			default:System.out.println("Enter valid Choice");break;
			}	
		}catch(MyException e)
		{
			System.out.println("Caught");
		}
		finally
		{
			System.out.println("Do You Want To Continue Play:Yes(press 1)/No(Press 0)");
			ch = sc.nextInt();
		}
		}while(ch==1);
		}catch(InputMismatchException e)
		{
			System.out.println(e);
		}
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
	public void editScript() throws MyException
	{
		System.out.println("Whose Script You Want To Edit\n1.IronMan\n2.Thanos\n3.Back\n");
		int x = sc.nextInt();
		if(x>=4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:ironManScript();break;
			case 2:thanosScript();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}
	}
	public  void ironManScript()throws MyException
	{
		System.out.println("\n1.Qusetion\n2.Answer\n3.Back\n");
		int x = sc.nextInt();
		if(x>=4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:addIronManQuest();break;
			case 2:addIronManAns();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}
	public  void thanosScript()throws MyException
	{
		System.out.println("\n1.Qusetion\n2.Answer\n3.Back\n");
		int x = sc.nextInt();
		if(x>=4)
		{
				throw new MyException("invalid input exception");
		}
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
		viewScript("ironMan","Qusetion",ironManQ);
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
		viewScript("ironMan","Reply",ironManR);
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
		viewScript("Thanos","Question",thanosQ);
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
		viewScript("Thanos","Reply",thanosR);
		int length4 = thanosR.size();
		System.out.println("Enter Answer to add::");
		String ans = sc.nextLine();
		ans = sc.nextLine();
		thanosR.add(new Dialogue());
		thanosR.get(length4).setMovieDialogue(ans);
		thanosR.get(length4).setMarkDialogue(true);
		script.writeToScript(fileFour,ans);
	}
	public void viewScript(String name,String type,ArrayList<Dialogue> a)
	{
		System.out.println(name + type);
		System.out.println("--------------------");
		for (Dialogue  x: a) 
		{
			System.out.println(x.getMovieDialogue()+"\n");	
		}
	}
	public void deleteScript()throws MyException
	{
		System.out.println("Whose Script You Want To Delete\n1.IronMan\n2.Thanos\n3.Back\n");
		int x = sc.nextInt();
		if(x>4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:ironManScriptDelete();break;
			case 2:thanosScriptDelete();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;		
		}
	}
	public void ironManScriptDelete() throws MyException
	{
		System.out.println("\n1.Qusetion\n2.Answer\n3.Back\n");
		int x = sc.nextInt();
		if(x>=4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:deleteIronManQuest();break;
			case 2:deleteIronManAns();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}
	}
	public void thanosScriptDelete() throws MyException
	{
		System.out.println("\n1.Qusetion\n2.Answer\n3.Back\n");
		int x = sc.nextInt();
		if(x>=4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:deleteThanosQuest();break;
			case 2:deleteThanosAns();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}
	}
	public void deleteIronManQuest()
	{
		viewScript("ironMan","Qusetion",ironManQ);
		System.out.println("Enter position Of Question to be deleted");
		int position = sc.nextInt();
		ironManQ.remove(position);
		try{
		if(fileOne.exists() && fileOne.isFile())
		{
			fileOne.delete();
		}
		fileOne.createNewFile();
		}
		catch(IOException e){ System.out.println("Error");}	
		for(int i=0;i<ironManQ.size();i++) 
		{
			String dialogue = ironManQ.get(i).getMovieDialogue();
			script.writeToScript(fileOne,dialogue);

		}

	}
	public void deleteIronManAns()
	{
		viewScript("ironMan","Reply",ironManQ);
		System.out.println("Enter position Of Reply to be deleted");
		int position = sc.nextInt();
		ironManR.remove(position);
		try{
		if(fileTwo.exists() && fileTwo.isFile())
		{
			fileTwo.delete();
		}
		fileTwo.createNewFile();
		}
		catch(IOException e){ System.out.println("Error");}
		for(int i=0;i<ironManR.size();i++) 
		{
			String dialogue = ironManR.get(i).getMovieDialogue();
			script.writeToScript(fileTwo,dialogue);

		}	
	}
	public void deleteThanosQuest()
	{
		viewScript("Thanos","Qusetion",thanosQ);
		System.out.println("Enter position Of Question to be deleted");
		int position = sc.nextInt();
		thanosQ.remove(position);
		try{
		if(fileThree.exists() && fileThree.isFile())
		{
			fileThree.delete();
		}
		fileThree.createNewFile();
		}
		catch(IOException e){ System.out.println("Error");}
		for(int i=0;i<thanosQ.size();i++) 
		{
			String dialogue = thanosQ.get(i).getMovieDialogue();
			script.writeToScript(fileThree,dialogue);

		}	
	}
	public void deleteThanosAns()
	{
		viewScript("Thanos","Reply",thanosR);
		System.out.println("Enter position Of Reply to be deleted");
		int position = sc.nextInt();
		thanosR.remove(position);
		try{
		if(fileFour.exists() && fileFour.isFile())
		{
			fileFour.delete();
		}
		fileFour.createNewFile();
		}
		catch(IOException e){ System.out.println("Error");}
		for(int i=0;i<thanosR.size();i++) 
		{
			String dialogue = thanosR.get(i).getMovieDialogue();
			script.writeToScript(fileFour,dialogue);

		}	
	}

	
}