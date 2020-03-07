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
		List[] list  = script.getScript(repo);
		// System.out.println(list[0].get(0));
		//System.out.println(list[1]);	
	 	playMovie(actorList,list);
	}	
	public void playMovie(ArrayList<Actor> actorList,List[] list)
	{
		System.out.println("Scene One--->>");
		System.out.println("--------IronMan Meeting Thanos In Titan-------------");
		int[] quest = new int[10];
		boolean flag = false;
		do
		{
			int actorOne = random.nextInt(actorList.size());
			int actorTwo = selectCharacter(actorOne);
			int randomDialogue = random.nextInt(10);
			int[] markedQuest = new int[10];
			if(actorList.get(actorOne) instanceof Heroism)
			{
				System.out.println(actorList.get(actorOne).getActorName()+" --> "+  list[actorOne].get(randomDialogue));
				System.out.println(actorList.get(actorTwo).getActorName()+" --> "+  list[actorTwo].get(randomDialogue)); 
				markQuestion(quest,actorOne,actorTwo,randomDialogue);
				for (int num:quest ) 
				{
					System.out.println(num);	
				}	
			}
			else if(actorList.get(actorOne) instanceof Villanism) 
			{
				System.out.println(actorList.get(actorOne).getActorName()+" --> "+  list[actorOne].get(randomDialogue));
				System.out.println(actorList.get(actorTwo).getActorName()+" --> "+  list[actorTwo].get(randomDialogue));
				markQuestion(quest,actorOne,actorTwo,randomDialogue);
				for (int num:quest ) 
				{
					System.out.println(num);	
				}
				
			
			}
		}while(true);		
	}
	public int[] markQuestion(int[] quest,int actorOne,int actorTwo,int randomDialogue)
	{
		int i=0;
		quest[i] = randomDialogue;
		i++;
		return quest;
	}
	// public search(int[] quest,int randomDialogue)
	// {
	// 	for(int i=0;i<quest.length;i++)
	// 	{
	// 		if(quest[i] != randomDialogue)
	// 		{

	// 		}
	// 	}
	// }
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