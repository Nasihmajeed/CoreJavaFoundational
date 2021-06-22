package com.lxisoft.controller;
import com.lxisoft.controller.*;
import com.lxisoft.controller.Heroine;
import com.lxisoft.model.*;
import com.lxisoft.view.*;

import com.lxisoft.repository.*;
import java.util.*;

public class Controller 
{
	int i,number;
	Scanner input=new Scanner(System.in);

		Cast hero=new Hero();
		Cast heroine=new Heroine();
		Cast comedian=new Comedian();
		Cast villain=new Villain();

	ArrayList<Cast>cast=new ArrayList<Cast>();

	Map<String,ArrayList<Cast>> castMap=new HashMap<String,ArrayList<Cast>>();
		
	Map<String,ArrayList<Cast>> heros = new HashMap<String,ArrayList<Cast>>();
	Map<String,ArrayList<Cast>> heroines = new HashMap<String,ArrayList<Cast>>();
	Map<String,ArrayList<Cast>> comedians = new HashMap<String,ArrayList<Cast>>();
	Map<String,ArrayList<Cast>> villains = new HashMap<String,ArrayList<Cast>>();

    public void setCast()
    {
		this.setHero();
		this.setHeroine();
		this.setComedian();
		this.setVillain();
	}

	public void setHero()
	{
		System.out.print("Number of Heros	\t\t\t: ");
		number = input.nextInt();

		for(i=0;i<number;i++)
		{
				System.out.print("Name of Hero "+(i+1)+" \t\t\t\t: ");
				hero.name = input.next();
				System.out.print("Character name of "+hero.name+"\t\t: ");
				hero.character = input.next();
				cast.add(new Hero());
				cast.get(i).setName(hero.name);
				cast.get(i).setCharacter(hero.character);
				heros.put("Hero",cast);
			
		}
	}
	public void setHeroine()
	{
		System.out.print("Number of Heroines \t\t\t: ");
		number = input.nextInt();

		for(i=0;i<number;i++)
		{
				System.out.print("Name of Heroine "+(i+1)+" \t\t\t: ");
				heroine.name = input.next();
				System.out.print("Character name of "+heroine.name+"\t\t: ");
				heroine.character = input.next();
				cast.add(new Heroine());
				cast.get(i).setName(heroine.name);
				cast.get(i).setCharacter(heroine.character);
				heroines.put("Heroine",cast);
			
		}
	}
	public void setComedian()
	{
		System.out.print("Number of Comedians \t\t\t: ");
		number = input.nextInt();

		for(i=0;i<number;i++)
		{
				System.out.print("Name of Comedian "+(i+1)+" \t\t\t: ");
				comedian.name = input.next();
				System.out.print("Character name of "+comedian.name+" \t\t: ");
				comedian.character = input.next();
				cast.add(new Comedian());
				cast.get(i).setName(comedian.name);
				cast.get(i).setCharacter(comedian.character);
				comedians.put("Comedian",cast);
			
		}
	}
	public void setVillain()
	{
		System.out.print("Number of Villains \t\t\t: ");
		number = input.nextInt();

		for(i=0;i<number;i++)
		{
				System.out.print("Name of Villain "+(i+1)+" \t\t\t: ");
				villain.name = input.next();
				System.out.print("Character name of "+villain.name+" \t\t: ");
				villain.character = input.next();
				cast.add(new Villain());
				cast.get(i).setName(villain.name);
				cast.get(i).setCharacter(villain.character);
				villains.put("Villain",cast);
			
		}
	}

	public void printCast()
	{
		for(int i=0;i<cast.size();i++)
		{	
			System.out.println(" "+castMap.get("Hero").get(i).getName()+" "+castMap.get("Hero").get(i).getCharacter());
 			System.out.println(" "+castMap.get("Heroine").get(i).getName()+" "+castMap.get("Heroine").get(i).getCharacter());
 			System.out.println(" "+castMap.get("Comedian").get(i).getName()+" "+castMap.get("Comedian").get(i).getCharacter());
 			System.out.println(" "+castMap.get("Villain").get(i).getName()+" "+castMap.get("Villain").get(i).getCharacter());
		}
	}

	public Map<String,ArrayList<Cast>> getHero()
	{
		return heros;
	}
	public Map<String,ArrayList<Cast>> getHeroine()
	{
		return heroines;
	}
	public Map<String,ArrayList<Cast>> getComedian()
	{
		return comedians;
	}
	public Map<String,ArrayList<Cast>> getVillain()
	{
		return villains;
	}

    // public void database(int x, ArrayList<Cast> cast)
    // {
    //     Scenes scenes = new Scenes();
		
    // 		if(x==1)
    //     	{
    // 			cl.addToDatabase(cast);
    // 		}
    // 		else if(x==2)
    //     	{
    // 			cl.showDatabase();
    // 		}
    // 		else if(x==3)
    //     	{
    // 			cl.deleteFromDatabase();
    // 		}
    // } 
}
