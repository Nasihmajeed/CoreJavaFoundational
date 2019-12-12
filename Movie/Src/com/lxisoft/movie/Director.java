package com.lxisoft.movie;
import java.lang.Math;
public class Director
{
	
	String name;
	
		
	public String directes()
	{
		int num=(int)(Math.random()*4);	
		
		Script script=new Script();
		String scene;
		scene=script.scenes(num);
		return scene;
		
	}
	public Actor[] castActor()
	{	
		
		Hero hero=castHero(); 
		Villain villain=castVillain();
		Comedian comedian=castComedian();
		Heroin heroin=castHeroin();
		Actor[] a={hero,villain,comedian,heroin};
		return a;
	}	
	public Hero castHero()
	{
		int num=(int)(Math.random()*4);	
		Hero hero=new Hero();
		int n1=num;		
		String[] actorname={"Ajith","Bruce","Prem nazir","Tony"};
		hero.setActorname(actorname[n1]);

		int n2=num;
		String[] character={"(police)","(Business Man)","(fisher)","(Superhero)"};
		hero.setCharecter(character[n2]);
		return hero;
	}
	public Villain castVillain()
	{
		int num=(int)(Math.random()*4);	
		Villain villain=new Villain();
		int n3=num;
		String[] actorname={"Sankil","Bane","Nambiyar","Thanos"};
		villain.setActorname(actorname[n3]);

		int n4=num;
		String[] character={"(Gangster)","(patient)","(fisher)","(Alien)"};
		villain.setCharecter(character[n4]);
		return villain;
	}
	public Comedian castComedian()
	{
		int num=(int)(Math.random()*4);	
		Comedian comedian=new Comedian();
		int n5=num;
		String[] actorname={"Kultheep","Alfred","Nagesh","Drax"};
		comedian.setActorname(actorname[n5]);

		int n6=num;
		String[] character={"(Constable","(Worker)","(Boat worker)","(Alien)"};
		comedian.setCharecter(character[n6]);
		return comedian;
	}
	public Heroin castHeroin()
	{
		int num=(int)(Math.random()*4);	
		Heroin heroin=new Heroin();
		int n7=num;
		String[] actorname={"nayanthara","bennu","jaya","natasha"};
		heroin.setActorname(actorname[n7]);

		int n8=num;	
		String[] character={"(police)","(Worker)","(Boat worker)","(Agent)"};
		heroin.setCharecter(character[n8]);
		return heroin;
	}
	
}