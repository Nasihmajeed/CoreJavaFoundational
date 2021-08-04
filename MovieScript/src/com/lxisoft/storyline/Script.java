package com.lxisoft.storyline;
import java.io.*;
import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;


public class Script
{
	ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
	public void showComedyScene(ArrayList<Dialogue> comedyDialogueLinesFromFile,Map<String,ArrayList<Actor>> cast )
	{
		for(int i=0;i<comedyDialogueLinesFromFile.size();i++ )
			{
			
			
					if(comedyDialogueLinesFromFile.get(i) instanceof ComedyDialogue)
					{
						if(i%2==0 && i>0)
						{
							System.out.print(cast.get("Comedian").get(0).getCharacterName());
							System.out.print("("+cast.get("Comedian").get(0).getActorName()+")");
							System.out.println(comedyDialogueLinesFromFile.get(i).getDialogueLine());
							
						}	
						else if(i>2 && i>0)
						{	
							System.out.print(cast.get("Hero").get(0).getCharacterName());
							System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
							
							System.out.println(comedyDialogueLinesFromFile.get(i).getDialogueLine());
						}	
							
					}	
	}
}
	public void showRomanticScene(ArrayList<Dialogue> romanticDialogueLinesFromFiles,Map<String,ArrayList<Actor>> cast)
	{	for(int i=0;i<romanticDialogueLinesFromFiles.size();i++ )
		{
			if(romanticDialogueLinesFromFiles.get(i) instanceof RomanticDialogue)
							{
								
								if(i%2==0)
								{	
									System.out.print(cast.get("Hero").get(0).getCharacterName());
									System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
									System.out.println(romanticDialogueLinesFromFiles.get(i).getDialogueLine());
								}
								else if(i>2)
								{	
									System.out.print(cast.get("Heroine").get(0).getCharacterName());
									System.out.print("("+cast.get("Heroine").get(0).getActorName()+")");
									System.out.println(romanticDialogueLinesFromFiles.get(i).getDialogueLine());
								}
							}

		}
	}
	public void showEmotionalScene(ArrayList<Dialogue> emotionalDialogueLinesFromFiles,Map<String,ArrayList<Actor>> cast)
	{	for(int i=0;i<emotionalDialogueLinesFromFiles.size();i++ )
		{
			if(emotionalDialogueLinesFromFiles.get(i) instanceof EmotionalDialogue)
							{
								
								if(i%2==0 && i>0)
								{	
									System.out.print(cast.get("Hero").get(0).getCharacterName());
									System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
									System.out.println(emotionalDialogueLinesFromFiles.get(i).getDialogueLine());
								}
								else if(i>2 && i>0)
								{	
									System.out.print(cast.get("Heroine").get(0).getCharacterName());
									System.out.print("("+cast.get("Heroine").get(0).getActorName()+")");
									System.out.println(emotionalDialogueLinesFromFiles.get(i).getDialogueLine());
								}
							}
		}
	}
	public void showThrillerScene(ArrayList<Dialogue> thrillerDialogueLinesFromFiles,Map<String,ArrayList<Actor>> cast)
	{	for(int i=0;i<thrillerDialogueLinesFromFiles.size();i++ )
		{
			if(thrillerDialogueLinesFromFiles.get(i) instanceof ThrillerDialogue)
							{
								
								if(i%2==0 && i>0)
								{	
									System.out.print(cast.get("Hero").get(0).getCharacterName());
									System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
									System.out.println(thrillerDialogueLinesFromFiles.get(i).getDialogueLine());
								}
								else if(i>2 && i>0)
								{	
									System.out.print(cast.get("Villan").get(0).getCharacterName());
									System.out.print("("+cast.get("Villan").get(0).getActorName()+")");
									System.out.println(thrillerDialogueLinesFromFiles.get(i).getDialogueLine());
								}
							}
		}
	

	}
	


}


