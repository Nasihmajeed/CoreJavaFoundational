package com.lxisoft.scripts;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.lxisoft.cast.*;

import java.util.*;
import java.io.*;



public class Script
{
	
final String romance="E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\RomanticScr.txt";
final String emotional= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\EmotionalScr.txt";
final String comedy= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\ComedyScr.txt";

Actors act=new Actors();


int n;    //line number
String line;

public void selectScript(int genre)
{
	switch(genre)
	{
	case 1 :  //romantic
	                      System.out.println("-----------------------------------Romantic Script--------------------------------------------");
	
	                            
					     try (BufferedReader romanticReader=new BufferedReader(new FileReader(new File(romance)))) {
                                                     for (n=0; n<5; n++)
													 {
														  line = romanticReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				
                                                                   try{
					                                                     Thread.sleep(2000);
				                                                        }
				                                                  catch(InterruptedException e)
				                                                        {
					                                                     Thread.currentThread().interrupt();
				                                                        } 
	                     
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 
						 
				System.out.println("-----------------------------------Emotional Script--------------------------------------------");
											
											try (BufferedReader emotionalReader=new BufferedReader(new FileReader(new File(emotional)))) {
                                                     for (n=0; n<2; n++)
													 {
														  line = emotionalReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				
                                                                   try{
					                                                     Thread.sleep(2000);
				                                                        }
				                                                  catch(InterruptedException e)
				                                                        {
					                                                     Thread.currentThread().interrupt();
				                                                        } 							
															System.out.println("\r\n");
						
    					 
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");			
				
				System.out.println("-----------------------------------Comedy Script--------------------------------------------");
											
											try (BufferedReader comedyReader=new BufferedReader(new FileReader(new File(comedy)))) {
                                                     for (n=0; n<3; n++)
													 {
														  line = comedyReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				 							
																		
									break;									
																		
	case 2 : 
	              //emotional
				  
                   System.out.println("-----------------------------------Romantic Script--------------------------------------------");
	
	                            
					     try (BufferedReader romanticReader=new BufferedReader(new FileReader(new File(romance)))) {
                                                     for (n=0; n<1; n++)
													 {
														  line = romanticReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				
                                                                   try{
					                                                     Thread.sleep(2000);
				                                                        }
				                                                  catch(InterruptedException e)
				                                                        {
					                                                     Thread.currentThread().interrupt();
				                                                        } 
	                     
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 
				System.out.println("-----------------------------------Emotional Script--------------------------------------------");
											
											try (BufferedReader emotionalReader=new BufferedReader(new FileReader(new File(emotional)))) {
                                                     for (n=0; n<10; n++)
													 {
														  line = emotionalReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				
                                                                   try{
					                                                     Thread.sleep(2000);
				                                                        }
				                                                  catch(InterruptedException e)
				                                                        {
					                                                     Thread.currentThread().interrupt();
				                                                        } 							
															
                         System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
															
				System.out.println("-----------------------------------Comedy Script--------------------------------------------");
											
											try (BufferedReader comedyReader=new BufferedReader(new FileReader(new File(comedy)))) {
                                                     for (n=0; n<2; n++)
													 {
														  line = comedyReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }

				  break;
				   
				   
	case 3 :
	                //comedy
	               
				   System.out.println("-----------------------------------Romantic Script--------------------------------------------");
	
	                            
					     try (BufferedReader romanticReader=new BufferedReader(new FileReader(new File(romance)))) {
                                                     for (n=0; n<2; n++)
													 {
														  line = romanticReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				
                                                                   try{
					                                                     Thread.sleep(2000);
				                                                        }
				                                                  catch(InterruptedException e)
				                                                        {
					                                                     Thread.currentThread().interrupt();
				                                                        } 
	                     
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 
				System.out.println("-----------------------------------Emotional Script--------------------------------------------");
											
											try (BufferedReader emotionalReader=new BufferedReader(new FileReader(new File(emotional)))) {
                                                     for (n=0; n<1; n++)
													 {
														  line = emotionalReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				
                                                                   try{
					                                                     Thread.sleep(2000);
				                                                        }
				                                                  catch(InterruptedException e)
				                                                        {
					                                                     Thread.currentThread().interrupt();
				                                                        } 							
												
                         System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");
						 System.out.println("\r\n");

 
 
												
				System.out.println("-----------------------------------Comedy Script--------------------------------------------");
											
											try (BufferedReader comedyReader=new BufferedReader(new FileReader(new File(comedy)))) {
                                                     for (n=0; n<15; n++)
													 {
														  line = comedyReader.readLine();
                                                System.out.println("Dialogue : "+line);									
													 }  
						 }
						catch(IOException e)
					     {
						 System.out.println("Something is wrong........File Reading Failed !!!");
						 System.out.println(e);
					     }
				   
				   break;
	
	}
		
}


}