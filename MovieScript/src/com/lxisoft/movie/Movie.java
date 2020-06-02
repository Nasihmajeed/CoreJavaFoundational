package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*; 
import java.io.*; 
public class Movie
{
	public String movieName;
	Script script;
	Actors actor;
	static Scanner sc=new Scanner(System.in);				
	public void doAct()
	{
		List<String> summary=new ArrayList<String>();  
		summary.add("Movie Begins");  
		summary.add("\n--Ramayana--\n");  
		summary.add("A Film By Valmeeki"); 	 
		for(String su:summary){  
	 	System.out.println(su); 
	 	}
	 	script=new Script();
		script.addDialogues();
		
		try
		{
			System.out.println("Availables are");
			System.out.println("\n1.Scenes \n2.Actors");
			boolean isTest=false;
			do
			{
				isTest=false;
				int m=sc.nextInt();
				switch (m)
				{
					case 1:	System.out.println("Avalable scenes are");
					doScene();isTest=true;break;
					case 2:System.out.println("Actors are");
					doActt();isTest=true;break;								
					case 3: System.exit(0); break;	
					default: break;
				}
			}while(isTest);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}			
	}	
	public void doActt()
	{
		System.out.println("\n 1.Comedy \n 2.Villain");
		int act=sc.nextInt();		
		switch(act)
		{
			case 1: doComedy(script); break;
			case 2: doVillanic(script); break;
			default:				
		}
	}
	public void doComedy(Script script)
	{

		int[] integer=new int[4];
			for(int i=0;i<integer.length;i++)
			{	
				int	y=(int) (Math.random()*3);
				integer[i]=y;			
				System.out.println(script.cdiaQuest[y].dialogueType + "  =Vs=  " + script.vdiaAns[y].dialogueType);			
				if(integer[y]==integer[i])
				{
					break;
				}
				else
				{
					continue;
				}
			}
		
	}
	public void doVillanic(Script script)
	{		
		for(int j=0;j<3;j++)
		{
			int	x=(int) (Math.random()*3);			
			System.out.println(script.vdiaQuest[x].dialogueType + "  =Vs=  " + script.cdiaAns[x].dialogueType);
		}
	}
	public void doScene()
	{
		try
		{
		File file = new File("D:\\scene.txt");
               
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                
                String message = "Here is the  place the peoples are waiting for the mariage of RamaSeetha ";
 
                writer.write(message);                
                writer.close();
                displayAll();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		
	}
	public void displayAll()
	{	
		File file=new File("D:\\scene.txt");
		try(BufferedReader br=new BufferedReader(new FileReader(file)))
		{

			String line;
			while((line=br.readLine())!=null)
			{	
				System.out.println(line);		
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
	 	}
	}		
	
}	



		
		
