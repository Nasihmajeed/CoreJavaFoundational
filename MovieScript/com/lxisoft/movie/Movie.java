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
			File fileOne = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v6//com//lxisoft//repository//ironManQ.csv");
			File fileTwo = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v6//com//lxisoft//repository//ironManR.csv");
			File fileThree = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v6//com//lxisoft//repository//thanosQ.csv");
			File fileFour = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v6//com//lxisoft//repository//thanosR.csv");
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
		{do{
		System.out.println("1.Play Movie\n2.Edit Script\n3.Delete Script\n4.Update Script\n5.Back\nEnter Ur Choice:\n");
		x = sc.nextInt();
		try
		{switch(x)
			{
			case 1:playMovie();break;
			case 2:editScript();break;
			case 3:deleteScript();break;
			case 4:updateScript();
			case 5:createMovie();break;
			default:System.out.println("Enter valid Choice");break;
			}	
		}catch(MyException e){System.out.println("Caught");}
		finally{System.out.println("Do You Want To Continue Play:Yes(press 1)/No(Press 0)");
				ch = sc.nextInt();}
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
		switch(x)
		{
			case 1:add();break;
			case 2:delete();break;
			case 3:update();break;
			case 4:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}
	}
	public void add()
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back");
		int x = sc.nextInt();
		if(x>=4)
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
		d1.clear();  d2.clear();
		d1= script.readFromScript(file1);
		d2= script.readFromScript(file2);
		viewScript(name1,d1);
		System.out.println("Enter position to add::");
		int position = sc.nextInt();
		addDialog(position,file1,d1)
		viewScript(name2,d2);
		addDialog(position,file2,d2);
	}
	public void addDialog(int position,File file,ArrayList<Dialogue> d)
	{
		int length = d.size();
		System.out.println("Enter Dialogue::");
		String dialogue = sc.nextLine();
		dialogue = sc.nextLine();
		d.add(position,new Dialogue());
		d.get(position).setMovieDialogue(dialogue);
		d.get(position).setMarkDialogue(true);
		for (int i=0;i<length;i++){
		script.writeToScript(file,d.get(i).getMovieDialogue());
		}
	}


	public void delete()
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back");
		int x = sc.nextInt();
		if(x>=4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:deleteDialogue();break;
			case 2:deleteDialogue();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}
	public void update()
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back");
		int x = sc.nextInt();
		if(x>=4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:updateDialogue();break;
			case 2:updateDialogue();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}	
	}



	public void editScript() throws MyException
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back\n");
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
		add("ironMan","Question",ironManQ,fileOne);
	}
	public void addIronManAns()
	{
		add("ironMan","Reply",ironManR,fileTwo);
	}
	public void addThanosQuest()
	{
		add("Thanos","Question",thanosQ,fileThree);
	}
	public void addThanosAns()
	{
		add("Thanos","Reply",thanosR,fileFour);
	}
	public void viewScript(String name,String type,ArrayList<Dialogue> a)
	{
		System.out.println(name +"Script");
		System.out.println("--------------------");
		for (Dialogue  x: a) 
		{
			System.out.println(x.getMovieDialogue()+"\n");	
		}
	}
	public void deleteScript()throws MyException
	{
		System.out.println("\n1.IronManVsThanos\n2.ThanosVsIronMan\n3.Back\n");
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
		delete("ironMan","Question",ironManQ,fileOne);
	}
	public void deleteIronManAns()
	{
		delete("ironMan","Reply",ironManR,fileTwo);	
	}
	public void deleteThanosQuest()
	{
		delete("Thanos","Question",thanosQ,fileThree);	
	}
	public void deleteThanosAns()
	{
		delete("Thanos","Reply",thanosR,fileFour);	
	}

	public void delete(String name,String type,ArrayList<Dialogue> d,File file)
	{
		viewScript(name,type,d);
		System.out.println("Enter position Of Reply to be deleted");
		int position = sc.nextInt();
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

	public void add(String name,String type,ArrayList<Dialogue> d,File file)
	{
		d = script.readFromScript(file);
		viewScript(name,type,d);
		int length = d.size();
		System.out.println("Enter Answer to add::");
		String dialogue = sc.nextLine();
		dialogue = sc.nextLine();
		d.add(new Dialogue());
		d.get(length).setMovieDialogue(dialogue);
		d.get(length).setMarkDialogue(true);
		script.writeToScript(file,dialogue);
	}
	public void updateScript() throws MyException
	{
		System.out.println("Whose Script You Want To Edit\n1.IronManVSThanos\n2.ThanosVSIronMan\n3.Back\n");
		int x = sc.nextInt();
		if(x>=4)
		{
			throw new MyException("invalid input exception");
		}
		switch(x)
		{
			case 1:updateIronManVsThanos();break;
			case 2:updateThanosVsIronMan();break;
			case 3:createMovie();break;
			default:System.out.println("Enter Valid Choice!!!!");break;	
		}
	}
	public void updateIronManVsThanos()
	{
		updateScript("ironMan","Question",ironManQ,thanosR,fileOne,fileFour);
	}
	public void updateThanosVsIronMan()
	{
		updateScript("Thanos","Reply",thanosQ,ironManR,fileThree,fileTwo);	
	}
	public void updateScript(String name,String type,ArrayList<Dialogue> d1,ArrayList<Dialogue> d2,File file1,File file2)
	{
		d1 = script.readFromScript(file1);
		d2 = script.readFromScript(file2);
		System.out.println("Enter The Position to Update");
		int position = sc.nextInt();
		update(file1,position,d1);
		update(file2,position,d2);
	}
	public void update(File file,int position,ArrayList<Dialogue> d1)
	{
		d1.remove(position);
		System.out.println("Enter Dialogue::");
		String d = sc.nextLine();
		d = sc.nextLine();
		d1.add(position,new Dialogue());
		d1.get(position).setMovieDialogue(d);
		d1.get(position).setMarkDialogue(true);
		try{
		if(file.exists() && file.isFile())
		{
			file.delete();
		}
		file.createNewFile();
		}
		catch(IOException e){ System.out.println("Error");}

		for(int i=0;i<d1.size();i++)
		{
			script.writeToScript(file,d1.get(i).getMovieDialogue());
		}
	}
}