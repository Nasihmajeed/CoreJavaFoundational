package com.lxisoft.technical;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.cast.*;

import java.io.*;
import com.lxisoft.about.*;


public class FileUtilities
{

	String scriptPath=new String("resources\\script\\");
String extension=".csv";
File movieFile=null;
BufferedReader scriptReader=null;






public ArrayList<Dialogue> fetchContents(Genere genere,ArrayList<Dialogue> script,int noOfLines)
{
movieFile=new File(scriptPath+(genere.toString()+extension));

int j=0;
try
			{
						String minorLine=null;

						scriptReader=new BufferedReader(new FileReader(movieFile));
						while((minorLine=scriptReader.readLine())!=null && j<noOfLines )
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
