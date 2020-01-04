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
	
	File villanQuestionFile = new File("villanQuestionFile.txt");
	File comedianQuestionFile = new File("comedianQuestionFile.txt");
	File villanAnswerFile = new File("villanAnswerFile.txt");
	File comedianAnswerFile = new File("comedianAnswerFile.txt");
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
				   //comedianFileExists = script.fileExist(comedianFile);
				   //comedianFile = script.createFile(comedianFileExists,comedianFile);
				   //script.writeToFile(comedianFile,scanner,script.comedianDialouge);
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
	public void selectActor(ArrayList<Dialouge> villanQuestion,ArrayList<Dialouge> comedianQuestion,ArrayList<Dialouge> villanAnswer,ArrayList<Dialouge> comedianAnswer)
	{
		try
		{
			boolean isTrue = true,fileExists = false;
			int k=0;
			ArrayList<Actors> actors = new ArrayList<Actors>();
			actors.add(new Villan());
			actors.add(new Comedian());
			int c =0;
			boolean exists=false;
			do
			{
			 int x = (int)(Math.random()*actors.size());

				if(actors.get(x) instanceof Comic)
				{
					fileExists = script.fileExist(villanQuestionFile,comedianQuestionFile,villanAnswerFile,comedianAnswerFile);
					if(fileExists)
					{
						selectDialogue(actors.get(x),comedianQuestion,villanAnswer);
						c++;
					    exists = conversationexeed(c,exists);
					}
					else if(!fileExists)
					{
						script.commonConversation(actors.get(x),script.villanCommonDialouge,script.comedianCommonDialouge);
						exists=false;
					}
				}
				else if(actors.get(x) instanceof Villanic)
				{
					fileExists = script.fileExist(villanQuestionFile,comedianQuestionFile,villanAnswerFile,comedianAnswerFile);
					if(fileExists)
					{
					selectDialogue(actors.get(x),villanQuestion,comedianAnswer);
					c++;
					exists = conversationexeed(c,exists);
					}
					else if(!fileExists)
					{
						script.commonConversation(actors.get(x),script.villanCommonDialouge,script.comedianCommonDialouge);
						exists=false;
					}
				}
		    }while(exists);
	   }
	   catch(Exception e)
	   {
	   	e.printStackTrace();
	   }
	}
	public void selectDialogue(Actors actor,ArrayList<Dialouge> cDialouge,ArrayList<Dialouge> vDialouge)
	{
		ArrayList<Integer> cqus = new ArrayList<Integer>();
		ArrayList<Integer> vqus = new ArrayList<Integer>();
		int y = (int)(Math.random()*5);
		boolean bool = true,bool1 = true;

		if(actor instanceof Comic)
		{
			for(int i=0;i<=cqus.size();i++)
			{
				if(cqus.size()==0)
				{
					cqus.add(y);
					break;
				}
				else if(cqus.get(i)==y)
				{
					bool = false;
					break;
				}
		    }
		    if(bool)
		    {
		    	cqus.add(y);
			    System.out.println(cDialouge.get(y).getDialouge());
			    System.out.println(vDialouge.get(y+5).getDialouge());
		    }
		}
		if(actor instanceof Villanic)
		{
			for(int j=0;j<=vqus.size();j++)
			{
				if(vqus.size()==0)
				{
					vqus.add(y);
					break;
				}
				else if(vqus.get(j)==y)
				{
					bool1=false;
					break;
				}
		    }
		    if(bool1)
		    {
	    	    vqus.add(y);
				System.out.println(vDialouge.get(y).getDialouge());
				System.out.println(cDialouge.get(y+5).getDialouge());
		    }
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