package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  
class PlayMovie
{
	Random random = new Random();                                 
String file1="ComicScript.csv";                               
String file2="VillanScript.csv"; 	                                             
	static Scanner input =new Scanner(System.in);                                                     
public void play(ArrayList<Actor> actors,FileReppo script,ArrayList<Dialogue> comicdialogue,ArrayList<Dialogue> villandialogue)        
{                                                                 
	   
	System.out.println("\n\n");                                         
	System.out.println("\n________________________\n\n");
  	int count=((villandialogue.size()+comicdialogue.size()-2)/2);
	do{	int number1 = random.nextInt(2); 
		if(actors.get(number1) instanceof Villanisum)
		{                                                            
			int n=(villandialogue.size());
			int dilogeNumber = random.nextInt(n);
			if(villandialogue.get(dilogeNumber).getFlag()==true&&(villandialogue.get(dilogeNumber).getId()==1))
			{int number2=number1+1;
			playDialoge(actors.get(number1),actors.get(number2),villandialogue,comicdialogue,dilogeNumber); 
			System.out.println(count);
	    	count--;}
		} 
		else if(actors.get(number1) instanceof Comic)
		{
			int n=(comicdialogue.size());
			int dilogeNumber = random.nextInt(n);    
			if(comicdialogue.get(dilogeNumber).getFlag()==true&&(comicdialogue.get(dilogeNumber).getId()==1))
			{int number2=number1-1;                  
			playDialoge(actors.get(number1),actors.get(number2),comicdialogue,villandialogue,dilogeNumber);	
			System.out.println(count);
			count--;}                                                        
		}}while(count > 0);
	movieDetails(actors);
	int opt=0;
	do{opt =editScript(actors.get(0),actors.get(1),file1,file2,script,comicdialogue,villandialogue);}while(opt!=0);
}
public void playDialoge(Actor a1,Actor a2,ArrayList<Dialogue> d1,ArrayList<Dialogue> d2,int dilogeNumber)
{
	int temp=0;
	System.out.println(a1.getName()+" : "+d1.get(dilogeNumber).getdialogue());
	d1.get(dilogeNumber).setFlag(false);	
	System.out.print(a2.getName()+" : ");
	for(int i=0;i<d2.size();i++)
	{	if(d2.get(i).getId()==2)
		{ temp++;}
		if(temp==dilogeNumber)
		{   System.out.println(d2.get(i).getdialogue());	
			d1.get(i).setFlag(false);	
			System.out.println("\n");   
		}
	}
	                                   
}
public void movieDetails(ArrayList<Actor> actors)
{	System.out.println("\nScript Writer  : UNKNOWN");
	System.out.println("\n\nActors");
	System.out.println(actors.get(0).getName()+" : "+actors.get(0).getmovieRoll());
	System.out.println(actors.get(1).getName()+" : "+actors.get(1).getmovieRoll());
}

public int editScript(Actor a1,Actor a2,String file1,String file2,FileReppo script,ArrayList<Dialogue> comicdialogue,ArrayList<Dialogue> villandialogue)
{	System.out.print("\nPress 1 To Add Dialogue\nPress 2 to Delete a Dialogue\nPress 0 to Exit\n\n Enter Your Choise :");
	int option=input.nextInt();

	try{
	if(option==1)
	{
		System.out.println("Whose Dialogue you Want to Add \n1.Jhon \n2.Araya");
		int choise=input.nextInt();
		if((choise-1)==0)
		{
			for(int i=0;i<villandialogue.size();i++)
			{  if(villandialogue.get(i).getId()==1)
				{System.out.println("\n"+villandialogue.get(i).getdialogue());	}
			}	
			addDialouge(a1,a2,villandialogue,comicdialogue,file2,file1,script);
		}
		else                                          
		{
			for(int i=0;i<comicdialogue.size();i++)
			{	if(comicdialogue.get(i).getId()==1)
				{System.out.println("\n"+comicdialogue.get(i).getdialogue());	}
			}	
			addDialouge(a2,a1,comicdialogue,villandialogue,file1,file2,script);
		}
	}	
	else if(option==2)
	{	deleteDialouge(a2,a1,script,comicdialogue,villandialogue);	}	
	else if(option==0)
	{		System.out.println("EXited");	}
	// else if(option==3)
	// { updateDialouge(a2,a1,script,comicdialogue,villandialogue);}
	else
	{	System.out.println("You Entered A wrong Choise");}}
catch(Exception ex)
{System.out.println("**"+ex);}
                                                       
return option;
}

public void addDialouge(Actor a1,Actor a2,ArrayList<Dialogue> d1,ArrayList<Dialogue> d2,String file1,String file2,FileReppo script)
{
		int size=d1.size();
		d1.add(new Dialogue());
		System.out.print(a1.getName()+" : ");
		String que=input.nextLine();
		que=input.nextLine();                                                                                
   		 d1.get(size).setId(1);
		 d1.get(size).setdialogue(que);
		script.writeTofile(file1,que);
         
         int siz=d2.size();                                                  
		d2.add(new Dialogue());
		System.out.print(a2.getName()+" : ");
		String ans=input.nextLine();
		 d2.get(siz).setId(2);
		 d2.get(siz).setdialogue(ans);

		script.writeTofile(file2,ans);
}

public void deleteDialouge(Actor a1,Actor a2,FileReppo script,ArrayList<Dialogue> comicdialogue,ArrayList<Dialogue> villandialogue)
{
	System.out.println("Whose Dialogue you Want to Delete \n1.villan \n2.Comic");
		int choise=input.nextInt();
		if((choise-1)==0)
		{ int z=1;
			for(int i=0;i<villandialogue.size();i++)
			{
				if(villandialogue.get(i).getId()==1)
				{System.out.println(z);
					z++;}
				System.out.println("\n"+villandialogue.get(i).getdialogue());
			}		
			removeDialouge(villandialogue,comicdialogue,file2,file1,script);
		}
		else
		{ int z=1;
			for(int i=0;i<comicdialogue.size();i++)
			{  
				if(comicdialogue.get(i).getId()==1)
				{System.out.println(z);                                         
					z++;}                                            
				System.out.println("\n"+comicdialogue.get(i).getdialogue());
			}
			System.out.print(comicdialogue.size());			                                                                                                           
			removeDialouge(comicdialogue,villandialogue,file1,file2,script);
		}                                                                    
}
public void removeDialouge(ArrayList<Dialogue> d1,ArrayList<Dialogue> d2,String file1,String file2,FileReppo script)
	{                                                                        
		System.out.print("Select the Dialogue = ");                            
		int dia=input.nextInt();                                                                              
		int temp1=0,temp2=0;                                             
		 d2.remove(dia);
		 try{        

	for(int i=0;i<d1.size();i++)
	{	if(d1.get(i).getId()==1)
		{ temp1++;}
		if(temp1==dia)
		{ 
			 d1.remove(dia);                  
		 File fle1=new File(file1); 
		 fle1.delete(); 
		 script.creatFile(fle1);    
		  for (int x=0;x<d1.size();x++) {
		 String dilg=d1.get(x).getdialogue(); 	
		 script.writeTofile(file1,dilg); }                                        
		}
	}                                                                               
	
	for(int j=0;j<d2.size();j++)
	{	if(d2.get(j).getId()==2)
		{ temp2++;}
		if(temp2==dia)
		{ 
			 d2.remove(dia);                  
		 File fle2=new File(file2); 
		 fle2.delete(); 
		 script.creatFile(fle2);    
		  for (int i=0;i<d2.size();i++) {
		 String dilg=d2.get(i).getdialogue(); 	
		 script.writeTofile(file2,dilg); }                                        
		}
	}                
		}catch(Exception ex)
		 {System.out.println(ex);}                                                                  
	}
                                                            
}