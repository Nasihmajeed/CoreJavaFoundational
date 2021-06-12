package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;
/*
import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
*/
//create 3 arrayLists for saving heroname,heroinename and comedian name ---- their charname.....

// Ask for Movie Genre at the beginning itself

//add names of all to arrayLists and also to setheroCharName,.......in Characters Class

//add 

//enter names and characters and print them to the user

//save each script to file and read each dialogues from file and add to an arrayListand get dialogues using--- random----get(Random variable) 
import java.util.*;

public class ScriptWriter
{
 
Scanner sc=new Scanner(System.in);
/*	
static final String romance="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\RomanticScr.txt";
static final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.txt";
static final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.txt";
static final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ActionScr.txt";
	
	long numOfLines=0;

	
	ArrayList<Hero> heroo=new ArrayList<Hero>();
	ArrayList<Heroine> heroinee=new ArrayList<Heroine>();
	ArrayList<Comedian> comediann=new ArrayList<Comedian>();
	ArrayList<Villain> villainn=new ArrayList<Villain>();

	
	ArrayList<String> romDialog=new ArrayList<String>();
    ArrayList<String> emoDialog=new ArrayList<String>();
    ArrayList<String> comDialog=new ArrayList<String>();	
	
	BufferedReader brom=new BufferedReader(new FileReader(romance));
	BufferedReader bemo=new BufferedReader(new FileReader(emotional));
	BufferedReader bcom=new BufferedReader(new FileReader(comedy));


								                 Long a=numberOfLinesInRomanceFile();
												 Long b=numberOfLinesInEmotionalFile();
												 Long c=numberOfLinesInComedyFile();

*/
String writerName;

public void writerDetails()
{
System.out.println("Enter the name of the ScriptWriter");
setWriterName(sc.next());
}

public void setWriterName(String writerName)
{
this.writerName=writerName;
}


public String getWriterName()
{
	return writerName;
} 

/*
	
public void writingTheScript(int genre , ArrayList<Hero> , ArrayList<Heroine> , ArrayList<Comedian> , ArrayList<Villain>)
{
	switch(genre)
            {
                 case 1 : 
                                             
							                                 try{
					                                                 Thread.sleep(2000);
				                                                  }
				                                       catch(InterruptedException e)
				                                                   {
					                                                  Thread.currentThread().interrupt();
				                                                  }
	                   
							   break;
							   
				 case 2 : 
				 
							                          
													  try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
			   
							   break;
				 
				 case 3 :
				
													 try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
							  
							   break;
				case 4 :
				
				                                        try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException e)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
				
				               break;
            }

}


public long numberOfLinesInRomanceFile()
{
	
	
	try{
	         numOfLines=Files.lines(Paths.get(romance)).count();	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return numOfLines;
}


public long numberOfLinesInEmotionalFile()
{
	
	
	try{
	         numOfLines=Files.lines(Paths.get(emotional)).count();	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return numOfLines;
}


public long numberOfLinesInComedyFile()
{
	
	
	try{
	         numOfLines=Files.lines(Paths.get(comedy)).count();	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	return numOfLines;
}

*/
}

