package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
public class Director
{

int i=0;
Scanner sc =new Scanner(System.in);
String scriptPath=new String("com\\script\\");
String extension=".csv";

BufferedReader scriptReader=null;

ArrayList<Script> listFromFile=new ArrayList<Script>(); 

Map<String,ArrayList<Actor>> castMap=new HashMap<String,ArrayList<Actor>>();
//map for each class
ArrayList<Actor> actors;

File movieFile=null;


public void doCasting()
{
	


int i, numberOfHeroCharacters,numberOfHeroineCharacters,numberOfComedianCharacters,numberOfVillanCharacters;
String heroName,heroCharacterName,heroineName,heroineCharacterName,comedianName,comedianCharacterName,villianName,villianCharacterName;

	System.out.println("Enter the number of heros: ");
	numberOfHeroCharacters=sc.nextInt();
	ArrayList<Hero> heros=new ArrayList<Hero>();
	for(i=0;i<numberOfHeroCharacters;i++)
	{
			

		System.out.println("Enter the name of hero "+(i+1));
		heroName=sc.next();	
		
		
		System.out.println("Enter the Character name of "+heroName);
		heroCharacterName=sc.next();

		heros.add(new Hero(heroName,heroCharacterName));
		/*actors.get(i).setHeroName(heroName);
		actors.get(i).setHeroCharacterName(heroCharacterName);*/
		//if(actors.get(i) instanceof Hero)
		actors.add(new Hero());
		actors.addAll(heros);

		 castMap.put("Hero",actors);
		
		}
int j,n,m;
//j=actors.size();
	System.out.println("Enter the number of heroines: ");
	numberOfHeroineCharacters=sc.nextInt();
	ArrayList<Heroine> heroines=new ArrayList<Heroine>();
	for( i=0;i<numberOfHeroineCharacters;i++)
	{	
		System.out.println("Enter the name of heroines "+(i+1));
		heroineName=sc.next();
		
		
		System.out.println("Enter the Character name of "+heroineName);
		heroineCharacterName=sc.next();
		heroines.add(new Heroine(heroineName,heroineCharacterName));
		/*actors.get(i).setHeroineName(heroineName);	
		actors.get(i).setHeroineCharacterName(heroineCharacterName);*/
		//if(actors.get(i) instanceof Heroine)
		actors.add(new Heroine());
		actors.addAll(heroines);

			castMap.put("Heroine",actors);
		
		
	
//j++;		
		
	}
		//n=actors.size();
		System.out.println("Enter the number of Comedian: ");
	numberOfComedianCharacters=sc.nextInt();
	ArrayList<Comedian> comedians=new ArrayList<Comedian>();
	for( i=0;i<numberOfComedianCharacters;i++)
	{	
		System.out.println("Enter the name of Comedian "+(i+1));
		comedianName=sc.next();
		
		
		System.out.println("Enter the Character name of "+comedianName);
		comedianCharacterName=sc.next();
		comedians.add(new Comedian(comedianName,comedianCharacterName));
		/*actors.get(i).setComedianName(comedianName);	
		actors.get(i).setComedianCharacterName(comedianCharacterName);*/
		//if(actors.get(i) instanceof Comedian)
		actors.add(new Comedian());
		actors.addAll(comedians);

		castMap.put("Comedian",actors);
		//n++;
	
	}
	//m=actors.size();
	System.out.println("Enter the number of Villian: ");
	numberOfVillanCharacters=sc.nextInt();
	ArrayList<Villan> villans=new ArrayList<Villan>();
		
	for( i=0;i<numberOfVillanCharacters;i++)
	{
		
		System.out.println("Enter the name of Villian "+(i+1));
		villianName=sc.next();
	
		System.out.println("Enter the Character name of "+villianName);
		 villianCharacterName=sc.next();
		 villans.add(new Villan(villianName,villianCharacterName));
		 	/*actors.get(i).setVillianName(villianName);	
		actors.get(i).setVillianCharacterName(villianCharacterName);*/
		//if(actors.get(i) instanceof Villan)
		actors.add(new Villan());
		actors.addAll(villans);
		castMap.put("Villian",actors);
		//m++;
		

		 
	}



	/*for(Actor a:actors)
	{
		System.out.println(a.getActorName()+" "+a.getCharacterName());
	}*/
	System.out.print(castMap.get("Comedian").get(0).getCharacterName());
	System.out.print(castMap.get("Villian").get(0).getCharacterName());
	System.out.print(castMap.get("Heroine").get(0).getCharacterName());

}

		
public void scriptSelection(Genere genere)
{	

Actor hero=new Hero();
Actor heroine=new Heroine();
Actor villian=new Villan();
Actor comedian=new Comedian();

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
							System.out.print(castMap.get("Hero").get(1).getCharacterName());
							System.out.print("("+castMap.get("Hero").get(1).getActorName()+")");
							System.out.println(listFromFile.get(i).getDialogue());
						}
						else if(i>2 && i>0)
						{	
							System.out.print(castMap.get("Heroine").get(1).getCharacterName());
							System.out.print("("+castMap.get("Heroine").get(1).getActorName()+")");
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
/*case Emotional : movieFile=new File(scriptPath+"Emotional.csv");
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
					{	System.out.print(castMap.get("Heroine").get(0).getHeroineCharacterName());
						System.out.print("("+castMap.get("Heroine").get(0).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+castMap.get("Hero").get(0).getHeroName()+")");
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
					{	System.out.print(castMap.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+castMap.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(1).getHeroCharacterName());
					System.out.print("("+castMap.get("Hero").get(1).getHeroName()+")");
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
					{	System.out.print(castMap.get("Hero").get(0).getHeroCharacterName());
						System.out.print("("+castMap.get("Hero").get(0).getHeroName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(castMap.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+castMap.get("Comedian").get(0).getComedianName()+")");
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
					{	System.out.print(castMap.get("Villian").get(0).getVillianName());
						System.out.print("("+castMap.get("Villian").get(0).getVillianCharacterName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(0).getHeroCharacterName());
					System.out.print("("+castMap.get("Hero").get(0).getHeroName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
					else if(i>15 && i>0)
					{
						System.out.print(castMap.get("Hero").get(1).getHeroCharacterName());
						System.out.print("("+castMap.get("Hero").get(1).getHeroName()+")");
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
					{	System.out.print(castMap.get("Heroine").get(1).getHeroineCharacterName());
						System.out.print("("+castMap.get("Heroine").get(1).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
					System.out.print(castMap.get("Hero").get(1).getHeroineCharacterName());
					System.out.print("("+castMap.get("Hero").get(1).getHeroineName()+")");
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
					{	System.out.print(castMap.get("Hero").get(0).getHeroineCharacterName());
						System.out.print("("+castMap.get("Hero").get(0).getHeroineName()+")");
						System.out.println(listFromFile.get(i).getDialogue());
					}
					else if(i>2 && i>0)
					{
						System.out.print(castMap.get("Comedian").get(0).getComedianCharacterName());
						System.out.print("("+castMap.get("Comedian").get(0).getComedianName()+")");
					System.out.println(listFromFile.get(i).getDialogue());	
					}
					
				}
					
			}		
			break;		
	
		*/				

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