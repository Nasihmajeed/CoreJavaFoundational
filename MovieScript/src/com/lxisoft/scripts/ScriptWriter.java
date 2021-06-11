package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;

import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

//create 3 arrayLists for saving heroname,heroinename and comedian name ---- their charname.....

// Ask for Movie Genre at the beginning itself

//add names of all to arrayLists and also to setheroCharName,.......in Characters Class

//add 

//enter names and characters and print them to the user

//save each script to file and read each dialogues from file and add to an arrayListand get dialogues using--- random----get(Random variable) 


public class ScriptWriter
{
 /* 
Scanner sc=new Scanner(System.in);
	
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
	                            
                          try{
							               //Reading Complete Data from Romantic Script
							  
							         
								 
								         while( (line=brom.readLine()) != null)
								             {
									            romDialog.add(line);
								             }
											 
										//Reading partial data from Emotional Script
											 
								   
							
                                 for(int i=0 ; i<b ; i++)
								             {	 
		          						  while( ( (line=bremo.readLine()) != null) && i<b )
					     			             {
						    			            emoDialog.add(line);
							  	                 }
								             }
								         
									//Reading partial data from ComedyScript
											 
								    
							
                                 for(int i=0 ; i<c ; i++)
								             {	 
		          						  while( ( (line=brcom.readLine()) != null) && i<c )
					     			             {
						    			            comDialog.add(line);
							  	                 }
								             }
											 
											 
						       }  								
							catch(IOException e)
							   {
								e.printStackTrace();
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

