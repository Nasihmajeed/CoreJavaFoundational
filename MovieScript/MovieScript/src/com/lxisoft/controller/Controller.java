package com.lxisoft.controller;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
import java.util.*;

public class Controller 
{
    Gopi gopi = new Gopi();
    Veena veena = new Veena();
   	Mani mani = new Mani();
    Felix felix = new Felix();
    CastList cl = new CastList();
	Scenes scenes = new Scenes();

    public void setCast(ArrayList<Cast> cast)
    {
		System.out.println("\nSet Cast");
		Scanner s = new Scanner(System.in);
		System.out.print(" Hero name		: ");	
        cast.add(new Cast());
		cast.get(0).setName(s.next());
		// cast.get(0).setAge(38);
		System.out.print(" Character name		: ");
		cast.get(0).setCharacterName(s.next());

		System.out.print(" Heroine name		: ");
		cast.add(new Cast());
		cast.get(1).setName(s.next());
		// cast.get(1).setAge(28);
		System.out.print(" Character name		: ");
		cast.get(1).setCharacterName(s.next());

		System.out.print(" Comedian name		: ");
		cast.add(new Cast());
		cast.get(2).setName(s.next());
		// cast.get(2).setAge(41);
		System.out.print(" Character name		: ");
		cast.get(2).setCharacterName(s.next());

        cast.add(new Cast());
		System.out.print(" Villain name		: ");
		cast.get(3).setName(s.next());
		// cast.get(3).setAge(32);
		System.out.print(" Character name		: ");
		cast.get(3).setCharacterName(s.next());
		
    }

    public void viewActors()
    {
        Scanner s = new Scanner(System.in);
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

    public void database(int x, ArrayList<Cast> cast)
    {
        Scenes scenes = new Scenes();
		
    		if(x==1)
        	{
    			cl.addToDatabase(cast);
    		}
    		else if(x==2)
        	{
    			cl.showDatabase();
    		}
    		else if(x==3)
        	{
    			cl.deleteFromDatabase();
    		}
    } 
}
