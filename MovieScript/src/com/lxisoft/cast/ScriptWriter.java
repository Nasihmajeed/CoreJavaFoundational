package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
import com.lxisoft.technical.*;
public class ScriptWriter
{



Scanner sc =new Scanner(System.in);


ArrayList<Dialogue> script=new ArrayList<Dialogue>();

FileUtilities fileOperation=new FileUtilities();

Script story=new Script(); 



public void writeScript(Genere genere,ArrayList<Actor> actors)
{	


	switch(genere)
	{
		case Comedy:story.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script,25),actors);
					story.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),script,10),actors);
					story.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script,15),actors);
					break;
	
		

		case Romantic : 

					story.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script,15),actors);
					story.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),script,25),actors);
					story.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script,15),actors);
					break;
			
		case Emotional : 
					story.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script,15),actors);
					story.showRomanticScene(fileOperation.fetchContents(Genere.valueOf("Romantic"),script,15),actors);
					story.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script,25),actors);
					break;
			
		case Thriller :
					story.showComedyScene(fileOperation.fetchContents(Genere.valueOf("Comedy"),script,15),actors);
					story.showThrillerScene(fileOperation.fetchContents(Genere.valueOf("Thriller"),script,25),actors);
					story.showEmotionalScene(fileOperation.fetchContents(Genere.valueOf("Emotional"),script,15),actors);
					break;
					



	}




}







}