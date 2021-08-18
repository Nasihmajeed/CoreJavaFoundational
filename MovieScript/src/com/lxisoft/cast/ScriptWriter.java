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
		case Comedy:script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),25),actors);
					script.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),script.getDialogue(),10),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),15),actors);
					break;
	
		case Romantic : 

					script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),15),actors);
					script.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),script.getDialogue(),25),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),15),actors);
					break;
			
		case Emotional : 
					script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),15),actors);
					script.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),script.getDialogue(),15),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),25),actors);
					break;
			
		case Thriller :
					script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script.getDialogue(),15),actors);
					script.showThrillerScene(fileOperation.fetchContents(Genere.valueOf("Thriller"),script.getDialogue(),25),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script.getDialogue(),15),actors);
					break;
					

}

}

}