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
	public void selectActor(ArrayList<Dialouge> vDialouge,ArrayList<Dialouge> cDialouge)
	{
		try
		{
			ArrayList<Actors> actors = new ArrayList<Actors>();
			actors.add(new Villan());
			actors.add(new Comedian());
			int c =0;
			boolean exists=false;
			do
			{
			 int x = (int)(Math.random()*actors.size());

				if(actors.get(x) instanceof Comic)
				{
					checkQuestion(actors.get(x),cDialouge,vDialouge);
					c++;
					exists = conversationexeed(c,exists);
				}
				else if(actors.get(x) instanceof Villanic)
				{
					checkQuestion(actors.get(x),cDialouge,vDialouge);
					c++;
					exists = conversationexeed(c,exists);
				}
		    }while(exists);
	   }
	   catch(Exception e)
	   {
	   	e.printStackTrace();
	   }
	}
	// public void startConversation(Actors actor,ArrayList<Dialouge> vDialouge,ArrayList<Dialouge> cDialouge)
	// {
	// 	try
	// 	{
	// 		int y = (int)(Math.random()*5);

	// 		if(actor instanceof Comic)
	// 		{
				
	// 		}
	// 		else if(actor instanceof Villanic)
	// 		{
				
	// 		}
	//     }
	// 	catch(Exception e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// }
	public void checkQuestion(Actors actor,ArrayList<Dialouge> cDialouge,ArrayList<Dialouge> vDialouge)
	{
		ArrayList<Integer> cqus = new ArrayList<Integer>();
		ArrayList<Integer> vqus = new ArrayList<Integer>();
		int y = (int)(Math.random()*5);
		if(actor instanceof Comic)
		{
			for(int i=0;i<cqus.size();i++)
			{
				if(!cqus.equals(y))
				{
					cqus.add(y);
					System.out.println(cDialouge.get(y).getDialouge());
					System.out.println(vDialouge.get(y+5).getDialouge());
				}
		    }
		}
		if(actor instanceof Villanic)
		{
			for(int i=0;i<vqus.size();i++)
			{
				if(!cqus.equals(y))
				{
					vqus.add(y);
					System.out.println(vDialouge.get(y).getDialouge());
					System.out.println(cDialouge.get(y+5).getDialouge());	
				}
		    }
		}
	}
	public boolean conversationexeed(int x,boolean exists)
	{
		try
		{
			if(x==9)
			{
				exists = false;
			}
			else if(x<10)
			{
				exists = true;
			}
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return exists;
	}
}