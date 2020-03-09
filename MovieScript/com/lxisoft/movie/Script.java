package com.lxisoft.movie;
import  com.lxisoft.movie.*;
import com.lxisoft.repository.*;
import java.util.*;
public class Script
{
	Scanner sc = new Scanner(System.in);
	private String scriptWriter;
	ArrayList<Dialogue> dialogueList = new ArrayList<Dialogue>();
	public void setScriptWriter(String scriptwriter)
	{
		this.scriptWriter = scriptwriter;
	}
	public String getScriptWriter()
	{
		return scriptWriter;
	}
	public void scriptDetails()
	{
		setScriptWriter("rahul");
		System.out.println("ScriptWriter::"+getScriptWriter().toUpperCase());	
	}
	public List<Dialogue>[] getScript(FileRepository repo)
	{
		repo.readFromScript(dialogueList,"C://Users//rahul//Desktop//Java Projects//MovieScript//v3//com//lxisoft//repository//IronManScript.csv",0);
		repo.readFromScript(dialogueList,"C://Users//rahul//Desktop//Java Projects//MovieScript//v3//com//lxisoft//repository//ThanosScript.csv",10);
		List<Dialogue> dialogueListIronMan = dialogueList.subList(0,10);
		List<Dialogue> dialogueListThanos = dialogueList.subList(10,20); 
		return new List[]{dialogueListIronMan,dialogueListThanos};
	} 
	public void editScript(List<Dialogue>[] list)
	{
		System.out.println("1.Add Dialogue\n2.Delete Dialogue\n");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:addDialogue(list);
			//case 2:deleteDialogue(list);
			default :System.out.println("Enter valid choice");
		}	
	}
	public void addDialogue(List<Dialogue>[] list)
	{
		System.out.println("1.Question\n Or \n2.Answer,You Want to add");
		int ch = sc.nextInt(); 

	}
}
