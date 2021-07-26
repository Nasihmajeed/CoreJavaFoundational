package com.lxisoft.storyline;

import java.io.*;
import java.util.*;
import com.lxisoft.about.*;
public class Script
{

public ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();


int index=0;
public void createScriptFromDialogues(String dialogue)
{	

	dialogues.get(index).setDialogueLine(dialogue);
		
	index++;
}

public ArrayList<Dialogue> getDialogues()
{
	return dialogues;	
}


	
}