package com.lxisoft.moviescript;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Script
{
	
	public ArrayList<Dialogue> setArray()
	{
		ArrayList<Dialogue> dialouge = new ArrayList<Dialogue>();
		for(int i=0;i<4;i++)
		{
			dialouge.add(new Dialogue());
		}
		return dialouge;
	}
	public void commonConversation(Actors actor,ArrayList<Dialogue> vDialouge,ArrayList<Dialogue> cDialouge,ArrayList<Actors> actorArray)
	{
		if(actor instanceof Villan)
		{
			for(int i=0;i<vDialouge.size()-2;i++)
			{
				System.out.println(((Villan)actorArray.get(0)).getName()+" : "+vDialouge.get(i).getDialogue());
				System.out.println(((Comedian)actorArray.get(1)).getName()+" : "+cDialouge.get(i+2).getDialogue());
			}
	    }
	    else if(actor instanceof Comedian)
	    {
	    	for(int i=0;i<cDialouge.size()-2;i++)
			{
				System.out.println(((Comedian)actorArray.get(1)).getName()+" : "+cDialouge.get(i).getDialogue());
				System.out.println(((Villan)actorArray.get(0)).getName()+" : "+vDialouge.get(i+2).getDialogue());
			}	
	    }
	}
	
	public File createFile (boolean exists,File file)
	{
		try
		{
			if(!exists)
			{
				file.createNewFile();
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		return file;
	}
	public void writeFile(File file,Scanner sc,ArrayList<Dialogue> dialougeArray)
	{
		try
		{
			boolean isTrue = false;
			FileWriter fileWriter = new FileWriter(file,true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			do
			{
			isTrue = false;
			System.out.println("1.Add Dialouge\n 2.View Dialouge\n 3.Back");
			int x = sc.nextInt();
			switch(x)
			{
				case 1:
					dialougeEntry(file,sc,bufferedWriter);
				    isTrue = true;
				    break;
				case 2:
					readDialoge(file,dialougeArray);
					isTrue = true;
					break;
				case 3:
				    // bufferedWriter.close();
				    System.exit(0);
					break;
				default :
					System.out.println("Select any Options");
					break;
			}
		    }while(isTrue);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public void readDialoge(File file,ArrayList<Dialogue> dialougeArray)
	{
		try{
			List<Dialogue> dialouge;
			dialouge = readFromFile(file,dialougeArray);
			printDialouge(dialougeArray);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void dialougeEntry(File file,Scanner sc,BufferedWriter bufferedWriter)
	{
		try{
			System.out.println("Enter Dialouge");
			String dialog = sc.nextLine();
			dialog = sc.nextLine();
			createNewLine(file,bufferedWriter);
			bufferedWriter.write(dialog);
		    bufferedWriter.flush();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void createNewLine(File file,BufferedWriter bw)
	{
		try
		{
			if(file.length()>0)
			{
				bw.newLine();
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	public List<Dialogue> readFromFile(File file,List<Dialogue> dialougeArray)
	{
		try
		{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String dia;
			while((dia = bufferedReader.readLine()) != null)
			{
				dialougeArray.add(new Dialogue());
				for(int i=0;i<dialougeArray.size();i++)
				{
					if(dialougeArray.get(i).getDialogue()==null)
					{
						dialougeArray.get(i).setDialogue(dia);
						break;
					}
				}
			}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return dialougeArray;
	}
	
	public void printDialouge(ArrayList<Dialogue> dialouge)
	{
		for(int i=0;i<dialouge.size();i++)
		{
			System.out.println(dialouge.get(i).getDialogue());
		}
	}
	public void print(int x,ArrayList<Dialogue> dialouge1,ArrayList<Dialogue> dialouge2,Actors actor,ArrayList<Actors> actorsArray)
	{
		if(actor instanceof Comic)
		{
			System.out.println(((Comedian)actorsArray.get(1)).getName()+" : "+dialouge1.get(x).getDialogue());
			System.out.println(((Villan)actorsArray.get(0)).getName()+" : "+dialouge2.get(x).getDialogue());
	    }
	    else if(actor instanceof Villanic)
	    {
	    	System.out.println(((Villan)actorsArray.get(0)).getName()+" : "+dialouge1.get(x).getDialogue());
			System.out.println(((Comedian)actorsArray.get(1)).getName()+" : "+dialouge2.get(x).getDialogue());	
	    }
	}
}
