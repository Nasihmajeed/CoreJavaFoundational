package com.lxisoft.scripts;

import java.io.*;
import java.util.*;


public class Script
{


public void niramScript()
{
    try{

  File file=new File("E:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\scripts\\NiramScr.txt");
	
	Scanner sc=new Scanner(file);	
 
      System.out.println("----------------------Script of Niram Movie :----------------------- ");
	  
	while( sc.hasNextLine() )
	    {
			String datasInFile=sc.nextLine();
		System.out.println(datasInFile);
	    }
          sc.close();		
     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }

}

}