package com.lxisoft.movie;
import java.util.Scanner;
import java.lang.Math;
import java.util.*;
public class Director
{
	String name;
	String directionControl;
	Actor[] castList;	
	public void SetDirectes()
	{
		int randscenenum=(int)(Math.random()*4);	
		
		Script script=new Script();
		String scene;
		scene=script.scenes(randscenenum);
		
		directionControl=scene;
	}
	public String getDirectes()
	{
		return directionControl;
	}
	
	public void setCastActor()throws ArrayIndexOutOfBoundsException
	{	
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter number of Actor :");
		int number=scr.nextInt();
		castList=new Actor[number];		
		
		for (int i=0;i<number;i++) 
		{
			System.out.println("select charecters \n1 : Hero \n2 : Comedian \n3 : Villain \n4 : Heroin");
			int num=scr.nextInt();
			Hero hero=castHero(); 
			Comedian comedian=castComedian();
			Villain villain=castVillain();		
			Heroin heroin=castHeroin();
			ArrayList<Actor> a=new ArrayList<Actor>();
			a.add(hero);
			a.add(comedian);
			a.add(villain);
			a.add(heroin);
			castList[i]=a.get(--num);
		}
		
	}	
	public Actor[] getCastActor()
	{
		return castList;
	}
	public Hero castHero()
	{
		int randhero=(int)(Math.random()*4);	
		Hero hero=new Hero();
		ArrayList<String>actorname=new ArrayList<String>();
		actorname.add("Ajith");
		actorname.add("Bruce");
		actorname.add("Prem nazir");
		actorname.add("Tony");
		actorname.add("miles morales");
		actorname.add("peter parker");
		hero.setActorName(actorname.get(randhero));
		ArrayList<String>character=new ArrayList<String>();
		character.add("(police)");
		character.add("(Business Man)");
		character.add("(fisher)");
		character.add("(Superhero)");
		character.add("(Supernatural guy)");
		character.add("(Spiderman)");
		hero.setCharecter(character.get(randhero));
		return hero;
	}
	public Comedian castComedian()
	{
		int randcomedian=(int)(Math.random()*6);	
		Comedian comedian=new Comedian();
		ArrayList<String>actorname=new ArrayList<String>();
		actorname.add("Kultheep");
		actorname.add("Alfred");
		actorname.add("Nagesh");
		actorname.add("Drax");
		actorname.add("Rocket");
		actorname.add("martin");
		
		comedian.setActorName(actorname.get(randcomedian));

		ArrayList<String>character=new ArrayList<String>();
		character.add("(Constable)");
		character.add("(Worker)");
			character.add("(Boat worker)");
				character.add("(Alien)");
					character.add("(physian)");
						character.add("(Gangleader)");
		comedian.setCharecter(character.get(randcomedian));
		return comedian;
	}
	public Villain castVillain()
	{
		int randvillain=(int)(Math.random()*6);	
		Villain villain=new Villain();
	
		ArrayList<String>actorname=new ArrayList<String>();
		actorname.add("Sankil");
		actorname.add("Bane");
		actorname.add("Nambiyar");
		actorname.add("Thanos");
		actorname.add("Kingpin");
		actorname.add("DR:Octobus");
		villain.setActorName(actorname.get(randvillain));

		ArrayList<String>character=new ArrayList<String>();
		character.add("(Gangster)");
		character.add("(patient)");
		character.add("(fisher)");
		character.add("(Alien)");
		character.add("(Bussinesman)");
		character.add("(Scientist)");
		villain.setCharecter(character[randvillain]);
		return villain;
	}
	public Heroin castHeroin()
	{
		int randheroin=(int)(Math.random()*4);	
		Heroin heroin=new Heroin();
		
		ArrayList<String>actorname=new ArrayList<String>();
		actorname.add("nayanthara");
		actorname.add("bennu");
		actorname.add("jaya");
		actorname.add("natasha");
		heroin.setActorName(actorname.get(randheroin));

		ArrayList<String>character=new ArrayList<String>();	
		character.add("(police)");
		character.add("(Worker)");
		character.add("(Boat worker)");
		character.add("(Agent)");
		heroin.setCharecter(character.get(randheroin));
		return heroin;
	}
	/*public */
	
}