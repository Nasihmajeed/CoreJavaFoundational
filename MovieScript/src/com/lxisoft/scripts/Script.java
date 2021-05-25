package com.lxisoft.scripts;

import java.io.*;

public class Script
{
	
final String romance="E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\RomanticScr.txt";
final String emotional= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\EmotionalScr.txt";
final String comedy= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\ComedyScr.txt";

File file1=new File(romance);
File file2=new File(emotional);
File file3=new File(comedy);

BufferedReader romanticReader=null;
BufferedReader emotionalReader=null;
BufferedReader comedyReader=null;


{
ArrayList<Script> romanticscr=new ArrayList<Script>();
ArrayList<Script> emotionalscr=new ArrayList<Script>();
ArrayList<Script> comicscr=new ArrayList<Script>();

romanticscr.add(new RomanceScript());	
emotionalscr.add(new EmotionalScript());
comicscr.add(new ComedyScript());
}





public void selectScript(int genre)
{
	switch(genre)
	{
	case 1: 
	
	}
	
	
	
	
	
}

}