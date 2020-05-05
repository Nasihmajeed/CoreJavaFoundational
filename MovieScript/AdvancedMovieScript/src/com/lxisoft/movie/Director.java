package com.lxisoft.movie;

import java.util.*;

import com.lxisoft.movie.ScriptWriter;

public class Director {
	
	private String name;
	private List<Dialouge> dialouge;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void selectScript(int movieCode)
	{
		ScriptWriter scriptWriter = new ScriptWriter();
		dialouge = scriptWriter.getScript(movieCode);
		ArrayList<Actor> actors =  this.createActor();
		this.startConversation(dialouge, actors);
		
	}
	
	public ArrayList<Actor> createActor()
	{
		ArrayList<Actor> actor = new ArrayList<>();
		
		if(dialouge.get(0).getCharacterName().equals("comedian") || dialouge.get(0).getCharacterName().equals("villan"))
		{ 
			actor.add(new Comedian());
			actor.add(new Villan());
			actor.get(0).setName("Adarsh");
			actor.get(1).setName("Jishnu");
			return actor;
		}
		else
		{
			return actor;
		}
	}
	
	public void startConversation(List<Dialouge> dialouge,ArrayList<Actor> actors)
	{
		try
		{
			int x = (int)(Math.random()*actors.size());
			for(int i=0;i<4;i++)
			{
				if(actors.get(x) instanceof Comic)
				{
					int y = (int)(Math.random()*3);
					this.printDialouge(dialouge, actors.get(x),"question",y);
					this.printDialouge(dialouge, actors.get(1),"answer",y);	
				}
				else if(actors.get(x) instanceof Villanism)
				{
					int y = (int)(Math.random()*3);
					this.printDialouge(dialouge, actors.get(x),"question",y);
					this.printDialouge(dialouge, actors.get(0),"answer",y);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	public void printDialouge(List<Dialouge> dialouge,Actor actor,String questionOrAnswer,int y)
	{	
		for(int k=0;k<dialouge.size();k++)
		{
			if(dialouge.get(k).getDialougeCode() == y && dialouge.get(k).getQuestionOrAnswer().equals(questionOrAnswer))
			{
				System.out.println(actor.getName()+"("+dialouge.get(k).getCharacterName()+") : "+dialouge.get(k).getDialouge());
			}
		}
		
	}
}
