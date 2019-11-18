package com.lxisoft.view;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.util.*;

public class View
{
	public static Controller con = new Controller();
	public void begin()
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
	public void addContact()
	{
		
		System.out.println("ENTER NAME");
		Scanner read = new Scanner(System.in);
		String name= read.nextLine();
		System.out.println("ENTER NUMBER");
		String number=read.nextLine();
		con.addContact(name,number);
	}
	public void search()
	{
		int f;
		System.out.println("ENTER NAME");
		Scanner set = new Scanner(System.in);
		String name= set.nextLine();
		
		if(name.equals(con.search(name).getName()))
		{	
			//rep.array.indexOf(con.search(name));
			int i = con.search();
			f=1;

    	      System.out.println(" NUMBER : "+ con.array.get(i).getNumber());
			 	
			 	do{
					System.out.println(" \n \n 1 = EDIT \n 2 = DELETE \n 3 = BACK TO MAIN MENU ");
					Scanner read= new Scanner(System.in);
					int n = read.nextInt();
					switch(n)
						{
							case 1 :edit(); break;
							case 2 : delete();break;
							case 3 :begin(); break;
							default: System.out.println("INVALID CHOICE");
						}
					} while(true);
			}
			 
			if(f!=1)
			{
				System.out.println(" CONTACT NOT FOUND");
			}
			
	}
	public  void display()
	{
		 con.display();
	}
	public void edit()
	{
		 System.out.println("ENTER THE NEW NAME");
		 Scanner read= new Scanner(System.in);
		 String name= read.nextLine();
		 System.out.println("ENTER THE NEW NUMBER");
		 String number = read.nextLine();
		 con.editContact(name,number);
	}
	public void delete()
	{
		System.out.println("are you sure ? \n press y   OR \t\t  n");
		 Scanner read= new Scanner(System.in);
		 String choice= read.nextLine();
		 switch(choice)
		 {
		 	case "y": con.deleteContact();
		 	          System.out.println("contact deleted ");
		 	          break;
		 	case "n" : search(); break;
		 }
	}
}
