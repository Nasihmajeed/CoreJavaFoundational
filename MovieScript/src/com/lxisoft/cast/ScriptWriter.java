package com.lxisoft.cast;

import java.io.*;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;
public class ScriptWriter
{

int i=0;

Scanner sc =new Scanner(System.in);
String scriptPath=new String("resources\\script\\");
String extension=".csv";

BufferedReader scriptReader=null;

List<Dialogue> dialogueLinesFromFile=new ArrayList<Dialogue>(); 

Map<String,ArrayList<Actor>> cast=new HashMap<String,ArrayList<Actor>>();

File movieFile=null;

 ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();

Script script =new Script();

public void setCast(Map<String,ArrayList<Actor>> cast)
{
	this.cast=cast;
}

public void writeScript(Genere genere)
{	


switch(genere)
{
	case Comedy: 
					 movieFile=new File(scriptPath+"Comedy.csv");

					script.createScriptFromDialogues(majorContentsOfTheMovie(movieFile,genere));
					dialogueLinesFromFile=script.getDialogues();

			for(i=0;i<dialogueLinesFromFile.size();i++ )
			{
			
			
					if(dialogueLinesFromFile.get(i) instanceof ComedyDialogue)
					{
						if(i%2==0 && i>0)
						{

							
							System.out.print(cast.get("Comedian").get(0).getCharacterName());
							System.out.print("("+cast.get("Comedian").get(0).getActorName()+")");

							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
							
						}	
							
						
						else if(i>2 && i>0)
						{	
							System.out.print(cast.get("Hero").get(0).getCharacterName());
							System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
							
							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
						}	
							

				breakBetweenScenes();
					if(dialogueLinesFromFile.get(i) instanceof RomanticDialogue)
					{
						
						if(i%2==0)
						{	
							System.out.print(cast.get("Hero").get(0).getCharacterName());
							System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
						}
						else if(i>2)
						{	
							System.out.print(cast.get("Heroine").get(0).getCharacterName());
							System.out.print("("+cast.get("Heroine").get(0).getActorName()+")");
							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
						}
					}
					breakBetweenScenes();
					if(dialogueLinesFromFile.get(i) instanceof EmotionalDialogue)
					{
						
						if(i%2==0 && i>0)
						{	
							System.out.print(cast.get("Hero").get(0).getCharacterName());
							System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
						}
						else if(i>2 && i>0)
						{	
							System.out.print(cast.get("Heroine").get(0).getCharacterName());
							System.out.print("("+cast.get("Heroine").get(0).getActorName()+")");
							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
						}
					}


					
			}
			
			break;
		
/*	case Romantic :  movieFile=new File(scriptPath+"Romantic.csv");
					dialogueLinesFromFile= fetchMovieScript(movieFile,genere);

			for(i=0;i<dialogueLinesFromFile.size();i++ )
			{	

				if(dialogueLinesFromFile.get(i) instanceof RomanticDialogue)
				{	if(i%2==0 && i>0)
					{	System.out.print(cast.get("Heroine").get(1).getCharacterName());
						System.out.print("("+cast.get("Heroine").get(1).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast.get("Hero").get(1).getCharacterName());
					System.out.print("("+cast.get("Hero").get(1).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}

				}
									

				

				if(dialogueLinesFromFile.get(i) instanceof EmotionalDialogue)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast.get("Heroine").get(0).getCharacterName());
						System.out.print("("+cast.get("Heroine").get(0).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast.get("Hero").get(0).getCharacterName());
					System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}
				}
				//breakBetweenScenes();
				if(dialogueLinesFromFile.get(i) instanceof ComedyDialogue)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast.get("Hero").get(0).getCharacterName());
						System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
						System.out.print(cast.get("Comedian").get(0).getCharacterName());
						System.out.print("("+cast.get("Comedian").get(0).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}
					
				}


					
			}		
			break;		
case Emotional : movieFile=new File(scriptPath+"Emotional.csv");
					dialogueLinesFromFile= fetchMovieScript(movieFile,genere);

			for(i=0;i<dialogueLinesFromFile.size();i++ )
			{
				breakBetweenScenes();
				if(dialogueLinesFromFile.get(i) instanceof EmotionalDialogue)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast.get("Heroine").get(0).getCharacterName());
						System.out.print("("+cast.get("Heroine").get(0).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast.get("Hero").get(0).getCharacterName());
					System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}
				}
					
				if(dialogueLinesFromFile.get(i) instanceof RomanticDialogue)
				{	if(i%2==0 && i>0)
					{	System.out.print(cast.get("Heroine").get(1).getCharacterName());
						System.out.print("("+cast.get("Heroine").get(1).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast.get("Hero").get(1).getCharacterName());
					System.out.print("("+cast.get("Hero").get(1).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}

					
				}
					breakBetweenScenes();
				
				if(dialogueLinesFromFile.get(i) instanceof ComedyDialogue)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast.get("Hero").get(0).getCharacterName());
						System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
						System.out.print(cast.get("Comedian").get(0).getCharacterName());
						System.out.print("("+cast.get("Comedian").get(0).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}
					
				}
					
			}		
			break;		
	

	case Thriller : movieFile=new File(scriptPath+"Thriller.csv");
					dialogueLinesFromFile= fetchMovieScript(movieFile,genere);

			for(i=0;i<dialogueLinesFromFile.size();i++ )
			{
				breakBetweenScenes();
				if(dialogueLinesFromFile.get(i) instanceof ThrillerDialogue)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast.get("Villian").get(0).getCharacterName());
						System.out.print("("+cast.get("Villian").get(0).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast.get("Hero").get(0).getCharacterName());
					System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}
					else if(i>15 && i>0)
					{
						System.out.print(cast.get("Hero").get(1).getCharacterName());
						System.out.print("("+cast.get("Hero").get(1).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}
				}

				breakBetweenScenes();

				if(dialogueLinesFromFile.get(i) instanceof RomanticDialogue)
				{	if(i%2==0 && i>0)
					{	System.out.print(cast.get("Heroine").get(1).getCharacterName());
						System.out.print("("+cast.get("Heroine").get(1).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
					System.out.print(cast.get("Hero").get(1).getCharacterName());
					System.out.print("("+cast.get("Hero").get(1).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}

					
				}

				breakBetweenScenes();
				if(dialogueLinesFromFile.get(i) instanceof ComedyDialogue)
				{
					if(i%2==0 && i>0)
					{	System.out.print(cast.get("Hero").get(0).getCharacterName());
						System.out.print("("+cast.get("Hero").get(0).getActorName()+")");
						System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
					}
					else if(i>2 && i>0)
					{
						System.out.print(cast.get("Comedian").get(0).getCharacterName());
						System.out.print("("+cast.get("Comedian").get(0).getActorName()+")");
					System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());	
					}
					
				}
					
			}		
			break;		
	*/
			

		}			

 }
}

public ArrayList<Dialogue> majorContentsOfTheMovie(File file,Genere genere)
{
		//ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
	
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
					 //scriptList=script.createScriptFromDialogues(dialogue.toString(),Genere.valueOf("Comedy"));

						/*dialogues.add(new ComedyDialogue());
						dialogues.get(i).setDialogueLine(dialogue.toString());
						i++;*/	
						script.writeDialogues(new ComedyDialogue(),dialogue.toString(),i);

						//scriptList.get(i).setDialogueLine(dialogue.toString());
						
						
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
		}

		dialogues=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Emotional"),dialogues );
			/*scriptList=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Romantic"),scriptList);
			scriptList=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Thriller"),scriptList);
			*/

break;



	/*	case Emotional:	try{
						
						
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
						scriptList.add(new EmotionalDialogue());
						scriptList.get(i).setDialogueLine(dialogue.toString());
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
					
					StringBuilder dialogue=new StringBuilder();
					dialogue.append(line);
					
					if(!(dialogue.toString().equals("")))
					{
						scriptList.add(new RomanticDialogue());
						scriptList.get(i).setDialogueLine(dialogue.toString());
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
					
					StringBuilder dialogue=new StringBuilder();
					dialogue.append(line);
					
					if(!(dialogue.toString().equals("")))
					{
						scriptList.add(new ThrillerDialogue());
						scriptList.get(i).setDialogueLine(dialogue.toString());
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


			}scriptList=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Comedy"),scriptList);
			scriptList=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Emotional"),scriptList);
			scriptList=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Romantic"),scriptList);
			break;
			*/


}
script.createScriptFromDialogues(dialogues);		
return dialogues;
//return scriptList;


}





public ArrayList<Dialogue> minorContentsOfTheMovie(String scriptPath,Genere genere,ArrayList<Dialogue> dialogues)
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
									/*case Comedy:if(!(dialogue.toString().equals("")))
													{int l=dialogues.size();
													dialogues.add(new ComedyDialogue());
													dialogues.get(l).setDialogueLine(dialogue.toString());

													//scriptList.get(l).setDialogueLine(dialogue.toString());
													l++;
													//scriptList=script.getDialogues();
													}
													break;	*/
								case Emotional:	if(!(dialogue.toString().equals("")))
														{int k=dialogues.size();
														/*dialogues.add(new EmotionalDialogue());
														dialogues.get(k).setDialogueLine(dialogue.toString());
														*/
														script.writeDialogues(new EmotionalDialogue(),dialogue.toString(),k);	
														k++;}
													break;	/*		
									case Romantic:	if(!(dialogue.toString().equals("")))
													{int m=scriptList.size();
													scriptList.add(new RomanticDialogue());
													scriptList.get(m).setDialogueLine(dialogue.toString());
													m++;				
													}
													break;
									case Thriller:	if(!(dialogue.toString().equals("")))
													{int n=scriptList.size();
													scriptList.add(new ThrillerDialogue());
													scriptList.get(n).setDialogueLine(dialogue.toString());
													n++;
													}break;	*/			
								
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



		return dialogues;
//return scriptList;

}


private void breakBetweenScenes()
{
	try{
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					Thread.currentThread().interrupt();
				}

}


}