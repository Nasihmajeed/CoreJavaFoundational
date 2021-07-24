package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.sleep.*;

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

      


      //romance
                  

           for(int i=0;i<7;i++)
           { 

           	int a=r.nextInt(2);
               if(actors.get(1).get(a) instanceof Hero){
System.out.println(actors.get(1).get(a).getActorName()+" : "+actors.get(1).get(a).getActorCharName()+" : "+"\n\t"+romanticDialogues.get(r.nextInt(15)));
               }
                
                
                 try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException ine)
				    {
					Thread.currentThread().interrupt();
				    }

                int b=r.nextInt(2);
System.out.println(actors.get(2).get(b).getActorName()+" : "+actors.get(2).get(b).getActorCharName()+" : "+"\n\t"+romanticDialogues.get(r.nextInt(15)));
       	     	 
       	     	 try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException ine)
				    {
					Thread.currentThread().interrupt();
				    }
           }

                    try{
				        Thread.sleep(2000);
				       }
				catch(InterruptedException ine)
				    {
					Thread.currentThread().interrupt();
				    }



         //emotional
          
          for(int i=0;i<2;i++)
          {
          	int c=r.nextInt(2);
          	int d=r.nextInt(2);
          	int e=r.nextInt(2);

          	if(actors.get(1).get(c) instanceof Hero)
          	{
System.out.println(actors.get(1).get(c).getActorName()+" : "+actors.get(1).get(c).getActorCharName()+" : "+"\n\t"+emotionalDialogues.get(r.nextInt(15)));	
          	
          	try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException ide)
				    {
					Thread.currentThread().interrupt();
				    }

          	}

                
                 
                
            else if(actors.get(2).get(d) instanceof Heroine)
            {
System.out.println(actors.get(2).get(d).getActorName()+" : "+actors.get(2).get(d).getActorCharName()+" : "+"\n\t"+emotionalDialogues.get(r.nextInt(15)));	
            try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException ide)
				    {
					Thread.currentThread().interrupt();
				    }
            }

                
                  

                
            else if(actors.get(4).get(e) instanceof Villain)
            {
System.out.println(actors.get(4).get(e).getActorName()+" : "+actors.get(4).get(e).getActorCharName()+" : "+"\n\t"+emotionalDialogues.get(r.nextInt(15)));	
            try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException ide)
				    {
					Thread.currentThread().interrupt();
				    }
            }

                  
                   
          }


                        try{
				        Thread.sleep(2000);
				       }
				catch(InterruptedException intre)
				    {
					Thread.currentThread().interrupt();
				    }


              //comedy

          for(int i=0;i<2;i++)
          {
          	int f=r.nextInt(2);
System.out.println(actors.get(1).get(f).getActorName()+" : "+actors.get(1).get(f).getActorCharName()+" : "+"\n\t"+comedyDialogues.get(r.nextInt(15)));
                
                try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException inte)
				    {
					Thread.currentThread().interrupt();
				    }


                int g=r.nextInt(2);
System.out.println(actors.get(3).get(g).getActorName()+" : "+actors.get(3).get(g).getActorCharName()+" : "+"\n\t"+comedyDialogues.get(r.nextInt(15)));
                
                try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException inte)
				    {
					Thread.currentThread().interrupt();
				    }


                int h=r.nextInt(2);
System.out.println(actors.get(2).get(h).getActorName()+" : "+actors.get(2).get(h).getActorCharName()+" : "+"\n\t"+comedyDialogues.get(r.nextInt(15)));
                 
                 try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException inte)
				    {
					Thread.currentThread().interrupt();
				    }


                int j=r.nextInt(2);
System.out.println(actors.get(3).get(j).getActorName()+" : "+actors.get(3).get(j).getActorCharName()+" : "+"\n\t"+comedyDialogues.get(r.nextInt(15)));
                
                try{
				     Thread.sleep(2000);
				    }
				catch(InterruptedException inte)
				    {
					Thread.currentThread().interrupt();
				    }
          }


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