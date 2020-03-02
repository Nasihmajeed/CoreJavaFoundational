package com.lxisoft.game;
import java.io.*;  
import java.util.Scanner;  

public class FileReppo
{

public void creatFile()
{
	File file =new File("Result.txt");
		try
		{ 	file.createNewFile();	}
	   	catch(Exception ex)
	   	{	System.out.println("* "+ex); }
}

public void writeTofile(String name)
{
	 try {
      FileWriter myWriter = new FileWriter("Result.txt",true);
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
	FileInputStream fis=new FileInputStream("Result.txt");       
	Scanner sc=new Scanner(fis); 
	while(sc.hasNextLine())  
	{  System.out.println(sc.nextLine()); }
	} catch(IOException e)  
		{  e.printStackTrace();  }  
}

}