package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
public class PlayMovie
{
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	FileRepository repo = new FileRepository();	
	public void startMovie(ArrayList<Actor> actorList,Script script)
	{
		System.out.println("1.Play Movie\n2.Edit Script\n");
		int ch = sc.nextInt();
		switch (ch) 
		{
			case 1:playMovie(actorList,list);break;
			case 2:script.editScript(actorList,list);break;
			default: System.out.println("Enter valid choice!!!!!!");break;	
		}		
	}	
	public void playMovie(ArrayList<Actor> actorList,List<Dialogue>[] list)
	{
		script.getScript(repo);
		System.out.println("Scene One--->>");
		System.out.println("--------IronMan Meeting Thanos In Titan-------------");
		System.out.println(actorList.get(0).getActorName()+" As "+actorList.get(0).getNameOfRole());
		System.out.println(actorList.get(1).getActorName()+" As "+actorList.get(1).getNameOfRole());
		boolean flag = false;
		int temp = 0;
		int actorOne;
		int actorTwo;
		int randomDialogue;
		do
		{
			actorOne = random.nextInt(actorList.size());
			actorTwo = selectCharacter(actorOne);
			randomDialogue = random.nextInt(5);
			int opponentDialogue = 0; 
			if(actorList.get(actorOne) instanceof Heroism)
			{
				temp = actorConversation(actorList,list,actorOne,actorTwo,randomDialogue,opponentDialogue);
			}	
			else if(actorList.get(actorOne) instanceof Villanism) 
			{
				temp = actorConversation(actorList,list,actorOne,actorTwo,randomDialogue,opponentDialogue);		
			}					
			else
			{
				System.out.println("----------THE END------------");
			}
		}while(true);		
	}
	public  int actorConversation(ArrayList<Actor> actorList,List<Dialogue>[] list,int actorOne,int actorTwo,int randomDialogue,int opponentDialogue)
	{
		if(randomDialogue<=4)
		{
			opponentDialogue = randomDialogue+5;
			if(list[actorOne].get(randomDialogue).getMarkDialogue()!=false && list[actorTwo].get(opponentDialogue).getMarkDialogue()!=false)
			{
				System.out.println(actorList.get(actorOne).getNameOfRole()+" --> "+  list[actorOne].get(randomDialogue));
				System.out.println(actorList.get(actorTwo).getNameOfRole()+" --> "+  list[actorTwo].get(opponentDialogue));
				list[actorOne].get(randomDialogue).setMarkDialogue(false);
				list[actorTwo].get(opponentDialogue).setMarkDialogue(false);
				randomDialogue--;
			}	
		}
		else if(randomDialogue>4)
		{
			opponentDialogue = randomDialogue-5;
			if(list[actorOne].get(randomDialogue).getMarkDialogue()!=false && list[actorTwo].get(opponentDialogue).getMarkDialogue()!=false)
			{
				System.out.println(actorList.get(actorOne).getNameOfRole()+" --> "+  list[actorTwo].get(opponentDialogue));
				System.out.println(actorList.get(actorTwo).getNameOfRole()+" --> "+  list[actorOne].get(randomDialogue));
				list[actorTwo].get(randomDialogue).setMarkDialogue(false);
				list[actorOne].get(opponentDialogue).setMarkDialogue(false);
				randomDialogue--;
			}	
		}
		return randomDialogue;
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