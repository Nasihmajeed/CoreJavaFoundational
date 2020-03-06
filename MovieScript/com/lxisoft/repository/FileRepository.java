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

	public ArrayList<Dialogue> readFromScript(ArrayList<Dialogue> dialogueList,Dialogue dialogue,FileRepository repo,String path,int index)
	{
		String line =" ";
		String[] conversation = null;
		try
		{	
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			if((line = br.readLine())!= null)
			{
				conversation = line.split(",");
				//System.out.println("conversation="+conversation.length);
				for (int i=index,j=0;i<conversation.length + index;i++,j++) 
				{
					if((conversation[j]!=null) || (conversation[j].length()!= 0))
					{
						dialogueList.add(new Dialogue());
						dialogueList.get(i).setMovieDialogue(conversation[j]); //.trim();	
					}	
				}	
			}		
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("Cannot Access File");
		}
		return dialogueList;
	}
}