package com.lxisoft.direction;

import com.lxisoft.cast.Actor;

import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Villain;

import com.lxisoft.movie.*;

import java.util.*;

public class Director 
{
	Scanner sc=new Scanner(System.in);
	
	//Director can set the actors
	
private int numOfMoviesDirected,numOfHero,numOfHeroine,numOfComedian,numOfVillain;
private String directorName,directorLanguage;
private String heroName,heroineName,comedianName,villainName;
private String heroCharName,heroineCharName,comedianCharName,villainCharName;
	
Actor actor=new Actor();

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
	 
public ArrayList<Actor> castingTheActors()
   {
         //Casting the Heroes
    {
	   System.out.println("Enter the number of heroes in the movie : ");
       numOfHero=sc.nextInt(); 
	   System.out.println("Number of heroes in the Movie is : "+numOfHero);
	   setNumberOfHero(numOfHero); 

	  for(int i=0 ; i<numOfHero ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Hero : ");  
		 heroName=sc.next();
		 System.out.println("Name of the Hero is: "+heroName);
		 

         System.out.println("Enter the Character name of the Hero : ");
		 heroCharName=sc.next();
		 System.out.println("Name of the Hero's Character is : "+heroCharName);  
         actors.add(new Hero());
         actors.get(i).setActorName(heroName);
         actors.get(i).setActorCharName(heroCharName);
        } 	 
		 
		 System.out.println("\r\n"); 
     



		//Casting the Heroine
           
           int k=actors.size();
     

		System.out.println("Enter the number of heroines in the movie : ");
        numOfHeroine=sc.nextInt(); 
	    System.out.println("Number of heroines in the Movie is : "+numOfHeroine);
	    setNumberOfHeroine(numOfHeroine);

	   for(int i=0 ; i<numOfHeroine ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Heroine : ");  
		 heroineName=sc.next();
		 System.out.println("Name of the Heroine is: "+heroineName);
     
         System.out.println("Enter the Character name of the Heroine : ");
		 heroineCharName=sc.next();
		 System.out.println("Name of the Heroine's Character is : "+heroineCharName);  
		 actors.add(new Heroine());
		 actors.get(k).setActorName(heroineName);
         actors.get(k).setActorCharName(heroineCharName);
         k++;

        }
     
       System.out.println("\r\n");
    
   //Casting the Comedians

       System.out.println("Enter the number of Comedian in the movie : ");
       numOfComedian=sc.nextInt(); 
	   System.out.println("Number of comedians in the Movie is : "+numOfComedian);
	   setNumberOfComedian(numOfComedian);

	   for(int i=0 ; i<numOfComedian ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Comedian : ");  
		 comedianName=sc.next();
		 System.out.println("Name of the Comedian is: "+comedianName);
     	 
 
         System.out.println("Enter the Character name of the Comedian : ");
		 comedianCharName=sc.next();
		 System.out.println("Name of the Comedian's Character is : "+comedianCharName);  
		 actors.add(new Comedian());
		 actors.get(k).setActorName(comedianName);
         actors.get(k).setActorCharName(comedianCharName);
         k++;
        }
          System.out.println("\r\n");

    //Casting the Villains
    
       System.out.println("Enter the number of villains in the movie : ");
       numOfVillain=sc.nextInt(); 
	   System.out.println("Number of villains in the Movie is : "+numOfVillain);
	   setNumberOfVillain(numOfVillain);

	    for(int i=0 ; i<numOfVillain ; i++)
	    {
		 System.out.println("\r\n");
		 System.out.println("Enter the name of the Villain : ");  
		 villainName=sc.next();
		 System.out.println("Name of the Villain is: "+villainName);
     

         System.out.println("Enter the Character name of the Villain : ");
		 villainCharName=sc.next();
		 System.out.println("Name of the Villain's Character is : "+villainCharName);  
		 actors.add(new Villain());
         actors.get(k).setActorName(villainName);
         actors.get(k).setActorCharName(villainCharName);
         k++;
        }

       System.out.println("\r\n");
  }
 return actors;
}	    

//Setters for the number of each category of actors in the movie
 
public void setNumberOfHero(int numOfHero)
{
   this.numOfHero=numOfHero;
}

public void setNumberOfHeroine(int numOfHeroine)
{
   this.numOfHeroine=numOfHeroine;
}

public void setNumberOfComedian(int numOfCom)
{
   this.numOfComedian=numOfComedian;
}

public void setNumberOfVillain(int numOfVillain)
{
   this.numOfHero=numOfHero;
}


//Getters for the number of each category of actors in the movie

public int getNumberOfHero()
{
	return numOfHero;
}

public int getNumberOfHeroine()
{
	return numOfHeroine;
}

public int getNumberOfComedian()
{
	return numOfComedian;
}

public int getNumberOfVillain()
{
	return numOfVillain;
}



//To print the characters to the user
    
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
}