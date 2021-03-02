package com.lxisoft.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Movies 
{
    String movieName = "Vettam";
    String director = "Priyadarshan";
    String genre = "Comedy";
    Scenes scene = new Scenes();
    ArrayList<Cast> cast = new ArrayList<Cast>();
    Gopi gopi = new Gopi();
    Veena veena = new Veena();
    Mani mani = new Mani();
    Maala maala = new Maala();
    Kurup kurup = new Kurup();
    Felix felix = new Felix();

    public void movieOptions()
    {
        Scanner s = new Scanner(System.in);
        int option;
        do
        {
            System.out.println("Select option \n1.View Script \n2.View Cast\n0.Exit");
            option = s.nextInt();
            if(option==1)
            {
                this.setMovie();
            }
            else if(option==2)
            {
                this.setCast();
                this.printCast();
                System.out.println("View details of charectors? \n1.Yes \n0.No");
                int x = s.nextInt();
                if(x==1)
                {
                    this.printActors();
                    System.out.println("\nEnter ID to view the descriptions");
                    int id = s.nextInt();
                    switch(id)
                    {
                        case 1:
		    			    System.out.println("Actor Brief : ");
		    			    gopi.actorDetails();
		    			    System.out.println("Charactor Brief : ");
		    			    gopi.characterDetails();
		    			    break;
		    			case 2:
		    			    System.out.println("Actor Brief : ");
		    			    veena.actorDetails();
		    			    System.out.println("Charactor Brief : ");
		    			    veena.characterDetails();
		    			    break;
		    			case 3:
		    			    System.out.println("Actor Brief : ");
		    			    mani.actorDetails();
		    			    System.out.println("Charactor Brief : ");
		    			    mani.characterDetails();
		    			    break;
                        case 4:
		    			    System.out.println("Actor Brief : ");
		    			    maala.actorDetails();
		    			    System.out.println("Charactor Brief : ");
		    			    maala.characterDetails();
		    			    break;
		    			case 5:
		    			    System.out.println("Actor Brief : ");
		    			    kurup.actorDetails();
		    			    System.out.println("Charactor Brief : ");
		    			    kurup.characterDetails();
		    			    break;
		    			case 6:
		    			    System.out.println("Actor Brief : ");
		    			    felix.actorDetails();
		    			    System.out.println("Charactor Brief : ");
		    			    felix.characterDetails();
		    			    break; 

		    			default:
		    			    System.out.println("Something went wrong");  
                    }
                }
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
		cast.get(3).setName("Sruthi Nair");
		cast.get(3).setAge(25);
		cast.add(new Cast());
		cast.get(4).setName("Cochin Haneefa");
		cast.get(4).setAge(53);
        cast.add(new Cast());
		cast.get(5).setName("Midhun");
		cast.get(5).setAge(32);
    }
    public void printActors()
    {
        System.out.println("+------+-----------------------------------------------+");
		System.out.println("| SNo  |                   Name                        |");
		System.out.println("+------+-----------------------------------------------+");
		for(int j=0; j<cast.size(); j++)
        {
			System.out.println("  "+(j+1)+"                "+cast.get(j).getName());
		}
    }
    public void printCast()
    {
        Collections.sort(cast);
        System.out.println("Movie Cast : ");
        
        for (Cast c: cast)
        {
            System.out.println("Name : "+c.getName()+"\nAge : "+c.getAge()+"\n");
        }
    }
    public void setMovie()
    {
		System.out.println("+--------------------------------------------------------------------------------------+");
		// System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("|                                   "+movieName+"                                       |");
		System.out.println("|                           Directed by : "+director+"                                  |");
		System.out.println("|    Genere : "+genre+"                                       IMDb Rating : 6.7/10      |");
		System.out.println("|    Plot   : The adventures of a private detective CID Moosa, who's luck and wit helps |");
		System.out.println("|             him to solve the cases.                                                   |");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-1                                          ");
		System.out.println("                                       ---------                                         ");
		// System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println(" Gopalakrishnan a.k.a Gopi is at the airport waiting to board \n from there he meets veena who is also waiting to board for her first ever flight");

		
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-1 Begins");
		this.slowPrint();
		scene.setScene1();
		scene.printScene1();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-2                                          ");
		System.out.println("                                       ---------                                         ");
		// System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println(" Police arrive at the airport to get a thief suspecting Gopi \n  they start to search him nut couldn't recover anything. \n Gopi saw Mani there and ask him to follow veena.");

		
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-2 Begins");
		this.slowPrint();
		scene.setScene2();
		scene.printScene2();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-3                                          ");
		System.out.println("                                       ---------                                         ");
		// System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println(" Gopi came to know that the jewel is lost. \n He comes to see off veena at the railway station. \n After boarding te train Veena shows the jewel and ask Gopi for help to find her fiance Felix to get the jewel back.");
		

        System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-3 Begins");
		this.slowPrint();
		scene.setScene3();
		scene.printScene3();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-4                                          ");
		System.out.println("                                       ---------                                         ");
		// System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println(" Gopi and Veena arrives at a hotel in search of Felix and came to know it was Felix's marriage. \n Same time Mani arrives there with his girlfriend Maala and says they are being followed by Maala's father Kurup");


        System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-4 Begins");
		this.slowPrint();
		scene.setScene4();
		scene.printScene4();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-5                                          ");
		System.out.println("                                       ---------                                         ");
		// System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println(" Due to some problems at the hotel Gopi meets Maala's father Kurup by mistake Instead of jewel agent Abdullah. \n ")


        System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-5 Begins");
		this.slowPrint();
		scene.setScene5();
		scene.printScene5();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-6                                          ");
		System.out.println("                                       ---------                                         ");
		// System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println(" Gopi meets Felix as Veena's cousin and ask to marry her for that he will arrange the dowry. \n Felix meets Veena ");


		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-6 Begins");
		this.slowPrint();
		scene.setScene6();
		scene.printScene6();
		System.out.println("+---------------------------------------------------------------------------------------+");

		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                       The End                                          ");
		System.out.println("                                      ----------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
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
