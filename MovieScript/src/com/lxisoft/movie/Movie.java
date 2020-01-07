package com.lxisoft.movie;
import com.lxisoft.Interface.*;
import java.util.*;
import java.io.*;
public class Movie
{
	public static Scanner scanner = new Scanner(System.in); 
	private String name;
	Script script = new Script();
    public ArrayList<Dialouge> vDialouge;
	public ArrayList<Dialouge> cDialouge;
	
	File villanQuestionFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\villanQuestionFile.txt");
	File comedianQuestionFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\comedianQuestionFile.txt");
	File villanAnswerFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\villanAnswerFile.txt");
	File comedianAnswerFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\comedianAnswerFile.txt");
	public Movie(String name)
	{
		this.name=name;
	}
	public void startMovie()
	{
		try
		{
			boolean isTrue = true;
			do
			{
				System.out.println("Press ==> 1.Start Movie  2.Add Dialouge");
			    int x = scanner.nextInt();
				isTrue = true;
				switch(x)
				{
				case 1:
				   selectActor(script.villanQuestion,script.comedianQuestion,script.villanAnswer,script.comedianAnswer);
				   isTrue = false;
				   break;
				case 2:
				   addDialougeToFile(villanAnswerFile,comedianAnswerFile,villanQuestionFile,comedianQuestionFile);
				   break;
				default :
				   System.out.println("!!! Select Options From Above !!!");
				   break;
				}
		    }while(isTrue);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public void selectActor(ArrayList<Dialouge> villanQuestion,ArrayList<Dialouge> comedianQuestion,ArrayList<Dialouge> villanAnswer,ArrayList<Dialouge> comedianAnswer)
	{
		try
		{
			boolean isTrue = true;
			boolean fileExists = script.fileExist(villanQuestionFile,comedianQuestionFile,villanAnswerFile,comedianAnswerFile);
			ArrayList<Actors> actors = new ArrayList<Actors>();
			actors.add(new Villan());
			actors.add(new Comedian());
			int[] c = script.limitOfDialogue(villanQuestion.size(),comedianQuestion.size(),villanAnswer.size(),comedianAnswer.size(),fileExists);
			boolean exists = false;
			//Set While loop and remove do While
			//Remove repetation...
			//print dialouge properly...
			while(c[0]>0)
			{
			 int x = (int)(Math.random()*actors.size());
				if(actors.get(x) instanceof Comic)
				{
					if(fileExists)
					{
						selectDialogue(c[1],actors.get(x),comedianQuestion,villanAnswer);
						c[0]=c[0]-2;
					}
					else if(!fileExists)
					{
						script.commonConversation(actors.get(x),script.villanCommonDialouge,script.comedianCommonDialouge);
						break;
					}
				}
				else if(actors.get(x) instanceof Villanic)
				{
					if(fileExists)
					{
						selectDialogue(c[1],actors.get(x),villanQuestion,comedianAnswer);
						c[0]=c[0]-2;
					}
					else if(!fileExists)
					{
						script.commonConversation(actors.get(x),script.villanCommonDialouge,script.comedianCommonDialouge);
						break;
					}
				}
		    }
	   }
	   catch(Exception e)
	   {
	   	e.printStackTrace();
	   }
	}
	//public void checkInstance(Actor actor)
	//{

	//}
	public void addDialougeToFile(File villanAnswerFile,File comedianAnswerFile,File villanQuestionFile,File comedianQuestionFile)
	{
		try
		{
			boolean isTrue = true;
			do 
			{
		        System.out.println("press ==> 1.Add to villian File 2.Add to Comedian File 3.Back");
			    int x = scanner.nextInt();
				isTrue = true;
				switch(x)
				{
				case 1:
				   script.questionOrAnswer(scanner,villanQuestionFile,villanAnswerFile,script.villanQuestion,script.villanAnswer);
				   break;
				case 2:
				   script.questionOrAnswer(scanner,comedianQuestionFile,comedianAnswerFile,script.comedianQuestion,script.comedianAnswer);
				   break;
				case 3:
					isTrue = false;
					break;
				default :
				   System.out.println("!!! Select Options From Above !!!");
				   break;
				}
		    }while(isTrue);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	public void selectDialogue(int x,Actors actor,ArrayList<Dialouge> cDialouge,ArrayList<Dialouge> vDialouge)
	{
		try
		{
			if(actor instanceof Comic)
			{
				int y = (int)(Math.random()*cDialouge.size());
				if(cDialouge.get(y).isTaken)
				{
					script.print(y,cDialouge,vDialouge,actor);
					cDialouge.get(y).isTaken = false;
					vDialouge.get(y).isTaken = false;
				}
			}
			if(actor instanceof Villanic)
			{
				int y = (int)(Math.random()*vDialouge.size());
				if(cDialouge.get(y).isTaken)
				{
					script.print(y,vDialouge,cDialouge,actor);
					cDialouge.get(y).isTaken = false;
					vDialouge.get(y).isTaken = false;
				}
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public boolean conversationexeed(int x,boolean exists)
	{
		try
		{
			if(x==9)
			{
				exists = false;
			}
			else if(x<9)
			{
				exists = true;
			}
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return exists;
	}
}