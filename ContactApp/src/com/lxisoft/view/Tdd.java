package com.lxisoft.view;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import java.util.*;


public class Tdd
{
	public static Controller con = new Controller();
	public static void main(String[] args)
	{
		
		System.out.println("  \n \t \t -----CONTACT LIST------");
		do
		{
			try
		{
		System.out.println(" \n \n 1 = ADD NEW CONTACT \n 2 = SEARCH \n 3 = DISPLAY ");
		Scanner read= new Scanner(System.in);
		int n = read.nextInt();
		
			switch(n)
			{
				case 1 : addContact(); break;
				case 2 : search();break;
				case 3 : display(); break;
				default: System.out.println("INVALID CHOICE");
			}
		
		}
		catch (InputMismatchException exception) 
        {
        	System.out.println(" PLEASE ENTER THE NUMERIC SUGGESTIONS GIVEN ABOVE");
        }

        }while(true);
	}
	public static void addContact()
	{
		
		System.out.println("ENTER NAME");
		Scanner read = new Scanner(System.in);
		String name= read.nextLine();
		System.out.println("ENTER NUMBER");
		String number=read.nextLine();
		con.addContact(name,number);
	}
	public static void search()
	{
		String[] args=null;
		int f=0;
		System.out.println("ENTER NAME");
		Scanner set = new Scanner(System.in);
		String name= set.nextLine();
		for(int i=0;i<con.getArraySize();i++)
		{
			if(name.equals(con.array.get(i).getName()))
			 {
			 	System.out.println(" NUMBER : "+con.array.get(i).getNumber());
			 	f=1;
			 	do{
					System.out.println(" \n \n 1 = EDIT \n 2 = DELETE \n 3 = BACK TO MAIN MENU ");
					Scanner read= new Scanner(System.in);
					int n = read.nextInt();
					switch(n)
						{
							case 1 :edit(i); break;
							case 2 : delete(i);break;
							case 3 :main(args) ; break;
							default: System.out.println("INVALID CHOICE");
						}
					} while(true);
					  
			 }	 
		}
		if(f!=1)
		{
			System.out.println("NOT FOUND");
		}
		
	}
	public static void display()
	{
		 for(int i=0;i<(con.getArraySize());i++)
		{ 	
		 System.out.println("\t"+con.array.get(i).getName()+"  "+con.array.get(i).getNumber());
		}
	}
	public static void edit(int i)
	{
		 System.out.println("ENTER THE NEW NAME");
		 Scanner read= new Scanner(System.in);
		 String name= read.nextLine();
		 System.out.println("ENTER THE NEW NUMBER");
		 String number = read.nextLine();
		 con.editContact(i,name,number);
	}
	public static void delete(int i)
	{
		System.out.println("are you sure ? \n 1= yes \t\t 2 = nop");
		 Scanner read= new Scanner(System.in);
		 int choice= read.nextInt();
		 switch(choice)
		 {
		 	case 1 : con.deleteContact(i);
		 	          System.out.println("contact deleted ");
		 	          break;
		 	case 2 : search(); break;
		 }
	}
		
}