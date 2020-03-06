package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  

public class FileReppo
{

public void creatFile()
{
	File file =new File("Script.csv");
		try
		{ 	file.createNewFile();	}
	   	catch(Exception ex)
	   	{	System.out.println("* "+ex); }
}



public void readDialogue(int number,String name)
{
String line = null;  
String splitBy = ",";  
	try  
	{  
	
	BufferedReader br = new BufferedReader(new FileReader(name));  
		while ((line = br.readLine()) != null) 
			{  
				String[] dialouge = line.split(splitBy); 
				System.out.println(dialouge[number]);  
			}  
	} catch(IOException e)  
		{  e.printStackTrace();  }  
}

public void writeTofile(String name,String write)
{
	 try {
      FileWriter myWriter = new FileWriter(name,true);
      myWriter.write(write);
      myWriter.close();
      } catch (IOException e) {
      System.out.println("An error occurred."+e);
      e.printStackTrace();    }
}

}