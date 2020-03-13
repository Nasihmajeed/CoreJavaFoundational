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
		File fileOne;
		File fileTwo ;
		File fileThree;
		File fileFour;	
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
	public void createScript()
	{
		 fileOne = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v8//com//lxisoft//repository//ironManQ.csv");
		 fileTwo = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v8//com//lxisoft//repository//ironManR.csv");
		 fileThree = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v8//com//lxisoft//repository//thanosQ.csv");
		 fileFour = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v8//com//lxisoft//repository//thanosR.csv");
		try{
			if(fileOne.exists() && fileTwo.exists() && fileThree.exists() && fileFour.exists())
			{
			fileOne.delete();fileTwo.delete();fileThree.delete();fileFour.delete();
			}
		fileOne.createNewFile();fileTwo.createNewFile();fileThree.createNewFile();fileFour.createNewFile();
		}
	catch(IOException e){System.out.println("Error");}
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
	public void ironmanScript()
	{
		ironManQ.clear();ironManR.clear();
		for(int i=0;i<3;i++)
		{
			ironManQ.add(new Dialogue());
			ironManR.add(new Dialogue());
		}
		ironManQ.get(0).setMovieDialogue("A");
		ironManQ.get(1).setMovieDialogue("B");
		ironManQ.get(2).setMovieDialogue("C");
		ironManR.get(0).setMovieDialogue("D");
		ironManR.get(1).setMovieDialogue("E");
		ironManR.get(2).setMovieDialogue("F");
		for(int i=0;i<3;i++)
		{
			script.writeToScript(fileOne,ironManQ.get(i).getMovieDialogue());
			script.writeToScript(fileTwo,ironManR.get(i).getMovieDialogue());
		}
	}  
	public void thanosScript()
	{
		thanosQ.clear();thanosR.clear();
		for(int i=0;i<3;i++)
		{
			thanosQ.add(new Dialogue());
			thanosR.add(new Dialogue());
		}
		thanosQ.get(0).setMovieDialogue("G");
		thanosQ.get(1).setMovieDialogue("H");
		thanosQ.get(2).setMovieDialogue("I");
		thanosR.get(0).setMovieDialogue("J");
		thanosR.get(1).setMovieDialogue("K");
		thanosR.get(2).setMovieDialogue("L");
		for(int i=0;i<3;i++)
		{
			script.writeToScript(fileThree,thanosQ.get(i).getMovieDialogue());
			script.writeToScript(fileFour,thanosR.get(i).getMovieDialogue());
		}
	}
	
	public void createMovie()
	{	
		createScript();
		ironmanScript();
		thanosScript();
		int x,ch = 0;
		try
		{do{
		System.out.println("1.Play Movie\n2.Edit Script\nEnter Ur Choice:\n");
		x = sc.nextInt();
		try{
		switch(x)
			{
			case 1:playMovie();break;
			case 2:editScript();break;
			default:System.out.println("Enter valid Choice");break;
			}	
				System.out.println("Do You Want To Continue Play:Yes(press 1)/No(Press 0)");
				ch = sc.nextInt();
		}catch(MyException e){System.out.println("Error");}	
		}while(ch==1);
		}catch(InputMismatchException e){System.out.println(e);}
	}
	public  void playMovie()
	{
		setMovieDetails();
		createCharacters();
		startMovie(actorList,fileOne,fileTwo,fileThree,fileFour);
	}
	public  void startMovie(ArrayList<Actor> actorList,File a,File b,File c,File d)
	{
		ironManQ.clear();ironManR.clear();thanosQ.clear();thanosR.clear();
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
		System.out.println("\n1.Add\n2.Delete\n3.Update\n4.Back");
		int x = sc.nextInt();
		if(x>=5)
		{
			throw new MyException("invalid input exception");
		}
		try{
			switch(x)
			{
				case 1:add();break;
				case 2:delete();break;
				case 3:update();break;
				case 4:createMovie();break;
				default:System.out.println("Enter valid choice");
			}
		}
		catch(Exception e){System.out.println(e);}
 	}
	public void add() throws MyException
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back");
		int x = sc.nextInt();
		if(x>=3)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:addDialogue("ironMan","Thanos",fileOne,fileFour,ironManQ,thanosR);break;
			case 2:addDialogue("Thanos","ironMan",fileThree,fileTwo,thanosQ,ironManR);break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}
	public void addDialogue(String name1,String name2,File file1,File file2,ArrayList<Dialogue> d1,ArrayList<Dialogue> d2)
	{
		d1= script.readFromScript(file1);
		d2= script.readFromScript(file2);
		viewScript(name1,d1);
		addDialog(file1,d1);
		viewScript(name2,d2);
		addDialog(file2,d2);
	}
	public void addDialog(File file,ArrayList<Dialogue> d)
	{
		int length = d.size();
		System.out.println("Enter Dialogue::");
		String dialogue = sc.nextLine();
		dialogue = (dialogue.equals(""))?sc.nextLine():dialogue;
		d.add(new Dialogue());
		d.get(length).setMovieDialogue(dialogue);
		d.get(length).setMarkDialogue(true);
		script.writeToScript(file,d.get(length).getMovieDialogue());
	}
	public void viewScript(String name,ArrayList<Dialogue> a)
	{
		System.out.println(name +"Script");
		System.out.println("--------------------");
		for (Dialogue  x: a) 
		{
			System.out.println(x.getMovieDialogue()+"\n");	
		}
	}
	public void delete() throws MyException
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back");
		int x = sc.nextInt();
		if(x>=3)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:deleteDialogue("ironMan","Thanos",fileOne,fileFour,ironManQ,thanosR);break;
			case 2:deleteDialogue("Thanos","ironMan",fileThree,fileTwo,thanosQ,ironManR);break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}
	public void deleteDialogue(String name1,String name2,File file1,File file2,ArrayList<Dialogue> d1,ArrayList<Dialogue> d2)
	{
		d1= script.readFromScript(file1);
		d2= script.readFromScript(file2);
		System.out.println("Enter position");
		int pos = sc.nextInt();
		deleteDialog(pos,file1,d1);
		deleteDialog(pos,file2,d2);
		viewScript(name1,d1);
		viewScript(name2,d2);
	}
	public void deleteDialog(int position,File file,ArrayList<Dialogue> d)
	{
		d.remove(position);
		try{
		if(file.exists() && file.isFile())
		{
			file.delete();
		}
		file.createNewFile();
		}
		catch(IOException e){ System.out.println("Error");}
		for(int i=0;i<d.size();i++) 
		{
			String dialogue = d.get(i).getMovieDialogue();
			script.writeToScript(file,dialogue);
 		}
	}
	public void update() throws MyException
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back");
		int x = sc.nextInt();
		if(x>=3)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:updateDialogue("ironMan","Thanos",fileOne,fileFour,ironManQ,thanosR);break;
			case 2:updateDialogue("Thanos","ironMan",fileThree,fileTwo,thanosQ,ironManR);break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}
	public void updateDialogue(String name1,String name2,File file1,File file2,ArrayList<Dialogue> d1,ArrayList<Dialogue> d2)
	{
		d1= script.readFromScript(file1);
		d2= script.readFromScript(file2);
		System.out.println("Enter position");
		int pos = sc.nextInt();
		updateDialog(pos,file1,d1);
		updateDialog(pos,file2,d2);
		viewScript(name1,d1);
		viewScript(name2,d2);
	}
	public void updateDialog(int position,File file,ArrayList<Dialogue> d)
	{
		int length = d.size();
		System.out.println("Enter Dialogue::");
		String dialogue = sc.nextLine();
		dialogue = sc.nextLine();
		d.remove(position);
		d.add(position,new Dialogue());
		d.get(position).setMovieDialogue(dialogue);
		d.get(position).setMarkDialogue(true);
		try{
		if(file.exists() && file.isFile())
		{
			file.delete();
		}
		file.createNewFile();
		}
		catch(IOException e){ System.out.println("Error");}
		for(int i=0;i<d.size();i++) 
		{
			String dia = d.get(i).getMovieDialogue();
			script.writeToScript(file,dia);
 		}
	}
}




