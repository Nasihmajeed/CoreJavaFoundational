package com.lxisoft.moviescript;
import java.util.*;
import java.io.*;
public class ScriptWriter
{
	File villanQuesFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\villanQuesFile.txt");
	File comedianQuesFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\comedianQuesFile.txt");
	File villanAnsFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\villanAnsFile.txt");
	File comedianAnsFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\comedianAnsFile.txt");
	Script script = new Script();
	public ArrayList<Dialogue> villanCommonDialouge = script.setArray();
    public ArrayList<Dialogue> comedianCommonDialouge = script.setArray();

    public ArrayList<Dialogue> villanQuestion = new ArrayList<Dialogue>();
	public ArrayList<Dialogue> comedianQuestion = new ArrayList<Dialogue>();

	public ArrayList<Dialogue> villanAnswer = new ArrayList<Dialogue>();
	public ArrayList<Dialogue> comedianAnswer = new ArrayList<Dialogue>();
	
	public void commonDialogue(Actors actor,ArrayList<Actors> actorsArray)
	{
		try
		{
			script.setVillanDialouge(villanCommonDialouge);
			script.setComedianDialouge(comedianCommonDialouge);
			script.commonConversation(actor,villanCommonDialouge,comedianCommonDialouge,actorsArray);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void selectDialogue(int x,Actors actor,ArrayList<Actors> actorsArray)
	{
		try
		{
			if(actor instanceof Comic)
			{
				int y = (int)(Math.random()*x);
				if(comedianQuestion.get(y).isTaken)
				{
					script.print(y,comedianQuestion,villanAnswer,actor,actorsArray);
					comedianQuestion.get(y).isTaken = false;
					villanAnswer.get(y).isTaken = false;
				}
			}
			if(actor instanceof Villanic)
			{
				int y = (int)(Math.random()*x);
				if(villanQuestion.get(y).isTaken)
				{
					script.print(y,villanQuestion,comedianAnswer,actor,actorsArray);
					villanQuestion.get(y).isTaken = false;
					comedianAnswer.get(y).isTaken = false;
				}
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public void questionOrAnswer(Scanner scanner,File questionFile,File answerFile,ArrayList<Dialogue> questionArray,ArrayList<Dialogue> answerArray)
	{
		try
		{
			boolean isTrue = false,fileExists = false;
			do
			{
				isTrue = false;
				fileExists = false;
				System.out.println("press ==> 1.Question 2.Answer 3.Back");
				int x = scanner.nextInt();
				switch(x)
				{
					case 1:
						fileExists = script.singleFileExists(questionFile);
				   		questionFile = script.createFile(fileExists,questionFile);
				   		script.writeToFile(questionFile,scanner,questionArray);
						isTrue = true;
						break;
					case 2:
						fileExists = script.singleFileExists(answerFile);
				   		answerFile = script.createFile(fileExists,answerFile);
				   		script.writeToFile(answerFile,scanner,answerArray);
						isTrue = true;
						break;
					case 3:
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