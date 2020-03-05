package com.lxisoft.repository;
import com.lxisoft.movie.*;
import java.io.*;
import java.util.*;
public class FileRepository
{
	Random random = new Random();
	//String pathOne = "C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//HeroScript.csv";
	//String pathTwo = "C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//VillainScript.csv";
	public void createRepository()
	{
		try
		{
			File fileOne = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//HeroScript.csv");
			File fileTwo = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//VillainScript.csv");
			fileOne.createNewFile();
			fileTwo.createNewFile();	
		}
		catch(IOException e)
		{
			System.out.println("File Can't be created");
		}
	}

	public void readFromHeroScript(ArrayList<Actor> actorList,int actorOne,int actorTwo,int dialogueOne,int dialogueTwo,String pathOne)
	{
		String line ="";
		try
		{
				FileReader fr = new FileReader(pathOne);
				BufferedReader br = new BufferedReader(fr);
				while((line = br.readLine())!= null)
				{
					String[] dialogue = line.split(",");
					System.out.println(dialogue[dialogueOne]);
				}
				br.close();
		}
		catch(IOException e)
		{
			System.out.println("Cannot Access File");

		}
	}
	public void readFromVillainScript(ArrayList<Actor> actorList,int actorOne,int actorTwo,int dialogueOne,int dialogueTwo,String pathTwo)
	{
		String line ="";
		try
		{
				FileReader fr = new FileReader(pathTwo);
				BufferedReader br = new BufferedReader(fr);
				while((line = br.readLine())!= null)
				{
					String[] dialogue = line.split(",");
					System.out.println(dialogue[dialogueTwo]);
				}
				br.close();
		}
		catch(IOException e)
		{
			System.out.println("Cannot Access File");

		}
	}

	// public int checkInstance(ArrayList<Actor> actorList,int actorOne,int actorTwo,int dialogueOne,int dialogueTwo)
	// {
	// 	if(actorList.get(actorOne) instanceof Heroism)
	// 	{

	// 	}
	// }
	// public void writeToFile()
	// {
	// 	try
	// 	{
	// 		FileWriter fw = new FileWriter("C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//Script.csv",true);
	// 		fw.write("hello ,");
	// 		fw.flush();
	// 		fw.close();
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("Cannot Access File");	
	// 	}	
	// }



}