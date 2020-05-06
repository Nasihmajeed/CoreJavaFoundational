package com.lxisoft.moviescript;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Script
{
	
	public ArrayList<Dialogue> setArray()
	{
		ArrayList<Dialogue> dialouge = new ArrayList<Dialogue>();
		for(int i=0;i<4;i++)
		{
			dialouge.add(new Dialogue());
		}
		return dialouge;
	}
	public void setVillanDialouge(ArrayList<Dialogue> dialouge)
	{
		dialouge.get(0).setDialogue("Hi");
		dialouge.get(1).setDialogue("Who are You ?");
		dialouge.get(2).setDialogue("Hello");
		dialouge.get(3).setDialogue("Iam Villan");
	}
	public void setComedianDialouge(ArrayList<Dialogue> dialouge)
	{
		dialouge.get(0).setDialogue("Hi");
		dialouge.get(1).setDialogue("Who are you ?");
		dialouge.get(2).setDialogue("Hello");
		dialouge.get(3).setDialogue("Iam Comedian");
	}
	public void commonConversation(Actors actor,ArrayList<Dialogue> vDialouge,ArrayList<Dialogue> cDialouge,ArrayList<Actors> actorArray)
	{
		if(actor instanceof Villan)
		{
			for(int i=0;i<vDialouge.size()-2;i++)
			{
				System.out.println(((Villan)actorArray.get(0)).getName()+" : "+vDialouge.get(i).getDialogue());
				System.out.println(((Comedian)actorArray.get(1)).getName()+" : "+cDialouge.get(i+2).getDialogue());
			}
	    }
	    else if(actor instanceof Comedian)
	    {
	    	for(int i=0;i<cDialouge.size()-2;i++)
			{
				System.out.println(((Comedian)actorArray.get(1)).getName()+" : "+cDialouge.get(i).getDialogue());
				System.out.println(((Villan)actorArray.get(0)).getName()+" : "+vDialouge.get(i+2).getDialogue());
			}	
	    }
	}
	public int[] limitOfDialogue(int a,int b,int c,int d,boolean isTrue)
	{
		int[] x= new int[2];
		if(isTrue)
		{
		ArrayList<Integer> limit = new ArrayList<Integer>();
		limit.add(a);
		limit.add(b);
		limit.add(c);
		limit.add(d);

		Collections.sort(limit);
		x[0] = limit.get(0)*4;
		x[1] = limit.get(0);
	    }
	    else if(!isTrue)
	    {
	    	x[0] = 8;
	    	x[1] = 4;
	    }
		return x;
	}
	public boolean fileExist(ScriptWriter sw,File villanQuestionFile,File comedianQuestionFile,File villanAnswerFile,File comedianAnswerFile)
	{
		boolean villanQuestionFileExists = villanQuestionFile.exists();
		boolean comedianQuestionFileExists = comedianQuestionFile.exists();
		boolean villanAnserFileExists = villanAnswerFile.exists();
		boolean comedianAnswerFileExists = comedianAnswerFile.exists();
		boolean exists;
		if(villanQuestionFileExists && comedianQuestionFileExists && villanAnserFileExists && comedianAnswerFileExists)
		{
			exists = true;
			readFromFile(sw.comedianQuesFile,sw.comedianQuestion);
			readFromFile(sw.villanAnsFile,sw.villanAnswer);
			readFromFile(sw.villanQuesFile,sw.villanQuestion);
			readFromFile(sw.comedianAnsFile,sw.comedianAnswer);
		}
		else
		{
			exists = false;
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
		try
		{
			if(!exists)
			{
				file.createNewFile();
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		return file;
	}
	public void writeToFile(File file,Scanner scanner,ArrayList<Dialogue> dialougeArray)
	{
		try
		{
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
					dialougeEntry(file,scanner,bufferedWriter);
				    isTrue = true;
				    break;
				case 2:
					readDialoge(file,dialougeArray);
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
	public void readDialoge(File file,ArrayList<Dialogue> dialougeArray)
	{
		try{
			ArrayList<Dialogue> dialouge;
			dialouge = readFromFile(file,dialougeArray);
			printDialouge(dialougeArray);
			clearArray(dialougeArray);
			clearArray(dialouge);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void dialougeEntry(File file,Scanner scanner,BufferedWriter bufferedWriter)
	{
		try{
			System.out.println("Enter Dialouge");
			String dia = scanner.nextLine();
			dia = scanner.nextLine();
			createNewLine(file,bufferedWriter);
			bufferedWriter.write(dia);
		    bufferedWriter.flush();
		}
		catch(Exception e){
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
	public ArrayList<Dialogue> readFromFile(File file,ArrayList<Dialogue> dialougeArray)
	{
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dia;
			while((dia = bufferedReader.readLine()) != null)
			{
				dialougeArray.add(new Dialogue());
				for(int i=0;i<dialougeArray.size();i++)
				{
					if(dialougeArray.get(i).getDialogue()==null)
					{
						dialougeArray.get(i).setDialogue(dia);
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
	public void clearArray(ArrayList<Dialogue> dialouge)
	{
		int x = dialouge.size();
		for(int i=0;i<x;i++)
		{
			dialouge.remove(0);
		}
	}
	public void printDialouge(ArrayList<Dialogue> dialouge)
	{
		for(int i=0;i<dialouge.size();i++)
		{
			System.out.println(dialouge.get(i).getDialogue());
		}
	}
	public void print(int x,ArrayList<Dialogue> dialouge1,ArrayList<Dialogue> dialouge2,Actors actor,ArrayList<Actors> actorsArray)
	{
		if(actor instanceof Comic)
		{
			System.out.println(((Comedian)actorsArray.get(1)).getName()+" : "+dialouge1.get(x).getDialogue());
			System.out.println(((Villan)actorsArray.get(0)).getName()+" : "+dialouge2.get(x).getDialogue());
	    }
	    else if(actor instanceof Villanic)
	    {
	    	System.out.println(((Villan)actorsArray.get(0)).getName()+" : "+dialouge1.get(x).getDialogue());
			System.out.println(((Comedian)actorsArray.get(1)).getName()+" : "+dialouge2.get(x).getDialogue());	
	    }
	}
}
