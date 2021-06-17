package com.lxisoft.tdd;

import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.scripts.*;
import com.lxisoft.movie.*;

public class TDD
{
public static void main(String[] args)
{
	
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


Movie movie=new Movie();
ScriptWriter scr=new ScriptWriter();


movie.begin();
movie.getMovieDetails();

if(movie.getMovieGenre().equals("Romantic"))
{
scr.startMovie(1);	
}

else if(movie.getMovieGenre().equals("Emotional"))
{
scr.startMovie(2);	
}

else if(movie.getMovieGenre().equals("Comedy"))
{
scr.startMovie(3);	
}

else if(movie.getMovieGenre().equals("Action"))
{
scr.startMovie(4);	
}


}
}
