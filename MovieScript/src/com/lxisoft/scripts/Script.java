package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;



import java.util.*;
import java.io.*;


public class Script
{
 
 Scanner sc=new Scanner(System.in);

 private String writerName,writerLanguage,line;	

 final String romance="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\RomanticScr.CSV";
 /*

 final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.CSV";
 final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.CSV";
 final String action= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ActionScr.CSV";
	*/
  
	Director director=new Director();

	   ArrayList<String> movieScript=new ArrayList<String>();	

     ArrayList<Actor> allActors;

    public void writerDetails()
     {
           System.out.println("Enter the name of the ScriptWriter");
           setWriterName(sc.next());
                            
           System.out.println("Enter the Language of the ScriptWriter");
           setWriterLanguage(sc.next());
     }



    public void setWriterName(String writerName)
     {
       this.writerName=writerName;
     }




     public String getWriterName()
      {
	   return writerName;
      } 



     public void setWriterLanguage(String writerLanguage)
     {
       this.writerLanguage=writerLanguage;
     }




     public String getWriterLanguage()
      {
	   return writerLanguage;
      } 


  public void startMovie(int genre)
    {

//Casting the actors

allActors=director.castingTheActors();

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


                                   int j=0;
                                   int numOfHero=director.getNumberOfHero();
                                   int numOfHeroinee=director.getNumberOfHeroine();
                                   int numOfComedian=director.getNumberOfComedian();
                                   int numOfVillain=director.getNumberOfVillain();

                               try{
                     	BufferedReader brom=new BufferedReader(new FileReader(romance));
                                	while((line=brom.readLine()) != null)
                                	{
                               		
                                  movieScript.add(new String(line));
                                	}


                               	brom=new BufferedReader(new FileReader(emotional));

                               	while((line=brom.readLine()) != null)   
                               	{
                                 
                                      movieScript.add(new String(line));  
                               		
                               	}
                                  
                                
                                brom=new BufferedReader(new FileReader(comedy));

                               	while((line=brom.readLine()) != null)   
                                {
                                  
                                      movieScript.add(new String(line));  
                                  
                                }

                               }
                               catch(IOException ioe)
                               {

                               	ioe.printStackTrace();
                               
                               }        
                                
                              

            
                              
                              for(int i=0;i<numOfHero;i++)
                              {
                                  if( ( ( allActors.get(i) ) instanceof Hero) && (j<movieScript.size()))
                                     {
System.out.println(allActors.get(i).getHeroName()+":"+allActors.get(i).getHeroCharName()+":"+movieScript.get(j));     
                                     }
                                  else if( ( ( allActors.get(i) ) instanceof Heroine) && (j<movieScript.size()))
                                     {
System.out.println(allActors.get(i).getHeroineName()+":"+allActors.get(i).getHeroineCharName()+":"+movieScript.get(j));
                                     }
                               else if( ( ( allActors.get(i) ) instanceof Comedian) && (j<movieScript.size()))
                                     {
System.out.println(allActors.get(i).getComedianName()+":"+allActors.get(i).getComedianCharName()+":"+movieScript.get(j));
                                     }

                                 j++;

                              }
                               
                               
                              
                                                    
							   break;
							   
				 case 2 : System.out.println("script");
							                   
			   
							   break;
				 
				 case 3 :
				                  System.out.println("script");
				
							   break;
				case 4 :
				                System.out.println("script");
				
				               break;
   }

}
}








