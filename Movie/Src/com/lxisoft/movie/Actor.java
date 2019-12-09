package com.lxisoft.movie;
import com.lxisoft.movie.Actor;
public  class Actor
{
	String actorcharecter;
	String actorname;
	String dialogue;

	public void setActorname(String actorname)
	{
		this.actorname=actorname;
	}	
	public String getActorname()
	{
		return actorname;
	}
	public void setCharecter(String character)
	{
		this.actorcharecter=character;
	}
	public String getCharecter()
	{
		return actorcharecter;
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
