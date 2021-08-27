package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
import com.lxisoft.technical.*;
public class ScriptWriter
{

Scanner sc =new Scanner(System.in);

FileUtilities fileOperation=new FileUtilities();

Script script=new Script(); 

public void writeScript(Genere genere,ArrayList<Actor> actors)
{	
	switch(genere)
	{
		case Comedy:script.viewScript(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),25),actors,Genere.valueOf("Comedy"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Romantic"),script.getDialogue(),10),actors,Genere.valueOf("Romantic"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),15),actors,Genere.valueOf("Emotional"));
					break;
	
		case Romantic : 

					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),15),actors,Genere.valueOf("Comedy"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Romantic"),script.getDialogue(),25),actors,Genere.valueOf("Romantic"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),15),actors,Genere.valueOf("Emotional"));
					break;
			
		case Emotional : 
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),15),actors,Genere.valueOf("Comedy"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Romantic"),script.getDialogue(),15),actors,Genere.valueOf("Romantic"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),25),actors,Genere.valueOf("Emotional"));
					break;
			
		case Thriller :
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),15),actors,Genere.valueOf("Comedy"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Thriller"),script.getDialogue(),25),actors,Genere.valueOf("Thriller"));
					script.viewScript(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),15),actors,Genere.valueOf("Emotional"));
					break;
					

}

}

}