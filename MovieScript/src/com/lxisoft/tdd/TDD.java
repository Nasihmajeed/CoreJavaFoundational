package com.lxisoft.tdd;

import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;
import com.lxisoft.movie.*;

public class TDD
{
public static void main(String[] args)
{

String movieName;
int numOfHero,numOfHeroine,numOfComedian;

Scanner sc=new Scanner(System.in);

Movie movie=new Movie();



{

System.out.println("---------------------------------------------------------------------------------------------------------");	
System.out.println("---------------------------------------------------------------------------------------------------------");	
System.out.println("------------------------------------------Movie_Script------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------------------------------");	
                 try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
}





System.out.println("Enter the Movie Name : ");	
movieName=sc.nextLine();			
movie.setMovieName(movieName);
System.out.println("The Movie Name you have entered is : "+movie.getMovieName());




				 try{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}


System.out.println("Enter the number of Heroes in the movie : ");
numOfHero=sc.nextInt();

System.out.println("Enter the number of Heroines in the movie : ");
numOfHeroine=sc.nextInt();

System.out.println("Enter the number of Comedians in the movie : ");
numOfComedian=sc.nextInt();

movie.setNumber(numOfHero,numOfHeroine,numOfComedian);

}
}