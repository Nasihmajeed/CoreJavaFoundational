package com.lxisoft.movie;
import java.util.*;
import java.io.*;
public class Movie 
{
	private String name;

	public Movie(String name)
	{
		this.name=name;
	}
	public void coversation()
	{
		File villanFile = new File("villanDialouge.txt");
	    File comedianFile = new File("comedianFile.txt");
		ArrayList<Dialouge> vDialouge;
		ArrayList<Dialouge> cDialouge;
		ArrayList<Dialouge> test;
		boolean villanExists,comedianExists;
		Script script = new Script();

		vDialouge = script.setArray(script.villanDialouge);
		cDialouge = script.setArray(script.comedianDialouge);
        script.setVillanDialouge(vDialouge);
        script.setComedianDialouge(cDialouge);
        villanExists = script.fileExist(villanFile);
        comedianExists = script.fileExist(comedianFile);
        villanFile = script.createFile(villanExists,villanFile);
        comedianFile = script.createFile(comedianExists,comedianFile);
        script.writeToFile(villanFile,vDialouge);
        script.writeToFile(comedianFile,cDialouge);
        vDialouge = script.clearArray(vDialouge);
        cDialouge = script.clearArray(cDialouge);
        vDialouge = script.readFromFile(villanFile,vDialouge);
        cDialouge = script.readFromFile(comedianFile,cDialouge);
        script.print(vDialouge);
        script.print(cDialouge);
	}
}