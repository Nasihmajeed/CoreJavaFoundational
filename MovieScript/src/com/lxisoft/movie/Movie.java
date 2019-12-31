package com.lxisoft.movie;
import java.util.*;
import java.io.*;
public class Movie 
{
	private String name;
    public ArrayList<Dialouge> vDialouge;
	public ArrayList<Dialouge> cDialouge;
	public ArrayList<Dialouge> sample = new ArrayList<Dialouge>();
	public ArrayList<Dialouge> sample1 = new ArrayList<Dialouge>();

	public Movie(String name)
	{
		this.name=name;
	}
	public void coversation()
	{
		File villanFile = new File("villanDialouge.txt");
	    File comedianFile = new File("comedianFile.txt");
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

        //vDialouge = script.clearArray(vDialouge);
        //cDialouge = script.clearArray(cDialouge);

        sample = script.readFromFile(villanFile,sample);
        sample1 = script.readFromFile(comedianFile,sample1);
      	
        //script.print(cDialouge);
        startConversation();
	}

	public void startConversation()
	{
		int x = (int)(Math.random()*sample.size());

		for(int i=0;i<sample.size();i++)
		{
			System.out.println(sample.get(i).getDialouge());
			System.out.println(sample1.get(i).getDialouge());
		}
			//System.out.println(sample.size());
			//System.out.println(sample1.size());
	}
	public void selectActor()
	{
		
	}
}