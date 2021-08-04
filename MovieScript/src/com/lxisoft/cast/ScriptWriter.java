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



public void writeScript(Genere genere,Map<String,ArrayList<Actor>> cast)
{	


	switch(genere)
	{
		case Comedy:story.showComedyScene(fileOperation.fetchMinorContents(Genere.valueOf("Comedy"),script,25),cast);
					story.showRomanticScene(fileOperation.fetchMinorContents(Genere.valueOf("Romantic"),script,10),cast);
					story.showEmotionalScene(fileOperation.fetchMinorContents(Genere.valueOf("Emotional"),script,15),cast);
					break;
	
		

		case Romantic : 

					story.showComedyScene(fileOperation.fetchMinorContents(Genere.valueOf("Comedy"),script,15),cast);
					story.showRomanticScene(fileOperation.fetchMinorContents(Genere.valueOf("Romantic"),script,25),cast);
					story.showEmotionalScene(fileOperation.fetchMinorContents(Genere.valueOf("Emotional"),script,15),cast);
					break;
			
		case Emotional : 
					story.showComedyScene(fileOperation.fetchMinorContents(Genere.valueOf("Comedy"),script,15),cast);
					story.showRomanticScene(fileOperation.fetchMinorContents(Genere.valueOf("Romantic"),script,15),cast);
					story.showEmotionalScene(fileOperation.fetchMinorContents(Genere.valueOf("Emotional"),script,25),cast);
					break;
			
		case Thriller :
					story.showComedyScene(fileOperation.fetchMinorContents(Genere.valueOf("Comedy"),script,15),cast);
					story.showThrillerScene(fileOperation.fetchMinorContents(Genere.valueOf("Thriller"),script,25),cast);
					story.showEmotionalScene(fileOperation.fetchMinorContents(Genere.valueOf("Emotional"),script,15),cast);
					break;
					



	}




}







}