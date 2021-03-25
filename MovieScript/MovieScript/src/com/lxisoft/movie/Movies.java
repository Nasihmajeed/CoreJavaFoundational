package com.lxisoft.movie;
import com.lxisoft.movie.*;
import com.lxisoft.theatre.*;
import com.lxisoft.actors.*;

import java.util.*;
import java.util.regex.*;


public class Movies 
{
    String movieName;
    String director;
    String genre;
    Scenes scene = new Scenes();
	Theatre theatre = new Theatre();
    ArrayList<Cast> cast = new ArrayList<Cast>();

	public Movies()
	{
		movieName = "Vettam";
		director = "Priyadarshan";
    	genre = "Comedy";
	}

    public void movieOptions()
    {
		Gopi gopi = new Gopi();
    	Veena veena = new Veena();
   	 	Mani mani = new Mani();
    	Felix felix = new Felix();

        Scanner s = new Scanner(System.in);
        int option;
        do
        {
            System.out.println("\nSelect option : \n	1.Play Script \n	2.View Cast \n	3.Ticket booking \n	0.Exit");
			System.out.print("\nEnter option : ");
            option = s.nextInt();
            if(option==1)
            {
                this.setMovie();
            }
            else if(option==2)
            {
                this.setCast();
                this.printCast();
				int x;
				do
				{
                	System.out.println("\n	Select option : \n		1.View details of characters \n		2.Search actors \n		0.Exit");
					System.out.print("\n	Enter option : ");
                	x = s.nextInt();
                	if(x==1)
                	{
                    	this.printActors();
                    	System.out.println("\nEnter ID to view the descriptions");
                    	int id = s.nextInt();
                    	switch(id)
                    	{
                        	case 1:
		    				    System.out.println("\nActor Details : ");
		    				    veena.actorDetails();
		    				    System.out.println("\nCharacter Details : ");
		    				    veena.characterDetails();
		    				    break;

							case 2:
		    				    System.out.println("\nActor Details : ");
		    				    felix.actorDetails();
		    				    System.out.println("\nCharacter Details : ");
		    				    felix.characterDetails();
		    				    break;
							case 3:

		    				    System.out.println("\nActor Details : ");
		    				    gopi.actorDetails();
		    				    System.out.println("\nCharacter Details : ");
		    				    gopi.characterDetails();
		    				    break;
		    			
		    				case 4:
		    				    System.out.println("\nActor Details : ");
		    				    mani.actorDetails();
		    				    System.out.println("\nCharacter Details : ");
		    				    mani.characterDetails();
		    				    break;
		    			 

		    				default:
		    				    System.out.println("Something went wrong");  
                    	}
					}
					else if(x==2)
					{
						theatre.search();
					}
                }
				while(x!=0);
            }
			else if(option==3)
			{
				theatre.selectSeat();
			}

        }
        while(option!=0);
    }
    public void setCast()
    {
        cast.add(new Cast());
		cast.get(0).setName("Dileep");
		cast.get(0).setAge(38);
		cast.add(new Cast());
		cast.get(1).setName("Bhavna Pani");
		cast.get(1).setAge(28);
		cast.add(new Cast());
		cast.get(2).setName("Kalabhavan Mani");
		cast.get(2).setAge(41);
        cast.add(new Cast());
		cast.get(3).setName("Mithun Ramesh");
		cast.get(3).setAge(32);
		
    }

    public void printActors()
    {
        System.out.println("\n+------+-----------------------------------------------+");
		System.out.println("   ID  |                   Name");
		System.out.println("+------+-----------------------------------------------+");
		for(int j=0; j<cast.size(); j++)
        {
			System.out.println("   "+(j+1)+"                     "+cast.get(j).getName());
		}
		System.out.println("+------+-----------------------------------------------+");
    }
    public void printCast()
    {
        Collections.sort(cast);
        System.out.println("\nMovie Cast : \n");
        
        for (Cast c: cast)
        {
            System.out.println("\tName : "+c.getName()+"\n\tAge  : "+c.getAge()+"\n");
        }
    }

    public void setMovie()
    {
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                   |                                        "+movieName+"                                         |");
		System.out.println("                                                   |                                Directed by : "+director+"                             |");
		System.out.println("                                                   |    Genere : "+genre+"                                           IMDb Rating : 6.7/10     |");
		System.out.println("                                                   |    Plot   :  Life of a thief and the unexpected twists and situations in his life     |");
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                                                           Scene-1                                          ");
		System.out.println("                                                                                          ---------                                         ");
        System.out.println(" Gopalakrishnan a.k.a Gopi is at the airport waiting to board. From there he meets veena who is also waiting to board for her first ever flight. Veena leaves her trolley on the way to enquire about the flight. Gopi collides with the trolley and makes a mess.");

		
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+\n Scene-1");
		this.slowPrint();
		scene.setScene1();
		scene.printScene1();
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                                                           Scene-2                                          ");
		System.out.println("                                                                                          ---------                                         ");
        System.out.println(" Police arrive at the airport to get a thief suspecting Gopi.  They start to search him nut couldn't recover anything. Gopi saw Mani there and ask him to follow veena.");

		
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+\n Scene-2");
		// this.slowPrint();
		// scene.setScene2();
		// scene.printScene2();
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                                                           Scene-3                                          ");
		System.out.println("                                                                                          ---------                                         ");
        System.out.println(" Gopi takes Veena home to get the jewel but he couldn't recover it. Gopi came to know that the jewel is lost. He comes to see off veena at the railway station. After boarding te train Veena shows the jewel and ask Gopi for help to find her fiance Felix to get the jewel back.");
		

        System.out.println("\n                                                   +---------------------------------------------------------------------------------------+\n Scene-3");
		// this.slowPrint();
		// scene.setScene3();
		// scene.printScene3();
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                                                           Scene-4                                          ");
		System.out.println("                                                                                          ---------                                         ");
        System.out.println(" Gopi and Veena arrives at a hotel in search of Felix and came to know it was Felix's marriage. Same time Mani arrives there with his girlfriend Maala");


        

        System.out.println("\n                                                   +---------------------------------------------------------------------------------------+\n Scene-4");
		// this.slowPrint();
		// scene.setScene4();
		// scene.printScene4();
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                                                           Scene-5                                          ");
		System.out.println("                                                                                          ---------                                         ");
        System.out.println(" Gopi meets Felix as Veena's cousin and ask to marry her for that he will arrange the Money. Felix agrres to that. Gopi asks Felix to meet Veena before all and clear their confusions and problems.");


		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+\n Scene-5");
		this.slowPrint();
		scene.setScene5();
		scene.printScene5();
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");

		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                                                          The End                                          ");
		System.out.println("                                                                                         ----------                                         ");
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
	}

    public void slowPrint()
    {
		try
        {
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
        {
			e.printStackTrace();
		}
	}
}
