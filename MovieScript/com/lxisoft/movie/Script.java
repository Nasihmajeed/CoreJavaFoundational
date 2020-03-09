package com.lxisoft.movie;
import  com.lxisoft.movie.*;
import com.lxisoft.repository.*;
import java.util.*;
public class Script
{
	Scanner sc = new Scanner(System.in);
	private String scriptWriter;

	ArrayList<Dialogue> ironManQ = new ArrayList<Dialogue>();
	ArrayList<Dialogue> ironManR = new ArrayList<Dialogue>();
	ArrayList<Dialogue> thanosQ = new ArrayList<Dialogue>();
	ArrayList<Dialogue> thanosR = new ArrayList<Dialogue>();

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
	public void getScript(FileRepository repo)
	{
		repo.readFromScript(ironManQ,"C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//ironManQ.csv");
		repo.readFromScript(ironManR,"C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//ironManR.csv");
		repo.readFromScript(thanosQ,"C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//thanosQ.csv");
		repo.readFromScript(thanosR,"C://Users//rahul//Desktop//Java Projects//MovieScript//v5//com//lxisoft//repository//thanosR .csv");
	} 
	public void editScript(ArrayList<Actor> actorList,List<Dialogue>[] list)
	{
		System.out.println("1.Add Dialogue\n2.Delete Dialogue\n");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:addDialogue(actorList);
			case 2:deleteDialogue();
			default:System.out.println("Enter valid choice");
		}	
	}
	public void addDialogue(ArrayList<Actor> actorList)
	{
		System.out.println("Whose Dialogues You Want to add\n1.IronMan(Press 1)\n2.Thanos(Press 2)\n");
		int ch = sc.nextInt();
		switch(ch)
		{	
			case 1:addToScript(ch,actorList);
			case 2:addToScript(ch,actorList);
			default:System.out.println("Enter valid choice");	
		}

	}
	public  void addToScript(int index,ArrayList<Actor> actorList)
	{

		System.out.println(actorList.get(index).getNameOfRole());
		System.out.println("Enter dialogue:");
		String movieDialogue = sc.nextLine();
		sc.nextLine();
		System.out.println(actorList.get(index).getNameOfRole());
		System.out.println("Enter reply:");
		String movieReply = sc.nextLine();
		sc.nextLine();

	}
}
