package com.lxisoft.movie;

import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;

import java.util.*;


public class Movie
{

Scanner sc=new Scanner(System.in);

String movieName;

Genre g=new Genre();

Hero him=new Hero();
Heroine her=new Heroine();
Comedian com=new Comedian();

Cast casting=new Cast();
Script scripting=new Script();
Characters characters=new Characters();

Rating rate=new Rating();

  public void setMovieName(String movieName)
   {
    this.movieName=movieName;	
   }		


   public String getMovieName()
  {
	return movieName;
  }


String heroName,heroineName,comedianName;

public void setNumber(int hero,int heroine,int comedian)
{
	if(hero==1 && heroine==1 && comedian==1)
	{
		g.setMovieGenre("Romantic");
		System.out.println("Genre of the movie is : "+g.getMovieGenre());
	            
				System.out.println("Enter the name of the Hero : ");
				      heroName=sc.nextLine();
                      him.setHeroName(heroName);
					  System.out.println("Hero Name : "+him.getHeroName());
					  
				System.out.println("Enter the name of the Heroine : ");	  
	                  heroineName=sc.nextLine();
					  her.setHeroineName(heroineName);
                      System.out.println("Heroine Name : "+her.getHeroineName());
					  
		        System.out.println("Enter the name of the Comedian : ");
		              comedianName=sc.nextLine();
					  com.setComedianName();
                      System.out.println("Comedian Name : "+com.getComedianName());
		
		
			rate.getRating();
     
	 scripting.scriptSelect();
	 }
	
	else if(hero==1 && heroine==2 && comedian==0)
	{
		g.setMovieGenre("Emotional");
		System.out.println("Genre of the movie is : "+g.getMovieGenre());
		
		System.out.println("Enter the name of the Hero : ");
				      heroName=sc.nextLine();
	}
	
	else if(hero==2 && heroine==2 && comedian==2)
	{
		g.setMovieGenre("Comedy");
		System.out.println("Genre of the movie is : "+g.getMovieGenre());
	}
	
	else 
	{
		System.out.println("Enter valid numbers as the numbers you have entered does not match the search!");
	}
}


}