package com.lxisoft.scripts;

import java.io.*;

public class Script
{
	
String st;

final String niramRomantic="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\NiramScrRomantic.txt";

final String niramComedy="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\NiramScrComedy.txt";  
  
final String spRomantic="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\SpScrRomantic.txt";

final String spComedy="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\SpScrComedy.txt";    
  
final String knRomantic="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\KnScrRomantic.txt";

final String knComedy="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\KnScrComedy.txt";    
  
                //Romantic Script from the Movie Niram
  
  public void niramRomanticScript() 
  {
	System.out.println("----------------------------------------------Romantic Script from Niram Movie :------------------------------------------------------------- ");
	
  
  try{

  File niramFile=new File(niramRomantic);
 
  BufferedReader br=new BufferedReader(new FileReader(niramFile));
 
     	while(( st=br.readLine()) != null) throws IOException
	        {
		        System.out.println(st);
				
	        }	
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }

}


                 //Comedy Script from the Movie Niram 

public void niramComedyScript() 
  {
	System.out.println("----------------------------------------------Comedy Script from Niram Movie :------------------------------------------------------------- ");
	
  
  try{

  File niramFile=new File(niramComedy);
 
  BufferedReader br=new BufferedReader(new FileReader(niramFile));
 
     	while(( st=br.readLine()) != null) throws IOException
	        {
		        System.out.println(st);
	        }
			
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }

}





  public void spRomanticScript() 
  {
	System.out.println("----------------------------------------------Romantic Script from Soorari Pottru Movie :------------------------------------------------------------- ");
	
  
  try{

  File spFile=new File(spRomantic);
 
  BufferedReader br=new BufferedReader(new FileReader(spFile));
 
     	while(( st=br.readLine()) != null) throws IOException
	        {
		        System.out.println(st);
	        }	
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }

}



  public void spComedyScript() 
  {
	System.out.println("----------------------------------------------Comedy Script from Soorari Pottru Movie :------------------------------------------------------------- ");
	
  
  try{

  File spFile=new File(spComedy);
 
  BufferedReader br=new BufferedReader(new FileReader(spFile));
 
     	while(( st=br.readLine()) != null) throws IOException
	        {
		        System.out.println(st);
	        }	
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }

}




  public void knRomanticScript() 
  {
	System.out.println("----------------------------------------------Romantic Script from Kumbalangi-Nights Movie :------------------------------------------------------------- ");
	
  
  try{

  File knFile=new File(knRomantic);
 
  BufferedReader br=new BufferedReader(new FileReader(knFile));
 
     	while(( st=br.readLine()) != null) throws IOException
	        {
		        System.out.println(st);
	        }	
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }

}


  public void knComedyScript() 
  {
	System.out.println("----------------------------------------------Comedy Script from Kumbalangi-Nights Movie :------------------------------------------------------------- ");
	
  
  try{

  File knFile=new File(knComedy);
 
  BufferedReader br=new BufferedReader(new FileReader(knFile));
 
     	while(( st=br.readLine()) != null) throws IOException
	        {
		        System.out.println(st);
	        }	
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
     }
    catch(FileNotFoundException e)
     {
      System.out.println("An Error has occured !!!!!!!!!!");
	  e.printStackTrace();
     }

}

}