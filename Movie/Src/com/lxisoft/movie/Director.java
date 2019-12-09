package com.lxisoft.movie;
import java.lang.Math;
public class Director
{
	
	String name;
	
	public void direction()
	{
		Script script=new Script();
		String[] scene;
		scene=script.scenes();
		System.out.println(scene[0]);
	}
	public Actor[] casting()
	{	
		Actor[] a=new Actor[4];
		Hero hero=setHero(); 
		Villain villain=setVillain();
		Comedian comedian=setComedian();
		Heroin heroin=setHeroin();
		a[0]=hero;
		a[1]=villain;
		a[2]=comedian;
		a[3]=heroin;
		return a;
		
	}
	public int randomactor()
	{
		int n=(int)(Math.random()*4);	
		return n;
	}
	public Hero setHero()
	{
		Hero hero=new Hero();
		int n1=randomactor();		
		String[] actorname={"Ajith","Bruce","Prem nazir","Tony"};
		hero.setActorname(actorname[n1]);

		int n2=randomactor();
		String[] character={"(police)","(Business Man)","(fisher)","(Superhero)"};
		hero.setCharecter(character[n2]);

		return hero;
	}
	public Villain setVillain()
	{
		Villain villain=new Villain();
		int n3=randomactor();
		String[] actorname={"Sankil","Bane","Nambiyar","Thanos"};
		villain.setActorname(actorname[n3]);

		int n4=randomactor();
		String[] character={"(Gangster)","(patient)","(fisher)","(Alien)"};
		villain.setCharecter(character[n4]);

		return villain;
	}
	public Comedian setComedian()
	{
		Comedian comedian=new Comedian();
		int n5=randomactor();
		String[] actorname={"Kultheep","Alfred","Nagesh","Drax"};
		comedian.setActorname(actorname[n5]);

		int n6=randomactor();
		String[] character={"(Constable","(Worker)","(Boat worker)","(Alien)"};
		comedian.setCharecter(character[n6]);


		return comedian;
	}
	public Heroin setHeroin()
	{
		Heroin heroin=new Heroin();
		int n7=randomactor();
		String[] actorname={"nayanthara","bennu","jaya","natasha"};
		heroin.setActorname(actorname[n7]);

		int n8=randomactor();	
		String[] character={"(police)","(Worker)","(Boat worker)","(Agent)"};
		heroin.setCharecter(character[n8]);


		return heroin;
	}
	
}