package com.lxisoft.direction;

import com.lxisoft.cast.*;

import com.lxisoft.movie.*;

import java.util.*;

public class Director 
{
	Scanner sc=new Scanner(System.in);
	
    private String directorName;

	
    Hero heroo=new Hero();
    Heroine heroinee=new Heroine();
    Comedian comediann=new Comedian();
    Villain villainn=new Villain();


   ArrayList<Actor> actors=new ArrayList<Actor>();

 
	public void setDirectorName(String directorName)
	{
		this.directorName=directorName;
	}
	
	
	public String getDirectorName()
	{
		return directorName;
	}
	  
	 //Casting the actors by the Director---
	 
public ArrayList<Actor> castingTheActors()
   {
         //Casting the Heroes
    {
       System.out.println("---------------------------------------------------------------------------------------------------------");
	   System.out.println("Enter the number of heroes in the movie : ");
       heroo.setNumOfHero(sc.nextInt()); 
	   System.out.println("Number of heroes in the Movie is : "+heroo.getNumOfHero());
	 
	  for(int i=0 ; i<heroo.getNumOfHero() ; i++)
	    {
		 
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Hero : ");  
		 String name=sc.next();
		 System.out.println("Name of the Hero is: "+name);
		 

         System.out.println("Enter the Character name of the Hero : ");
		 String charName=sc.next();
		 System.out.println("Name of the Hero's Character is : "+charName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
         actors.add(new Hero(name,charName));

        } 	 
		 
		 System.out.println("\r\n"); 
     

		//Casting the Heroine
           
           
     
        System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Enter the number of heroines in the movie : ");
        heroinee.setNumOfHeroine(sc.nextInt()); 
	    System.out.println("Number of heroines in the Movie is : "+heroinee.getNumOfHeroine());
	
	   for(int i=0 ; i<heroinee.getNumOfHeroine(); i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Heroine : ");  
		 String name=sc.next();
		 System.out.println("Name of the Heroine is: "+name);
     
         System.out.println("Enter the Character name of the Heroine : ");
		 String charName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+charName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
		 actors.add(new Heroine(name,charName));

        }
     
       System.out.println("\r\n");
    
   //Casting the Comedians

       System.out.println("---------------------------------------------------------------------------------------------------------");
       System.out.println("Enter the number of Comedian in the movie : ");
       comediann.setNumOfComedian(sc.nextInt()); 
	   System.out.println("Number of comedians in the Movie is : "+comediann.getNumOfComedian());
	

	   for(int i=0 ; i<comediann.getNumOfComedian() ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Comedian : ");  
		 String name=sc.next();
		 System.out.println("Name of the Comedian is: "+name);
     	 
 
         System.out.println("Enter the Character name of the Comedian : ");
		 String charName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+charName);
		 System.out.println("---------------------------------------------------------------------------------------------------------");  
		 actors.add(new Comedian(name,charName));

        }
          System.out.println("\r\n");

    //Casting the Villains

       System.out.println("---------------------------------------------------------------------------------------------------------");
       System.out.println("Enter the number of villains in the movie : ");
       villainn.setNumOfVillain(sc.nextInt()); 
	   System.out.println("Number of villains in the Movie is : "+villainn.getNumOfVillain());
	
	    for(int i=0 ; i<villainn.getNumOfVillain() ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Villain : ");  
		 String name=sc.next();
		 System.out.println("Name of the Villain is: "+name);
     

         System.out.println("Enter the Character name of the Villain : ");
		 String charName=sc.next();
		 System.out.println("Name of the Villain's Character is : "+charName);  
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 actors.add(new Villain(name,charName));

        }

       System.out.println("\r\n");
  }
 return actors;
}	    



//To print the characters to the user
    
public void printCharactersOfTheMovie()
{
	  System.out.println("\r\n");
		
		System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
            

                  try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


    System.out.println("----------------------------=====CHARACTERS=====---------------------------");
            

                      try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		
		          try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

for(int i=0; i<actors.size(); i++)
 {


 	if(actors.get(i) instanceof Hero)
   {
    System.out.println("Hero Name : "+actors.get(i).getActorName()+" : "+"Hero's Character Name : "+actors.get(i).getActorCharName());
   
            try{
					      Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread() .interrupt();
				    }
   }
  else if(actors.get(i) instanceof Heroine)
   {
    System.out.println("Heroine Name : "+actors.get(i).getActorName()+" : "+"Heroine's Character Name : "+actors.get(i).getActorCharName());
   
            try{
					      Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

   }
  else if(actors.get(i) instanceof Comedian)
   {
    System.out.println("Comedian Name : "+actors.get(i).getActorName()+" : "+"Comedian's Character Name : "+actors.get(i).getActorCharName());
   

             try{
					      Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

   }
  else if(actors.get(i) instanceof Villain)
   {
    System.out.println("Villain Name : "+actors.get(i).getActorName()+" : "+"Villain's Character Name : "+actors.get(i).getActorCharName());
   
             try{
					      Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

   }      
 }
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");

} 






public void startMovie(String genre)
  {          
                                 
                                 castingTheActors();

                                 printCharactersOfTheMovie();


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








// Script class


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
       

       private String line;
       private int type;

       List<String> scriptOfFilm=new ArrayList<String>();

       Director director=new Director();

       ArrayList<Actor> allActors;                     



   

            






















}