package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
public class PlayMovie
{
	Random random = new Random();
	public void startMovie(ArrayList<Actor> actorList,ArrayList<Dialogue> dialogueList,Dialogue dialogue, FileRepository repo)
	{
		getHeroDialogues(dialogueList,dialogue,repo);
		getVillainDialogues(dialogueList,dialogue,repo);
		// for (int i=0;i<dialogueList.size();i++) 
		// {
		// 	System.out.println(i+"= "+dialogueList.get(i).getMovieDialogue());	
		// }
		playMovie(actorList,dialogueList,dialogue);
			
	}
	public ArrayList<Dialogue> getHeroDialogues(ArrayList<Dialogue> dialogueList,Dialogue dialogue,FileRepository repo)
	{
		repo.readFromScript(dialogueList,dialogue,repo,"C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//HeroScript.csv",0);
		return dialogueList;
	}
	public ArrayList<Dialogue> getVillainDialogues(ArrayList<Dialogue> dialogueList,Dialogue dialogue,FileRepository repo)
	{
		repo.readFromScript(dialogueList,dialogue,repo,"C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//VillainScript.csv",5);
		return dialogueList;
	}

	public void playMovie(ArrayList<Actor> actorList,ArrayList<Dialogue> dialogueList,Dialogue dialogue)
	{
		int num = dialogueList.size();
		do
		{
			int actorOne = random.nextInt(actorList.size());
			int actorTwo = random.nextInt(actorList.size());
			int dialogueOne = random.nextInt(4-0)+0;
			int dialogueTwo = random.nextInt(9-4)+4;
			// System.out.println("qustion="+dialogueOne);
			// System.out.println("qustion="+dialogueTwo);
			num = checkActor(actorList,actorOne,actorTwo,dialogueList,dialogue,dialogueOne,dialogueTwo);
			System.out.println(num);	
		}while(num>1);
	}
	public int checkActor(ArrayList<Actor> actorList,int actorOne,int actorTwo,ArrayList<Dialogue> dialogueList,Dialogue dialogue,int dialogueOne,int dialogueTwo)
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
		// System.out.println("removed qustion="+dialogueOne);
		// System.out.println("removed qustion="+dialogueTwo);
		// for (int i=0;i<dialogueList.size();i++) 
		// {
		// 	System.out.println(i+"= "+dialogueList.get(i).getMovieDialogue());	
		// }
		questionCount = questionCount-1;
		questionCount = questionCount-1;
		return questionCount;
	}
}