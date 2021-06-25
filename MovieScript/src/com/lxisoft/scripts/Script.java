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
   final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.CSV";
   final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.CSV";
 //  final String action= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ActionScr.CSV";
  
	
        
       ArrayList<RomanceScript> romanceScene=new ArrayList<RomanceScript>();
       ArrayList<EmotionalScript> emotionalScene=new ArrayList<EmotionalScript>(); 
   //    ArrayList<ActionScript> actionScene=new ArrayList<ActionScript>(); 
	   ArrayList<ComedyScript> comedyScene=new ArrayList<ComedyScript>();

       Director director=new Director();

       ArrayList<Actor> allActors;
                                       
   //Getting the number of each actors in the movie from the Director   
   int numOfHero=director.getNumberOfHero();
   int numOfHeroine=director.getNumberOfHeroine();
   int numOfComedian=director.getNumberOfComedian();
   int numOfVillain=director.getNumberOfVillain();


   int j=0;

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

                /*  try{
					    Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }	
                 */

         switch(genre)
                     {
                 
                  case 1 : 
                           
                               try{

                 BufferedReader brom=new BufferedReader(new FileReader(romance));
                                while((line=brom.readLine()) != null)
                                	{
                                        String[] s1=line.split(":");
                                        String st=s1[0].trim();
                                        
                                        romanceScene.add(new RomanceScript());
                                        romanceScene.get(romanceScene.size()).setDialogue(st);   
                                	}

                               	brom=new BufferedReader(new FileReader(emotional));
                               	while((line=brom.readLine()) != null)   
                               	{        
                                               String[] s2=line.split(":");
                                               String str=s2[0].trim();
                                              
                                              emotionalScene.add(new EmotionalScript());
                                              emotionalScene.get(emotionalScene.size()).setDialogue(str);
                                          
                               	}
                                  
                                brom=new BufferedReader(new FileReader(comedy));
                               	while((line=brom.readLine()) != null)   
                                {      
                                     
                                              String[] s3=line.split(":");
                                              String stri=s3[0].trim();
                                             
                                              comedyScene.add(new ComedyScript());
                                              comedyScene.get(comedyScene.size()).setDialogue(stri);      
                                }

                               }
                               catch(IOException ioe)
                               {

                               	ioe.printStackTrace();
                               
                               }        
                                
                             
                              
                           //Romantic Scene between Hero and Heroine
            
                              
                              for(int i=0; i<allActors.size() ;i++)
                              {

                                do{

                                     if( ( ( allActors.get(i) ) instanceof Hero) )
                                     {
System.out.println(allActors.get(i).getHeroName()+":"+allActors.get(i).getHeroCharName()+":"+romanceScene.get(j).getDialogue());     
                                     }
                                     else if( ( ( allActors.get(i) ) instanceof Heroine))
                                     {
System.out.println(allActors.get(i).getHeroineName()+":"+allActors.get(i).getHeroineCharName()+":"+romanceScene.get(j).getDialogue());
                                     }
                                    
                                    i++;
                                    j++;

                                   }while( (i<numOfHero )&& (j<romanceScene.size()));
 
                              }
                               



                               /*

                             //Comedy Scene between Hero and Comedian  
                             

                              for(int i=0;i<allActors.size();i++)
                              {

                                do{

                                     if( ( ( allActors.get(i) ) instanceof Hero) && (j<comedyScene.size()))
                                     {
System.out.println(allActors.get(i).getHeroName()+":"+allActors.get(i).getHeroCharName()+":"+comedyScene.get(j).getDialogue());     
                                     }
                                     else if( ( ( allActors.get(i) ) instanceof Comedian) && (j<comedyScene.size()))
                                     {
System.out.println(allActors.get(i).getComedianName()+":"+allActors.get(i).getComedianCharName()+":"+comedyScene.get(j).getDialogue());
                                     }

                                   }while(i<numOfComedian);
                               }



                              for(int i=0;i<numOfHeroine;i++)
                              {
                                  if( ( ( allActors.get(i) ) instanceof Hero) && (j<romanceScene.size()))
                                     {
System.out.println(allActors.get(i).getHeroName()+":"+allActors.get(i).getHeroCharName()+":"+romanceScene.get(j));     
                                     }
                                  else if( ( ( allActors.get(i) ) instanceof Heroine) && (j<romanceScene.size()))
                                     {
System.out.println(allActors.get(i).getHeroineName()+":"+allActors.get(i).getHeroineCharName()+":"+romanceScene.get(j));
                                     }
                               else if( ( ( allActors.get(i) ) instanceof Comedian) && (j<romanceScene.size()))
                                     {
System.out.println(allActors.get(i).getComedianName()+":"+allActors.get(i).getComedianCharName()+":"+romanceScene.get(j));
                                     }

                                 j++;

                              }
                                 
*/
							   break;
							   
				 case 2 : 
                           System.out.println("script");
							                   
			   
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