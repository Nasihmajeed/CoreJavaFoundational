package com.lxisoft.movie;
import java.util.Scanner;
import java.lang.Math;
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
	
	public void setCastActor()
	{	
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter number of Actor :");
		int number=scr.nextInt();
		castList=new Actor[number];		
		
		for (int i=0;i<number;i++) 
		{
			Hero hero=castHero(); 
			Villain villain=castVillain();
			Comedian comedian=castComedian();		
			Heroin heroin=castHeroin();
			int randactor=(int)(Math.random()*4);	
			Actor[] a={hero,villain,comedian,heroin};
			castList[i]=a[randactor];
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
			
		String[] actorname={"Ajith","Bruce","Prem nazir","Tony,miles morales","peter parker"};
		hero.setActorName(actorname[randhero]);
		
		String[] character={"(police)","(Business Man)","(fisher)","(Superhero)","(Supernatural guy)","(Spiderman)"};
		hero.setCharecter(character[randhero]);
		return hero;
	}
	public Villain castVillain()
	{
		int randvillain=(int)(Math.random()*6);	
		Villain villain=new Villain();
	
		String[] actorname={"Sankil","Bane","Nambiyar","Thanos","Kingpin","DR:Octobus"};
		villain.setActorName(actorname[randvillain]);

	
		String[] character={"(Gangster)","(patient)","(fisher)","(Alien)","(Bussinesman)","(Scientist)"};
		villain.setCharecter(character[randvillain]);
		return villain;
	}
	public Comedian castComedian()
	{
		int randcomedian=(int)(Math.random()*6);	
		Comedian comedian=new Comedian();
		
		String[] actorname={"Kultheep","Alfred","Nagesh","Drax","Rocket","martin"};
		comedian.setActorName(actorname[randcomedian]);

		
		String[] character={"(Constable","(Worker)","(Boat worker)","(Alien)","(physian)","Gangleader"};
		comedian.setCharecter(character[randcomedian]);
		return comedian;
	}
	public Heroin castHeroin()
	{
		int randheroin=(int)(Math.random()*4);	
		Heroin heroin=new Heroin();
		
		String[] actorname={"nayanthara","bennu","jaya","natasha"};
		heroin.setActorName(actorname[randheroin]);

			
		String[] character={"(police)","(Worker)","(Boat worker)","(Agent)"};
		heroin.setCharecter(character[randheroin]);
		return heroin;
	}
	/*public */
	
}