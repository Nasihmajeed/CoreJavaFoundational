package com.lxisoft.storyline;
import com.lxisoft.script.*;
import java.io.*;
import java.util.*;
public class ScriptWriting 
{


String actorsName;

final String comedyScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\KarthiGanesh.txt";

final String romanceScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\KarthiJessie.txt";
 
final String emotionalScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\Emotional.txt";

File romanceFile=new File(romanceScript);
File comdeyFile=new File(comedyScript);
File emotionalFile=new File(emotionalScript);

BufferedWriter comedyScriptWriter=null;
BufferedWriter romanceScriptWriter=null;
BufferedWriter emotionalScriptWriter=null;


// for reading
File romanceFile=new File(romanceScript);
File comdeyFile=new File(comedyScript);
File emotionalFile=new File(emotionalScript);

BufferedReader comedyScriptReader=null;
BufferedReader romanceScriptReader=null;
BufferedReader emotionalScriptReader=null;

public void scriptSetting()
{

	try
	{

		//for reading
		comedyScriptReader=new BufferedReader(new FileReader(comdeyFile));
		romanceScriptReader=new BufferedReader(new FileReader(romanceFile));
		emotionalScriptReader=new BufferedReader(new FileReader(emotionalFile));
	

	//for writing
		comedyScriptWriter=new BufferedWriter(new FileWriter(comdeyFile));
		romanceScriptWriter=new BufferedWriter(new FileWriter(romanceFile));
		emotionalScriptWriter=new BufferedWriter(new FileWriter(emotionalFile));
String line=null;

	while((line=comedyScriptReader.readLine())!=null)
	{
		String []parts=line.split(":");
		String actor=parts[0].trim();
		String dialogues=parts[1];

		StringBuilder dialogue=new StringBuilder();
		dialogue.append(dialogues);
	
			if(!(dialogue.toString().equals(""))&& !(actor.equals("")))
		{
			comedyList.add(new Script());
			comedyList.get(i).setCharacter(actor);
			comedyList.get(i).setDialogue(dialogue.toString());
			i++;
		}

	}
 



	}
	catch(IOException e)
{
	e.printStackTrace();
}
finally
{

		try
		{
			comedyScriptWriter.close();
			emotionalScriptWriter.close();
			romanceScriptWriter.close();
		}
		catch(IOException e)
			{

			}


}




}






}