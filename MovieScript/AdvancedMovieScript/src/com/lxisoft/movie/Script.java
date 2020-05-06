package com.lxisoft.movie;

import java.util.*;
import java.io.*;

import com.lxisoft.repository.*;

public class Script {
	
 private List<Dialouge> dialouge = new ArrayList<>();
 private FileRepositoryImp fileReppo = FileRepositoryImp.getInstance();
 private File comediFilmFile = new File("/home/adarsh/TestProject/MovieScript/src/com/lxisoft/file/comediFilmFile.csv");
 private File romanticFilmFile = new File("/home/adarsh/TestProject/MovieScript/src/com/lxisoft/file/romanticFilmFile.csv");
 private Scanner scanner;
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
			//dialouge.clear();
			dialouge = fileReppo.readFromFile(dialouge,comediFilmFile);
			return dialouge;
		}
		else
		{
			//dialouge.clear();
			dialouge = fileReppo.readFromFile(dialouge,romanticFilmFile);
			return dialouge;
		}
		
	}
	//overload
	public void editScript(int movieCode)
	{
		if(movieCode == 1)
		{
			dialouge = fileReppo.readFromFile(dialouge,comediFilmFile);
			//this.printScript(dialouge);
			this.printScriptUsingComparator(dialouge);
			this.editScript(dialouge, comediFilmFile);
		}
		else if(movieCode == 2)
		{
			//dialouge.clear();
			dialouge = fileReppo.readFromFile(dialouge,romanticFilmFile);
			//this.printScript(dialouge);
			this.printScriptUsingComparator(dialouge);
			this.editScript(dialouge, romanticFilmFile);
		}
	}
	
	public void printScript(List<Dialouge> dialouge)
	{
		Collections.sort(dialouge);
		for(int i =0 ;i<dialouge.size();i++)
		{
			System.out.println("Id : "+dialouge.get(i).getId());
			System.out.println("Dialouge Code : "+dialouge.get(i).getDialougeCode());
			System.out.println("QuestionOrAnswer : "+dialouge.get(i).getQuestionOrAnswer());
			System.out.println("Character Name : "+dialouge.get(i).getCharacterName());
			System.out.println("Dialouge : "+dialouge.get(i).getDialouge());
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	
	public void printScriptUsingComparator(List<Dialouge> dialouge)
	{
		Collections.sort(dialouge,new IdComparator());
		Iterator itr = dialouge.iterator();
		while(itr.hasNext())
		{
			Dialouge dia = (Dialouge)itr.next();
			System.out.println("Id : "+dia.getId());
			System.out.println("Dialouge Code : "+dia.getDialougeCode());
			System.out.println("QuestionOrAnswer : "+dia.getQuestionOrAnswer());
			System.out.println("Character Name : "+dia.getCharacterName());
			System.out.println("Dialouge : "+dia.getDialouge());
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		
	}
	//overLoad
	public void editScript(List<Dialouge> dialouge,File file)
	{
		scanner = Movie.getScanner();
		System.out.println("Enter the ID  for Update");
		String id = scanner.next();
		System.out.println("Enter the Dialouge Code ");
		String dialougeCode = scanner.next();
		System.out.println("Enter the Character Name ");
		String characterName = scanner.next();
		System.out.println("Enter Question Or Answer");
		String quesOrAns = scanner.next();
		System.out.println("Enter Dialouge");
		String dia = scanner.nextLine();
		dia = scanner.nextLine();
		this.editDialouge(dialouge, id, dialougeCode, characterName, quesOrAns, dia, file);
				
	}
	public void editDialouge(List<Dialouge> dialouge,String id,String dialougeCode,String characterName,String quesOrAns,String dia,File file)
	{
		for(int i = 0;i<dialouge.size();i++)
		{
			if(dialouge.get(i).getId().equals(id))
			{
				dialouge.get(i).setId(id);
				dialouge.get(i).setDialougeCode(dialougeCode);
				dialouge.get(i).setCharacterName(characterName);
				dialouge.get(i).setQuestionOrAnswer(quesOrAns);
				dialouge.get(i).setDialouge(dia);
				fileReppo.writeToFile(dialouge,file);
			}
		}
	}
}
