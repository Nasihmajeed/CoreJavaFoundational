package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
class PlayMovie
{
	Random random = new Random();                                 
String file1="ComicScript.csv";                               
String file2="VillanScript.csv"; 	
	static Scanner input =new Scanner(System.in);                                                     
public void Play(ArrayList<Actor> actors,FileReppo script,ArrayList<Dialogue> comicdialogue,ArrayList<Dialogue> villandialogue)        
{                                                                 
	   
	System.out.println("\n\n");
	System.out.println("\n________________________\n\n");
  	int count=(((villandialogue.size()+villandialogue.size()-2)/2)+1);
	do{	int number1 = random.nextInt(2); 
		if(actors.get(number1) instanceof Villanisum)
		{                                                             
			int n=(villandialogue.size());
			int dilogeNumber = random.nextInt(n);
			if(villandialogue.get(dilogeNumber).getFlag()==true&&(villandialogue.get(dilogeNumber).getId()==1))
			{int number2=number1+1;
			PlayDialoge(actors.get(number1),actors.get(number2),villandialogue,dilogeNumber); 
			System.out.println(count);
	    	count--;}
		}
		else if(actors.get(number1) instanceof Comic)
		{
			int n=(comicdialogue.size());
			int dilogeNumber = random.nextInt(n);
			if(comicdialogue.get(dilogeNumber).getFlag()==true&&(comicdialogue.get(dilogeNumber).getId()==1))
			{int number2=number1-1;
			PlayDialoge(actors.get(number1),actors.get(number2),comicdialogue,dilogeNumber);	
			System.out.println(count);
			count--;}
		}}while(count > 0);
	MovieDetails(actors);
	int opt=0;
	do{opt =EditScript(actors.get(0),actors.get(1),file1,file2,script,comicdialogue,villandialogue);}while(opt!=0);
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

public int EditScript(Actor a1,Actor a2,String file1,String file2,FileReppo script,ArrayList<Dialogue> comicdialogue,ArrayList<Dialogue> villandialogue)
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
			for(int i=0;i<comicdialogue.size();i++)
			{
				System.out.println("\n"+comicdialogue.get(i).getdialogue());
			}	
			AddDialouge(a2,a1,comicdialogue,file1,script);
		}
	}	
	else if(option==2)
	{	DeleteDialouge(a2,a1,script,comicdialogue,villandialogue);	}	
	else if(option==0)
	{		System.out.println("EXited");	}
	else if(option==3)
	{ UpdateDialouge(a2,a1,script,comicdialogue,villandialogue);}
	else
	{	System.out.println("You Entered A wrong Choise");}}
catch(Exception ex)
{System.out.println("**"+ex);}
                                                       
return option;
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
public void DeleteDialouge(Actor a1,Actor a2,FileReppo script,ArrayList<Dialogue> comicdialogue,ArrayList<Dialogue> villandialogue)
{
	System.out.println("Whose Dialogue you Want to Delete \n1.villan \n2.Comic");
		int choise=input.nextInt();
		if((choise-1)==0)
		{ int z=1;
			for(int i=0;i<villandialogue.size();i++)
			{
				if(villandialogue.get(i).getId()==1)
				{System.out.print(z);
					z++;}
				System.out.println("\n"+villandialogue.get(i).getdialogue());
			}		
			RemoveDialouge(a1,a2,villandialogue,file2,script);
		}
		else
		{ int z=1;
			for(int i=0;i<comicdialogue.size();i++)
			{  
				if(comicdialogue.get(i).getId()==1)
				{System.out.print(z);                                         
					z++;}                                            
				System.out.println("\n"+comicdialogue.get(i).getdialogue());
			}
			System.out.print(comicdialogue.size());			                                                                                                           
			RemoveDialouge(a2,a1,comicdialogue,file1,script);
		}                                                                    
}
public void RemoveDialouge(Actor a1,Actor a2,ArrayList<Dialogue> d1,String file,FileReppo script)
	{                                                                        
		System.out.print("Select the Dialogue = ");                            
		int dia=input.nextInt();                                                                              
		 d1.remove(dia);                                                                
		 d1.remove(dia+1);
		 try{                                                                                       
		 File fle=new File(file);
		// fle.createNewFile();
		fle.delete();                                                              
		 System.out.println(fle.exists());
		fle.createNewFile();                                                              
		                                                                                             
		 script.creatFile(fle);                                            
		 for (int i=0;i<d1.size();i++) {
		 String dilg=d1.get(i).getdialogue(); 	
		 script.writeTofile(file,dilg); }}catch(Exception ex)
		 {System.out.println(ex);}                                                                  
	}

public void UpdateDialouge(Actor a1,Actor a2,FileReppo script,ArrayList<Dialogue> comicdialogue,ArrayList<Dialogue> villandialogue)
{
	System.out.println("Whose Dialogue you Want to Update \n1.villan \n2.Comic");
		int choise=input.nextInt();
		if((choise-1)==0)
		{ int z=1;
			for(int i=0;i<villandialogue.size();i++)
			{
				if(villandialogue.get(i).getId()==1)
				{System.out.print(z);
					z++;}
				System.out.println("\n"+villandialogue.get(i).getdialogue());
			}		
			ChangeDialouge(a1,a2,villandialogue,file2,script);
		}
		else
		{ int z=1;
			for(int i=0;i<comicdialogue.size();i++)
			{  
				if(comicdialogue.get(i).getId()==1)
				{System.out.print(z);                                         
					z++;}                                            
				System.out.println("\n"+comicdialogue.get(i).getdialogue());
			}
			System.out.print(comicdialogue.size());			                                                                                                           
			ChangeDialouge(a2,a1,comicdialogue,file1,script);
		}                                                                    
}

public void ChangeDialouge(Actor a1,Actor a2,ArrayList<Dialogue> d1,String file,FileReppo script)
{
	System.out.print("Select the Dialogue = ");                            
		int dia=input.nextInt();                                                                              
		 try{      

		System.out.print(" : ");
		String que=input.nextLine();
		que=input.nextLine();
   				 
		 d1.get(dia).setdialogue(null);
		 d1.get(dia).setdialogue(que);

		System.out.print(" : ");
		String ans=input.nextLine();
		que=input.nextLine();

		 d1.get(dia+1).setdialogue(null);
		 d1.get(dia+1).setdialogue(ans);

		 File fle=new File(file);
		fle.delete();                                                              
		 System.out.println(fle.exists());
		fle.createNewFile();                                                              
		                                                                                             
		 script.creatFile(fle);                                            
		 for (int i=0;i<d1.size();i++) {
		 String dilg=d1.get(i).getdialogue(); 	
		 script.writeTofile(file,dilg); }}catch(Exception ex)
		 {System.out.println(ex);}                                  
}

}   