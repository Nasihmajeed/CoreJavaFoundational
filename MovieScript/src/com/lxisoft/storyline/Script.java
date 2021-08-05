package com.lxisoft.storyline;
import java.io.*;
import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.storyline.*;


public class Script
{
	ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
	public void showComedyScene(ArrayList<Dialogue> comedyDialogues,ArrayList<Actor> actors )
	{
		for(int i=0,j=0;(i<comedyDialogues.size(),j<actors.size());i++,j++ )
			{
			
			
					if(comedyDialogues.get(i) instanceof ComedyDialogue  )
					{	
							//if(i%2==0  )
							//{
							if(actors.get(j) instanceof Comedian)
							{
								System.out.print(actors.get(j).getCharacterName());
							System.out.print("("+actors.get(j).getActorName()+")");
							System.out.println(comedyDialogues.get(i).getDialogueLine());
							}
						//}	
						//else 
						//{	
							if( actors.get(j) instanceof Hero)
							{
								System.out.print(actors.get(j).getCharacterName());
							System.out.print("("+actors.get(j).getActorName()+")");
							
							
							System.out.println(comedyDialogues.get(i).getDialogueLine());
						}
						//}	
							
					}	
	}
}
	public void showRomanticScene(ArrayList<Dialogue> romanticDialogues,ArrayList<Actor> actors)
	{	

		for(int i=0,j=0;(i<romanticDialogues.size(),j<actors.size());i++,j++ )
		{
			if(romanticDialogues.get(i) instanceof RomanticDialogue)
							{
								
								//if(i%2==0  )

								//{	
									if(actors.get(j) instanceof Hero )
									{System.out.print(actors.get(j).getCharacterName());
									System.out.print("("+actors.get(j).getActorName()+")");
									System.out.println(romanticDialogues.get(i).getDialogueLine());}
								//}
								//else
								//{	
									if(actors.get(j) instanceof Heroine)
									{System.out.print(actors.get(j).getCharacterName());
									System.out.print("("+actors.get(j).getActorName()+")");
									System.out.println(romanticDialogues.get(i).getDialogueLine());}
								//}
							}

		}
	}
	public void showEmotionalScene(ArrayList<Dialogue> emotionalDialogues,ArrayList<Actor> actors)
	{

		for(int i=0,j=0;(i<emotionalDialogues.size(),j<actors.size());i++,j++ )
		{
			if(emotionalDialogues.get(i) instanceof EmotionalDialogue)
							{
								
								//if(i%2==0 )
								//{	
									if(actors.get(j) instanceof Hero)
									{
										System.out.print(actors.get(j).getCharacterName());
									System.out.print("("+actors.get(j).getActorName()+")");
																	
									System.out.println(emotionalDialogues.get(i).getDialogueLine());
								}
								//}
								//else 
								//{	
									if( actors.get(j) instanceof Heroine)
									{
										System.out.print(actors.get(j).getCharacterName());
									System.out.print("("+actors.get(j).getActorName()+")");
																	
									System.out.println(emotionalDialogues.get(i).getDialogueLine());
								}
								//}
							}
		}
	}
	public void showThrillerScene(ArrayList<Dialogue> thrillerDialogues,ArrayList<Actor> actors)
	{	
		for(int i=0,j=0;(i<thrillerDialogues.size(),j<actors.size());i++,j++ )
		{
			if(thrillerDialogues.get(i) instanceof ThrillerDialogue)
							{
								
								//if(i%2==0  )
								//{	
									if(actors.get(j) instanceof Hero)
									{
										System.out.print(actors.get(j).getCharacterName());
										System.out.print("("+actors.get(j).getActorName()+")");
																	
									System.out.println(thrillerDialogues.get(i).getDialogueLine());
								}
								//}
								//else 
								//{	
									if(actors.get(j) instanceof Villan)
									{
										System.out.print(actors.get(j).getCharacterName());
									System.out.print("("+actors.get(j).getActorName()+")");
																	
									System.out.println(thrillerDialogues.get(i).getDialogueLine());
								}
								//}
							}
		}
	

	}
	


}


