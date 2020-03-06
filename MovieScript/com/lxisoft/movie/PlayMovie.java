package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
public class PlayMovie
{
	Random random = new Random();
	FileRepository repo = new FileRepository();
	public void startMovie(ArrayList<Actor> actorList,ArrayList<Dialogue> dialogueList)
	{
		getHeroDialogues(dialogueList);
		//getVillainDialogues(dialogueList);
		System.out.println(dialogueList.size());
		for (int i=0;i<dialogueList.size();i++) 
		{
			System.out.println(i+"= "+dialogueList.get(i).getMovieDialogue());	
		}
		playMovie(actorList,dialogueList);
			
	}
	public ArrayList<Dialogue> getHeroDialogues(ArrayList<Dialogue> dialogueList)
	{
		repo.readFromScript(dialogueList,"C://Users//rahul//Desktop//Java Projects//MovieScript//v2//com//lxisoft//repository//IronManScript.csv",0);
		return dialogueList;
	}
	// public ArrayList<Dialogue> getVillainDialogues(ArrayList<Dialogue> dialogueList)
	// {
	// 	repo.readFromScript(dialogueList,"C://Users//rahul//Desktop//Java Projects//MovieScript//v2//com//lxisoft//repository//VillainScript.csv",10);
	// 	return dialogueList;
	// }

	public void playMovie(ArrayList<Actor> actorList,ArrayList<Dialogue> dialogueList)
	{
		int num = dialogueList.size();
		int i=0;
		do
		{
			int actorOne = random.nextInt(actorList.size());
			int actorTwo = random.nextInt(actorList.size());
			int dialogueOne = random.nextInt((9-0)+0);
			int dialogueTwo = dialogueOne;
			num = checkActor(actorList,actorOne,actorTwo,dialogueList,dialogueOne,dialogueTwo);
			System.out.println(num);	
		}while(num>1);
	}
	public int checkActor(ArrayList<Actor> actorList,int actorOne,int actorTwo,ArrayList<Dialogue> dialogueList,int dialogueOne,int dialogueTwo)
	{	
		int num  = dialogueList.size();
		if(actorList.get(actorOne) instanceof Heroism)
		{	
			System.out.println(actorList.get(actorOne).getNameOfRole()+" = "+dialogueList.get(dialogueOne).getMovieDialogue());
			System.out.println(actorList.get(actorTwo).getNameOfRole()+" = "+dialogueList.get(dialogueTwo).getMovieDialogue());
			num = noOfQuestion(dialogueList,dialogueOne,dialogueTwo);
		}
		else if(actorList.get(actorOne) instanceof Villanism)
		{
			System.out.println(actorList.get(actorOne).getNameOfRole()+" = "+dialogueList.get(dialogueTwo).getMovieDialogue());
			System.out.println(actorList.get(actorTwo).getNameOfRole()+" = "+dialogueList.get(dialogueOne).getMovieDialogue());
			num = noOfQuestion(dialogueList,dialogueOne,dialogueTwo);
		}
		return num;
	}
	public  int noOfQuestion(ArrayList<Dialogue> dialogueList,int dialogueOne,int dialogueTwo)
	{
		int questionCount = dialogueList.size();
		dialogueList.remove(dialogueOne);
		dialogueList.remove(dialogueTwo);
		questionCount = questionCount-1;
		questionCount = questionCount-1;
		return questionCount;
	}
}