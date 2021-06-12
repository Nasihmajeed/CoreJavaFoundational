package com.lxisoft.storyline;

import java.io.*;
import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.about.*;
public class ScriptWriter
{
int i=0;
Scanner sc =new Scanner(System.in);

final String comedyScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\Comedy.txt";

final String romanceScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\Romance.txt";
 
final String emotionalScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\Emotional.txt";

final String thrillerScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\Thriller.txt";


File romanceFile=new File(romanceScript);
File comdeyFile=new File(comedyScript);
File emotionalFile=new File(emotionalScript);
File thrillerFile=new File(thrillerScript);

BufferedReader comedyScriptReader=null;
BufferedReader romanceScriptReader=null;
BufferedReader emotionalScriptReader=null;
BufferedReader thrillerScriptReader=null;
		
		String  heroName,heroineName,comedianName,villanName,directorName;


		ArrayList<Script> comedyListFromFile=new ArrayList<Script>();
		ArrayList<Script> romanceListFromFile=new ArrayList<Script>();
		ArrayList<Script> emotionalListFromFile=new ArrayList<Script>();
		ArrayList<Script> thrillerListFromFile=new ArrayList<Script>();	 



		Actors hero=new Actor();
		Actors heroine=new Actress();
		Actors comedian=new Actor();
		Actors villan=new Actor();
		
		
		Map<String,ArrayList<Actors>> cast_Map=new HashMap<String,ArrayList<Actors>>();
		ArrayList<Actors> actors=new ArrayList<Actors>();
		

		 Director director=new Director();
		//Movie movie=new Movie();
		Casting casting=new Casting();

public void scriptSelection(int genere)
{
	casting.makeCasting();
	cast_Map=casting.getMap();


switch(genere)
{
	case 1: comedyListFromFile= comedyMovie();


			for(i=0;i<comedyListFromFile.size();i++ )
			{
			
			
					if(comedyListFromFile.get(i) instanceof ComedyScript)
					{
						

							

						if(i%2==0)
						{

							System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
							System.out.print("("+cast_Map.get("Comedian").get(0).getComedianName()+")");

							System.out.println(comedyListFromFile.get(i).getDialogue());
						}	//comedyListFromFile.get(i).setCharacter(comedianName);
							
						
						else if(i>2 && i>0)
						{
							System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
							System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}	//comedyListFromFile.get(i).setCharacter(heroName);
							

						try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
						
					}
					if(comedyListFromFile.get(i) instanceof RomanticScript)
					{
						
						if(i%2==0)
						{	
							System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
							System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
						else if(i>2)
						{	
							System.out.print(cast_Map.get("Heroine").get(0).getHeroineCharacterName());
							System.out.print("("+cast_Map.get("Heroine").get(0).getHeroineName()+")");
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
					}
					try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
					if(comedyListFromFile.get(i) instanceof EmotionalScript)
					{
						
						if(i%2==0)
						{	
							System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
							System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
						else if(i>2)
						{	
							System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
							System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
							System.out.println(comedyListFromFile.get(i).getDialogue());
						}
					}


					
			}
			break;
			
	case 2: romanceListFromFile= romanticMovie();

			for(i=0;i<romanceListFromFile.size();i++ )
			{
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(romanceListFromFile.get(i) instanceof RomanticScript)
				{	if(i%2==0)
					{	System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(romanceListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
					System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
					System.out.println(romanceListFromFile.get(i).getDialogue());	
					}

					
				}
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(romanceListFromFile.get(i) instanceof EmotionalScript)
				{
					if(i%2==0)
					{	System.out.print(cast_Map.get("Heroine").get(0).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(0).getHeroineName()+")");
						System.out.println(romanceListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
					System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
					System.out.println(romanceListFromFile.get(i).getDialogue());	
					}
				}
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(romanceListFromFile.get(i) instanceof ComedyScript)
				{
					if(i%2==0)
					{	System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
						System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
						System.out.println(romanceListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
						System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+cast_Map.get("Comedian").get(0).getComedianCharacterName()+")");
					System.out.println(romanceListFromFile.get(i).getDialogue());	
					}
					
				}


					
			}		
			break;		
case 3: emotionalListFromFile= emotionalMovie();

			for(i=0;i<emotionalListFromFile.size();i++ )
			{
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(emotionalListFromFile.get(i) instanceof EmotionalScript)
				{
					if(i%2==0)
					{	System.out.print(cast_Map.get("Heroine").get(0).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(0).getHeroineName()+")");
						System.out.println(emotionalListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
					System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
					System.out.println(emotionalListFromFile.get(i).getDialogue());	
					}
				}
					try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(emotionalListFromFile.get(i) instanceof RomanticScript)
				{	if(i%2==0)
					{	System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(emotionalListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
					System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
					System.out.println(emotionalListFromFile.get(i).getDialogue());	
					}

					
				}
					try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				
				if(emotionalListFromFile.get(i) instanceof ComedyScript)
				{
					if(i%2==0)
					{	System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
						System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
						System.out.println(emotionalListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
						System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+cast_Map.get("Comedian").get(0).getComedianName()+")");
					System.out.println(emotionalListFromFile.get(i).getDialogue());	
					}
					
				}
					
			}		
			break;		
	

	case 4 :thrillerListFromFile= thrillerMovie();

			for(i=0;i<thrillerListFromFile.size();i++ )
			{
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(thrillerListFromFile.get(i) instanceof ThrillerScript)
				{
					if(i%2==0)
					{	System.out.print(cast_Map.get("Villian").get(0).getVillianCharacterName());
						System.out.print("("+cast_Map.get("Villian").get(0).getVillianName()+")");
						System.out.println(thrillerListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
					System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
					System.out.println(thrillerListFromFile.get(i).getDialogue());	
					}
					else if(i>15)
					{
						System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
					System.out.println(thrillerListFromFile.get(i).getDialogue());	
					}
				}

				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(thrillerListFromFile.get(i) instanceof RomanticScript)
				{	if(i%2==0)
					{	System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(thrillerListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
					System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
					System.out.println(thrillerListFromFile.get(i).getDialogue());	
					}

					
				}

				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(thrillerListFromFile.get(i) instanceof ComedyScript)
				{
					if(i%2==0)
					{	System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
						System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
						System.out.println(thrillerListFromFile.get(i).getDialogue());
					}
					else if(i>2)
					{
						System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+cast_Map.get("Comedian").get(0).getComedianName()+")");
					System.out.println(thrillerListFromFile.get(i).getDialogue());	
					}
					
				}
					
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
			//comedyList.get(i).setCharacter1(comedianName);
			//comedyList.get(i).setCharacter2(heroName);
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
			comedyList.add(new RomanticScript());
				//comedyList.get(l).setCharacter1(heroName);
				//comedyList.get(l).setCharacter2(heroineName);
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
			comedyList.add(new EmotionalScript());
			//comedyList.get(s).setCharacter1(heroName);
			//comedyList.get(s).setCharacter2(heroineName);
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
			romanceList.add(new RomanticScript());
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

		if(!(dialogueRomance.toString().equals("")))
		{	i=romanceList.size();
			romanceList.add(new ComedyScript());
			//romanceList.get(i).setCharacter1(actorRomance);
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

		if(!(dialogueEmotional.toString().equals("")))
		{	int s=romanceList.size();
			romanceList.add(new EmotionalScript());
			//romanceList.get(s).setCharacter1(actorEmotional);
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
	
			if(!(dialogue.toString().equals("")))
		{
			emotionalList.add(new EmotionalScript());
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

		if(!(dialogueRomance.toString().equals("")))
		{	i=emotionalList.size();
			emotionalList.add(new RomanticScript());
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

		if(!(dialogueComedy.toString().equals("")))
		{	int s=emotionalList.size();
			emotionalList.add(new ComedyScript());
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




// thriller Movie
public ArrayList<Script> thrillerMovie()
{


ArrayList<Script> thrillerList= new ArrayList<Script>();

try
{
	comedyScriptReader=new BufferedReader(new FileReader(comdeyFile));
	romanceScriptReader=new BufferedReader(new FileReader(romanceFile));
emotionalScriptReader=new BufferedReader(new FileReader(emotionalFile));
	thrillerScriptReader=new BufferedReader(new FileReader(thrillerFile)); 

	String line=null;

	while((line=thrillerScriptReader.readLine())!=null)
	{
		String []parts=line.split(":");
		String actor=parts[0].trim();

		StringBuilder dialogue=new StringBuilder();
		dialogue.append(line);
	
			if(!(dialogue.toString().equals("")))
		{
			thrillerList.add(new ThrillerScript());
			//thrillerList.get(i).setCharacter1(actor);
			thrillerList.get(i).setDialogue(dialogue.toString());
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

		if(!(dialogueRomance.toString().equals("")))
		{	i=thrillerList.size();
			thrillerList.add(new RomanticScript());
			//thrillerList.get(i).setCharacter1(actorRomance);
			thrillerList.get(i).setDialogue(dialogueRomance.toString());
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

		if(!(dialogueComedy.toString().equals("")))
		{	int s=thrillerList.size();
			thrillerList.add(new ComedyScript());
			//thrillerList.get(s).setCharacter1(actorComedy);
			thrillerList.get(s).setDialogue(dialogueComedy.toString());
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
			thrillerScriptReader.close();
		}
		catch(IOException e)
			{

			}


}

return thrillerList;

}






}