package com.lxisoft.moviescript;
import java.util.*;
import java.io.*;
public class Director
{
	private String name;
	ScriptWriter scriptWriter = new ScriptWriter();
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public ArrayList<Actors> creatingActors()
	{
		ArrayList<Actors> actors = new ArrayList<Actors>();
		actors.add(new Villan());
		((Villan)actors.get(0)).setName("Villan");
		actors.add(new Comedian());
		((Comedian)actors.get(1)).setName("Comedian");
		return actors;
	}
	public void selectActor()
	{
		try
		{
			Script script = new Script();
			boolean fileExists = script.fileExist(scriptWriter,scriptWriter.villanQuesFile,scriptWriter.comedianQuesFile,scriptWriter.villanAnsFile,scriptWriter.comedianAnsFile);
			ArrayList<Actors> actors = creatingActors();
			int[] c = script.limitOfDialogue(scriptWriter.villanQuestion.size(),scriptWriter.comedianQuestion.size(),scriptWriter.villanAnswer.size(),scriptWriter.comedianAnswer.size(),fileExists);
			boolean exists = false;
			while(c[0]>=0)
			{
			 int x = (int)(Math.random()*actors.size());
				if(actors.get(x) instanceof Comic)
				{
					if(fileExists)
					{
						scriptWriter.selectDialogue(c[1],actors.get(x),actors);
						c[0]=c[0]-2;
					}
					else if(!fileExists)
					{
						scriptWriter.commonDialogue(actors.get(x),actors);
						break;
					}
				}
				else if(actors.get(x) instanceof Villanic)
				{
					if(fileExists)
					{
						scriptWriter.selectDialogue(c[1],actors.get(x),actors);
						c[0]=c[0]-2;
					}
					else if(!fileExists)
					{
						scriptWriter.commonDialogue(actors.get(x),actors);
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
	public void addDialogue(Scanner scanner)
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
				   scriptWriter.questionOrAnswer(scanner,scriptWriter.villanQuesFile,scriptWriter.villanAnsFile,scriptWriter.villanQuestion,scriptWriter.villanAnswer);
				   break;
				case 2:
				   scriptWriter.questionOrAnswer(scanner,scriptWriter.comedianQuesFile,scriptWriter.comedianAnsFile,scriptWriter.comedianQuestion,scriptWriter.comedianAnswer);
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
}