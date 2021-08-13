package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
import com.lxisoft.technical.*;
public class ScriptWriter
{



Scanner sc =new Scanner(System.in);


ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();

FileUtilities fileOperation=new FileUtilities();

Script script=new Script(); 



public void writeScript(Genere genere,ArrayList<Actor> actors)
{	


	switch(genere)
	{
		case Comedy:script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),dialogues,25),actors);
					script.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),dialogues,10),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),dialogues,15),actors);
					break;
	
		

		case Romantic : 

					script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),dialogues,15),actors);
					script.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),dialogues,25),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),dialogues,15),actors);
					break;
			
		case Emotional : 
					script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),dialogues,15),actors);
					script.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),dialogues,15),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),dialogues,25),actors);
					break;
			
		case Thriller :
					script.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),dialogues,15),actors);
					script.showThrillerScene(fileOperation.fetchContents(Genere.valueOf("Thriller"),dialogues,25),actors);
					script.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),dialogues,15),actors);
					break;
					



	}




}







}