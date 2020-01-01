package com.lxisoft.movie;
import com.lxisoft.Interface.*;
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

        sample = script.readFromFile(villanFile,sample);
        sample1 = script.readFromFile(comedianFile,sample1);
      
        selectActor(sample,sample1);
	}

	public void startConversation(ArrayList<Dialouge> vDialouge,ArrayList<Dialouge> cDialouge)
	{
		for(int i=0;i<vDialouge.size();i++)
		{
			//if(vDialouge.get(i).getDialouge()!=null && cDialouge.get(i).getDialouge()!=null)
			//{
				System.out.println(vDialouge.get(i).getDialouge());
				System.out.println(cDialouge.get(i).getDialouge());
		    //}
		}
	}
	public void selectActor(ArrayList<Dialouge> vDialouge,ArrayList<Dialouge> cDialouge)
	{
		ArrayList<Actors> actors = new ArrayList<Actors>();
		actors.add(new Villan());
		actors.add(new Comedian());

		int x = (int)(Math.random()*actors.size());
		int y = (int)(Math.random()*sample.size());

		if(actors.get(x) instanceof Comic)
		{
			startConversation(sample1,sample);
		}
		else if(actors.get(x) instanceof Villanic)
		{
			startConversation(sample,sample1);	
		}
	}
}