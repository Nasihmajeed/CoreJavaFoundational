package com.lxisoft.scripts;

import com.lxisoft.cast.*;

import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;

import java.nio.file.Paths;


public class Script
{
	
static final String romance="E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\RomanticScr.txt";
static final String emotional= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\EmotionalScr.txt";
static final String comedy= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\ComedyScr.txt";

String line;


Characters c=new Characters();


public void selectScript(int genre)
{
	switch(genre)
	{

      case 1 :
	                 System.out.println("---------------------------------------------: Romantic Script :------------------------------------------------");
						 
						try{
                                  for(int i=0;i<=5;i++){
                                      line=Files.readAllLines(Paths.get(romance)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+1);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(romance)).get(i+2);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+3);
									                              System.out.println(line);
																  
																  
																  line=Files.readAllLines(Paths.get(romance)).get(i+4);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+5);
									                              System.out.println(line);
		 
					 
					 
					 System.out.println("---------------------------------------------: Emotional Scenes :------------------------------------------------"); 
						 
                                      line=Files.readAllLines(Paths.get(emotional)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+1);
									                              System.out.println(line);
			 
					 System.out.println("---------------------------------------------: Comedy Scenes :------------------------------------------------");
					 
                                      line=Files.readAllLines(Paths.get(comedy)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+1);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(comedy)).get(i+2);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+3);
									                              System.out.println(line);
							
								  }
						}
		                catch(IOException e)
		                     {		 
	                          e.printStackTrace();
		                     }	 	 
						 
						 
					 
					 
					 
		                 break;
	  case 2 :
	               System.out.println("---------------------------------------------: Emotional Script :------------------------------------------------");
	                       
						   for(int i=0;i<5;i++){
							   
							   try{
                                      line=Files.readAllLines(Paths.get(emotional)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+1);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(emotional)).get(i+2);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+3);
									                              System.out.println(line);
																  
																  
																  line=Files.readAllLines(Paths.get(emotional)).get(i+4);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+5);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(emotional)).get(i+5);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+6);
									                              System.out.println(line);
							
							                                      line=Files.readAllLines(Paths.get(emotional)).get(i+6);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+7);
									                              System.out.println(line);
							
							
							                                     line=Files.readAllLines(Paths.get(emotional)).get(i+7);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+8);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(emotional)).get(i+8);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+9);
									                              System.out.println(line);
						           }
					
					          
		
		                catch(IOException e)
		                     {		 
	                          e.printStackTrace();
		                     }	 
						  
                System.out.println("---------------------------------------------: Romantic Scenes :------------------------------------------------");
						  
						   try{
                                      line=Files.readAllLines(Paths.get(romance)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+1);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(romance)).get(i+2);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+3);
									                              System.out.println(line);
																  
																  
																  line=Files.readAllLines(Paths.get(romance)).get(i+4);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+5);
									                              System.out.println(line);
							
						           }
					
					          
		
		                catch(IOException e)
		                     {		 
	                          e.printStackTrace();
		                     }	 
						   
						   					 System.out.println("---------------------------------------------: Comedy Scenes :------------------------------------------------");
					 
						 
						 
						 try{
                                      line=Files.readAllLines(Paths.get(comedy)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+6);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(comedy)).get(i+7);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+8);
									                              System.out.println(line);
							
						           }
					
					          
		
		                catch(IOException e)
		                     {		 
	                          e.printStackTrace();
		                     }	 
							   
						   }
						   
							 
					break;	   
	  case 3 :
	               System.out.println("---------------------------------------------: Comedy Script :------------------------------------------------");
	                      
                        for(int i=0;i<5;i++)
						{
						 try{
                                      line=Files.readAllLines(Paths.get(comedy)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+1);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(comedy)).get(i+2);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+3);
									                              System.out.println(line);
																  
																  
																  line=Files.readAllLines(Paths.get(comedy)).get(i+4);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+5);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(comedy)).get(i+5);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+6);
									                              System.out.println(line);
							
							                                      line=Files.readAllLines(Paths.get(comedy)).get(i+6);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+7);
									                              System.out.println(line);
							
							
							                                     line=Files.readAllLines(Paths.get(comedy)).get(i+7);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+8);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(comedy)).get(i+8);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(comedy)).get(i+9);
									                              System.out.println(line);
						           }
					
					          
		
		                catch(IOException e)
		                     {		 
	                          e.printStackTrace();
		                     }	 
						  
						   System.out.println("---------------------------------------------: Romantic Scenes :------------------------------------------------");
						  
						   try{
                                      line=Files.readAllLines(Paths.get(romance)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+2);
									                              System.out.println(line);
																  
																  line=Files.readAllLines(Paths.get(romance)).get(i+1);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i);
									                              System.out.println(line);
																  
																  
																  line=Files.readAllLines(Paths.get(romance)).get(i+3);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(romance)).get(i+4);
									                              System.out.println(line);
							
						           }
					
					          
		
		                catch(IOException e)
		                     {		 
	                          e.printStackTrace();
		                     }	 
	                   
					   System.out.println("---------------------------------------------: Emotional Scenes :------------------------------------------------");
	                       
						   try{
                                      line=Files.readAllLines(Paths.get(emotional)).get(i);
                                                                   System.out.println(line);   
                                      line=Files.readAllLines(Paths.get(emotional)).get(i+7);
									                              System.out.println(line);
						   }
						   catch(IOException e)
		                     {		 
	                          e.printStackTrace();
		                     }		
							
						}
						 
						   
	               break;
    }

}

}