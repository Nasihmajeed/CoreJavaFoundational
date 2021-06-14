package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ScriptWriter
{
 
Scanner sc=new Scanner(System.in);

private String writerName,line;	

static final String romance="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\RomanticScr.CSV";
static final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.CSV";
static final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.CSV";
static final String action= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ActionScr.CSV";
	
	
	   ArrayList<Hero> heroo=new ArrayList<Hero>();
	   ArrayList<Heroine> heroinee=new ArrayList<Heroine>();
	   ArrayList<Comedian> comediann=new ArrayList<Comedian>();
	   ArrayList<Villain> villainn=new ArrayList<Villain>();

	
	  ArrayList<String> romScr=new ArrayList<String>();
     ArrayList<String> emoScr=new ArrayList<String>();
     ArrayList<String> comScr=new ArrayList<String>();
     ArrayList<String> actScr=new ArrayList<String>();	


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


	
public void writingTheScript(int genre,ArrayList<Hero> heroo,ArrayList<Heroine> heroinee,ArrayList<Comedian> comediann,ArrayList<Villain> villainn)
{
       
	switch(genre)
            {
                 case 1 : //romantic script

                                 try{     
   
   
	// BufferedReader bact=new BufferedReader(new FileReader(action));
	
	
                BufferedReader brom=new BufferedReader(new FileReader(romance));
                                 while( (line=brom.readLine()) != null)
                                    {
                 	                 romScr.add(line);
                                    }

                BufferedReader bemo=new BufferedReader(new FileReader(emotional));
                                 while( (line=bemo.readLine()) != null)
                                    {
                                    	if(line.length()<50)
                                    	{
                                         romScr.add(line);		
                                    	}
                                     
                                    }

                BufferedReader bcom=new BufferedReader(new FileReader(comedy));
                                 while( (line=bcom.readLine()) != null ) 
                                    {
                                    	if(line.length()<50)
                                    	{
                                         romScr.add(line);		
                                    	}
                                     
                                    }

                  for(String a:romScr)
                  {
                      System.out.println(a);
                  }
                            
                       
                            }
                          

                          }
                          catch(IOException io)
                          {
                            io.printStackTrace();
                          }




                          try{
                          	Thread.sleep(2000);
                          }
                          catch(InterruptedException ex)
				                         {
					                       Thread.currentThread().interrupt();
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

/*

public long noOflinesRomFile(String romanceFile) 
{
   long lines = 0;

      try 
      {
          lines = Files.lines(Paths.get(romanceFile)).count();
      } 
      catch (IOException e) 
      {
          e.printStackTrace();
      }
      
    return lines;
  */


}