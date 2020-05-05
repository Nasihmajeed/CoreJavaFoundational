package com.lxisoft.movie;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
	
	public Scanner sc=new Scanner(System.in);
	
	public void head()
	{int x=0;
		do {
		System.out.println("******MOVIE SCRIPT*********");
		System.out.println("---------------------------");
		System.out.println("\n1.Start new Script");
		System.out.println("\n2.Open Script");
		System.out.println("\nEnter your choice : ");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: newScript();
					break;
			case 2: openScript();
					break;
			default: System.out.println("please enter the right choice ");
		}
		System.out.println("enter 1 if you want to continue : ");
		 x=sc.nextInt();
	}while(x==1);
		}
	
	public void openScript()
	{
		File head=new File("D:\\lxi\\eclips\\movieScript\\src\\com\\lxisoft\\file\\head.txt");
		File char1=new File("D:\\\\lxi\\\\eclips\\\\movieScript\\\\src\\\\com\\\\lxisoft\\\\file\\\\char1.txt");
		File char2=new File("D:\\\\lxi\\\\eclips\\\\movieScript\\\\src\\\\com\\\\lxisoft\\\\file\\\\char2.txt");
		displayHead(head);
		conversation(head,char1,char2);	
		 	
	}
	public void conversation(File head,File char1,File char2)
	{
		ArrayList<Dialogue> c1=read(char1);
		ArrayList<Dialogue> c2=read(char2);
		for(int i=0,j=0;i<c1.size()&&j<c2.size();i++,j++)
			{
				System.out.println("charecter 1: "+c1.get(i).dialogue);
				System.out.println("charecter 2: "+c2.get(j).dialogue);
		}
	}
	public void displayHead(File file)
	{
		ArrayList<Dialogue> head= read(file);
		System.out.println("***********MOVIE SCRIPT***********");
		System.out.println("----------------------------------");
		System.out.println("MOVIE NAME : "+head.get(0).dialogue);
		System.out.println("SCRIPT WRITER : "+head.get(1).dialogue);
		System.out.println("MOVIE GENRE : "+head.get(2).dialogue);
	}
	public void newScript()
	{
		heading();
		choice1();
		
	}
	public void choice1()
	{
		
			System.out.println("select the charector whose dialogue needs to be added");
				System.out.println("1. charector 1.");
				System.out.println("2. charector 2.");
				System.out.println("3. back.");
				int a=sc.nextInt();
				switch(a)
				{
					case 1: choiceChar1();
							break;
					case 2: choiceChar2();
							break;
					case 3: head();
							break;
				}
		
	}
	public void	choiceChar1()
	{
		int a=0;
		try {
				File char1=new File("D:\\\\lxi\\\\eclips\\\\movieScript\\\\src\\\\com\\\\lxisoft\\\\file\\\\char2.txt");
				PrintWriter w = new PrintWriter(char1);
				w.print("");
				w.close();
		}
		catch(Exception e)
	{
		e.printStackTrace();
	}
				do{
					try{
						File char1=new File("D:\\\\lxi\\\\eclips\\\\movieScript\\\\src\\\\com\\\\lxisoft\\\\file\\\\char1.txt");
			 	
   			 	FileWriter fw =new FileWriter(char1,true);
				BufferedWriter bw =new BufferedWriter(fw);
				System.out.println("enter the dialogue : ");
				String d= sc.nextLine();
				d=sc.nextLine();
				bw.write(d);
				bw.newLine();
				bw.flush();
				bw.close();
				read(char1);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("press 1 if you want to add dialogue");
				 a=sc.nextInt();
 	}while(a==1);
 		System.out.println("1.back to previous menu");
 		System.out.println("2.back to main menu");
 		int b=sc.nextInt();
 		switch(b)
 		{
 		case 1:choice1();
 				break;
 		case 2: head();
 				break;
 		default:System.out.println("enter a valid choice");
 		}
	}
	public void choiceChar2()
	{
		int a=0;
 		try {
 				File char2=new File("D:\\\\lxi\\\\eclips\\\\movieScript\\\\src\\\\com\\\\lxisoft\\\\file\\\\char2.txt");
 				PrintWriter w = new PrintWriter(char2);
 				w.print("");
 				w.close();
 		}
 		catch(Exception e)
		{
			e.printStackTrace();
		}
 				do{
 					try{
 						File char2=new File("D:\\\\lxi\\\\eclips\\\\movieScript\\\\src\\\\com\\\\lxisoft\\\\file\\\\char2.txt");
   			 	FileWriter fw =new FileWriter(char2,true);
				BufferedWriter bw =new BufferedWriter(fw);
				System.out.println("enter the dialogue : ");
				String d= sc.nextLine();
				d=sc.nextLine();
				bw.write(d);
				bw.newLine();
				bw.flush();
				bw.close();
				read(char2);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("press 1 if you want to add dialogue");
				 a=sc.nextInt();
 	}while(a==1);
 		System.out.println("1.back to previous menu");
 		System.out.println("2.back to main menu");
 		int b=sc.nextInt();
 		switch(b)
 		{
 		case 1:choice1();
 				break;
 		case 2: head();
 				break;
 		default:System.out.println("enter a valid choice");
 		}
	}

	public void heading()
	{
		
		try {
		File head=new File("D:\\lxi\\eclips\\movieScript\\src\\com\\lxisoft\\file\\head.txt");
		PrintWriter w = new PrintWriter(head);
		w.print("");
		w.close();
		FileWriter fw =new FileWriter(head,true);
		BufferedWriter bw =new BufferedWriter(fw);
		System.out.println("\n movie : ");
		String movie=sc.next();
		bw.write(movie);
		bw.newLine();
		System.out.println("\n Script writer : ");
		String writer=sc.next();
		bw.write(writer);
		bw.newLine();
		System.out.println("\n genre : ");
		String genre=sc.next();
		bw.write(genre);
		bw.newLine();
		bw.flush();
		bw.close();
		read(head);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Dialogue> read(File file)
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
//			System.out.println("\n detailes in "+file.getName()+" are");
//			System.out.println("****************************************");
//			for(int i=0;i<readDialogue.size();i++)
//			{
//				System.out.println(readDialogue.get(i).dialogue);
//			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return readDialogue;
  	}

}
