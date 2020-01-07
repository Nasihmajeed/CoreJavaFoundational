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
			int a=sc.nextInt();
			switch(a)
			{
				case 1: choiceVillan();
						break;
				case 2: choiceComedian();
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
		File villanQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");
		File comedianQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianQns.txt");
		File villanAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanAns.txt");
		File comedianAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianAns.txt");	
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
		// int size1=(script.c.comedian.size());
		// int size2=(script.v.villan.size());
		// int size3=(script.c.comedian.size())+(script.v.villan.size());
		actor.add(new Comedian());
		actor.add(new Villan());
		ArrayList<Dialogue> readArray1= script.readFromFile(b);
		ArrayList<Dialogue> readArray2= script.readFromFile(a);
		ArrayList<Dialogue> readArray3= script.readFromFile(c);
		ArrayList<Dialogue> readArray4= script.readFromFile(d);
		// System.out.println("readArray1.size() : "+readArray1.size());
		// System.out.println("readArray2.size() : "+readArray2.size());
		// System.out.println("readArray3.size() : "+readArray3.size());
		// System.out.println("readArray4.size() : "+readArray4.size());
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
 		System.out.println("1.question.");
 		System.out.println("2.answer.");
 		int a=sc.nextInt();
 		switch(a)
 		{
 			case 1: villanQ();
 					break;
			case 2:	villanA();
					break;
		}

 	}
 	public void choiceComedian()
 	{
 		System.out.println("1.question.");
 		System.out.println("2.answer.");
 		int a=sc.nextInt();
 		switch(a)
 		{
 			case 1: comedianQ();
 					break;
			case 2:	comedianA();
					break;
		}
 	}
 	public void villanQ()
 	{
 		System.out.println("enter the number of questions you wish to add : ");
 					int b= sc.nextInt();
 						try{
 						   		File villanQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");
								FileWriter fw =new FileWriter(villanQns,false);
								BufferedWriter bw =new BufferedWriter(fw);
								for(int i=0;i<b;i++)
								{	
									System.out.println("enter the dialogue : ");
									String d= sc.nextLine();
									d=sc.nextLine();
									bw.write(d);
									bw.newLine();
								}
								bw.flush();
								bw.close();
								read(villanQns);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
 	}

  	public void villanA()
  	{
  			System.out.println("enter the number of answers you wish to add : ");
 					int b= sc.nextInt();
 						try{
 						   		File villanAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");
								FileWriter fw =new FileWriter(villanAns,false);
								BufferedWriter bw =new BufferedWriter(fw);
								for(int i=0;i<b;i++)
								{	
									System.out.println("enter the dialogue : ");
									String d= sc.nextLine();
									d=sc.nextLine();
									bw.write(d);
									bw.newLine();
								}
								bw.flush();
								bw.close();
								read(villanAns);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}	
  	}
  	public void comedianQ()
  	{
  		System.out.println("enter the number of questions you wish to add : ");
 					int b= sc.nextInt();
 						try{
 						   		File comedianQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");
								FileWriter fw =new FileWriter(comedianQns,false);
								BufferedWriter bw =new BufferedWriter(fw);
								for(int i=0;i<b;i++)
								{	
									System.out.println("enter the dialogue : ");
									String d= sc.nextLine();
									d=sc.nextLine();
									bw.write(d);
									bw.newLine();
								}
								bw.flush();
								bw.close();
								read(comedianQns);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
  	}
  	public void comedianA()
  	{
  		System.out.println("enter the number of answers you wish to add : ");
 					int b= sc.nextInt();
 						try{
 						   		File comedianQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");
								FileWriter fw =new FileWriter(comedianQns,false);
								BufferedWriter bw =new BufferedWriter(fw);
								for(int i=0;i<b;i++)
								{	
									System.out.println("enter the dialogue : ");
									String d= sc.nextLine();
									d=sc.nextLine();
									bw.write(d);
									bw.newLine();
								}
								bw.flush();
								bw.close();
								read(comedianQns);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
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
		
}