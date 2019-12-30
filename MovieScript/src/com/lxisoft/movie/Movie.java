package com.lxisoft.movie;
import java.util.*;
import java.io.*;
public class Movie 
{
	private String name;
    public ArrayList<Dialouge> vDialouge;
	public ArrayList<Dialouge> cDialouge;
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

        vDialouge = script.clearArray(vDialouge);
        cDialouge = script.clearArray(cDialouge);

        vDialouge = script.readFromFile(villanFile,vDialouge);
        cDialouge = script.readFromFile(comedianFile,cDialouge);
        //script.print(vDialouge);
        //script.print(cDialouge);
        startConversation();
	}

	public void startConversation()
	{
		int x = (int)(Math.random()*vDialouge.size());

		for(int i=0;i<vDialouge.size();i++)
		{
			System.out.println(vDialouge.get(i).getDialouge());
			System.out.println(cDialouge.get(i).getDialouge());
		}
			System.out.println(vDialouge.size());
			System.out.println(vDialouge.size());
	}
}