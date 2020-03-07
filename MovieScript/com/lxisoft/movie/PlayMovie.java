package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
public class PlayMovie
{
	Random random = new Random();
	FileRepository repo = new FileRepository();
	public void startMovie(ArrayList<Actor> actorList,Script script)
	{
		List<Dialogue>[] list  = script.getScript(repo);
	 	playMovie(actorList,list);
	}	
	public void playMovie(ArrayList<Actor> actorList,List<Dialogue>[] list)
	{
		System.out.println("Scene One--->>");
		System.out.println("--------IronMan Meeting Thanos In Titan-------------");
		boolean flag = false;
		do
		{
			int actorOne = random.nextInt(actorList.size());
			int actorTwo = selectCharacter(actorOne);
			int randomDialogue = random.nextInt(10);
			if(actorList.get(actorOne) instanceof Heroism)
			{
				System.out.println(actorList.get(actorOne).getActorName()+" --> "+  list[actorOne].get(randomDialogue));
				System.out.println(actorList.get(actorTwo).getActorName()+" --> "+  list[actorTwo].get(randomDialogue));
				System.out.println(list[actorTwo].get(randomDialogue).getMarkDialogue());
			}
			else if(actorList.get(actorOne) instanceof Villanism) 
			{
				System.out.println(actorList.get(actorOne).getActorName()+" --> "+  list[actorOne].get(randomDialogue));
				System.out.println(actorList.get(actorTwo).getActorName()+" --> "+  list[actorTwo].get(randomDialogue));
				System.out.println(list[actorTwo].get(randomDialogue).getMarkDialogue());				
			}
		}while(true);		
	}
	public  int selectCharacter(int actorOne)
	{
		int actorTwo = 0;
		if(actorOne == 0)
		{
			actorTwo = 1;
		}
		else
		{
		 	actorTwo = 0;
		}
		return actorTwo;
	}
}