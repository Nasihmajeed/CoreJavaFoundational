package com.lxisoft.movie;
import java.io.*;  
import java.util.Scanner;  

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

public void writeTofile(String name)
{
	 try {
      FileWriter myWriter = new FileWriter("Script.csv",true);
      myWriter.write(name+" wins\n");
      myWriter.close();
      } catch (IOException e) {
      System.out.println("An error occurred."+e);
      e.printStackTrace();    }
}

public void readResult()
{
	try  
	{  
	FileInputStream fis=new FileInputStream("Script.csv");       
	Scanner sc=new Scanner(fis); 
	while(sc.hasNextLine())  
	{  System.out.println(sc.nextLine()); }
	} catch(IOException e)  
		{  e.printStackTrace();  }  
}

}