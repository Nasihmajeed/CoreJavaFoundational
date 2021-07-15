package com.lxisoft.view;
import com.lxisoft.model.*;
import com.lxisoft.controller.*;

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Map.Entry;

public class Movies 
{
    String movieName;
    String director;
    String genre;

	Theatre theatre = new Theatre();
	Controller controller = new Controller();
	SceneSetting setScene = new SceneSetting();

	ArrayList<Entry<String, String>> cast = new ArrayList<Entry<String,String>>();
	ArrayList<String> search = new ArrayList<>();
	
	ArrayList<String> heroCast = new ArrayList<>();
	ArrayList<String> heroineCast = new ArrayList<>();
	ArrayList<String> comedianCast = new ArrayList<>();
	ArrayList<String> villainCast = new ArrayList<>();

	ArrayList<String> hero= new ArrayList<String>();
	ArrayList<String> heroine= new ArrayList<String>();
	ArrayList<String> comedian= new ArrayList<String>();
	ArrayList<String> villain= new ArrayList<String>();

	Scanner input = new Scanner(System.in);

	public Movies()
	{
		controller.setCast(cast);
	}

	public void movieInput()
	{
		System.out.print("\n\nEnter Movie Name	: ");
		movieName = input.next();
		System.out.print("Director Name		: ");
		director = input.next();
		System.out.print("Enter genre		: ");
		genre = input.next();

		this.movieOptions();
	}

    public void movieOptions()
    {
		this.casting();
        Scanner s = new Scanner(System.in);
        int option;
        do
        {
            System.out.println("\nSelect option : \n	1.Play Script \n	2.View Cast \n	3.Ticket booking \n	4.Database \n	0.Exit");
			System.out.print("\nEnter option : ");
            option = s.nextInt();
            if(option==1)
            {
				do
				{
					System.out.println("\nSelect option : \n	1.Comedy scene \n	2.Romantic scene \n	3.Thriller scene \n	4.Emotional scene \n	0.Exit");
					System.out.print("\nEnter option : ");
					option = s.nextInt();
					if(option==1)
            		{
						// System.out.print("\n\n>> Comedy Scene <<\n\n");
             		   	this.setComedyScene();
            		}
					else if(option==2)
					{
						// System.out.print("\n\n>> Romantic Scene <<\n\n");
						this.setRomanticScene();
					}
					else if(option==3)
					{
						// System.out.print("\n\n>> Thriller Scene <<\n\n");
						this.setThrillerScene();
					}
					else if(option==4)
					{
						// System.out.print("\n\n>> Emotional Scene <<\n\n");
						this.setEmotionalScene();
					}
					else if(option==0)
					{
						this.movieOptions();
					}
				}
				while(option!=0);
			}
            else if(option==2)
            {
                this.printCast();
				int x;
				do
				{
					System.out.println("\n	Select option : \n		1.Search actors \n		0.Exit");
					System.out.print("\n	Enter option : ");
                	x = s.nextInt();
					if(x==1)
					{
						this.search();
					}
                }
				while(x!=0);
            }
			else if(option==3)
			{
				theatre.selectSeat();
			}
			else if(option==4)
			{
				int opt;
				do
				{
					System.out.println("\n	Select option : \n		1.Add to Database \n		2.View Database \n		3.Delete from Database \n		0.Exit");
					opt = s.nextInt();
					controller.database(opt, cast);
				}
				while(opt!=0);
			}
		}
        while(option!=0);
    }

	public void search()
	{
		for(int k=0;k<cast.size();k++)
        {
			search.add(cast.get(k).getKey());
		}

		Scanner s = new Scanner(System.in);
		System.out.print("\n	Enter actor name : ");
		String actor = s.nextLine();
		
		if(search.contains(actor))
		{
			System.out.println(" 	Actor "+actor+" is acting in this movie");
		}
		else
		{
			System.out.println(" 	Actor "+actor+" is not acting in this movie");
			return;
		}
	}

	public void casting()
	{
		controller.setHero(heroCast);
		controller.setHeroine(heroineCast);
		controller.setComedian(comedianCast);
		controller.setVillain(villainCast);

		for(int k=0;k<heroCast.size();k++)
        {
			hero.add(heroCast.get(k));
		}
		
		for(int k=0;k<heroineCast.size();k++)
        {
			heroine.add(heroineCast.get(k));
		}
		
		for(int k=0;k<comedianCast.size();k++)
        {
			comedian.add(comedianCast.get(k));
		}

		for(int k=0;k<villainCast.size();k++)
        {
			villain.add(villainCast.get(k));
		}
	}
   
    public void printCast()
    {
        System.out.println("\nMovie Cast : \n");
		System.out.println("+------+-----------------------+-----------------------+");
		System.out.println("   ID          Name                   Character");
		System.out.println("+------+-----------------------+-----------------------+");
        
		for(int k=0;k<cast.size();k++)
        { 
            System.out.println("   "+(k+1)+"\t   "+cast.get(k).getKey()+"\t\t\t   "+cast.get(k).getValue()); 
        } 
		System.out.println("+------+-----------------------+-----------------------+");
    }

	public void setComedyScene()
	{	this.setMovie();
		setScene.printComedyScene();
		setScene.printRomanticScene();
		setScene.printEmotionalScene();
		setScene.printThrillerScene();
	}

	public void setRomanticScene()
	{
		this.setMovie();
		setScene.printEmotionalScene();
		setScene.printThrillerScene();
		setScene.printComedyScene();		
		setScene.printRomanticScene();
	}

	public void setEmotionalScene()
	{
		this.setMovie();
		setScene.printEmotionalScene();
		setScene.printThrillerScene();
		setScene.printComedyScene();
		setScene.printRomanticScene();
	}

	public void setThrillerScene()
	{
		this.setMovie();
		setScene.printThrillerScene();
		setScene.printComedyScene();
		setScene.printRomanticScene();
		setScene.printEmotionalScene();
	}

	/*public void printit()
	{
		System.out.println(">> Heros <<");
		for(int j=0; j<hero.size(); j++)
        {
			System.out.println((j+1)+" "+hero.get(j));
		}
		System.out.println(">> Heroines <<");
		for(int j=0; j<heroine.size(); j++)
        {
			System.out.println((j+1)+" "+heroine.get(j));	
		}
		System.out.println(">> Comedians <<");
		for(int j=0; j<comedianCast.size(); j++)
        {
			System.out.println((j+1)+" "+comedian.get(j));	
		}
		System.out.println(">> Villains <<");
		for(int j=0; j<villainCast.size(); j++)
        {
			System.out.println((j+1)+" "+villain.get(j));
		}
	}*/

    public void setMovie()
    {
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                   |                                        "+movieName+"\t\t\t\t\t   |");
		System.out.println("                                                   |                                Directed by : "+director+"\t\t\t\t   |");
		System.out.println("                                                   |    Genere : "+genre+"\t\t\t\t\t\t  IMDb Rating : 6.7/10     |");
		System.out.println("                                                   |    Plot   :  Life of a thief and the unexpected twists and situations in his life     |");
		System.out.println("                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("\n                                                   +---------------------------------------------------------------------------------------+");
		System.out.println("                                                                                           Scene-1                                          ");
		System.out.println("                                                                                          ---------                                         ");
	}
}
