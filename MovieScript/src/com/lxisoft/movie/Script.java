package com.lxisoft.movie;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Script
{
	ArrayList<Dialouge> villanDialouge = new ArrayList<Dialouge>();
	ArrayList<Dialouge> comedianDialouge = new ArrayList<Dialouge>();

	File villanFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\villanDialouge.txt");
	File comedianFile = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\comedianDialouge.txt");

	public void setDialougeArrayList()
	{
		for(int i=0;i<5;i++)
		{
			villanDialouge.add(new Dialouge());
			comedianDialouge.add(new Dialouge());
		}
		villanDialouge.get(0).setDialouge("Hi");
		villanDialouge.get(1).setDialouge("Hi1");
		villanDialouge.get(2).setDialouge("Hi2");
		villanDialouge.get(3).setDialouge("Hi3");
		villanDialouge.get(4).setDialouge("Hi4");
	}
	public void writeToFile()
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
	public void readFromFile()
	{
		try
		{
			FileReader fileReader = new FileReader(villanFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dio;
			while((dio = bufferedReader.readLine()) != null)
			{
				System.out.println(dio);
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}