package com.lxisoft.movie;
//import com.lxisoft.movie.*;
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



public void readDialogue(String name,ArrayList<Dialogue> dialouge)
{
String line = null; 

	try  
	{  
	
	BufferedReader br = new BufferedReader(new FileReader(name));  
		while ((line = br.readLine()) != null)
			{
			
				String[] conver = line.split(",");
				for(int i=0;i<conver.length;i++)
				{
					if(conver[i]!=null)
					{ 
						dialouge.add(new Dialogue());
						if((i+1)%2!=0)
						{
						dialouge.get(i).setId(1);
						dialouge.get(i).setdialogue(conver[i]);
						}
						else
						{
						dialouge.get(i).setId(2);	
						dialouge.get(i).setdialogue(conver[i]);	
						}	
					}
				}
			} 
			
			
	} catch(IOException e)  
		{  e.printStackTrace();  }  
}

public void writeTofile(String name,String write)
{
	 try {
      FileWriter myWriter = new FileWriter(name,true);
      myWriter.write(write+",");
      myWriter.close();
      } catch (IOException e) {
      System.out.println("An error occurred."+e);
      e.printStackTrace();    }
}

}