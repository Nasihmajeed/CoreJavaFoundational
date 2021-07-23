package com.lxisoft.storyline;

import java.io.*;
import java.util.*;
public class Script
{

ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();

int i=0;
public void createScriptFromDialogues(String dialogue,Genere genere)
{	
		
	switch(genere)
	{
		case Comedy: dialogues.add(new ComedyDialogue());
					dialogues.get(i).setDialogueLine(dialogue);
					i++;
					break;

		case Romantic:	dialogues.add(new RomanticDialogue());				
						dialogues.get(i).setDialogueLine(dialogue);
						i++;
						break;

		case Thriller:	dialogues.add(new ThrillerDialogue());
						dialogues.get(i).setDialogueLine(dialogue);
						i++;
						break;

		case Emotional:	dialogues.add(new EmotionalDialogue());
						dialogues.get(i).setDialogueLine(dialogue);
						i++;
						break;											

	}



		

		

}




	
}