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








public boolean equals(Object o) 
{

if((o instanceof Actor) && (((Actor)o).actorName == actorName)) 
{
return true;
}
else 
{
return false;
}

}
public int hashCode() 
{
	return actorName.length(); 
}
















/*


HashMap<String, ArrayList<Item>> items = new HashMap<String, ArrayList<Item>>();

public synchronized void addToList(String Hero, Item myItem)
 {
    List<Item> itemsList = items.get(Hero);

    // if list does not exist create it

        if(itemsList == null) 
        {
         itemsList = new ArrayList<Item>();
         itemsList.add(myItem);
         items.put(Hero, itemsList);
    } 
    else
     {
        // add if item is not already in list
        if(!itemsList.contains(myItem)) itemsList.add(myItem);
    }
}



Map<String , ArrayList<Actor>> actorsInMovie=new HashMap<String , ArrayList<Actor>>();

public synchronized void addToList(String typeOfActor, Actor actor)
 {
    List<Actor> actorsList = actorsInMovie.get(typeOfActor);


       if(actorsList == null)
       {
               actorsList=new ArrayList<Actor>();
               actorsList.add(actor);
               actorsInMovie.put(typeOfActor,actorsList);
       }
       else
       {
           if(!actorsList.contains(actor)) 
           	actorsList.add(actor);
       }
*/

}