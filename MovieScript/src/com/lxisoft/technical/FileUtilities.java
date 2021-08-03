package com.lxisoft.technical;
import java.util.*;

class FileUtilities
{

	String scriptPath=new String("resources\\script\\");
String extension=".csv";
File movieFile=null;
BufferedReader scriptReader=null;


public StringBuilder fetchMajorContents(File file,Genere genere)
{	
				file=new File(scriptPath+(genere.toString()+extension));
				
				try{
							scriptReader=new BufferedReader(new FileReader(file));
								String line=null;

									while((line=scriptReader.readLine())!=null  )
									{
										String []parts=line.split(":");
										String scene=parts[0].trim();
									
										StringBuilder dialogue=new StringBuilder();
										dialogue.append(line);
					
							
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

return dialogue;

}






}
