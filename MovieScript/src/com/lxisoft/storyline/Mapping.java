package com.lxisoft.storyline;
import com.lxisoft.script.*;
import java.io.*;
import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.about.*;
public class Mapping
{
int i=0;
Scanner sc =new Scanner(System.in);

final String comedyScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\KarthiGanesh.txt";

final String romanceScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\KarthiJessie.txt";
 
final String emotionalScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\Emotional.txt";

File romanceFile=new File(romanceScript);
File comdeyFile=new File(comedyScript);
File emotionalFile=new File(emotionalScript);

BufferedReader comedyScriptReader=null;
BufferedReader romanceScriptReader=null;
BufferedReader emotionalScriptReader=null;
		/*hero.setName(cast.heroName);
		heroine.setName(cast.heroineName);
		comedian.setName(cast.comedianName);
		villan.setName(cast.villanName);*/
		String  heroName,heroineName,comedianName,villanName,directorName;
		ArrayList<Script> comedyListFromFile=new ArrayList<Script>();
		ArrayList<Script> romanceListFromFile=new ArrayList<Script>();
		ArrayList<Script> emotionalListFromFile=new ArrayList<Script>();
{
	comedyListFromFile.add(new ComedyScript());
	romanceListFromFile.add(new RomanticScript());
	emotionalListFromFile.add(new EmotionalScript());
}
Actors hero=new Actor();
		Actors heroine=new Actress();
		Actors comedian=new Actor();
		Actors villan=new Actor();
		NonActors director=new Director();
		Map<String,ArrayList<Actors>> cast_Map=new HashMap<String,ArrayList<Actors>>();
		ArrayList<Actors> actors=new ArrayList<Actors>();
		Characters characters=new Characters();
/*public void getCasting(Map<String,ArrayList<Actors>> castMap)
	{
		cast_Map.putAll(castMap);


	}*/
	 



public void scriptSelection(int genere)
{

characters.setHeroName();
			
	
			characters.setHeroineName();
			characters.setComedianName();
			characters.setVillianName();
			characters.displayAll();

		/**/
		Casting cast=new Casting();
		 cast_Map=characters.getMap();


switch(genere)
{
	case 1: comedyListFromFile= comedyMovie();


			for(i=0;i<comedyListFromFile.size();i++ )
			{
				//System.out.print(listFromFile.get(i).getCharacter()+":");
			
					if(comedyListFromFile.get(i) instanceof ComedyScript)
					{		
							/*comedyListFromFile.get(i).setCharacter1(cast_Map.get("Comedian").get(i).getComedianCharacterName());
							comedyListFromFile.get(i).setCharacter2(cast_Map.get("Hero").getHeroCharacterName());*/

						if(i%2==0)
						{	//comedyListFromFile.get(i).setCharacter(comedianName);
							System.out.print(cast_Map.get("Comedian").get(i).getComedianCharacterName());
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
						else if(i>2 && i>0)
						{	//comedyListFromFile.get(i).setCharacter(heroName);
							System.out.print(cast_Map.get("Hero").get(i).getHeroCharacterName());
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
					}
					if(comedyListFromFile.get(i) instanceof RomanticScript)
					{
						comedyListFromFile.get(i).setCharacter1(heroineName);
							comedyListFromFile.get(i).setCharacter2(heroName);
						if(i%2==0)
						{	//comedyListFromFile.get(i).setCharacter(comedianName);
							System.out.print(comedyListFromFile.get(i).getCharacter1());
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
						else if(i>2)
						{	//comedyListFromFile.get(i).setCharacter(heroName);
							System.out.print(comedyListFromFile.get(i).getCharacter2());
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
					}
					if(comedyListFromFile.get(i) instanceof EmotionalScript)
					{
						comedyListFromFile.get(i).setCharacter1(heroineName);
							comedyListFromFile.get(i).setCharacter2(heroName);
						if(i%2==0)
						{	//comedyListFromFile.get(i).setCharacter(comedianName);
							System.out.print(comedyListFromFile.get(i).getCharacter1());
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
						else if(i>2)
						{	//comedyListFromFile.get(i).setCharacter(heroName);
							System.out.print(comedyListFromFile.get(i).getCharacter2());
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
					}


					
			}
			break;
			
	case 2: romanceListFromFile= romanticMovie();

			for(i=0;i<romanceListFromFile.size();i++ )
			{
				//System.out.print(listFromFile.get(i).getCharacter()+":");
				
					System.out.println(romanceListFromFile.get(i).getDialogue());
					
			}		
			break;		
case 3: emotionalListFromFile= emotionalMovie();

			for(i=0;i<emotionalListFromFile.size();i++ )
			{
				//System.out.print(listFromFile.get(i).getCharacter()+":");
				
					System.out.println(emotionalListFromFile.get(i).getDialogue());
					
			}		
			break;		


}			

 

/*if(listFromFile.get(i) instanceof MinorScript)
{	//System.out.println("Romance scenes");
	System.out.println(listFromFile.get(i).getDialogue());
}*/






}


public ArrayList<Script> comedyMovie()
{



ArrayList<Script> comedyList= new ArrayList<Script>();
	/*comedyList.add(new ComedyScript());
	comedyList.add(new EmotionalScript());
	comedyList.add(new RomanticScript());*/

	
	
	

//i=0;
try
{
	comedyScriptReader=new BufferedReader(new FileReader(comdeyFile));
	romanceScriptReader=new BufferedReader(new FileReader(romanceFile));
	emotionalScriptReader=new BufferedReader(new FileReader(emotionalFile));


	

	String line=null;

	while((line=comedyScriptReader.readLine())!=null  )
	{
		String []parts=line.split(":");
		String actor=parts[0].trim();


		StringBuilder dialogue=new StringBuilder();
		dialogue.append(line);
	if(!(dialogue.toString().equals("")) )
		{	comedyList.add(new ComedyScript());
			comedyList.get(i).setCharacter1(comedianName);
			comedyList.get(i).setCharacter2(heroName);
			comedyList.get(i).setDialogue(dialogue.toString());
			i++;	
		}

	}

	String minorLine=null;
	int j=0,l=0;
	while((minorLine=romanceScriptReader.readLine())!=null && j<15  )
	{
		String []partsRomance=minorLine.split(":");
		String actorRomance=partsRomance[0].trim();

		StringBuilder dialogueRomance=new StringBuilder();
		dialogueRomance.append(minorLine);

		if(!(dialogueRomance.toString().equals("")))
		{	l=comedyList.size();
			comedyList.add(new ComedyScript());
				comedyList.get(l).setCharacter1(heroName);
				comedyList.get(l).setCharacter2(heroineName);
			comedyList.get(l).setDialogue(dialogueRomance.toString());
		l++;
		}
		
j++;

	}
	String minorLine2=null;
	int k=0;
	int s=0;
while((minorLine2=emotionalScriptReader.readLine())!=null && (k<8) )
	{
		String []partsEmotional=minorLine2.split(":");
		String actorEmotional=partsEmotional[0].trim();

		StringBuilder dialogueEmotional=new StringBuilder();
		dialogueEmotional.append(minorLine2);
		//
		if(!(dialogueEmotional.toString().equals(""))  )
		{	//
			 s=comedyList.size();
			comedyList.add(new ComedyScript());
			comedyList.get(s).setCharacter1(heroName);
			comedyList.get(s).setCharacter2(heroineName);
			comedyList.get(s).setDialogue(dialogueEmotional.toString());
			s++;
		}

k++;

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
			comedyScriptReader.close();
			emotionalScriptReader.close();
			romanceScriptReader.close();
		}
		catch(IOException e)
			{

			}


}

return comedyList;

}





public ArrayList<Script> romanticMovie()
{


ArrayList<Script> romanceList= new ArrayList<Script>();

try
{
	comedyScriptReader=new BufferedReader(new FileReader(comdeyFile));
	romanceScriptReader=new BufferedReader(new FileReader(romanceFile));
emotionalScriptReader=new BufferedReader(new FileReader(emotionalFile));
	String line=null;

	while((line=romanceScriptReader.readLine())!=null)
	{
		String []parts=line.split(":");
		String actor=parts[0].trim();

		StringBuilder dialogue=new StringBuilder();
		dialogue.append(line);
	
			if(!(dialogue.toString().equals("")))
		{
			romanceList.add(new Script());
			//romanceList.get(i).setCharacter1(actor);
			romanceList.get(i).setDialogue(dialogue.toString());
			i++;
		}

	}

	String minorLine=null;
	int j=0;
	while((minorLine=comedyScriptReader.readLine())!=null && j<15)
	{
		String []partsRomance=minorLine.split(":");
		String actorRomance=partsRomance[0].trim();

		StringBuilder dialogueRomance=new StringBuilder();
		dialogueRomance.append(minorLine);

		if(!(dialogueRomance.toString().equals(""))&& !(actorRomance.equals("")))
		{	i=romanceList.size();
			romanceList.add(new MinorScript());
			romanceList.get(i).setCharacter1(actorRomance);
			romanceList.get(i).setDialogue(dialogueRomance.toString());
			i++;
		}

		j++;

	}

	String minorLine2=null;
	int k=0;
	while((minorLine2=emotionalScriptReader.readLine())!=null && (k<15))
	{
		String []partsEmotional=minorLine2.split(":");
		String actorEmotional=partsEmotional[0].trim();

		StringBuilder dialogueEmotional=new StringBuilder();
		dialogueEmotional.append(minorLine2);

		if(!(dialogueEmotional.toString().equals(""))&& !(actorEmotional.equals("")))
		{	int s=romanceList.size();
			romanceList.add(new Script());
			romanceList.get(s).setCharacter1(actorEmotional);
			romanceList.get(s).setDialogue(dialogueEmotional.toString());
			s++;
		}

k++;

	}


}
catch(IOException e)
{
	e.printStackTrace();
}
finally
{

		try
		{	comedyScriptReader.close();
			romanceScriptReader.close();
			emotionalScriptReader.close();
		}
		catch(IOException e)
			{

			}


}

return romanceList;

}


public ArrayList<Script> emotionalMovie()
{


ArrayList<Script> emotionalList= new ArrayList<Script>();

try
{
	comedyScriptReader=new BufferedReader(new FileReader(comdeyFile));
	romanceScriptReader=new BufferedReader(new FileReader(romanceFile));
emotionalScriptReader=new BufferedReader(new FileReader(emotionalFile));
	String line=null;

	while((line=emotionalScriptReader.readLine())!=null)
	{
		String []parts=line.split(":");
		String actor=parts[0].trim();

		StringBuilder dialogue=new StringBuilder();
		dialogue.append(line);
	
			if(!(dialogue.toString().equals(""))&& !(actor.equals("")))
		{
			emotionalList.add(new Script());
			emotionalList.get(i).setCharacter1(actor);
			emotionalList.get(i).setDialogue(dialogue.toString());
			i++;
		}

	}

	String minorLine=null;
	int j=0;
	while((minorLine=romanceScriptReader.readLine())!=null && j<15)
	{
		String []partsRomance=minorLine.split(":");
		String actorRomance=partsRomance[0].trim();

		StringBuilder dialogueRomance=new StringBuilder();
		dialogueRomance.append(minorLine);

		if(!(dialogueRomance.toString().equals(""))&& !(actorRomance.equals("")))
		{	i=emotionalList.size();
			emotionalList.add(new MinorScript());
			emotionalList.get(i).setCharacter1(actorRomance);
			emotionalList.get(i).setDialogue(dialogueRomance.toString());
			i++;
		}

j++;

	}

	String minorLine2=null;
	int k=0;
	while((minorLine2=comedyScriptReader.readLine())!=null && (k<15))
	{
		String []partsComedy=minorLine2.split(":");
		String actorComedy=partsComedy[0].trim();

		StringBuilder dialogueComedy=new StringBuilder();
		dialogueComedy.append(minorLine2);

		if(!(dialogueComedy.toString().equals(""))&& !(actorComedy.equals("")))
		{	int s=emotionalList.size();
			emotionalList.add(new Script());
			emotionalList.get(s).setCharacter1(actorComedy);
			emotionalList.get(s).setDialogue(dialogueComedy.toString());
			s++;
		}

k++;

	}


}
catch(IOException e)
{
	e.printStackTrace();
}
finally
{

		try
		{	comedyScriptReader.close();
			romanceScriptReader.close();
			emotionalScriptReader.close();
		}
		catch(IOException e)
			{

			}


}

return emotionalList;

}




}