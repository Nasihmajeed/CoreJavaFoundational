package com.lxisoft.cast;

public class Actor
{

 protected String actorName,actorCharName;

	
   public Actor(String actorName,String actorCharName)
   {
   	this.actorName=actorName;
   	this.actorCharName=actorCharName;
   }


	public String getActorName()
	{
		return actorName;
	}
	
	
	public String getActorCharName()
	{
		return actorCharName;
	}



}