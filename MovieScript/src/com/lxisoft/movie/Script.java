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
			c.comedianQns.add(new Dialogue());
		}
		c.comedianQns.get(0).dialogue="hello";
		c.comedianQns.get(1).dialogue="whats your role in this movie ?";
		c.comedianQns.get(2).dialogue="i am the comedian ";
	}
	public void villanDialogue()
	{
		for(int i=0;i<3;i++)
		{
			v.villanQns.add(new Dialogue());
		}
		v.villanQns.get(0).dialogue="hai..";
		v.villanQns.get(1).dialogue="i am the villan ";
		v.villanQns.get(2).dialogue="whats your role in this movie";
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
	public ArrayList<Dialogue> commonDialogue()
	{
	  ArrayList<Dialogue> commonD =new ArrayList<Dialogue>();
		for(int i=0;i<4;i++)
		{
		commonD.add(new Dialogue());
		}
			commonD.get(0).dialogue="hai";
			commonD.get(1).dialogue="hello";
			commonD.get(2).dialogue="how are you?";
			commonD.get(3).dialogue="i am fine";
			return commonD;

	}
	
}