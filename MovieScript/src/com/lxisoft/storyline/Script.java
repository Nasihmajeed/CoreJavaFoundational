package com.lxisoft.storyline;
import java.io.*;
import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;


public class Script
{
	//ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
	Actor actor;
	public void showComedyScene(ArrayList<Dialogue> comedyDialogues,ArrayList<Actor> actors )
	{	int i;
		for(int j=0;j<comedyDialogues.size();j++)

			{	
			
				for( i=0;i<actors.size();i++){
								
					if(comedyDialogues.get(j) instanceof ComedyDialogue  )
						{
							if(j%2==0)
								{
									if(actors.get(i) instanceof Comedian)
										{
											
							actor=new Comedian((actors.get(i).getCharacterName()).toString(),(actors.get(i).getActorName()).toString(),(comedyDialogues.get(j).getDialogueLine()).toString());
										}
														
								}	
													

							if(!(j%2==0))
							{	if(actors.get(i) instanceof Hero)
									{	
									 	
									actor=new Hero((actors.get(i).getCharacterName()).toString(),(actors.get(i).getActorName()).toString(),(comedyDialogues.get(j).getDialogueLine()).toString());
									}
																							
								
							}
													


												
						}

												
								
		}
					
							
					
	}
}
	public void showRomanticScene(ArrayList<Dialogue> romanticDialogues,ArrayList<Actor> actors)
	{	

	int i;
		for(int j=0;j<romanticDialogues.size();j++)

			{	
			
				for( i=0;i<actors.size();i++){
								
					if(romanticDialogues.get(j) instanceof RomanticDialogue  )
						{
							if(j%2==0)
								{
									if(actors.get(i) instanceof Heroine)
										{
											
										actor=new Heroine(actors.get(i).getCharacterName(),actors.get(i).getActorName(),romanticDialogues.get(j).getDialogueLine());
										}
														
									
								}	
													

							if(!(j%2==0))
							{	if(actors.get(i) instanceof Hero)
									{	
									 	
										actor=new Hero(actors.get(i).getCharacterName(),actors.get(i).getActorName(),romanticDialogues.get(j).getDialogueLine());
									}
																							
								
							}
													


						}
										
				}
	
			}
	}
	public void showEmotionalScene(ArrayList<Dialogue> emotionalDialogues,ArrayList<Actor> actors)
	{

		int i;
		for(int j=0;j<emotionalDialogues.size();j++)

			{	
			
				for( i=0;i<actors.size();i++){
								
					if(emotionalDialogues.get(j) instanceof EmotionalDialogue  )
						{
							if(j%2==0)
								{
									if(actors.get(i) instanceof Heroine)
										{
											
										actor=new Heroine(actors.get(i).getCharacterName(),actors.get(i).getActorName(),emotionalDialogues.get(j).getDialogueLine());
										}
														
									
								}	
													

							if(!(j%2==0))
							{	if(actors.get(i) instanceof Hero)
									{	
									 
										actor=new Hero(actors.get(i).getCharacterName(),actors.get(i).getActorName(),emotionalDialogues.get(j).getDialogueLine());
									}
																							
								
							}
													


						}
										
				}
	
			}
	}
	public void showThrillerScene(ArrayList<Dialogue> thrillerDialogues,ArrayList<Actor> actors)
	{	
		int i;
		for(int j=0;j<thrillerDialogues.size();j++)

			{	
			
				for( i=0;i<actors.size();i++){
								
					if(thrillerDialogues.get(j) instanceof RomanticDialogue  )
						{
							if(j%2==0)
								{
									if(actors.get(i) instanceof Villan)
										{
											
										actor=new Villan(actors.get(i).getCharacterName(),actors.get(i).getActorName(),thrillerDialogues.get(j).getDialogueLine());
										}
														
									
								}	
													

							if(!(j%2==0))
							{	if(actors.get(i) instanceof Hero)
									{	
									 	
										actor=new Hero((actors.get(i).getCharacterName()),(actors.get(i).getActorName()),(thrillerDialogues.get(j).getDialogueLine()));
									}
																							
								
							}
													


					}
										
			}
	
		}
	

	}
	


}


