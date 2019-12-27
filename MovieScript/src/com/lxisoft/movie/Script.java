package com.lxisoft.movie;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Script
{
	ArrayList<Dialouge> villanDialouge = new ArrayList<Dialouge>();
	ArrayList<Dialouge> comedianDialouge = new ArrayList<Dialouge>();
	File villanFile = new File("villanDialouge.txt");
	File comedianFile = new File("comedianFile.txt");

	public void setDialougeArrayList()
	{
		for(int i=0;i<5;i++)
		{
			villanDialouge.add(new Dialouge());
			comedianDialouge.add(new Dialouge());
		}
		villanDialouge.get(0).setDialouge("Hi0");
		villanDialouge.get(1).setDialouge("Hi1");
		villanDialouge.get(2).setDialouge("Hi2");
		villanDialouge.get(3).setDialouge("Hi3");
		villanDialouge.get(4).setDialouge("Hi4");

		comedianDialouge.get(0).setDialouge("Hello0");
		comedianDialouge.get(1).setDialouge("Hello1");
		comedianDialouge.get(2).setDialouge("Hello2");
		comedianDialouge.get(3).setDialouge("Hello3");
		comedianDialouge.get(4).setDialouge("Hello4");
	}
	public boolean villanFileExist()
	{
		boolean exists = villanFile.exists();
		if(exists)
		{
			exists = true;
		}
		else if(!exists)
		{
			exists = false;
		}
		return exists;
	}
	public boolean comedianFileExist()
	{
		boolean exists = comedianFile.exists();
		if(exists)
		{
			exists = true;
		}
		else if(!exists)
		{
			exists = false;
		}
		return exists;
	}
	public File createVillanFile (boolean exists)
	{
		if(!exists)
		{
			villanFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\villanDialouge.txt");
		}
		return villanFile;
	}
	public File createComedianFile(boolean exists)
	{
		if(!exists)
		{
			comedianFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\comedianDialouge.txt");
		}
		return comedianFile;
	}
	public void writeToVillanFile(File villanFile)
	{
		try
		{
			FileWriter fileWriter = new FileWriter(villanFile,false);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for(Dialouge dial : villanDialouge)
			{
				 bufferedWriter.write(dial.getDialouge());
				 bufferedWriter.newLine();
		    }
		    bufferedWriter.flush();
		    bufferedWriter.close();
		    
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public void writeToComedianFile(File comedianFile)
	{
		try
		{
			FileWriter fileWriter = new FileWriter(comedianFile,false);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for(Dialouge dial : comedianDialouge)
			{
				 bufferedWriter.write(dial.getDialouge());
				 bufferedWriter.newLine();
		    }
		    bufferedWriter.flush();
		    bufferedWriter.close();
		    
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }	
	}
	public void readFromFile(File file)
	{
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dia;
			while((dia = bufferedReader.readLine()) != null)
			{
				System.out.println(dia);
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}