package com.lxisoft.movie;
import com.lxisoft.movie.Actor;
public  class Actor
{
	String charecterName;
	String actorName;
	String dialogue;
	public void setActorName(String actorName)
	{
		this.actorName=actorName;
	}	
	public String getActorName()
	{
		return this.actorName;
	}
	public void setCharecter(String character)
	{
		this.charecterName=character;
	}
	public String getCharecter()
	{
		return charecterName;
	}
	public void setDialogues(String s)
	{ 
		this.dialogue=s;
	}
	public String getDialogues()	
	{
		return dialogue;
	}  
}
