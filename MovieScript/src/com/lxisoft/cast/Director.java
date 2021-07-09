package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
public class Director
{

//for randomizing actors
int i=0;

Scanner sc =new Scanner(System.in);
String scriptPath=new String("com\\script\\");
String extension=".csv";

BufferedReader scriptReader=null;

List<Script> listFromFile=new ArrayList<Script>(); 

Map<String,ArrayList<Actor>> castMap=new HashMap<String,ArrayList<Actor>>();
//map for each class
ArrayList<Actor> actors=new ArrayList<Actor>();

File movieFile=null;

public void doCasting()
{
	
/*actors=castActors();
for(i=0;i<actors.size();i++)
	{	if(actors.get(i) instanceof Hero)
		{castMap.put("Hero",actors);	
		}
		if(actors.get(i) instanceof Heroine)
		{castMap.put("Heroine",actors);
		}
		if(actors.get(i) instanceof Comedian)
		{
			castMap.put("Comedian",actors);
		}
		if(actors.get(i) instanceof Villan)
		{castMap.put("Villian",actors);}
	}*/
		
		
	
	/*System.out.print(castMap.get("Comedian").get(0).getCharacterName());
	System.out.print(castMap.get("Villian").get(0).getCharacterName());
	System.out.print(castMap.get("Heroine").get(0).getCharacterName());*/

}

public ArrayList<Actor> castActors()
{	int i,numberOfCharacters;
	String actorName,characterName,role=" ";


	System.out.println("Enter the role"+role+": ");
	role=sc.next();
	System.out.println("Enter number of  "+role+": ");
	numberOfCharacters=sc.nextInt();
	
	//ArrayList<Actor> actors=new ArrayList<Actor>();
	for(i=0;i<numberOfCharacters;i++)
	{
			

		System.out.println("Enter the name of"+role+" "+(i+1));
		actorName=sc.next();	
		
		
		System.out.println("Enter the Character name of "+actorName);
		characterName=sc.next();
		
		switch(role)
		{
			case "hero":actors.add(new Hero(actorName,characterName));
							castMap.put("Hero",actors);
							break;
			case "heroine":actors.add(new Heroine(actorName,characterName));
							castMap.put("Heroine",actors);
							break;
			case "comedian": actors.add(new Comedian(actorName,characterName));
								castMap.put("Comedian",actors);
								break;
			case "villan": actors.add(new Villan(actorName,characterName));
							castMap.put("Villian",actors);
							break;
			default :System.out.println("Invalid entry");			
		}



		
		 	
		 		
		
		
		}

		return actors;
}
/*
public ArrayList<Actor> castHeroine()
{	String heroineName,heroineCharacterName;
	int i,numberOfHeroineCharacters;
		System.out.println("Enter the number of heroines: ");
	numberOfHeroineCharacters=sc.nextInt();
	ArrayList<Actor> heroines=new ArrayList<Actor>();
	for( i=0;i<numberOfHeroineCharacters;i++)
	{	
		System.out.println("Enter the name of heroines "+(i+1));
		heroineName=sc.next();
		
		
		System.out.println("Enter the Character name of "+heroineName);
		heroineCharacterName=sc.next();
		heroines.add(new Heroine(heroineName,heroineCharacterName));
		
		
	}
	return heroines;


}
public ArrayList<Actor> castComedian()
{
	String comedianName,comedianCharacterName;
int i,numberOfComedianCharacters;
			System.out.println("Enter the number of Comedian: ");
	numberOfComedianCharacters=sc.nextInt();
	ArrayList<Actor> comedians=new ArrayList<Actor>();
	for( i=0;i<numberOfComedianCharacters;i++)
	{	
		System.out.println("Enter the name of Comedian "+(i+1));
		comedianName=sc.next();
		
		
		System.out.println("Enter the Character name of "+comedianName);
		comedianCharacterName=sc.next();
		comedians.add(new Comedian(comedianName,comedianCharacterName));
		
	
	}
	return comedians;
}

public ArrayList<Actor> castVillan()
{	String villianName,villianCharacterName;
	int i,numberOfVillanCharacters;
	System.out.println("Enter the number of Villian: ");
	numberOfVillanCharacters=sc.nextInt();
	ArrayList<Actor> villans=new ArrayList<Actor>();
		
	for( i=0;i<numberOfVillanCharacters;i++)
	{
		
		System.out.println("Enter the name of Villian "+(i+1));
		villianName=sc.next();
	
		System.out.println("Enter the Character name of "+villianName);
		 villianCharacterName=sc.next();
		 villans.add(new Villan(villianName,villianCharacterName));
	
		

		 
	}
	return villans;
}
*/
		
public void scriptSelection(Genere genere)
{	



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

							
							System.out.print(castMap.get("Comedian").get(0).getCharacterName());
							System.out.print("("+castMap.get("Comedian").get(0).getActorName()+")");

							System.out.println(listFromFile.get(i).getDialogue());
							
						}	
							
						
						else if(i>2 && i>0)
						{	
							System.out.print(castMap.get("Hero").get(0).getCharacterName());
							System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
							
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
							System.out.print(castMap.get("Hero").get(0).getCharacterName());
							System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
							System.out.println(listFromFile.get(i).getDialogue());
						}
						else if(i>2)
						{	
							System.out.print(castMap.get("Heroine").get(0).getCharacterName());
							System.out.print("("+castMap.get("Heroine").get(0).getActorName()+")");
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
							System.out.print(castMap.get("Hero").get(0).getCharacterName());
							System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
							System.out.println(listFromFile.get(i).getDialogue());
						}
						else if(i>2 && i>0)
						{	
							System.out.print(castMap.get("Heroine").get(0).getCharacterName());
							System.out.print("("+castMap.get("Heroine").get(0).getActorName()+")");
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
					{	System.out.print(castMap.get("Heroine").get(1).getCharacterName());
						System.out.print("("+castMap.get("Heroine").get(1).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(1).getCharacterName());
					System.out.print("("+castMap.get("Hero").get(1).getActorName()+")");
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
					{	System.out.print(castMap.get("Heroine").get(0).getCharacterName());
						System.out.print("("+castMap.get("Heroine").get(0).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(0).getCharacterName());
					System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
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
					{	System.out.print(castMap.get("Hero").get(0).getCharacterName());
						System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(castMap.get("Comedian").get(0).getCharacterName());
						System.out.print("("+castMap.get("Comedian").get(0).getActorName()+")");
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
					{	System.out.print(castMap.get("Heroine").get(0).getCharacterName());
						System.out.print("("+castMap.get("Heroine").get(0).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(0).getCharacterName());
					System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
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
					{	System.out.print(castMap.get("Heroine").get(1).getCharacterName());
						System.out.print("("+castMap.get("Heroine").get(1).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(1).getCharacterName());
					System.out.print("("+castMap.get("Hero").get(1).getActorName()+")");
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
					{	System.out.print(castMap.get("Hero").get(0).getCharacterName());
						System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(castMap.get("Comedian").get(0).getCharacterName());
						System.out.print("("+castMap.get("Comedian").get(0).getActorName()+")");
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
					{	System.out.print(castMap.get("Villian").get(0).getCharacterName());
						System.out.print("("+castMap.get("Villian").get(0).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(0).getCharacterName());
					System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
					else if(i>15 && i>0)
					{
						System.out.print(castMap.get("Hero").get(1).getCharacterName());
						System.out.print("("+castMap.get("Hero").get(1).getActorName()+")");
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
					{	System.out.print(castMap.get("Heroine").get(1).getCharacterName());
						System.out.print("("+castMap.get("Heroine").get(1).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(1).getCharacterName());
					System.out.print("("+castMap.get("Hero").get(1).getActorName()+")");
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
					{	System.out.print(castMap.get("Hero").get(0).getCharacterName());
						System.out.print("("+castMap.get("Hero").get(0).getActorName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(castMap.get("Comedian").get(0).getCharacterName());
						System.out.print("("+castMap.get("Comedian").get(0).getActorName()+")");
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