package com.lxisoft.repository;
import com.lxisoft.movie.*;
import java.io.*;
import java.util.*;
public class FileRepository
{
	Random random = new Random();
	public void createRepository()
	{
		try
		{
			File fileOne = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v2//com//lxisoft//repository//IronManScript.csv");
			File fileTwo = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v2//com//lxisoft//repository//ThanosScript.csv");
			fileOne.createNewFile();
			fileTwo.createNewFile();	
		}
		catch(IOException e)
		{
			System.out.println("File Can't be created");
		}
	}

	public ArrayList<Dialogue> readFromScript(ArrayList<Dialogue> dialogueList,String file,int index)
	{
		String line = " ";
		String[] conversation;
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			if((line = br.readLine())!=null)
			{
				conversation = line.split(",");
				System.out.println("conversation"+conversation.length);
				for (int i=index,j=0;i<conversation.length + index;i++,j++) 
				{
					if((conversation[j]!=null) || (conversation[j].length()!= 0))
					{
						dialogueList.add(new Dialogue());
						dialogueList.get(i).setMovieDialogue(conversation[j]); //.trim();
						dialogueList.get(i).setMarkDialogue(true);	
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