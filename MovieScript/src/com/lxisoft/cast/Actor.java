package com.lxisoft.cast;

public class Actor
{

 protected String actorName,actorCharName;



   public Actor()
   {
   	
   }

	
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


  public int hashCode() 
  {
   return actorName.length()+actorCharName.length(); 
  }


  public boolean equals(Object o) 
  {

   if((o instanceof Actor) && (((Actor)o).getActorName() == getActorName()) && (((Actor)o).getActorCharName() == getActorCharName())) 
  {
   return true;
  }
   else 
  {
   return false;
  }

  }

}