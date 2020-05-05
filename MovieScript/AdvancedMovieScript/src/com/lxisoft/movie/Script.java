package com.lxisoft.movie;

import java.util.*;
import java.io.*;

import com.lxisoft.repository.*;

public class Script {
	
 private List<Dialouge> dialouge = new ArrayList<>();
 private FileRepositoryImp fileReppo = FileRepositoryImp.getInstance();
 private File comediFilmFile = new File("/home/adarsh/TestProject/MovieScript/src/com/lxisoft/file/comediFilmFile.csv");
 private File romanticFilmFile = new File("/home/adarsh/TestProject/MovieScript/src/com/lxisoft/file/RomanticFilmFile.csv");
	
	public void setDialouge()
	{
		
		for(int i =0;i<10;i++)
		{
			dialouge.add(new Dialouge());
			System.out.println("Object Name : "+dialouge.get(i));
		}
	}
	public void getDialouge()
	{
		//dialouge = fileReppo.readFromFile(dialouge);
	}
	
	public List<Dialouge> getScript(int scriptCode)
	{
		if(scriptCode == 1)
		{
			dialouge.clear();
			dialouge = fileReppo.readFromFile(dialouge,comediFilmFile);
			return dialouge;
		}
		else
		{
			dialouge.clear();
			dialouge = fileReppo.readFromFile(dialouge,romanticFilmFile);
			return dialouge;
		}
		
	}
}
