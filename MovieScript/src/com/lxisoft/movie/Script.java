package com.lxisoft.movie;
import java.util.ArrayList;
import java.io.*;
public class Script 
{
	String scriptWriter = "christopher nolan";
	Comedian c=new Comedian();
	Villan v=new Villan();
	public void comedianDialogue()
	{
		for(int i=0;i<3;i++)
		{
			c.comedian.add(new Dialogue());
		}
		c.comedian.get(0).dialogue="hello";
		c.comedian.get(1).dialogue="whats your role in this movie ?";
		c.comedian.get(2).dialogue="i am the comedian ";
	}
	public void villanDialogue()
	{
		for(int i=0;i<3;i++)
		{
			v.villan.add(new Dialogue());
		}
		v.villan.get(0).dialogue="hai..";
		v.villan.get(1).dialogue="i am the villan ";
		v.villan.get(2).dialogue="whats your role in this movie";
	}
	public void writeToFile(File file,ArrayList<Dialogue>dialogueArray)
	{
		if(file.length()==0)
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
	}}
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