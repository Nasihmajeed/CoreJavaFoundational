package com.lxisoft.repository;

import java.io.*;
import java.util.*;

import com.lxisoft.movie.Dialouge;

public class FileRepositoryImp implements FileRepository {

	public static FileRepositoryImp fileReppo;
	
	private FileRepositoryImp()
	{
		
	}
	
	public static FileRepositoryImp getInstance()
	{
		if(fileReppo == null)
		{
			return fileReppo = new FileRepositoryImp();
		}
		else
		{
			return fileReppo;
		}
	}
	
	@Override
	public void writeToFile(List<Dialouge> dialouge)
	{
		
	}
	
	public List<Dialouge> readFromFile(List<Dialouge> dialouge,File file)
	{
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dia;
			while((dia = bufferedReader.readLine()) != null)
			{
				String[] diaSplit =  dia.split(",");
				dialouge.add(new Dialouge());
				for(int i=0;i<dialouge.size();i++)
				{
					if(dialouge.get(i).getDialouge() == null)
					{
						dialouge.get(i).setDialougeCode(Integer.parseInt(diaSplit[0]));
						dialouge.get(i).setCharacterName(diaSplit[1]);
						dialouge.get(i).setQuestionOrAnswer(diaSplit[2]);
						dialouge.get(i).setDialouge(diaSplit[3]);
					}
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return dialouge;
	}
}
