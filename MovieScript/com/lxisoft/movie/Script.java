package com.lxisoft.movie;
import  com.lxisoft.movie.*;
import com.lxisoft.repository.*;
import java.util.*;
public class Script
{
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
}
