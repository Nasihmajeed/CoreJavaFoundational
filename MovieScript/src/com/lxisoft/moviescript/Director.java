package com.lxisoft.moviescript;
import java.util.*;
import java.io.*;
public class Director
{
	private String name;
	ScriptWriter scriptWriter = new ScriptWriter();
	Script script = new Script();
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
	
	public void addDialogue(Scanner scanner)
	{
		try
		{
			boolean isTrue = true;
			do 
			{
		        System.out.println("1.Add to villian File\n2.Add to Comedian File\n3.Back\n");
			    int x = scanner.nextInt();
				isTrue = true;
				switch(x)
				{
				case 1:
				   questionOrAnswer(scanner,scriptWriter.villanQuesFile,scriptWriter.villanAnsFile,scriptWriter.villanQuestion,scriptWriter.villanAnswer);
				   break;
				case 2:
				   questionOrAnswer(scanner,scriptWriter.comedianQuesFile,scriptWriter.comedianAnsFile,scriptWriter.comedianQuestion,scriptWriter.comedianAnswer);
				   break;
				case 3:
					isTrue = false;
					System.exit(0);
					break;
				default :
				   System.out.println("You have entered the Wrong option\nPlease enter the Correct option");
				   break;
				}
		    }while(isTrue);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public void questionOrAnswer(Scanner sc,File quesFile,File ansFile,ArrayList<Dialogue> questionArray,ArrayList<Dialogue> answerArray)
	{
		try
		{
			boolean isTrue = false,fileExists = false;
			do
			{
				isTrue = false;
				fileExists = false;
				System.out.println("1.Question\n 2.Answer\n 3.Back\n");
				int x = sc.nextInt();
				switch(x)
				{
					case 1:
				   		quesFile = script.createFile(fileExists,quesFile);
				   		script.writeFile(quesFile,sc,questionArray);
						isTrue = true;
						break;
					case 2:
				   		ansFile = script.createFile(fileExists,ansFile);
				   		script.writeFile(ansFile,sc,answerArray);
						isTrue = true;
						break;
					case 3:
						System.exit(0);
						break;
					default :
						System.out.println("You have entered the Wrong option\nPlease enter the Correct option\n");
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