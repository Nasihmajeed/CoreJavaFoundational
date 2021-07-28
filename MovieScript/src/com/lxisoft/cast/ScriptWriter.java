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

ArrayList<Dialogue> script=new ArrayList<Dialogue>();


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

					dialogueLinesFromFile=majorContentsOfTheMovie(movieFile,genere);

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
							
					}	
				
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
	
		

case Romantic : 		 movieFile=new File(scriptPath+"Romantic.csv");

					dialogueLinesFromFile=majorContentsOfTheMovie(movieFile,genere);

			for(i=0;i<dialogueLinesFromFile.size();i++ )
			{
			
			
					if(dialogueLinesFromFile.get(i) instanceof ComedyDialogue)
					{
						if(i%2==0 && i>0)
						{

							
							System.out.print(cast.get("Heroine").get(0).getCharacterName());
							System.out.print("("+cast.get("Heroine").get(0).getActorName()+")");

							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
							
						}	
							
						
						else if(i>2 && i>0)
						{	
							System.out.print(cast.get("Comedian").get(0).getCharacterName());
							System.out.print("("+cast.get("Comedian").get(0).getActorName()+")");
							
							System.out.println(dialogueLinesFromFile.get(i).getDialogueLine());
						}	
							
					}	
				
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




	}




}

public ArrayList<Dialogue> majorContentsOfTheMovie(File file,Genere genere)
{
				
	
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
							
							script.add(new ComedyDialogue());
							script.get(i).setDialogueLine(dialogue.toString());
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
		}
		script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Emotional"),script );
		script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Romantic"),script);
		script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Thriller"),script);
			

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
						script.add(new EmotionalDialogue());
						script.get(i).setDialogueLine(dialogue.toString());
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


			}script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Comedy"),script);
			script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Romantic"),script);
			script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Thriller"),script);
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
						script.add(new RomanticDialogue());
						script.get(i).setDialogueLine(dialogue.toString());
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


			}script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Comedy"),script);
			script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Emotional"),script);
			script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Thriller"),script);
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
						script.add(new ThrillerDialogue());
						script.get(i).setDialogueLine(dialogue.toString());
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


			}
			script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Comedy"),script);
			script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Emotional"),script);
			script=minorContentsOfTheMovie(scriptPath,Genere.valueOf("Romantic"),script);
			break;
		

}


return script;
}





public ArrayList<Dialogue> minorContentsOfTheMovie(String scriptPath,Genere genere,ArrayList<Dialogue> script)
{	
	
	int j=0;
	
	File file=new File(scriptPath+(genere.toString()+extension));
	
			try
			{
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
													{int l=script.size();
													script.add(new ComedyDialogue());
													script.get(l).setDialogueLine(dialogue.toString());
														l++;
													
													}
													break;	
									case Emotional:	if(!(dialogue.toString().equals("")))
														{int k=script.size();
														script.add(new EmotionalDialogue());
														script.get(k).setDialogueLine(dialogue.toString());
														k++;}
													break;			
									case Romantic:	if(!(dialogue.toString().equals("")))
													{int m=script.size();
													script.add(new RomanticDialogue());
													script.get(m).setDialogueLine(dialogue.toString());
													m++;				
													}
													break;
									case Thriller:	if(!(dialogue.toString().equals("")))
													{int n=script.size();
													script.add(new ThrillerDialogue());
													script.get(n).setDialogueLine(dialogue.toString());
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



	return script;

}




}