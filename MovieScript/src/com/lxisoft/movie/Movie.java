package com.lxisoft.movie;

import java.util.*;

public class Movie
{

Scanner sc=new Scanner(System.in);

String movieName;


public void begin()
{
System.out.println("-------------: Enter the name of the movie :------------");
movieName=sc.next();	

                try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }


System.out.println("\r\n");
System.out.println("Name of the Movie is : "+movieName);
System.out.println("\r\n");
	            
				try{
					Thread.sleep(2000);
				     }
				catch(InterruptedException e)
				    {
					Thread.currentThread().interrupt();
				    }
}


}
}