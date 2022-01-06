package com.lxisoft.factors;

import java.io.*;
import java.io.FileReader; 
import java.util.Scanner;
import com.lxisoft.game.Forest;
import java.io.Writer; 
import com.lxisoft.game.*;
public class FileRepository {

    File file =new File("Animal.txt");
	
	
	
	public void createFile()
	{
		 
			try
			{ 	file.createNewFile();	
			
				System.out.println("File Created. ");
			}
			   catch(Exception ex)
			   {	System.out.println("* "+ex); }
	}
	
	public void writeTofile()
	{
		 try {
			 Forest f = new Forest();
		  Writer out = new FileWriter("Animal.txt");
		 BufferedWriter bw = new BufferedWriter(out);
		 //Writer.write(f.animalsList.get(0).getName());
		  //myWriter.close();
			bw.write(f.animalsList.get(0).getName());
			bw.close();
		  } catch (IOException e) {
		  System.out.println("An error occurred."+e);
		  e.printStackTrace();    }
	}
	
	public void readResult()
	{
		try  
		{  
		  
		{  System.out.println(sc.nextLine()); }
		} catch(IOException e)  {

		} 
	}
	
	}    

