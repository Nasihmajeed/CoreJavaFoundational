package com.lxisoft.direction;

import com.lxisoft.cast.*;
import com.lxisoft.movie.*;

import java.util.*;

public class Director 
{
	Scanner sc=new Scanner(System.in);
	
	//Director can set the actors
	
private int numOfMoviesDirected,numOfHero,numOfHeroine,numOfCom,numOfVillain;
private String directorName,directorLanguage;
private String heroName,heroineName,comedianName,villainName;
private String heroCharName,heroineCharName,comedianCharName,villainCharName;
	

ArrayList<Actor> actors=new ArrayList<Actor>();

	
	public void setDirectorName(String directorName)
	{
		this.directorName=directorName;
	}
	
	
	public String getDirectorName()
	{
		return directorName;
	}
	
	
    public void setDirectorLanguage(String directorLanguage)
    {
      this.directorLanguage=directorLanguage;
    }

    public String getDirectorLanguage()
    {
     return directorLanguage;
    }



    public void setNumberOfMoviesDirected(int numOfMoviesDirected)
    {
      this.numOfMoviesDirected=numOfMoviesDirected;
    }

    public int getNumberOfMoviesDirected()
    {
     return numOfMoviesDirected;
    }
	
	 
	  
	
	
	  
	 //Casting the actors by the Director---
	 
	 public void castingTheActors()
   {
         //Casting the Heroes

	   System.out.println("Enter the number of heroes in the movie : ");
     numOfHero=sc.nextInt(); 
	   System.out.println("Number of heroes in the Movie is : "+numOfHero);
	 
	 for(int i=0 ; i<numOfHero ; i++)
	   {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Hero : ");  
		 heroName=sc.next();
		 System.out.println("Name of the Hero is: "+heroName);
		 
		 actors.add(new Hero());
     
		 actors.get(i).setHeroName(heroName);
      
		 System.out.println("Enter the Character name of the Hero : ");
		 heroCharName=sc.next();
		 System.out.println("Name of the Hero's Character is : "+heroCharName);  
		 actors.get(i).setHeroCharName(heroCharName);
		 
		 System.out.println("\r\n"); 
	   }


          try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

		//Casting the Heroine

		System.out.println("Enter the number of heroines in the movie : ");
    numOfHeroine=sc.nextInt(); 
	  System.out.println("Number of heroines in the Movie is : "+numOfHeroine);
	 
	 for(int i=0;i<numOfHeroine;i++)
	   {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Heroine : ");  
		 heroineName=sc.next();
		 System.out.println("Name of the Heroine is: "+heroineName);
		 
		 actors.add(new Heroine());
     
		 actors.get(i).setHeroineName(heroineName);
      
		 System.out.println("Enter the Character name of the Heroine : ");
		 heroineCharName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+heroineCharName);  
		 actors.get(i).setHeroineCharName(heroineCharName);
		 
		 System.out.println("\r\n"); 
	   }	    



                 try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

     //Casting the Comedians


     System.out.println("Enter the number of Comedian in the movie : ");
     numOfCom=sc.nextInt(); 
	   System.out.println("Number of comedians in the Movie is : "+numOfCom);
	 
	 for(int i=0;i<numOfCom;i++)
	   {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Comedian : ");  
		 comedianName=sc.next();
		 System.out.println("Name of the Comedian is: "+comedianName);
		 
		 actors.add(new Comedian());
     
		 actors.get(i).setComedianName(comedianName);
      
		 System.out.println("Enter the Character name of the Comedian : ");
		 comedianCharName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+comedianCharName);  
		 actors.get(i).setHeroCharName(comedianCharName);
		 
		 System.out.println("\r\n"); 
	   }

				    try{
					    Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }

    //Casting the Villains

     System.out.println("Enter the number of villains in the movie : ");
     numOfVillain=sc.nextInt(); 
	   System.out.println("Number of villains in the Movie is : "+numOfVillain);
	 
	   for(int i=0;i<numOfVillain;i++)
	   {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Villain : ");  
		 villainName=sc.next();
		 System.out.println("Name of the Villain is: "+villainName);
		 
		 actors.add(new Villain());
     
		 actors.get(i).setVillainName(villainName);
      
		 System.out.println("Enter the Character name of the Villain : ");
		 villainCharName=sc.next();
		 System.out.println("Name of the Villain's Character is : "+villainCharName);  
		 actors.get(i).setVillainCharName(villainCharName);
		 
		 System.out.println("\r\n"); 
	   }

              try{
		   			      Thread.sleep(2000);
				        }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
}




public ArrayList<Actor> allActors()
{
	return actors;
}


public void printCharacters()
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

for(int i=0;i<actors.size();i++)
 {


 	if(actors.get(i) instanceof Hero)
   {
    System.out.println("Hero Name : "+actors.get(i).getHeroName()+" : "+"Hero's Character Name : "+actors.get(i).getHeroCharName());
   
            try{
					      Thread.sleep(2000);
				       }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
   }
  else if(actors.get(i) instanceof Heroine)
   {
    System.out.println("Heroine Name : "+actors.get(i).getHeroineName()+" : "+"Heroine's Character Name : "+actors.get(i).getHeroineCharName());
   
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
    System.out.println("Comedian Name : "+actors.get(i).getComedianName()+" : "+"Comedian's Character Name : "+actors.get(i).getComedianCharName());
   

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
    System.out.println("Villain Name : "+actors.get(i).getVillainName()+" : "+"Villain's Character Name : "+actors.get(i).getVillainCharName());
   
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
	  	
}