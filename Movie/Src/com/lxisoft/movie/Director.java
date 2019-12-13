package com.lxisoft.movie;
import java.lang.Math;
public class Director
{
	
	String name;
	Actor[] cast;
		
	public String directes()
	{
		
		int n=(int)(Math.random()*4);
		Script script=new Script();
		String scene;
		scene=script.scenes(n);
		return scene;
		
		
	}
	public void setCastActor()
	{	 
		Hero hero=getHero(); 
		Villain villain=getVillain();
		Comedian comedian=getComedian();
		Heroin heroin=getHeroin();
		cast[0]=hero;
		cast[1]=villain;
		cast[2]=comedian;
		cast[3]=heroin;
		
	}	
	public Actor[] getCastActor()
	{
		return cast;
	}
	public Hero getHero()
	{
		int num=(int)(Math.random()*4);	
		Hero hero=new Hero();
		int n1=num;		
		String[] actorname={"Ajith","Bruce","Prem nazir","Tony"};
		hero.setActorName(actorname[n1]);

		int n2=num;
		String[] character={"(police)","(Business Man)","(Ship captain)","(Superhero)"};
		hero.setCharecter(character[n2]);
		return hero;
	}
	public Villain getVillain()
	{
		int num=(int)(Math.random()*4);	
		Villain villain=new Villain();
		int n3=num;
		String[] actorname={"Sankil","Bane","Nambiyar","Thanos"};
		villain.setActorName(actorname[n3]);

		int n4=num;
		String[] character={"(Gangster)","(patient)","(fisher)","(Alien)"};
		villain.setCharecter(character[n4]);
		return villain;
	}
	public Comedian getComedian()
	{
		int num=(int)(Math.random()*4);	
		Comedian comedian=new Comedian();
		int n5=num;
		String[] actorname={"Kultheep","Alfred","Nagesh","Drax"};
		comedian.setActorName(actorname[n5]);

		int n6=num;
		String[] character={"(Constable)","(Worker)","(Boat worker)","(Alien)"};
		comedian.setCharecter(character[n6]);
		return comedian;
	}
	public Heroin getHeroin()
	{
		int num=(int)(Math.random()*4);	
		Heroin heroin=new Heroin();
		int n7=num;
		String[] actorname={"nayanthara","wanda","jaya","natasha"};
		heroin.setActorName(actorname[n7]);

		int n8=num;	
		String[] character={"(police)","(Worker)","(Boat Dancer)","(Agent)"};
		heroin.setCharecter(character[n8]);
		return heroin;
	}
	
}