package com.lxisoft.tdd;

import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.scripts.*;
import com.lxisoft.movie.*;

public class TDD
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

String gtype;

Movie movie=new Movie();
Genre genre=new Genre();
Script scr=new Script();

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
System.out.println("\r\n");

}



movie.begin();

    System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("----------------------------------Enter the genre of your movie------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("Romantic");
	System.out.println("Emotional");
	System.out.println("Comedy");
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
	System.out.println("---------------------------------------------------------------------------------------------------------");	
    gtype=sc.next();
    genre.setMovieGenre(gtype);

                try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


System.out.println("Genre of the movie is : "+genre.getMovieGenre());

}
}