package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;

import java.util.*;
import java.io.*;


public class ScriptWriter
{
 
Scanner sc=new Scanner(System.in);

private String writerName,line;	

final String romance="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\RomanticScr.CSV";


 final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.CSV";
 final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.CSV";
 final String action= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ActionScr.CSV";
	
  
	Director director=new Director();


 
	
	   ArrayList<Hero> heroo=new ArrayList<Hero>();
	   ArrayList<Heroine> heroinee=new ArrayList<Heroine>();
	   ArrayList<Comedian> comediann=new ArrayList<Comedian>();
	   ArrayList<Villain> villainn=new ArrayList<Villain>();
/*
	  ArrayList<String> romScr=new ArrayList<String>();
     ArrayList<String> emoScr=new ArrayList<String>();
     ArrayList<String> comScr=new ArrayList<String>();
     ArrayList<String> actScr=new ArrayList<String>();	
*/

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


public void startMovie(int genre)
{

//Casting the actors

heroo=director.castingTheHero();
heroinee=director.castingTheHeroine();
comediann=director.castingTheComedian();
villainn=director.castingTheVillain();


    System.out.println("\r\n");

director.printCharacters();
						  					  
			     try{
					    Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }									
       
	switch(genre)
            {
                 case 1 :      
                                        
        ArrayList<String> romScr =new ArrayList<String>();
          
          int i=0,j=0;

        try (BufferedReader br = new BufferedReader(new FileReader(romance))) 
         {
            while ((line=br.readLine()) != null && j<15) 
            {
                String[] cinema = line.split(",");
                String dialogue=cinema[0].trim();
                romScr.add(new String(dialogue));             
                 j++;
            }  
              for(int k=0;k<15;k++)
              {
              	System.out.println(heroo.get(i).getHeroName()+":"+heroo.get(i).getHeroCharName()+":"+romScr.get(k));
               System.out.println(heroinee.get(i).getHeroName()+":"+heroinee.get(i).getHeroCharName()+":"+romScr.get(k));
              }
                       
         }
        catch (IOException ioe)
         {
            ioe.printStackTrace();
         }


                      
							   break;
							   
				 case 2 : 
				 
							                          
													  try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException ex)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
			   
							   break;
				 
				 case 3 :
				
													 try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException ex)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
							  
							   break;
				case 4 :
				
				                                        try{
					                                         Thread.sleep(2000);
				                                           }
				                                catch(InterruptedException ex)
				                                          {
					                                         Thread.currentThread().interrupt();
				                                          }
				
				               break;
            }


}

}

