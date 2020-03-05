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

	public void readFromScript(Dialogue dialogue,ArrayList<Actor> actorList,int actorOne,int actorTwo,int dialogueOne,int dialogueTwo,String path)
	{
		String line =" ";
		String[] conversation = null;
		ArrayList<Dialogue> dialogueList = new ArrayList<Dialogue>();
		try
		{	
				FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);
				while((line = br.readLine())!= null)
				{
					conversation = line.split(",");
					dialogueList.add(new Dialogue());
					dialogueList.get(actorOne).setMovieDialogue(conversation[dialogueOne]);
					dialogueList.add(new Dialogue());
					dialogueList.get(actorTwo).setMovieDialogue(conversation[dialogueTwo]);		
				}
				System.out.println(dialogueList.get(actorOne).getMovieDialogue());	
				System.out.println(dialogueList.get(actorTwo).getMovieDialogue());
				br.close();
		}
		catch(IOException e)
		{
			System.out.println("Cannot Access File");

		}
	}
}