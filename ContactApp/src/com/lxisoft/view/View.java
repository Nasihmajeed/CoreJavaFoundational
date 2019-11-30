package com.lxisoft.view;
import com.lxisoft.controller.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.util.*;

public class View
{
	public static Controller con = new Controller();
	public ArrayList<Contact> array = new ArrayList<Contact>();
    Scanner read = new Scanner(System.in);
	public int  begin()
	{
		int n=0;
		try
	   { 
		do
		{
			
		System.out.println( "\n 1 = ADD NEW CONTACT \n 2 = SEARCH \n 3 = DISPLAY \n 4 = DELETE ALL");
		n = Integer.parseInt(read.next());	
		
		}while(n==1 && n==2 && n==3 && n ==4);

	   }
	    catch(Exception e)
	    {
	    	con.choice();
	    }     
        return n;
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
		 Scanner set = new Scanner(System.in);
		System.out.println("ENTER NAME");
		String name= set.nextLine();
		System.out.println("ENTER NUMBER");
		String number=set.nextLine();
		System.out.println("CONTACT SAVED");
		con.addContact(name,number);
		
	}
	// public void search()
	// {
	// 	int f=0;
	// 	System.out.println("ENTER NAME");
	// 	String name= read.next();
		
	// 	if(name.equals(con.search(name).getName()))
	// 	{	
	// 		 int i = con.contactList.indexOf(con.search(name));
	// 		f=1; 
 //    	     System.out.println("\n NAME : "+name +" NUMBER : "+ con.contactList.get(i).getNumber());
	// 		 	try
	// 		 	{
	// 		 	do{
	// 				System.out.println(" \n \n 1 = EDIT \n 2 = DELETE \n 3 = BACK TO MAIN MENU ");
	// 				Scanner read= new Scanner(System.in);
	// 				int n = read.nextInt();
	// 				switch(n)
	// 					{

	// 						case 1 :edit(i,con.contactList.get(i).getId()); break;
	// 						case 2 : delete(i);break;
	// 						case 3 :con.choice(); break;
	// 						default: System.out.println("INVALID CHOICE");
	// 					}
	// 				} while(true);
	// 		}
	// 		catch(Exception e)
	// 		{
	// 			System.out.println("PLEASE ENTER THE NUMERIC VALUE");
	// 		}
	//     }
	//     else if(f==0)
	// 		{
	// 			System.out.println(" CONTACT NOT FOUND");
	// 			con.choice();
	// 		}
	// }    
	// public  int  display()
	// {	
	// 	System.out.println("\n 1 = SORT BY DATE \n 2 = SORT BY NAME \n 3 = SORT BY ID");
	// 	int n =read.nextInt();
	// 	return n;
	// }
	// public void dateDisplay()
	// {
	// 	ArrayList <Contact> contactDetail = new ArrayList<Contact>();
	// 	contactDetail=con.fileRead();
	// 	for(Contact i : contactDetail)
	// 	      {
	// 		     System.out.println(" NAME:"+i.getName()+" NUMBER:"+i.getNumber());
	// 	      }

	// }
	// public void sortByname()
	// {
	// 	ArrayList<Contact>arrayList=con.fileRead();
	// 	Collections.sort(arrayList, new SortName()); 
	// 	for(Contact i : arrayList)
	// 	{
	// 	   System.out.println( "NAME:"+i.getName()+" NUMBER:"+i.getNumber());
	// 	}
		
	// }
	// public void sortByid()
	// {
	// 	ArrayList<Contact>arrayList=con.fileRead();
	// 	Collections.sort(arrayList, new SortId()); 
	// 	for(Contact i : arrayList)
	// 	{
	// 	   System.out.println(" ID:"+i.getId()+" NAME:"+i.getName());
	// 	}
	// }
	// public void edit(int i,int id)
	// {
	// 	 System.out.println("ENTER THE NEW NAME");
	// 	 String name  = read.next();
	// 	 System.out.println("ENTER THE NEW NUMBER");
	// 	 String number = read.next();
	// 	 con.editContact(i,id,name,number);
	// }
	// public void delete(int i)
	// {
	// 	System.out.println("are you sure ? \n press y   OR \t\t  n");
	// 	 String choice= read.next();
	// 	 switch(choice)
	// 	 {
	// 	 	case "y": System.out.println("contact deleted ");
	// 	 	         con.deleteContact(i);
		 	          
	// 	 	          break;
	// 	 	case "n" : search(); break;
	// 	 	default : search();
	// 	 }
	// }
	// public void deleteAll()
	// {
	// 	System.out.println("are you sure ? \n press y   OR \t\t  n");
	// 	 String choice= read.next();
	// 	 switch(choice)
	// 	 {
	// 	 	case "y": con.deleteAll();
	// 	 	          System.out.println("All contacts deleted ");
	// 	 	          break;
	// 	 	case "n" : con.choice(); break;
	// 	 	default : con.choice();
	// 	 }	
	// }
}
