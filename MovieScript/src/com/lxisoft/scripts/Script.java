package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;

import java.util.*;
import java.io.*;

public class Script
 {
 
  Scanner sc=new Scanner(System.in);

  private String scriptWriterName,line;	

   final String romance="E:\\MovieScript\\src\\com\\lxisoft\\scripts\\RomanticScr.CSV";
   final String emotional= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\EmotionalScr.CSV";
   final String comedy= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ComedyScr.CSV";
   final String action= "E:\\MovieScript\\src\\com\\lxisoft\\scripts\\ActionScr.CSV";

        
       ArrayList<RomanceScript> romanceScene=new ArrayList<RomanceScript>();
       ArrayList<EmotionalScript> emotionalScene=new ArrayList<EmotionalScript>(); 
       ArrayList<ActionScript> actionScene=new ArrayList<ActionScript>(); 
	   ArrayList<ComedyScript> comedyScene=new ArrayList<ComedyScript>();

       Director director=new Director();

       ArrayList<Actor> allActors;
         
   int l=0,m=0,n=0,p=0;                              

    public void writerDetails()
     {
           System.out.println("Enter the name of the ScriptWriter");
           setWriterName(sc.next());
     }



    public void setScriptWriterName(String scriptWriterName)
     {
       this.scriptWriterName=scriptWriterName;
     }




    public String getScriptWriterName()
      {
	   return scriptWriterName;
      } 



//Casting the actors
public void directorCastingCharacters()
{

allActors=castingTheActors();

System.out.println("\r\n");

                    
                     try{
                        Thread.sleep(2000);
                       }
                catch(InterruptedException e)
                    {
                    Thread.currentThread().interrupt();
                    }

} 





public void startMovie(String genre)
  {          

                                 director.printCharacters();

        int i=0,j=0; 
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
                                 br=new BufferedReader(new FileReader(action));
                                         do{
                                             while((line=br.readLine()) != null) 
                                              {
                                               String[] g=line.split(":");
                                               String strng=g[0].trim();
                                                  actionScene.add(new ActionScript());
                                                  actionScene.get(p).setDialogue(strng);
                                                  p++;
                                              }
                                           }while(p<15);
                    }catch(IOException ioe)
                            {
                                ioe.printStackTrace();
                            }




         switch(genre)
           {
                  

    case 1 :      

                                   //Romantic Scene between Hero and Heroine
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=0;

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



  /* *********************************************************************************************************/



                    //Comedy Scene between Hero and Comedian
/* *********************************************************************************************************/


try{

     i=0;
     j=2;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Comedian))
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
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Villain))
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

                      
                      //Fight Scene Between Hero and Villain
  /* *********************************************************************************************************/

   try{

                  i=0;
                  j=3;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Villain))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+actionScene.get(j).getDialogue());     
                                   
                         
                                    try{
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }
                                     }                                                           
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Comedian))
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



 //Romantic Scene between Hero and Heroine
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=7;

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



  /* *********************************************************************************************************/

                }catch(IndexOutOfBoundsException iofbe)
                      {
                       iofbe.printStackTrace();
                      }

                   break;

    case 2 : 
                           
          

          //Emotional Scene between Hero and Heroine
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=0;

                         while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Heroine))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+emotionalScene.get(j).getDialogue());     
                                   
                         
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



  /* *********************************************************************************************************/



                    //Emotional Scene between Hero and Villain
/* *********************************************************************************************************/


try{

     i=0;
     j=2;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Villain))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+emotionalScene.get(j).getDialogue());     
                                   
                         
                                    try{
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }
                                     }                                                           
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Comedian))
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

                      
                      //Fight Scene Between Hero and Villain
  /* *********************************************************************************************************/

   try{

                  i=0;
                  j=3;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Villain))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+actionScene.get(j).getDialogue());     
                                   
                         
                                    try{
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }
                                     }                                                           
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Comedian))
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



 //Romantic Scene between Hero and Heroine
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=7;

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



  /* *********************************************************************************************************/

                }catch(IndexOutOfBoundsException iofbe)
                      {
                       iofbe.printStackTrace();
                      }

                     	   break;
				 
				 case 3 :
				                  

        //Comedy Scene between Hero and Heroine
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=0;

                         while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Heroine))
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



  /* *********************************************************************************************************/



                    //Comedy Scene between Hero and Comedian
/* *********************************************************************************************************/


try{

     i=0;
     j=2;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Comedian))
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
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Villain))
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

                      
                      //Comedy Scene Between Hero and Villain
  /* *********************************************************************************************************/

   try{

                  i=0;
                  j=8;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Villain))
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
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Comedian))
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



 //Romantic Scene between Hero and Heroine
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=9;

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



  /* *********************************************************************************************************/

                }catch(IndexOutOfBoundsException iofbe)
                      {
                       iofbe.printStackTrace();
                      }




				
							   break;
				case 4 :
				                
          //Action Scene between Hero and Villain
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=0;

                         while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Villain))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+actionScene.get(j).getDialogue());     
                                   
                         
                                    try{
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }
                                     }                                                           
    else if( ( ( allActors.get(i) ) instanceof Comedian) ||  ( ( allActors.get(i) ) instanceof Heroine))
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



  /* *********************************************************************************************************/



                    //Comedy Scene between Hero and Comedian
/* *********************************************************************************************************/


try{

     i=0;
     j=8;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Comedian))
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
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Villain))
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

                      
                      //Fight Scene Between Hero and Villain
  /* *********************************************************************************************************/

   try{

                  i=0;
                  j=7;

while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Hero) || ( ( allActors.get(i) ) instanceof Villain))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+actionScene.get(j).getDialogue());     
                                   
                         
                                    try{
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }
                                     }                                                           
    else if( ( ( allActors.get(i) ) instanceof Heroine) ||  ( ( allActors.get(i) ) instanceof Comedian))
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



 //Fight Scene between Heroine and Villain
 /* *********************************************************************************************************/
                    try{

                         i=0;
                         j=7;

                         while( (i<allActors.size()) && (j<15) )
                         {
                             if( ( ( allActors.get(i) ) instanceof Heroine) || ( ( allActors.get(i) ) instanceof Villain))
                                     {
System.out.println(allActors.get(i).getActorName()+":"+allActors.get(i).getActorCharName()+":"+actionScene.get(j).getDialogue());     
                                   
                         
                                    try{
                                        Thread.sleep(2000);
                                       }
                                    catch(InterruptedException e)
                                       {
                                        Thread.currentThread().interrupt();
                                       }
                                     }                                                           
    else if( ( ( allActors.get(i) ) instanceof Comedian) ||  ( ( allActors.get(i) ) instanceof Hero))
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



  /* *********************************************************************************************************/

                }catch(IndexOutOfBoundsException iofbe)
                      {
                       iofbe.printStackTrace();
                      }

				
				               break;
   

   }

           
  }

}