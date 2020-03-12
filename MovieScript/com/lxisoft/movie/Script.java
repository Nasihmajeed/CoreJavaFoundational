package com.lxisoft.movie;
import  com.lxisoft.movie.*;
import java.util.*;
import java.io.*;
public class Script
{
	Scanner sc = new Scanner(System.in);
	private String scriptWriter = "Rahul";


	public void setScriptWriter(String scriptwriter)
	{
		this.scriptWriter = scriptwriter;
	}
	public String getScriptWriter()
	{
		return scriptWriter;
	}
	public ArrayList<Dialogue> readFromScript(File path)
	{
		String line = " ";
		String[] conversation;
		ArrayList<Dialogue> dialogueList = new ArrayList<Dialogue>();
		try
		{
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			if((line = br.readLine())!=null)
			{
				conversation = line.split(",");
				for (int i=0;i<conversation.length;i++) 
				{
					if((conversation[i]!=null) || (conversation[i].length()!= 0))
					{
						dialogueList.add(new Dialogue());
						dialogueList.get(i).setMovieDialogue(conversation[i]); //.trim();
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
	public void writeToScript(File path,String  dialogue)
	{
		try
		{
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(dialogue+",");
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Cannot Access File");
		}
	}
}
