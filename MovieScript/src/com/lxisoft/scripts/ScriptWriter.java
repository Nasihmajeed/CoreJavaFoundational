package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;

import java.util.*;
import java.io.*;


public class ScriptWriter
{
 
Scanner sc=new Scanner(System.in);

private int i=0,j=0;

private String writerName,line;	

final String romance="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\RomanticScr.CSV";


 final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.CSV";
 final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.CSV";
 final String action= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ActionScr.CSV";
	
  
	Director director=new Director();


      ArrayList<Actor> actors=new ArrayList<Actor>();
      
	   ArrayList<Hero> heroo=new ArrayList<Hero>();
	   ArrayList<Heroine> heroinee=new ArrayList<Heroine>();
	   ArrayList<Comedian> comediann=new ArrayList<Comedian>();
	   ArrayList<Villain> villainn=new ArrayList<Villain>();



	   ArrayList<RomanceScriptWriter> romScr=new ArrayList<RomanceScriptWriter>();

     ArrayList<ActionScriptWriter> emoScr=new ArrayList<ActionScriptWriter>();

     ArrayList<EmotionalScriptWriter> comScr=new ArrayList<EmotionalScriptWriter>();

     ArrayList<ComedyScriptWriter> actScr=new ArrayList<ComedyScriptWriter>();	


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

