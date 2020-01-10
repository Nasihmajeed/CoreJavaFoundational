 package com.lxisoft.movie;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class Movie 
{
	String name="dark knight";
	String director = "christopher nolan";
	String producer = "warner bros";
	Script script=new Script();
	public ArrayList<Actor> actor=new ArrayList<Actor>();
	public Scanner sc=new Scanner(System.in);

		File villanQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");
		File comedianQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianQns.txt");
		File villanAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanAns.txt");
		File comedianAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianAns.txt");	
		

	public void choice()
	{int x;
		do{
		System.out.println("select your choice");
		System.out.println("1. start movie.");
		System.out.println("2. edit script.");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: display();
					break;
			case 2: choiceActor();
					break;
			default:System.out.println("please enter the right choice ");
		}
		System.out.println("enter 1 if you want to continue : ");
		 x=sc.nextInt();
	}while(x==1);
	}
	public void choiceActor()
	{
		System.out.println("select the charector whose dialogue needs to be changed");
			System.out.println("1. villan.");
			System.out.println("2. comedian.");
			System.out.println("3. back.");
			int a=sc.nextInt();
			switch(a)
			{
				case 1: choiceVillan();
						break;
				case 2: choiceComedian();
						break;
				case 3: choice();
						break;
			}
	}

	public void display()
	{	
		System.out.println("movie name : "+name+"\ndirector : "+director+"\nproducer : "+producer);
		System.out.println("**************************************");
		System.out.println("scene no 1\n-----------");
		fileCreation();
	}
	public void fileCreation()
	{
	 if(villanAns.exists()&&villanQns.exists()&&comedianAns.exists()&&comedianQns.exists())
		 {
		 	conversation(villanQns,comedianQns,villanAns,comedianAns);
		 }
		 else {
		
		script.comedianDialogue();
		script.villanDialogue();
		ArrayList<Dialogue> random1=script.commonDialogue();
		 for(int i=0;i<random1.size();i++)
			{
		int random2=(int)(Math.random()*random1.size());
		System.out.println("comedian : "+ random1.get(random2).dialogue);
		System.out.println("villan : "+ random1.get(random2).dialogue);
			}}
		// script.writeToFile(villanQns,script.v.villanQns);
		// script.writeToFile(comedianQns,script.c.comedianQns);
		// script.writeToFile(villanAns,script.v.villanAns);
		// script.writeToFile(comedianAns,script.c.comedianAns);
		// conversation(villanQns,comedianQns,villanAns,comedianAns);

	}
	public void conversation(File a,File b,File c,File d)
	{
		actor.add(new Comedian());
		actor.add(new Villan());
		ArrayList<Dialogue> readArray1= script.readFromFile(b);
		ArrayList<Dialogue> readArray2= script.readFromFile(a);
		ArrayList<Dialogue> readArray3= script.readFromFile(c);
		ArrayList<Dialogue> readArray4= script.readFromFile(d);
		int x=readArray1.size()+readArray4.size();
		while(x>0)
		{
		int random1=(int) (Math.random()*actor.size());
		if(actor.get(random1)instanceof Comedy)
		{
			
			int comedianRandom=(int) (Math.random()*readArray1.size());
			if(readArray1.get(comedianRandom).same==true)
			{
			System.out.println("comedian : "+readArray1.get(comedianRandom).dialogue);
			System.out.println("villan : "+readArray3.get(comedianRandom).dialogue);
			readArray1.get(comedianRandom).same=false;
			x--;
			}
			try
 			{
 				if(readArray1.get(comedianRandom).same!=true)
 				{
 					MyEx ex=new MyEx(" same dialogue exception");
 					throw ex;
 				}}
 				catch(MyEx e)
 				{
 					e.printStackTrace();
 				}
		}
		else if(actor.get(random1)instanceof Villanism)
		{
			int villanRandom=(int) (Math.random()*readArray2.size());
			if(readArray2.get(villanRandom).same==true)
			{
			System.out.println("villan : "+readArray2.get(villanRandom).dialogue);
			System.out.println("comedian : "+readArray4.get(villanRandom).dialogue);
			readArray2.get(villanRandom).same=false;
			x--;
		}
		}

	}
 	}
 	public void choiceVillan()
 	{
 		int a=0;
 		do{
 		System.out.println("1.question.");
 		System.out.println("2.answer.");
 		System.out.println("3.diaplay question file.");
 		System.out.println("4.display answer file.");
 		System.out.println("5.back.");
 		int b=sc.nextInt();
 		switch(b)
 		{
 			case 1: villanQ();
 					break;
			case 2:	villanA();
					break;
			case 3: create(villanQns);
					break;
			case 4: create(villanAns);
					break;
			case 5: choiceActor();
					break;
			default: System.out.println("enter the right choice ");
		
		}System.out.println("press 1 if you want to go back");
						 a=sc.nextInt();
		}while(a==1);

 	}
 	public void choiceComedian()
 	{
 		int a=0;
 		do{
 		System.out.println("1.question.");
 		System.out.println("2.answer.");
 		System.out.println("3.diaplay question file.");
 		System.out.println("4.display answer file.");
 		System.out.println("5.back.");
 		int b=sc.nextInt();
 		switch(b)
 		{
 			case 1: comedianQ();
 					break;
			case 2:	comedianA();
					break;
			case 3: create(comedianQns);
					break;
			case 4:create(comedianAns);
					break;
			case 5: choiceActor();
					break;
			default: System.out.println("enter the right choice ");
		}System.out.println("press 1 if you want to go back");
						 a=sc.nextInt();
		}while(a==1);

 	}
 	public void villanQ()
 	{int a=0;
 		do{
			try{
 				File villanQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");	
   			 	FileWriter fw =new FileWriter(villanQns,true);
				BufferedWriter bw =new BufferedWriter(fw);
				System.out.println("enter the dialogue : ");
				String d= sc.nextLine();
				d=sc.nextLine();
				bw.write(d);
				bw.newLine();
				bw.flush();
				bw.close();
				read(villanQns);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("press 1 if you want to add dialogue");
				 a=sc.nextInt();
 	}while(a==1);
 	}

  	public void villanA()
  	{int a=0;
  		do{	
  			try{
 				File villanAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanAns.txt");
				FileWriter fw =new FileWriter(villanAns,true);
				BufferedWriter bw =new BufferedWriter(fw);	
				System.out.println("enter the dialogue : ");
				String d= sc.nextLine();
				d=sc.nextLine();
				bw.write(d);
				bw.newLine();
				bw.flush();
				bw.close();
				read(villanAns);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}	
				System.out.println("press 1 if you want to add dialogue");
				 a=sc.nextInt();
 	}while(a==1);
  	}
  	public void comedianQ()
  	{int a=0;
  		do{
 			try{
 				File comedianQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianQns.txt");
				FileWriter fw =new FileWriter(comedianQns,true);
				BufferedWriter bw =new BufferedWriter(fw);
				System.out.println("enter the dialogue : ");
				String d= sc.nextLine();
				d=sc.nextLine();
				bw.write(d);
				bw.newLine();
				bw.flush();
				bw.close();
				read(comedianQns);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("press 1 if you want to add dialogue");
				 a=sc.nextInt();
 	}while(a==1);
  	}
  	public void comedianA()
  	{int a=0;
  		do{
 			try{
 				File comedianAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianAns.txt");
				FileWriter fw =new FileWriter(comedianAns,true);
				BufferedWriter bw =new BufferedWriter(fw);
				System.out.println("enter the dialogue : ");
				String d= sc.nextLine();
				d=sc.nextLine();
				bw.write(d);
				bw.newLine();
				bw.flush();
				bw.close();
				read(comedianAns);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("press 1 if you want to add dialogue");
				 a=sc.nextInt();
 	}while(a==1);
  	}
  	public void read(File file)
  	{
  		ArrayList<Dialogue> readDialogue=new ArrayList<Dialogue>();
		try{
			FileReader fr =new FileReader(file);
			BufferedReader br =new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
					readDialogue.add(new Dialogue());
					for(int i=0;i<readDialogue.size();i++)
					{
						if(readDialogue.get(i).dialogue==null)
						readDialogue.get(i).dialogue=s;
					}
			}
			System.out.println("\n dialogues in "+file.getName()+" are");
			System.out.println("****************************************");
			for(int i=0;i<readDialogue.size();i++)
			{
				System.out.println(readDialogue.get(i).dialogue);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
  	}
  	public void create(File a)
  	{
  		try{
  				if(a.exists())
					{
					read(a);
					}
					else
					{
						a.createNewFile();
						read(a);
					}
			}
			catch(Exception e)
				{
					e.printStackTrace();
				}
  	}
  
		
}
