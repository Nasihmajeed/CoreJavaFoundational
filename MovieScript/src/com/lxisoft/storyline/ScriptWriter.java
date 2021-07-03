package com.lxisoft.storyline;

import java.io.*;
import java.util.*;
import com.lxisoft.cast.*;
import com.lxisoft.about.*;
public class ScriptWriter
{

int i=0;
Scanner sc =new Scanner(System.in);
String scriptPath=new String("com\\script\\");
String extension=".csv";
BufferedReader scriptReader=null;
ArrayList<Script> listFromFile=new ArrayList<Script>(); 
Map<String,ArrayList<Actor>> cast_Map=new HashMap<String,ArrayList<Actor>>();
//map for each class
ArrayList<Actor> actors=new ArrayList<Actor>();
File movieFile=null;
		
public void scriptSelection(Genere genere)
{	
	Casting casting=new Casting();
		casting.makeCasting();
		
	cast_Map=casting.getMap();
		//actors=casting.getActorsArraylist();


switch(genere)
{
	case Comedy: 
					 movieFile=new File(scriptPath+"Comedy.csv");
					listFromFile= fetchMovieScript(movieFile,genere);


			for(i=0;i<listFromFile.size();i++ )
			{
			
			
					if(listFromFile.get(i) instanceof ComedyScript)
					{
						if(i%2==0 && i>0)
						{

							
							System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
							System.out.print("("+cast_Map.get("Comedian").get(0).getComedianName()+")");

							System.out.println(listFromFile.get(i).getDialogue());
							
						}	
							
						
						else if(i>2 && i>0)
						{	
							System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
							System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
							
							System.out.println(listFromFile.get(i).getDialogue());
						}	
							

						try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
						
					}
					if(listFromFile.get(i) instanceof RomanticScript)
					{
						
						if(i%2==0)
						{	
							System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
							System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
							System.out.println(listFromFile.get(i).getDialogue());
						}
						else if(i>2)
						{	
							System.out.print(cast_Map.get("Heroine").get(0).getHeroineCharacterName());
							System.out.print("("+cast_Map.get("Heroine").get(0).getHeroineName()+")");
							System.out.println(listFromFile.get(i).getDialogue());
						}
					}
					try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
					if(listFromFile.get(i) instanceof EmotionalScript)
					{
						
						if(i%2==0 && i>0)
						{	
							System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
							System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
							System.out.println(listFromFile.get(i).getDialogue());
						}
						else if(i>2 && i>0)
						{	
							System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
							System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
							System.out.println(listFromFile.get(i).getDialogue());
						}
					}


					
			}
			break;
		
	case Romantic:  movieFile=new File(scriptPath+"Romantic.csv");
					listFromFile= fetchMovieScript(movieFile,genere);

			for(i=0;i<listFromFile.size();i++ )
			{
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(listFromFile.get(i) instanceof RomanticScript)
				{	if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}

									}
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(listFromFile.get(i) instanceof EmotionalScript)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Heroine").get(0).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(0).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
				}
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(listFromFile.get(i) instanceof ComedyScript)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
						System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+cast_Map.get("Comedian").get(0).getComedianName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
					
				}


					
			}		
			break;		
case Emotional : movieFile=new File(scriptPath+"Emotional.csv");
					listFromFile= fetchMovieScript(movieFile,genere);

			for(i=0;i<listFromFile.size();i++ )
			{
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(listFromFile.get(i) instanceof EmotionalScript)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Heroine").get(0).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(0).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
				}
					try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(listFromFile.get(i) instanceof RomanticScript)
				{	if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}

					
				}
					try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				
				if(listFromFile.get(i) instanceof ComedyScript)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
						System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+cast_Map.get("Comedian").get(0).getComedianName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
					
				}
					
			}		
			break;		
	

	case Thriller : movieFile=new File(scriptPath+"Thriller.csv");
					listFromFile= fetchMovieScript(movieFile,genere);

			for(i=0;i<listFromFile.size();i++ )
			{
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(listFromFile.get(i) instanceof ThrillerScript)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Villian").get(0).getVillianCharacterName());
						System.out.print("("+cast_Map.get("Villian").get(0).getVillianName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
					else if(i>15 && i>0)
					{
						System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
						System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
				}

				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

				if(listFromFile.get(i) instanceof RomanticScript)
				{	if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+cast_Map.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast_Map.get("Hero").get(1).getHeroCharacterName());
					System.out.print("("+cast_Map.get("Hero").get(1).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}

					
				}

				try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}
				if(listFromFile.get(i) instanceof ComedyScript)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast_Map.get("Hero").get(0).getHeroCharacterName());
						System.out.print("("+cast_Map.get("Hero").get(0).getHeroName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(cast_Map.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+cast_Map.get("Comedian").get(0).getComedianName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
					
				}
					
			}		
			break;		
	
						

}			

 
}


public ArrayList<Script> fetchMovieScript(File file,Genere genere)
{
	ArrayList<Script> scriptList=new ArrayList<Script>();
	
switch(genere)
{
case Comedy:	try{
						
						
						scriptReader=new BufferedReader(new FileReader(file));
						String line=null;

					while((line=scriptReader.readLine())!=null  )
					{
					String []parts=line.split(":");
					String scene=parts[0].trim();
					//String dialogues=parts[1].trim();

					//String scene
					StringBuilder dialogue=new StringBuilder();
					dialogue.append(line);
					
					if(!(dialogue.toString().equals("")))
					{
						scriptList.add(new ComedyScript());
						scriptList.get(i).setDialogue(dialogue.toString());
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
			scriptReader.close();
			
		}
		catch(IOException e)
			{

			}
		}scriptList=writeMinorParts(scriptPath,Genere.valueOf("Emotional"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Romantic"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Thriller"),scriptList);
			break;






case Emotional:	try{
						
						
						scriptReader=new BufferedReader(new FileReader(file));
						String line=null;

					while((line=scriptReader.readLine())!=null  )
					{
					String []parts=line.split(":");
					String scene=parts[0].trim();
					//String dialogues=parts[1].trim();

					//String scene
					StringBuilder dialogue=new StringBuilder();
					dialogue.append(line);
					
					if(!(dialogue.toString().equals("")))
					{
						scriptList.add(new EmotionalScript());
						scriptList.get(i).setDialogue(dialogue.toString());
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
			scriptReader.close();
			
		}
		catch(IOException e)
			{

			}


			}scriptList=writeMinorParts(scriptPath,Genere.valueOf("Comedy"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Romantic"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Thriller"),scriptList);
			break;
			

case Romantic:	try{
						
						
						scriptReader=new BufferedReader(new FileReader(file));
						String line=null;

					while((line=scriptReader.readLine())!=null  )
					{
					String []parts=line.split(":");
					String scene=parts[0].trim();
					//String dialogues=parts[1].trim();

					//String scene
					StringBuilder dialogue=new StringBuilder();
					dialogue.append(line);
					
					if(!(dialogue.toString().equals("")))
					{
						scriptList.add(new RomanticScript());
						scriptList.get(i).setDialogue(dialogue.toString());
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
			scriptReader.close();
			
		}
		catch(IOException e)
			{

			}


			}scriptList=writeMinorParts(scriptPath,Genere.valueOf("Comedy"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Emotional"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Thriller"),scriptList);
			break;


case Thriller:	try{
						
						
						scriptReader=new BufferedReader(new FileReader(file));
						String line=null;

					while((line=scriptReader.readLine())!=null  )
					{
					String []parts=line.split(":");
					String scene=parts[0].trim();
					//String dialogues=parts[1].trim();

					//String scene
					StringBuilder dialogue=new StringBuilder();
					dialogue.append(line);
					
					if(!(dialogue.toString().equals("")))
					{
						scriptList.add(new ThrillerScript());
						scriptList.get(i).setDialogue(dialogue.toString());
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
			scriptReader.close();
			
		}
		catch(IOException e)
			{

			}


			}scriptList=writeMinorParts(scriptPath,Genere.valueOf("Comedy"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Emotional"),scriptList);
			scriptList=writeMinorParts(scriptPath,Genere.valueOf("Romantic"),scriptList);
			break;


}
		

return scriptList;


}





public ArrayList<Script> writeMinorParts(String scriptPath,Genere genere,ArrayList<Script> scriptList)
{	
	
	int j=0;
	
	File file=new File(scriptPath+(genere.toString()+extension));
	
			try{
					String minorLine=null;

					scriptReader=new BufferedReader(new FileReader(file));
					while((minorLine=scriptReader.readLine())!=null && j<15  )
						{
							String []partsRomance=minorLine.split(":");
							String actorRomance=partsRomance[0].trim();
	
							StringBuilder dialogue=new StringBuilder();
								dialogue.append(minorLine);
	
						

								switch(genere)
								{
									case Comedy:if(!(dialogue.toString().equals("")))
													{int l=scriptList.size();
													scriptList.add(new ComedyScript());
													scriptList.get(l).setDialogue(dialogue.toString());
													l++;}
													break;	
									case Emotional:	if(!(dialogue.toString().equals("")))
														{int k=scriptList.size();
														scriptList.add(new EmotionalScript());
														scriptList.get(k).setDialogue(dialogue.toString());
														k++;}
													break;			
									case Romantic:	if(!(dialogue.toString().equals("")))
													{int m=scriptList.size();
													scriptList.add(new RomanticScript());
													scriptList.get(m).setDialogue(dialogue.toString());
													m++;				
													}
													break;
									case Thriller:	if(!(dialogue.toString().equals("")))
													{int n=scriptList.size();
													scriptList.add(new ThrillerScript());
													scriptList.get(n).setDialogue(dialogue.toString());
													n++;
													}break;				
								
								}
									
							
			
							j++;
	
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
								scriptReader.close();
								}
								catch(IOException e)
								{

								}
							}	



		
return scriptList;

}




}