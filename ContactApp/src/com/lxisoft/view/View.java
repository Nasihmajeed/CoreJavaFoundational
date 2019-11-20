package com.lxisoft.view;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.util.*;

public class View
{
	public static Controller con = new Controller();

	public int  begin()
	{
		int n=0;
		
		do
		{
		System.out.println("  \n \t \t -----CONTACT LIST------");
		
		System.out.println(" \n \n 1 = ADD NEW CONTACT \n 2 = SEARCH \n 3 = DISPLAY ");
		Scanner read= new Scanner(System.in);
		n = read.nextInt();	
		return n;
		 
		}while(true);	
	    
	    
       
	}
	public void defaultPrint(int n )
	{
		switch(n)
		{
			case 0 : System.out.println("INVALID CHOICE");
			          con.choice() ; break;
			case 1 : System.out.println("PLEASE ENTER THE NUMERIC VALUE");

		}
		

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
		int f=0;
		System.out.println("ENTER NAME");
		Scanner set = new Scanner(System.in);
		String name= set.nextLine();
		
		if(name.equals(con.search(name).getName()))
		{	
			 int i = con.contactList.indexOf(con.search(name));
			 f=1; 
    	     System.out.println("\n NAME : "+name +" NUMBER : "+ con.contactList.get(i).getNumber());
			 	
			 	do{
					System.out.println(" \n \n 1 = EDIT \n 2 = DELETE \n 3 = BACK TO MAIN MENU ");
					Scanner read= new Scanner(System.in);
					int n = read.nextInt();
					switch(n)
						{
							case 1 :edit(i); break;
							case 2 : delete(i);break;
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
	public void edit(int i)
	{
		 System.out.println("ENTER THE NEW NAME");
		 Scanner read= new Scanner(System.in);
		 String name= read.nextLine();
		 System.out.println("ENTER THE NEW NUMBER");
		 String number = read.nextLine();
		 con.editContact(i,name,number);
	}
	public void delete(int i)
	{
		System.out.println("are you sure ? \n press y   OR \t\t  n");
		 Scanner read= new Scanner(System.in);
		 String choice= read.nextLine();
		 switch(choice)
		 {
		 	case "y": System.out.println("contact deleted ");
		 	         con.deleteContact(i);
		 	          
		 	          break;
		 	case "n" : search(); break;
		 }
	}
}
