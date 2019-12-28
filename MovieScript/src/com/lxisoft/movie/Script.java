package com.lxisoft.movie;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Script
{
	public ArrayList<Dialouge> villanDialouge = new ArrayList<Dialouge>();
	public ArrayList<Dialouge> comedianDialouge = new ArrayList<Dialouge>();
	File villanFile = new File("villanDialouge.txt");
	File comedianFile = new File("comedianFile.txt");

	public ArrayList<Dialouge> setArray(ArrayList<Dialouge> dialouge)
	{
		for(int i=0;i<5;i++)
		{
			dialouge.add(new Dialouge());
		}
		return dialouge;
	}
	public void setVillanDialouge(ArrayList<Dialouge> dialouge)
	{
		dialouge.get(0).setDialouge("Hi0");
		dialouge.get(1).setDialouge("Hi1");
		dialouge.get(2).setDialouge("Hi2");
		dialouge.get(3).setDialouge("Hi3");
		dialouge.get(4).setDialouge("Hi4");
	}
	public void setComedianDialouge(ArrayList<Dialouge> dialouge)
	{
		dialouge.get(0).setDialouge("Hello0");
		dialouge.get(1).setDialouge("Hello1");
		dialouge.get(2).setDialouge("Hello2");
		dialouge.get(3).setDialouge("Hello3");
		dialouge.get(4).setDialouge("Hello4");
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
	public void writeToFile(File file,ArrayList<Dialouge> dialougearray)
	{
		if(file.length()==0)
		{
			try
			{
				FileWriter fileWriter = new FileWriter(file,false);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				for(Dialouge dial : dialougearray)
				{
					if(dial.getDialouge()!=null)
					{
					 bufferedWriter.write(dial.getDialouge());
					 bufferedWriter.newLine();
					}
			    }
			    bufferedWriter.flush();
			    bufferedWriter.close();
			    
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
	    }
	}
	public void readFromFile(File file)
	{
		ArrayList<Dialouge> test = new ArrayList<Dialouge>();
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dia;
			for(int i=0;i<10;i++)
			{
			test.add(new Dialouge());
		    }
			for(Dialouge dial : test)
			{
				while((dia = bufferedReader.readLine()) != null)
				{
					dial.setDialouge(dia);
					break;
				}
		    }
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}