package com.lxisoft.scripts;

import com.lxisoft.cast.*;

import java.util.*;
import java.io.*;

public class Script
{

  private String scriptWriterName;

  public void setScriptWriterName(String scriptWriterName)
  {
     this.scriptWriterName=scriptWriterName;
  }
  

  public String getScriptWriterName()
  {
  return scriptWriterName;  	
  }



 List<String> romanticDialogues=new ArrayList<String>();
 List<String> emotionalDialogues=new ArrayList<String>();
 List<String> comedyDialogues=new ArrayList<String>();
 List<String> actionDialogues=new ArrayList<String>();



public void writeScript(int genre , HashMap<Integer,ArrayList<Actor>> actors)
  {          

String line;

String romance=new String("com\\lxisoft\\resources\\RomanticScr.CSV");
String comedy=new String("com\\lxisoft\\resources\\EmotionalScr.CSV");
String emotional=new String("com\\lxisoft\\resources\\ComedyScr.CSV");
String action=new String("com\\lxisoft\\resources\\ActionScr.CSV");


                    try{
                        Thread.sleep(2000);
                       }
                catch(InterruptedException ie)
                       {
                        Thread.currentThread().interrupt();
                       }


    try{

          BufferedReader br=new BufferedReader(new FileReader(romance));
          while((line=br.readLine()) != null )
          {
          	romanticDialogues.add(new String(line));
     	   
          }


          br=new BufferedReader(new FileReader(emotional));
          while((line=br.readLine()) != null )
          {
          	emotionalDialogues.add(new String(line));
     	   
          }


          br=new BufferedReader(new FileReader(comedy));
          while((line=br.readLine()) != null )
          {
          	comedyDialogues.add(new String(line));
     	   
          }


          br=new BufferedReader(new FileReader(action));
          while((line=br.readLine()) != null )
          {
          	actionDialogues.add(new String(line));
     	   
          }

          
    }catch(IOException ioe)
         {
          ioe.printStackTrace();
         }





                     switch(genre)
                            {
                                  case 1 : 

                                                 break;
                                  case 2 : 


                                                 break;                                  
                                  case 3 :       

                                                 break;
                                  case 4 : 


                                                 break;
                            }
  } 	


}