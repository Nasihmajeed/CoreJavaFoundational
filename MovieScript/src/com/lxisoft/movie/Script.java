package com.lxisoft.movie;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Script
{
	public ArrayList<Dialouge> villanQuestion = new ArrayList<Dialouge>();
	public ArrayList<Dialouge> comedianQuestion = new ArrayList<Dialouge>();

	public ArrayList<Dialouge> villanAnswer = new ArrayList<Dialouge>();
	public ArrayList<Dialouge> comedianAnswer = new ArrayList<Dialouge>();

	public ArrayList<Dialouge> villanCommonDialouge = new ArrayList<Dialouge>();
	public ArrayList<Dialouge> comedianCommonDialouge = new ArrayList<Dialouge>();

	public ArrayList<Dialouge> setArray(ArrayList<Dialouge> dialouge)
	{
		for(int i=0;i<4;i++)
		{
			dialouge.add(new Dialouge());
		}
		return dialouge;
	}
	public void setVillanDialouge(ArrayList<Dialouge> dialouge)
	{
		dialouge.get(0).setDialouge("Hello");
		dialouge.get(1).setDialouge("Who are You ?");
		dialouge.get(2).setDialouge("Hi");
		dialouge.get(3).setDialouge("Iam Villan");
	}
	public void setComedianDialouge(ArrayList<Dialouge> dialouge)
	{
		dialouge.get(0).setDialouge("Hello");
		dialouge.get(1).setDialouge("Who are you ?");
		dialouge.get(2).setDialouge("Hi");
		dialouge.get(3).setDialouge("Iam Comedian");
	}
	public void commonConversation(Actors actor,ArrayList<Dialouge> vDialouge,ArrayList<Dialouge> cDialouge)
	{
		setArray(vDialouge);
		setArray(cDialouge);
		setVillanDialouge(vDialouge);
		setComedianDialouge(cDialouge);
		if(actor instanceof Villan)
		{
			for(int i=0;i<vDialouge.size()-2;i++)
			{
				System.out.println("Villan : "+vDialouge.get(i).getDialouge());
				System.out.println("Comedian : "+cDialouge.get(i+2).getDialouge());
			}
	    }
	    else if(actor instanceof Comedian)
	    {
	    	for(int i=0;i<cDialouge.size()-2;i++)
			{
				System.out.println("Comedian : "+cDialouge.get(i).getDialouge());
				System.out.println("Villan : "+vDialouge.get(i+2).getDialouge());
			}	
	    }
	}
	public void questionOrAnswer(Scanner scanner,File questionFile,File answerFile,ArrayList<Dialouge> questionArray,ArrayList<Dialouge> answerArray)
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
						fileExists = singleFileExists(questionFile);
				   		questionFile = createFile(fileExists,questionFile);
				   		writeToFile(questionFile,scanner,questionArray);
						isTrue = true;
						break;
					case 2:
						fileExists = singleFileExists(answerFile);
				   		answerFile = createFile(fileExists,answerFile);
				   		writeToFile(answerFile,scanner,answerArray);
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
	public boolean fileExist(File villanQuestionFile,File comedianQuestionFile,File villanAnswerFile,File comedianAnswerFile)
	{
		boolean villanQuestionFileExists = villanQuestionFile.exists();
		boolean comedianQuestionFileExists = comedianQuestionFile.exists();
		boolean villanAnserFileExists = villanAnswerFile.exists();
		boolean comedianAnswerFileExists = comedianAnswerFile.exists();
		boolean exists = false;

		if(villanQuestionFileExists && comedianQuestionFileExists && villanAnserFileExists && comedianAnswerFileExists)
		{
			exists = true;
		}
		return exists;
	}
	public boolean singleFileExists(File file)
	{
		boolean exist = file.exists();
		return exist;
	}
	public File createFile (boolean exists,File file)
	{
		if(!exists)
		{
			file = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\"+file+".txt");
		}
		return file;
	}
	public void writeToFile(File file,Scanner scanner,ArrayList<Dialouge> dialougeArray)
	{
		try
		{
			ArrayList<Dialouge> dialouge;
			boolean isTrue = false;
			FileWriter fileWriter = new FileWriter(file,true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			do
			{
			isTrue = false;
			System.out.println("Press ==> 1.Add Dialouge 2.Read Dialouge 3.Back");
			int x = scanner.nextInt();
			switch(x)
			{
				case 1:
					System.out.println("Enter Dialouge");
					String dia = scanner.nextLine();
					dia = scanner.nextLine();
					createNewLine(file,bufferedWriter);
					bufferedWriter.write(dia);
				    bufferedWriter.flush();
				    isTrue = true;
				    break;
				case 2:
					dialouge = readFromFile(file,dialougeArray);
					print(dialouge);
					clearArray(dialougeArray);
					clearArray(dialouge);
					isTrue = true;
					break;
				case 3:
				    bufferedWriter.close();
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
	public void createNewLine(File file,BufferedWriter bw)
	{
		try
		{
		if(file.length()>0)
		{
			bw.newLine();
		}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public ArrayList<Dialouge> readFromFile(File file,ArrayList<Dialouge> dialougeArray)
	{
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dia;
			while((dia = bufferedReader.readLine()) != null)
			{
				dialougeArray.add(new Dialouge());
				for(int i=0;i<dialougeArray.size();i++)
				{
					if(dialougeArray.get(i).getDialouge()==null)
					{
						dialougeArray.get(i).setDialouge(dia);
						break;
					}
				}
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return dialougeArray;
	}
	public void clearArray(ArrayList<Dialouge> dialouge)
	{
		int x = dialouge.size();
		for(int i=0;i<x;i++)
		{
			dialouge.remove(0);
		}
	}
	public void print(ArrayList<Dialouge> dialouge)
	{
		for(int i=0;i<dialouge.size();i++)
		{
			System.out.println("Dialouge : "+dialouge.get(i).getDialouge());
		}
	}
}