package com.lxisoft.movie;
import java.lang.Math;
public class Director
{
	String name;
	Actor[] castList;
	String directionControl;	
	public void SetDirectes()
	{
		int num=(int)(Math.random()*4);	
		
		Script script=new Script();
		String scene;
		scene=script.scenes(num);
		
		directionControl=scene;
	}
	public String getDirectes()
	{
		return directionControl;
	}
	
	public void setCastActor()
	{	
		
		Hero hero=castHero(); 
		Villain villain=castVillain();
		Comedian comedian=castComedian();
		Heroin heroin=castHeroin();
		Actor[] a={hero,villain,comedian,heroin};
		castList=a;
	}	
	public Actor[] getCastActor()
	{
		return castList;
	}
	public Hero castHero()
	{
		int n=(int)(Math.random()*4);	
		Hero hero=new Hero();
			
		String[] actorname={"Ajith","Bruce","Prem nazir","Tony"};
		hero.setActorName(actorname[n]);

		
		String[] character={"(police)","(Business Man)","(fisher)","(Superhero)"};
		hero.setCharecter(character[n]);
		return hero;
	}
	public Villain castVillain()
	{
		int n=(int)(Math.random()*4);	
		Villain villain=new Villain();
	
		String[] actorname={"Sankil","Bane","Nambiyar","Thanos"};
		villain.setActorName(actorname[n]);

	
		String[] character={"(Gangster)","(patient)","(fisher)","(Alien)"};
		villain.setCharecter(character[n]);
		return villain;
	}
	public Comedian castComedian()
	{
		int n=(int)(Math.random()*4);	
		Comedian comedian=new Comedian();
		
		String[] actorname={"Kultheep","Alfred","Nagesh","Drax"};
		comedian.setActorName(actorname[n]);

		
		String[] character={"(Constable","(Worker)","(Boat worker)","(Alien)"};
		comedian.setCharecter(character[n]);
		return comedian;
	}
	public Heroin castHeroin()
	{
		int n=(int)(Math.random()*4);	
		Heroin heroin=new Heroin();
		
		String[] actorname={"nayanthara","bennu","jaya","natasha"};
		heroin.setActorName(actorname[n]);

			
		String[] character={"(police)","(Worker)","(Boat worker)","(Agent)"};
		heroin.setCharecter(character[n]);
		return heroin;
	}
	/*public */
	
}