package com.lxisoft.storyline;

import java.io.*;
import java.util.*;
import com.lxisoft.about.*;
public class Script
{



 ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();

public void writeDialogues(Dialogue dialogueType,String dialogue,int i)
{	
	dialogues.add(dialogueType);
	dialogues.get(i).setDialogueLine(dialogue);
i++;

for(int j=0;j<dialogues.size();j++)
{
	System.out.println(" Dialogues "dialogues.get(i).getDialogueLine());

}
}

public void createScriptFromDialogues(ArrayList<Dialogue> dialogues)
{	

	dialogues.addAll(dialogues);
		
	
}

public ArrayList<Dialogue> getDialogues()
{	

	return dialogues;	
}


	
}