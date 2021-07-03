package com.lxisoft.scripts;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.movie.*;

import java.util.*;
import java.io.*;
import java.io.File;


public class Script
 {
/*
       Relative path methods

 1.      String filePath = new File("").getAbsolutePath();
       filePath.concat("path to the property file");



 2.    String basePath = new File("").getAbsolutePath();
    System.out.println(basePath);

    String path = new File("src/main/resources/conf.properties").getAbsolutePath();
    System.out.println(path);

3.   this.getClass().getClassLoader().getResource("relative path");

4.  String pathToWsdl = this.getClass().getClassLoader().getResource("src\\com\\lxisoft\\resources\\RomanticScr.CSV").toString();

5.  The simplest approach uses an instance of the java.io.File class
    to read the /src/test/resources directory, by calling the getAbsolutePath() method:
    Note that this path is relative to the current working directory, 
    meaning the project directory.
       
    

String path = "src/com/lxisoft";

File file = new File(path);

String absolutePath = file.getAbsolutePath();

System.out.println(absolutePath);

assertTrue(absolutePath.endsWith("src/com/lxisoft"));



6.//we can use the Path class, which was introduced in Java 7.
//First, we need to call a static factory method – Paths.get(). 
Then, we'll convert Path to File.
//In the end, we just need to call getAbsolutePath(), 
as in the previous example:

Path resourceDirectory = Paths.get("src","com","lxisoft");

String movieFiles = resourceDirectory.toFile().getAbsolutePath();

Assert.assertTrue(absolutePath.endsWith("src/com/lxisoft"));


*/
       Scanner sc=new Scanner(System.in);

       private String scriptWriterName,line;
       private int type;

       List<String> scriptOfFilm=new ArrayList<String>();

       Director director=new Director();

       ArrayList<Actor> allActors;                     



   public void setScriptWriterName(String scriptWriterName)
      {
       this.scriptWriterName=scriptWriterName;
      }



    public String getScriptWriterName()
      {
	   return scriptWriterName;
      } 

            

public void startMovie(String genre)
  {          
                                 
                                 allActors=director.castingTheActors();

                                 director.printCharactersOfTheMovie();


                    try{
                        Thread.sleep(2000);
                       }
                catch(InterruptedException e)
                       {
                        Thread.currentThread().interrupt();
                       }
/*
   if(genre.equals("RomanticMovie"))
   {
  
       
   }
   else if(genre.equals("EmotionalMovie"))
   {

   }
   else if(genre.equals("ComedyMovie"))
    {

    }
   else if(genre.equals("ActionMovie"))
    {

    }
*/

         
  }
}      