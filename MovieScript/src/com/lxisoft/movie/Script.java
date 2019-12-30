package com.lxisoft.movie;
import java.util.ArrayList;
import java.io.*;
public class Script 
{
	String scriptWriter = "christopher nolan";
	public ArrayList<Dialogue>comedian= new ArrayList<Dialogue>();
	public ArrayList<Dialogue>villan= new ArrayList<Dialogue>();
	public void comedianDialogue()
	{
		for(int i=0;i<3;i++)
		{
			comedian.add(new Dialogue());
		}
		comedian.get(0).dialogue="hello";
		comedian.get(1).dialogue="whats your role in this movie ?";
		comedian.get(2).dialogue="i am the comedian ";
	}
	public void villanDialogue()
	{
		for(int i=0;i<3;i++)
		{
			villan.add(new Dialogue());
		}
		villan.get(0).dialogue="hai..";
		villan.get(1).dialogue="i am the villan ";
		villan.get(2).dialogue="whats your role in the movie ?";
	}
	public void writeToFile(File file,ArrayList<Dialogue>dialogueArray)
	{
		try{
		FileWriter fw =new FileWriter(file,false);
		BufferedWriter bw =new BufferedWriter(fw);
		for(Dialogue d : dialogueArray)
		{	
			bw.write(d.dialogue);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public ArrayList<Dialogue> readFromFile(File file)
	{
		ArrayList<Dialogue> readDialogue=new ArrayList<Dialogue>();
		try{
			FileReader fr =new FileReader(file);
			BufferedReader br =new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
					readDialogue.add(new Dialogue());
					for(int i=0;i<readDialogue.size();i++)
					{
						if(readDialogue.get(i).dialogue==null)
						readDialogue.get(i).dialogue=s;
					}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return readDialogue;
	}
}