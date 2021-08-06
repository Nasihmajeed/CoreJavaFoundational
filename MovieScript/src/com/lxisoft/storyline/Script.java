package com.lxisoft.storyline;
import java.io.*;
import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;


public class Script
{
	ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
	public void showComedyScene(ArrayList<Dialogue> comedyDialogues,Map<String,ArrayList<Actor>> actors )
	{
		for(int i=0;i<comedyDialogues.size();i++)
			{
			
			
					if(comedyDialogues.get(i) instanceof ComedyDialogue  )
					{	
							if(i%2==0  )
							{
							
								System.out.print(actors.get("Comedian").get(0).getCharacterName());
							System.out.print("("+actors.get("Comedian").get(0).getActorName()+")");
							System.out.println(comedyDialogues.get(i).getDialogueLine());
							
						}	
						else 
						{	
							
								System.out.print(actors.get("Hero").get(0).getCharacterName());
							System.out.print("("+actors.get("Hero").get(0).getActorName()+")");
							
							
							System.out.println(comedyDialogues.get(i).getDialogueLine());
						}
						//}	
							
					}	
	}
}
	public void showRomanticScene(ArrayList<Dialogue> romanticDialogues,Map<String,ArrayList<Actor>> actors)
	{	

		for(int i=0;i<romanticDialogues.size();i++ )
		{
			if(romanticDialogues.get(i) instanceof RomanticDialogue)
							{
								
								if(i%2==0  )

								
									
								{	System.out.print(actors.get("Hero").get(0).getCharacterName());
									System.out.print("("+actors.get("Hero").get(0).getActorName()+")");
									System.out.println(romanticDialogues.get(i).getDialogueLine());
								}
								
								else
							
								{	System.out.print(actors.get("Heroine").get(0).getCharacterName());
									System.out.print("("+actors.get("Heroine").get(0).getActorName()+")");
									System.out.println(romanticDialogues.get(i).getDialogueLine());
								}
							}
								
							

		}
	}
	public void showEmotionalScene(ArrayList<Dialogue> emotionalDialogues,Map<String,ArrayList<Actor>> actors)
	{

		for(int i=0;i<emotionalDialogues.size();i++ )
		{
			if(emotionalDialogues.get(i) instanceof EmotionalDialogue)
							{
								
								if(i%2==0 )
								{	
									
										System.out.print(actors.get("Hero").get(0).getCharacterName());
									System.out.print("("+actors.get("Hero").get(0).getActorName()+")");
																	
									System.out.println(emotionalDialogues.get(i).getDialogueLine());
								}
								
								else 
								
									{
										System.out.print(actors.get("Heroine").get(0).getCharacterName());
									System.out.print("("+actors.get("Heroine").get(0).getActorName()+")");
																	
									System.out.println(emotionalDialogues.get(i).getDialogueLine());
								}
							
							}
		}
	}
	public void showThrillerScene(ArrayList<Dialogue> thrillerDialogues,Map<String,ArrayList<Actor>> actors)
	{	
		for(int i=0;i<thrillerDialogues.size();i++ )
		{
			if(thrillerDialogues.get(i) instanceof ThrillerDialogue)
							{
								
								if(i%2==0  )
								
									
									{
										System.out.print(actors.get("Hero").get(0).getCharacterName());
										System.out.print("("+actors.get("Hero").get(0).getActorName()+")");
																	
									System.out.println(thrillerDialogues.get(i).getDialogueLine());
								}
							
								else 
								
									{
										System.out.print(actors.get("Villan").get(0).getCharacterName());
									System.out.print("("+actors.get("Villan").get(0).getActorName()+")");
																	
									System.out.println(thrillerDialogues.get(i).getDialogueLine());
								}
							
							}
		}
	

	}
	


}


