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
   //  ArrayList<ActionScript> actionScene=new ArrayList<ActionScript>(); 
	   ArrayList<ComedyScript> comedyScene=new ArrayList<ComedyScript>();

       Director director=new Director();

       ArrayList<Actor> allActors;
         
   int l=0,m=0,n=0;                              
   
   /*
   //Getting the number of each actors in the movie from the Director   
   int numOfHero=director.getNumberOfHero();
   int numOfHeroine=director.getNumberOfHeroine();
   int numOfComedian=director.getNumberOfComedian();
   int numOfVillain=director.getNumberOfVillain();
   */

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




//Casting the actors
public void receiveAndPrintDetailsOfCharacters()
{

allActors=director.castingTheActors();

System.out.println("\r\n");

                    
                     try{
                        Thread.sleep(2000);
                       }
                catch(InterruptedException e)
                    {
                    Thread.currentThread().interrupt();
                    }

director.printCharacters();    

} 
	


public void startMovie(int genre)
  {                
         switch(genre)
           {
                 
                  case 1 :      

                
                            try{

                                BufferedReader br=new BufferedReader(new FileReader(romance));
                                         do{
                                             while((line=br.readLine()) != null) 
                                              {
                                               String[] a=line.split(":");
                                               String st=a[0].trim();
                                                  romanceScene.add(new RomanceScript());
                                                  romanceScene.get(l).setDialogue(st);
                                                  l++;
                                              }
                                           }while(l<15);
                                 br=new BufferedReader(new FileReader(comedy));
                                         do{
                                             while((line=br.readLine()) != null) 
                                              {
                                               String[] b=line.split(":");
                                               String str=b[0].trim();
                                                  comedyScene.add(new ComedyScript());
                                                  comedyScene.get(m).setDialogue(str);
                                                  m++;
                                              }
                                           }while(m<15);
                                 br=new BufferedReader(new FileReader(emotional));
                                         do{
                                             while((line=br.readLine()) != null) 
                                              {
                                               String[] c=line.split(":");
                                               String strn=c[0].trim();
                                                  emotionalScene.add(new EmotionalScript());
                                                  emotionalScene.get(n).setDialogue(strn);
                                                  n++;
                                              }
                                           }while(n<15);
                            }catch(IOException ioe)
                            {
                                ioe.printStackTrace();
                            }




                                     //Romantic Scene between Hero and Heroine
            try{
          
                        int i=0,j=0;

                         while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Heroine))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+romanceScene.get(j).getDialogue());     
                                   
                         
                                    try{
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }
                                     }                                                           
    else if( ( ( allActors.get(i) ) instanceof Comedian) ||  ( ( allActors.get(i) ) instanceof Villain))
                                    {
                                        
                                        i=i;

                                    try{ 
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }

                                    }
                            i++;
                            j++;
                         }
                               
                }catch(IndexOutOfBoundsException iofbe)
                      {
                       iofbe.printStackTrace();
                      }


                               

                             //Comedy Scene between Hero and Comedian  
                        

            try{

                      int i=0,j=0;
                
                    while( (i<allActors.size()) && (j<15) )
                    {
                          if(  ( allActors.get(i) ) instanceof Hero || ( allActors.get(i) ) instanceof Comedian)  
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+comedyScene.get(j).getDialogue());     
                                      

                                        try{
                                            Thread.sleep(2000);
                                           }
                                        catch(InterruptedException e)
                                           {
                                            Thread.currentThread().interrupt();
                                           }

                                          
                                     }
                            else if( ( allActors.get(i) ) instanceof Villain)
                                     {
                                        i=i;

                                        try{
                                           Thread.sleep(2000);
                                           }
                                        catch(InterruptedException e)
                                           {
                                           Thread.currentThread().interrupt();
                                           }
                                     }
                            i++;        
                            j++;

                    }                       
            }catch(IndexOutOfBoundsException inof)
                  {
                   inof.printStackTrace();
                  } 
		   
                        break;							   
				 

                    




                    //Fight Scene Between Hero and Villain







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