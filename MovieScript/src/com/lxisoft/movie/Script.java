package com.lxisoft.movie;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Script
{
	public ArrayList<Dialouge> villanDialouge = new ArrayList<Dialouge>();
	public ArrayList<Dialouge> comedianDialouge = new ArrayList<Dialouge>();

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
	public boolean fileExist(File file)
	{
		boolean exists = file.exists();
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
	public File createFile (boolean exists,File file)
	{
		if(!exists)
		{
			file = new File("D:\\Program Files\\workspace\\Projects\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\File\\"+file+".txt");
		}
		return file;
	}
	public void writeToFile(File file,Scanner scanner,ArrayList<Dialouge> dialougeArray)
	{
		try
		{
			ArrayList<Dialouge> dialouge;
			boolean isTrue = false;
			FileWriter fileWriter = new FileWriter(file,true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			do
			{
			isTrue = false;
			System.out.println("Press ==> 1.Add Dialouge 2.Read Dialouge 3.Back");
			int x = scanner.nextInt();
			switch(x)
			{
				case 1:
					System.out.println("Enter Dialouge");
					String dialogue = scanner.next();
					bufferedWriter.write(dialogue);
				    bufferedWriter.flush();
				    bufferedWriter.newLine();
				    isTrue = true;
				    break;
				case 2:
					dialouge = readFromFile(file,dialougeArray);
					print(dialouge);
					//clearArray(dialouge);
					isTrue = true;
					break;
				case 3:
				    bufferedWriter.close();
					break;
				default :
					System.out.println("!!! Select Options From Above !!!");
					break;
			}
		    }while(isTrue);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public ArrayList<Dialouge> readFromFile(File file,ArrayList<Dialouge> dialougeArray)
	{
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dia;
			while((dia = bufferedReader.readLine()) != null)
			{
				dialougeArray.add(new Dialouge());
				for(int i=0;i<dialougeArray.size();i++)
				{
					if(dialougeArray.get(i).getDialouge()==null)
					{
						dialougeArray.get(i).setDialouge(dia);
						break;
					}
				}
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return dialougeArray;
	}
	public void clearArray(ArrayList<Dialouge> dialouge)
	{
		
		for(int i=0;i<dialouge.size();i++)
		{
			dialouge.remove(i);
		}
	}
	public void print(ArrayList<Dialouge> dialouge)
	{
		for(int i=0;i<dialouge.size();i++)
		{
			System.out.println(dialouge.get(i).getDialouge());
		}
	}
}