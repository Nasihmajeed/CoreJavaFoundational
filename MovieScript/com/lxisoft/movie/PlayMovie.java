package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
class PlayMovie
{
	Random random = new Random();
	ArrayList<Dialogue> comicdialogue =new ArrayList<Dialogue>();
	ArrayList<Dialogue> villandialogue =new ArrayList<Dialogue>();
	static Scanner input =new Scanner(System.in);
public void Play(ArrayList<Actor> actors,FileReppo script)
{
	String file1="ComicScript.csv";
	String file2="VillanScript.csv";
	script.readDialogue(file1,comicdialogue);
	script.readDialogue(file2,villandialogue);
	System.out.println("\n\n");
	System.out.println("\n________________________\n\n");
 	
 	int count=((villandialogue.size()+villandialogue.size())/2-1);
	do{
		int number1 = random.nextInt(2); 
		//System.out.println(" count"+count);		
		if(actors.get(number1) instanceof Villanisum)
		{
			int n=(villandialogue.size());
			int dilogeNumber = random.nextInt(n);
			if(villandialogue.get(dilogeNumber).getFlag()==true&&(villandialogue.get(dilogeNumber).getId()==1))
			{
			int number2=number1+1;
			PlayDialoge(actors.get(number1),actors.get(number2),villandialogue,dilogeNumber);    
			//System.out.println(count);        
	    	count--;}
		}

		else if(actors.get(number1) instanceof Comic)
		{
			int n=(comicdialogue.size());
			int dilogeNumber = random.nextInt(n);
			if(comicdialogue.get(dilogeNumber).getFlag()==true&&(comicdialogue.get(dilogeNumber).getId()==1))
			{
			int number2=number1-1;
			PlayDialoge(actors.get(number1),actors.get(number2),comicdialogue,dilogeNumber);	
			//System.out.println(count);        
			count--;}
		}

	}while(count > 0);

	MovieDetails(actors);
	EditScript(actors.get(0),actors.get(1),file1,file2,script);
}

public void PlayDialoge(Actor a1,Actor a2,ArrayList<Dialogue> d1,int dilogeNumber)
{
	System.out.println(a1.getName()+" : "+d1.get(dilogeNumber).getdialogue());
	d1.get(dilogeNumber).setFlag(false);	
	System.out.println(a2.getName()+" : "+d1.get(dilogeNumber+1).getdialogue());
	d1.get(dilogeNumber+1).setFlag(false);	
	System.out.println("\n");                                      
}

public void MovieDetails(ArrayList<Actor> actors)
{
	System.out.println("\nScript Writer  : UNKNOWN");
	System.out.println("\n\nActors");
	System.out.println(actors.get(0).getName()+" : "+actors.get(0).getmovieRoll());
	System.out.println(actors.get(1).getName()+" : "+actors.get(1).getmovieRoll());
}

public void EditScript(Actor a1,Actor a2,String file1,String file2,FileReppo script)
{
	System.out.print("\nPress 1 To Add Dialogue\nPress 2 to Delete a Dialogue\nPress 0 to Exit\n\n Enter Your Choise :");
	int option=input.nextInt();

	try{
	if(option==1)
	{
		System.out.println("Whose Dialogue you Want to Add \n1.villan \n2.Comic");
		int choise=input.nextInt();
		if((choise-1)==0)
		{
			for(int i=0;i<villandialogue.size();i++)
			{
				System.out.println("\n"+villandialogue.get(i).getdialogue());
			}	
			AddDialouge(a1,a2,villandialogue,file2,script);
		}
		else
		{
			for(int i=0;i<villandialogue.size();i++)
			{
				System.out.println("\n"+comicdialogue.get(i).getdialogue());
			}	
			AddDialouge(a2,a1,comicdialogue,file1,script);
		}
	}	
	if(option==2)
	{	DeleteDialouge();	}	
	else if(option==0)
	{		System.out.println("EXited");	}
	else
	{	System.out.println("You Entered A wrong Choise");}}
catch(Exception ex)
{System.out.println("**"+ex);}
}

public void AddDialouge(Actor a1,Actor a2,ArrayList<Dialogue> d1,String file,FileReppo script)
{
		int size=d1.size();
		d1.add(new Dialogue());
		System.out.print(a1.getName()+" : ");
		String que=input.nextLine();
		que=input.nextLine();
   		 d1.get(size).setId(1);
		 d1.get(size).setdialogue(que);
		script.writeTofile(file,que);

		d1.add(new Dialogue());
		System.out.print(a2.getName()+" : ");
		String ans=input.nextLine();
		 d1.get(size+1).setId(2);
		 d1.get(size+1).setdialogue(ans);
		script.writeTofile(file,ans);
}
public void DeleteDialouge(Actor a1,Actor a2,ArrayList<Dialogue> d1,String file,FileReppo script)
{
	
		d1.get(n).remove();
		d1.get(n).remove();
	
}


}