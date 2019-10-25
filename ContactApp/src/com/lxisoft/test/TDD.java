package com.lxisoft.test;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TDD
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		ContactController control=new ContactController();
		List <Contact> contactsList=new ArrayList<Contact>();
		int a=0;
		System.out.println("\t <-----CONTACT APP MENU----->\n");
		contactsList=control.getContacts();
		do
		{
			System.out.println("<---Enter your choice--->");
			System.out.println("\n 1-Add\t\t\t 2-Delete\n\n 3-Update\t\t 4-Search\n\n 5-Exit");
			a=s.nextInt();
			switch(a)
			{
				case 1: addContact(control); break;
				case 2: deleteContact(control); break;
				case 3: updateContact(control); break;
				case 4: searchContact(control,contactsList); break;
			}
		}while(a!=5);
		System.out.println("\t <-------CONTACT LIST------>\n");
		System.out.println("\t ID \t NAME \t\t NUMBER \n\t-----\t------\t\t--------");
		int i = 1;
		for(Contact c: contactsList)
		{
			System.out.println("\t "+i+"\t"+c.getContactName()+"\t\t"+ c.getContactNumber());
			i++;
		}
		
	} 
	public static void addContact(ContactController control)
	{
		System.out.println("Enter contact name");
		String name=s.next();
		System.out.println("Enter contact number");
		long num=s.nextInt();
		control.addContact(name,num);
	}

	public static void deleteContact(ContactController control)
	{
		System.out.println("Enter contact name");
		String name=s.next();
		control.deleteContact(name);
	}
	public static void updateContact(ContactController control)
	{
		System.out.println("Enter contact name");
		String name=s.next();
		System.out.println("Enter new contact number");
		long num=s.nextInt();
		control.updateContact(name,num);
	}
	public static void searchContact(ContactController control,List <Contact> contactsList)
	{
		System.out.println("Enter contact name");
		String name=s.next();
		int i=control.searchContact(name);
		System.out.println("contact no--->"+contactsList.get(i).getContactNumber());
	}
}