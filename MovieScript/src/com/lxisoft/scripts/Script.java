package com.lxisoft.scripts;

import java.io.*;

public class Script
{
	
	
	
public void scriptSelect()
{
	
 try{

  File file=new File();
 
  BufferedReader br=new BufferedReader(new FileReader(niramFile));
 
     	while(( st=br.readLine()) != null) throws IOException
	        {
		        System.out.println(st);
				
	        }	

     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }



	 
}

}